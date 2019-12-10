package com.cafeintech.multaxi.controller.util;

import java.util.Random;

public class RandomNumberGenerator {
	
	
	public static String usage = "Usage: java RandomNumberGenerator <lines> [seed]";

	public static void main(String[] args) {
		if (args.length > 2) {
			System.err.println("Too many arguments!");
			System.err.println(usage);
			System.exit(1);
		} else if (args.length == 0) {
			System.err.println("Requires at least one argument");
			System.err.println(usage);
			System.exit(1);
		}

		int count = parseCriticalInt(args[0]);

		Random rng = null;
		if (args.length == 2) {
			int seed = parseCriticalInt(args[1]);
			rng = new Random(seed);
		} else {
			rng = new Random();
		}

		for (int i = 0; i < count; ++i) {
			System.out.println(rng.nextInt(9));
		}
	}

	public static int parseCriticalInt(String stringValue) {
		int intValue = 0;
		try {
			intValue = Integer.parseInt(stringValue);
		} catch (NumberFormatException e) {
			System.err.println(stringValue + " must be an integer");
			System.exit(2);
		}
		return intValue;
	}
};