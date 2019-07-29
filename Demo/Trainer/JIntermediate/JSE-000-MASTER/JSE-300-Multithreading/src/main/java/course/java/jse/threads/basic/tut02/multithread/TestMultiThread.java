package course.java.jse.threads.basic.tut02.multithread;



public class TestMultiThread {
	
	
	
	
	public static void main (String [] arg){
		
		
		
		int i=0;
		
		
		CountMultiThread x = new CountMultiThread("countMultiThread");
		x.start();
		
		while (i<100){
			
			try {
				
				if(i%10==0){
					Thread.sleep(1000);
				}
				System.out.println("Main Thread Loop Count "+ i);
				i++;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}