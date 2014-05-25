package emg.demos.spring.wiring.annotations;

public class ConsoleWriter implements ILogWriter {
	public void write(String text) {
		System.out.println("[byAnnotations] - " + text);
	}
}