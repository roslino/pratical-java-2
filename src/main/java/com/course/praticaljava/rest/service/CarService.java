package com.course.praticaljava.rest.service;

import java.util.List;

import com.course.praticaljava.rest.domain.Car;

public interface CarService {

	List<String> BRANDS = List.of("Toyota", "Honda", "Ford");
	List<String> COLORS = List.of("Red", "Black", "White");
	List<String> TYPES = List.of("Sedan", "SUV", "MVP");

	public Car generateCar();
}
