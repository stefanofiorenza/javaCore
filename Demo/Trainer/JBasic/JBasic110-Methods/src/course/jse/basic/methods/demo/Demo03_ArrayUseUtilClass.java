package course.jse.basic.methods.demo;

import course.jse.basic.methods.libs.ArrayUtils;

public class Demo03_ArrayUseUtilClass {
	
	public static void main(String[] args) {

		int [] intArray1 = {89,45,32,77,1,-99};		
		int [] intArray2 = {1,2,3,4,5};
		int [] intArray3 = {17,31,54,1,76,88,91,91,80,91};		
		
		System.out.println("Average Array1: "+ArrayUtils.average(intArray1));
		System.out.println("Min Array2: "+ArrayUtils.min(intArray2));
		System.out.println("Sum Array3: "+ArrayUtils.sum(intArray3));
		
	}
	
	
	
}
