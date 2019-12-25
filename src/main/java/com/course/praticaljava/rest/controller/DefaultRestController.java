package com.course.praticaljava.rest.controller;

import java.time.LocalTime;
import java.util.Arrays;

import org.apache.tomcat.util.buf.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultRestController {

	private Logger log = LoggerFactory.getLogger(DefaultRestController.class);

	@GetMapping("/welcome")
	public String welcome() {
		log.info(StringUtils.join(Arrays.asList("Hello", "This is", "Spring Boot", "REST API")));
		return "Hello World Guy Ross Assoumou.\nComment vas tu ?";
	}

	@GetMapping("/time")
	public String time() {
		return "Local time is: " + LocalTime.now().toString();
	}

}
