package course.jse.basic.methods.libs;

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
		double average = 0.0;
		average = (double) sum(input) / input.length;
		return average;
	}
	
	public static void addSeven(int x){
		x=x+7;
	}
	
	public static void addSeven(int []x){
		x[0]=x[0]+7;
	}
	
	
}
