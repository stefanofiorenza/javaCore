package course.java.jse.threads.basic.tut02.runnable.adv;



public class TestMultiThread {
	
	
	
	
	public static void main (String [] arg){
				
		int i=0;
		CountRunnable x = new CountRunnable("CountRunnable");
		x.conta(); //count will run in a separate thread
		
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