package emg.demos.spring.wiringbytype;

public class ConsoleWriter implements ILogWriter {
	public void write(String text) {
		System.out.println("[byType] - " + text);
	}
}