package course.jse.basic.exceptions.utils;

import course.jse.basic.exceptions.custom.ArrayAverageException;

public class ArrayUtils {

	public static int max(int[] input) {
		int max = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}

	public static int min(int[] input) {
		int min = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
			}
		}
		return min;
	}

	public static int sum(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
		}
		return sum;
	}

	public static double average(int[] input) {
		
		// 01 Checked Exception (compile time)
		/* 
		if (input==null || input.length==0){
			throw new ArrayAverageException("Array is empty");
		}
		*/
		
		// 02 Runtime Exception (not checked)
		/* 
		if (input==null || input.length==0){
			throw new IllegalStateException("Array is empty");
		}
		*/
		double average = 0.0;
		average = (double) sum(input) / input.length;
		return average;
	}
}
