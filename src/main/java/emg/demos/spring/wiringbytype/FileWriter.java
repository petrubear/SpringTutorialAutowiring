package emg.demos.spring.wiringbytype;

public class FileWriter implements ILogWriter {

	public void write(String text) {
		// Write to a file here.
		// Dummy implementation
		System.out.println("[byType] - Write to file: " + text);
	}
}
