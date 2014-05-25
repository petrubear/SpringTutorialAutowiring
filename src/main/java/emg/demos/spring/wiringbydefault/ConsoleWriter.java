package emg.demos.spring.wiringbydefault;

public class ConsoleWriter implements ILogWriter {
	public void write(String text) {
		System.out.println("[byDefault] - " + text);
	}
}