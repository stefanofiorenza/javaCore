package course.jse.basic.methods.demo;

public class Demo02_ArrayExMain {
	
	public static void main(String[] args) {

		int [] intArray = {89,45,32,77,1,-99};
			
		//1) find max in Array
		int max=intArray[0];
		
		for (int i=1; i<intArray.length; i++){
			if (max<intArray[i]){
				max=intArray[i];
			}
		}
			
		//2) print min in Array
		int min=intArray[0];
		
		for (int i=1; i<intArray.length; i++){
			if (min>intArray[i]){
				min=intArray[i];
			}
		}
		
		//3) find Sum of Array elements 
		int sum=0;
		
		for (int i=1; i<intArray.length; i++){
			sum=sum+intArray[i];
			//sum+=intArray[i];
		}
		
		
		//4) find average in Array
		double average=sum/intArray.length;
		
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+average);		
		
	}
	
	
	
}
