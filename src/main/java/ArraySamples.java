package main.java;

import java.util.Arrays;

public class ArraySamples {
	public static void main(String[] args) {
		String[] weekdays = new String[7];
		// Returns address
		System.out.println(weekdays);
		// Returns array of 7 nulls
		System.out.println(Arrays.toString(weekdays));
		
		// Edit element in array
		weekdays[0] = "Mondays";
		System.out.println(Arrays.toString(weekdays));
		
		// Add elements on initialization
		weekdays = new String[]{"Mon", "Tues", "Wed"};
		System.out.println(Arrays.toString(weekdays));
		
		// Iteration over array
		for (String day: weekdays) {
			System.out.println("Weekday - " + day);
		}
		
		for (int i=0; i<weekdays.length; i++) {
			weekdays[i] = weekdays[i].toUpperCase();
		}
		System.out.println(Arrays.toString(weekdays));
	}
}
