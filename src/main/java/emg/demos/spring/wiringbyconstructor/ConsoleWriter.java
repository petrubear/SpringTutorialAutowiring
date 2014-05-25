package emg.demos.spring.wiringbyconstructor;

public class ConsoleWriter implements ILogWriter {
	public void write(String text) {
		System.out.println("[byConstructor] - " + text);
	}
}