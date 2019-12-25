package com.course.praticaljava.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.praticaljava.rest.domain.Car;
import com.course.praticaljava.rest.service.CarService;

@RestController
@RequestMapping("/api/car/v1")
public class CarController {

	@Autowired
	private CarService carService;

	@GetMapping(path = "/random", produces = MediaType.APPLICATION_JSON_VALUE)
	public Car randonCar() {
		return carService.generateCar();
	}

}
