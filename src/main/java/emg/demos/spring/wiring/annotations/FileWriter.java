package emg.demos.spring.wiring.annotations;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("filewriter")
public class FileWriter implements ILogWriter {

	public void write(String text) {
		// Write to a file here.
		// Dummy implementation
		System.out.println("[byAnnotations] - Write to file: " + text);
	}
}
