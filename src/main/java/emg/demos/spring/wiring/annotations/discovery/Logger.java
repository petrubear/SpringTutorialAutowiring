package emg.demos.spring.wiring.annotations.discovery;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
public class Logger {

	private ConsoleWriter consoleWriter;
	private ILogWriter fileWriter;

	@Inject
	@Named("consoleWriter")
	public void setConsoleWriter(ConsoleWriter writer) {
		this.consoleWriter = writer;
	}

	@Inject
	@Named("fileWriter")
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
		System.out.println("init Annotations Discovery Logger");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy Annotations Discovery Loger");
	}
}