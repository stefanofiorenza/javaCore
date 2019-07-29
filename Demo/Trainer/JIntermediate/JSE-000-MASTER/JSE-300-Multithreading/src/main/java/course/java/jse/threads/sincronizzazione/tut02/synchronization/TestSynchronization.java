package course.java.jse.threads.sincronizzazione.tut02.synchronization;


public class TestSynchronization{
	
	public static void main(String[] arg)
	{
		Repository sharedRepository;
		Thread t1,t2;
		Consumer consumer;
		Producer producer;
		
		sharedRepository = new Repository();
		consumer = new Consumer(sharedRepository);
		producer = new Producer(sharedRepository);
		
		t1 = new Thread(consumer);
		t2 = new Thread(producer); 
		
		t2.start();
		t1.start();
	}		
}