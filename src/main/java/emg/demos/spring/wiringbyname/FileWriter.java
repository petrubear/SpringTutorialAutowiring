package emg.demos.spring.wiringbyname;

public class FileWriter implements ILogWriter {

	public void write(String text) {
		// Write to a file here.
		// Dummy implementation
		System.out.println("[byName] - Write to file: " + text);
	}
}
