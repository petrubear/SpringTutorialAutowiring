package emg.demos.spring.wiring.annotations.values;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("robot")
public class Robot {

	private int id = 0;
	private String speech = "hello";

	// ademas de la anotacion Value se requiere Autowired
	@Autowired
	public void setId(@Value("1138") int id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("Hello World!") String speech) {
		this.speech = speech;
	}

	public void speak() {
		System.out.println(id + ":" + speech);
	}
}
