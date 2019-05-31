package corso.jse.basic.syntax.demo;

import java.util.Scanner;

/*
 * 
 * Introduced:
 * 
 * Constants (static final)
 * static  methods
 * switch statement
 */

public class Demo05_StatementSwitch {

	private static final String PRIME_NUMBER = "Prime number";
	private static final String NOT_A_PRIME_NUMBER = "Not a prime number";
	private static final String OUT_OF_RANGE = "Number out of range";
	private static final String NUMBER_IS = "Number is: ";

	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert a Number from 1 to 10");

		int anInteger = scanner.nextInt();

		// switchWithBreakError(anInteger);
		// switchWithRepetitions(anInteger);
		// switchProperlyCoded(anInteger);
				
		scanner.close();
	}

	private static void switchWithBreakError(int anInput) {

		switch (anInput) {

		case 1:
			System.out.println(NUMBER_IS + anInput);
			// break;
		case 2:
			System.out.println(NUMBER_IS + anInput);
			// break;
		case 3:
			System.out.println(NUMBER_IS + anInput);
			// break;
		case 5:
			System.out.println(NUMBER_IS + anInput);
			// break;
		case 7:
			System.out.println(NUMBER_IS + anInput);
			// break;
		case 4:
			System.out.println(NUMBER_IS + anInput);
			// break;
		case 6:
			System.out.println(NUMBER_IS + anInput);
			// break;
		case 8:
			System.out.println(NUMBER_IS + anInput);
			// break;
		case 9:
			System.out.println(NUMBER_IS + anInput);
			// break;
		case 10:
			System.out.println(NUMBER_IS + anInput);
			// break;
		default:
			System.out.println(OUT_OF_RANGE);
		}
	}

	private static void switchWithRepetitions(int anInput) {

		switch (anInput) {

		case 1:
			System.out.println(PRIME_NUMBER);
			break;
		case 2:
			System.out.println(PRIME_NUMBER);
			break;
		case 3:
			System.out.println(PRIME_NUMBER);
			break;
		case 5:
			System.out.println(PRIME_NUMBER);
			break;
		case 7:
			System.out.println(PRIME_NUMBER);
			break;

		case 4:
			System.out.println(anInput);
			break;
		case 6:
			System.out.println(anInput);
			break;
		case 8:
			System.out.println(anInput);
			break;
		case 9:
			System.out.println(anInput);
			break;
		case 10:
			System.out.println(anInput);
			break;
		default:
			System.out.println(OUT_OF_RANGE);
		}

	}

	private static void switchProperlyCoded(int anInput) {

		switch (anInput) {

		case 1:
		case 2:
		case 3:
		case 5:
		case 7:
			System.out.println(PRIME_NUMBER);
			break;
		case 4:
		case 6:
		case 8:
		case 9:
		case 10:
			System.out.println(anInput);
			break;
		default:
			System.out.println(OUT_OF_RANGE);

		}

	}

}
