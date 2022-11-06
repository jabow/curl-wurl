package com.bowen.homepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomepageApplication {

	public static void main(String[] args) {
		EnglishToWelsh etw = new EnglishToWelsh();
		System.out.println(etw.eToWConversion.getOrDefault("ok", "Not Found"));
		SpringApplication.run(HomepageApplication.class, args);
		System.out.println("Hello World");
	}

}
