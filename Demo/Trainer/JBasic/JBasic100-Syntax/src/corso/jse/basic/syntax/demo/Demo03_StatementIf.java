package corso.jse.basic.syntax.demo;

import java.util.Scanner;

public class Demo03_StatementIf {

	public static void main(String[] arg) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Insert a Number");
		int anInteger = scanner.nextInt();

		if (anInteger % 2 == 0) {
			System.out.println("Pair Number");
		} else {
			System.out.println("Odd Number");
		}
		
		scanner.close();

	}

}
