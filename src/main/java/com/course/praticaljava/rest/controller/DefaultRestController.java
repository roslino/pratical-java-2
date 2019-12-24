package com.course.praticaljava.rest.controller;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultRestController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Hello World Guy Ross Assoumou.\nComment vas tu ?";
	}

	@GetMapping("/time")
	public String time() {
		return "Local time is: " + LocalTime.now().toString();
	}

}
