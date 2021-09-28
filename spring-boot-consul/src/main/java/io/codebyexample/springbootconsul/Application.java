package io.codebyexample.springbootconsul;

import io.codebyexample.springbootconsul.configuration.MyConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Application {

	@Autowired
	MyConf myConf;

	@Value("${spring.application.name}")
	String applicationName;

	@EventListener(ApplicationReadyEvent.class)
	protected void readyProcess() {
		System.out.println("Id: " + myConf.getId());
		System.out.println("Value: " + myConf.getValue());

		System.out.println("Application name: " + applicationName);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
