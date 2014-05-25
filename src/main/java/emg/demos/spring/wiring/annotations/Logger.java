package emg.demos.spring.wiring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {

	// @Autowired
	private ConsoleWriter consoleWriter;
	// @Autowired
	private ILogWriter fileWriter;

	/*
	 * @Autowired public Logger(FileWriter fileWriter) { super();
	 * this.fileWriter = fileWriter; }
	 */

	@Autowired
	// (required=false)
	@Qualifier("toconsole")
	public void setConsoleWriter(ConsoleWriter writer) {
		this.consoleWriter = writer;
	}

	// @Autowired
	// @Qualifier("filewriter")
	// tambien se puede usar la anotacion @Resource
	//@Resource(name = "filewriter")
	// otra opcion es la anotacion @Inject - requiere actualizar el pom
	@Inject
	@Named(value="filewriter")
	public void setFileWriter(ILogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

	public void writeConsole(String text) {
		if (consoleWriter == null)
			return;
		consoleWriter.write(text);
	}

	@PostConstruct
	public void init() {
		System.out.println("init Logger");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy Loger");
	}
}