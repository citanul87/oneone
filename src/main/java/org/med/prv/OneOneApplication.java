package org.med.prv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OneOneApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OneOneApplication.class, args);
	}
	
	@GetMapping("/message")
	public String getPropertyMe(){
		System.out.println("========================");
		System.out.println("Message was displayed !");
		System.out.println("========================");
		return "Welcome to test OneOne";
	}
}
