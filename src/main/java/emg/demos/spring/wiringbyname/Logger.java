package emg.demos.spring.wiringbyname;


public class Logger {

	private ILogWriter consoleWriter;
	private ILogWriter fileWriter;

	public void setConsoleWriter(ILogWriter writer) {
		this.consoleWriter = writer;
	}

	public void setFileWriter(ILogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}

}