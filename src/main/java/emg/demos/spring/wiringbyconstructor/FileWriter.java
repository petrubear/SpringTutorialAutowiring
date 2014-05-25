package emg.demos.spring.wiringbyconstructor;

public class FileWriter implements ILogWriter {

	public void write(String text) {
		// Write to a file here.
		// Dummy implementation
		System.out.println("[byConstructor] - Write to file: " + text);
	}
}
