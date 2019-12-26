package com.course.praticaljava.util;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDateUtil {

	private static final long minDay = LocalDate.of(2010, Month.JANUARY, 1).toEpochDay();
	private static final long maxDay = LocalDate.now().toEpochDay();

	public static LocalDate generateRandomLocalDate() {
		long randomDay = minDay + ThreadLocalRandom.current().nextLong(maxDay - minDay);
		return LocalDate.ofEpochDay(randomDay);
	}

	public static Date generateRandomDate() {
		var ramdomLocalDate = generateRandomLocalDate();
		return Date.from(ramdomLocalDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	}
}
