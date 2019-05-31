package corso.jse.basic.syntax.demo;

import java.util.Scanner;

public class Demo04_StatementLoops {

		
	public static void main(String[] args) {
		
		//demoForLoop();
		//demoWhileLoop();
		//demoDoWhileLoop();
		//demoForEachLoop();		
	}

	
	
	private static void demoForLoop() {

		System.out.println("For Loop:\n Set for 100 loops");

		for (int i = 0; i < 100; i++) {

			if (i == 74)
				break; // alternative exit condition

			if (i % 9 == 0)
				continue; // skip execution of next lines if i % 9== 0

			// prints i
			System.out.println(i);
		}

		System.out.println(
				"Things to Notice:\n1) 9 and its multiples are missing\2) Loop ends earlier than 100, because i=74 is an alternative exit condition");

	}

	private static void demoWhileLoop() {
		System.out.println("While Loop:\n Set for 100 loops");

		int i = 0;
		while (i <= 100) {

			if (i == 74)
				break; // alternative exit condition

			if (i % 9 == 0)
				continue; // skip execution of next lines if i % 9== 0
			
			
			System.out.println(i);
		}
		
		System.out.println(
				"Things to Notice:\n1) 9 and its multiples are missing\2) Loop ends earlier than 100, because i=74 is an alternative exit condition");


	}

	
	private static void demoDoWhileLoop() {

	
		System.out.println("Do While Loop:\nCheck password demo. Keep asking until pw is correct");
		String passwordSaved="123";
		Scanner scanner = new Scanner(System.in);
		
		String password="";

		do {
			System.out.println("Please insert password");
			password=scanner.nextLine();
		
		}while (!password.equals(passwordSaved));
		
		
		System.out.println("Welcome in our super safe system");
		scanner.close();
	}
	
	
	

	/**
	 * TO explain after array explaination
	 */
	private static void demoForEachLoop() {

		int [] numbers={1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("For Each Loop:\nLoop over an <<iterable>> object (e.g. java Array)");
		for (int i : numbers){
			System.out.println(i);
		}
		
	}

}
