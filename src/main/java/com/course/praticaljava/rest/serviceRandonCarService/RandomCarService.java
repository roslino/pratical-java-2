package com.course.praticaljava.rest.serviceRandonCarService;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.course.praticaljava.rest.domain.Car;
import com.course.praticaljava.rest.service.CarService;
import com.course.praticaljava.util.RandomDateUtil;

@Service
public class RandomCarService implements CarService {

	private Random random = new Random();

	@Override
	public Car generateCar() {
		var randomBrand = BRANDS.get(random.nextInt(BRANDS.size()));
		var randomColor = COLORS.get(random.nextInt(COLORS.size()));
		var randomType = TYPES.get(random.nextInt(TYPES.size()));

		var car = new Car(randomBrand, randomColor, randomType);

		car.setAvailable(random.nextBoolean());
		car.setPrice(5000 + random.nextInt(7001));
		car.setFirstReleaseDate(RandomDateUtil.generateRandomDate());

		return car;
	}

}
