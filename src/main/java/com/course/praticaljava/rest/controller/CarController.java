package com.course.praticaljava.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.praticaljava.rest.domain.Car;
import com.course.praticaljava.rest.service.CarService;

@RestController
@RequestMapping("/api/car/v1")
public class CarController {

	@Autowired
	private CarService carService;

	private Random random = new Random();

	private Logger log = LoggerFactory.getLogger(CarController.class);

	@GetMapping(path = "/random", produces = MediaType.APPLICATION_JSON_VALUE)
	public Car randonCar() {
		return carService.generateCar();
	}

	@PostMapping(path = "/echo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String echo(@RequestBody Car car) {
		log.info("The car is : " + car);
		return car.toString();
	}

	@GetMapping(path = "/random-cars", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Car> randomCars() {
		var results = new ArrayList<Car>();
		for (int i = 0; i < random.nextInt(6); i++) {
			results.add(carService.generateCar());
		}
		return results;
	}

}
