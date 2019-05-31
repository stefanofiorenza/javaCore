package course.jse.basic.methods.demo;

import course.jse.basic.methods.libs.ArrayUtils;

public class Demo01_MethodParams {
	
	public static void main(String[] args) {

		int[] anArray = { 0, 1, 2, 3, 4 };
		int anInteger = 0;

		System.out.println("Before");
		printData(anArray,anInteger);

		ArrayUtils.addSeven(anInteger);
		ArrayUtils.addSeven(anArray);

		System.out.println("After");
		printData(anArray,anInteger);
	}
	
	
	
	private static void printData(int[] anArray, int x){
		
		System.out.println("anInteger: " + x);
		for (int i = 0; i < anArray.length; i++) {
			System.out.println("anArray " + anArray[i]);
		}
	}
	
}
