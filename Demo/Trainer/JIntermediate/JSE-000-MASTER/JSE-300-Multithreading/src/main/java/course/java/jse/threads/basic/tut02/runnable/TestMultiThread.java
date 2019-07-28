package course.java.jse.threads.basic.tut02.runnable;



public class TestMultiThread {
	
	
	
	
	public static void main (String [] arg){
				
		int i=0;
		CountRunnable x = new CountRunnable("CountRunnable");
		Thread thread1 = new Thread(x);
		thread1.start();
		
		while (i<100){
			
			try {
				
				if(i%10==0){
					Thread.sleep(1000);
				}
				System.out.println("Main Thread Loop N."+ i);
				i++;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}