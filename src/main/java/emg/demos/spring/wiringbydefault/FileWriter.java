package emg.demos.spring.wiringbydefault;

public class FileWriter implements ILogWriter {

	public void write(String text) {
		// Write to a file here.
		// Dummy implementation
		System.out.println("[byDefault] - Write to file: " + text);
	}
}
