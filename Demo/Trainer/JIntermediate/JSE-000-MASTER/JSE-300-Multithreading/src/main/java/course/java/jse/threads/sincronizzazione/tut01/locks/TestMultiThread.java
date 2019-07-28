package course.java.jse.threads.sincronizzazione.tut01.locks;



public class TestMultiThread {
	
	
	
	
	public static void main (String [] arg){
				
		int i=0;
		CountRunnable thStefano = new CountRunnable("Stefano");
		CountRunnable thMaria = new CountRunnable("Maria");
		CountRunnable thRaul = new CountRunnable("Raul");
		
		// No Difference (Each Object has its lock)
		//Thread thread1 = new Thread(thStefano);
		//Thread thread2 = new Thread(thMaria);
		//Thread thread3 = new Thread(thRaul);
		
		// if Object is same they come into count methods one at each time
		
		Thread thread1 = new Thread(thStefano);
		Thread thread2 = new Thread(thStefano);
		Thread thread3 = new Thread(thStefano);
		
		
		thread1.start();
		thread2.start();
		thread3.start();
				
	}
		
}