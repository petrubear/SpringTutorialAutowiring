package emg.demos.spring.wiringbyname;

public class ConsoleWriter implements ILogWriter {
	public void write(String text) {
		System.out.println("[byName] - " + text);
	}
}