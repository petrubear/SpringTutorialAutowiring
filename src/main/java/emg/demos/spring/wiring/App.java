package emg.demos.spring.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import emg.demos.spring.wiring.annotations.values.Robot;
import emg.demos.spring.wiringbytype.Logger;

public class App {
	public static void main(String[] args) {
		System.out.println("************************");
		System.out.println("Wiring by type");
		System.out.println("************************");
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"emg/demos/spring/wiringbytype/beans/beans.xml");

		Logger logger = (Logger) context.getBean("logger");

		logger.writeConsole("Hello there");
		logger.writeFile("Hi again");

		((ClassPathXmlApplicationContext) context).close();
		
		System.out.println("************************");
		System.out.println("Wiring by name");
		System.out.println("************************");
		
		context = new ClassPathXmlApplicationContext(
				"emg/demos/spring/wiringbyname/beans/beans.xml");

		emg.demos.spring.wiringbyname.Logger loggerByName = 
				(emg.demos.spring.wiringbyname.Logger) context.getBean("logger");

		loggerByName.writeConsole("Hello there");
		loggerByName.writeFile("Hi again");

		((ClassPathXmlApplicationContext) context).close();
		
		System.out.println("************************");
		System.out.println("Wiring by constructor");
		System.out.println("************************");
		
		context = new ClassPathXmlApplicationContext(
				"emg/demos/spring/wiringbyconstructor/beans/beans.xml");

		emg.demos.spring.wiringbyconstructor.Logger loggerByConstructor = 
				(emg.demos.spring.wiringbyconstructor.Logger) context.getBean("logger");

		loggerByConstructor.writeConsole("Hello there");
		loggerByConstructor.writeFile("Hi again");

		((ClassPathXmlApplicationContext) context).close();
		
		System.out.println("************************");
		System.out.println("Wiring by default");
		System.out.println("************************");
		
		context = new ClassPathXmlApplicationContext(
				"emg/demos/spring/wiringbydefault/beans/beans.xml");

		emg.demos.spring.wiringbydefault.Logger loggerByDefault = 
				(emg.demos.spring.wiringbydefault.Logger) context.getBean("logger");

		loggerByDefault.writeConsole("Hello there");
		loggerByDefault.writeFile("Hi again");

		((ClassPathXmlApplicationContext) context).close();
		
		
		System.out.println("************************");
		System.out.println("Wiring by annotations");
		System.out.println("************************");
		
		context = new ClassPathXmlApplicationContext(
				"emg/demos/spring/wiring/annotations/beans/beans.xml");

		emg.demos.spring.wiring.annotations.Logger loggerAnnotations = 
				(emg.demos.spring.wiring.annotations.Logger) context.getBean("logger");

		loggerAnnotations.writeConsole("Hello there");
		loggerAnnotations.writeFile("Hi again");

		((ClassPathXmlApplicationContext) context).close();
		
		System.out.println("************************");
		System.out.println("Wiring by annotations discovery");
		System.out.println("************************");
		
		context = new ClassPathXmlApplicationContext(
				"emg/demos/spring/wiring/annotations/discovery/beans/beans.xml");

		emg.demos.spring.wiring.annotations.discovery.Logger loggerAnnotationsDiscovery = 
				(emg.demos.spring.wiring.annotations.discovery.Logger) context.getBean("logger");

		loggerAnnotationsDiscovery.writeConsole("Hello there");
		loggerAnnotationsDiscovery.writeFile("Hi again");

		((ClassPathXmlApplicationContext) context).close();
		
		System.out.println("************************");
		System.out.println("Wiring property values");
		System.out.println("************************");
		
		context = new ClassPathXmlApplicationContext(
				"emg/demos/spring/wiring/annotations/values/beans/beans.xml");

		Robot robot = (Robot)context.getBean("robot");

		robot.speak();
		((ClassPathXmlApplicationContext) context).close();
	}
}
