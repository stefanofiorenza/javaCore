package course.jse.basic.exceptions.demo;

import course.jse.basic.exceptions.domain.Date;
import course.jse.basic.exceptions.utils.ArrayUtils;

public class DemoExceptions {

	public static void main(String[] args) {


		//demoAverage();
		//demoDate();
		

	}
	
	
	private static void demoAverage(){
	
		int [] array=null;		
		double average= ArrayUtils.average(array);
		System.out.println("Average is "+average);
	}
	
	
	private static void demoDate(){		
		Date anIllegalDate = new Date(-1,13,2000);
		System.out.println(anIllegalDate.toString());
	}

}
