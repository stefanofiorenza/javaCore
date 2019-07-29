package course.java.jse.threads.basic.tut01.monothread;


public class TestMonoThread {
	
	
	
	
	public static void main (String [] arg){
		
		
		
		int i=0;
		
		
		CountMonoThread x = new CountMonoThread("CountMonoThread");
		x.count();
		
		while (i<100){
			
			i++;
			System.out.println("Main Thread Loop N."+ i);
			
		}
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}