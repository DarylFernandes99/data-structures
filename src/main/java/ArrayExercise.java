package main.java;

public class ArrayExercise {
	public void arrayToUpperCase(String[] str) {
		for (int i=0; i<str.length; i++) {
			str[i] = str[i].toUpperCase();
		}
	}
	
	public void incrementArray(int[] str) {
		for (int i=0; i<str.length; i++) {
			str[i] += 1;
		}
	}
}
