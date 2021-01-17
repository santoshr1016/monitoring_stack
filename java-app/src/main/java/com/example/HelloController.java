package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
        Logger log = LoggerFactory.getLogger(HelloController.class);
        log.info("Start of the endpoint /");
        log.info("Just logging here");
        log.info("Returning from endpoint /");
		return "Greetings from Spring Boot! - YOLO";
	}

}