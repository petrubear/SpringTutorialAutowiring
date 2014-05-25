package emg.demos.spring.wiring.annotations.discovery;

import org.springframework.stereotype.Component;

@Component("consoleWriter")
public class ConsoleWriter implements ILogWriter {
	public void write(String text) {
		System.out.println("[byAnnotationsDiscovery] - " + text);
	}
}