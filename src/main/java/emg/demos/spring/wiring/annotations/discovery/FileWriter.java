package emg.demos.spring.wiring.annotations.discovery;

import org.springframework.stereotype.Component;

@Component("fileWriter")
public class FileWriter implements ILogWriter {

	public void write(String text) {
		// Write to a file here.
		// Dummy implementation
		System.out.println("[byAnnotationsDiscovery] - Write to file: " + text);
	}
}
