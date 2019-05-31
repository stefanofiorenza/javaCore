package corso.jse.basic.syntax.demo;

import java.util.Scanner;

public class Demo01_IoTest {

	public static void main(String[] args) {
		
		System.out.println("Insert an integer");
		Scanner scanner = new Scanner(System.in);
		
		int anIntegerFromKeyboard=scanner.nextInt();
		
		System.out.println("Inserted "+anIntegerFromKeyboard);
		
		String aStringFromKeyboard=scanner.nextLine();// needed to intercept return
		
		System.out.println("Insert a String");
		aStringFromKeyboard=scanner.nextLine();
		
		System.out.println("Inserted "+aStringFromKeyboard);
		
		scanner.close();
		
	}

}
