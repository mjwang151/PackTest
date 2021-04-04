package com.amarsoft;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) { 
		SpringApplication application = new SpringApplication(App.class);
		application.setBannerMode(Mode.OFF);
		application.run(args);
	}
}