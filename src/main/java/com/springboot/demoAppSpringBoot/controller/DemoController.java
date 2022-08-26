package com.springboot.demoAppSpringBoot.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DemoController {
	Logger logger = LoggerFactory.getLogger(DemoController.class);

	@GetMapping("/welcome")
	  String welcomeMessage() {
	    return "Welcome!!!!";
	  }
	
	@GetMapping("/welcome/{name}")
	  public String welcomeMessage(@PathVariable String name) {
		logger.info("Welcome Message --query param="+name);
	    return "Hello There! Welcome "+name;
	  }
	
	
}
