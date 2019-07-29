package course.java.jse.threads.sincronizzazione.tut02.synchronization;

public class Repository{

	int value;
	private boolean availble; 
	
	public Repository()
	{
		value=0;
	}	
	
	public synchronized int getData()
	{
		while(availble == false)
		{
			try 
			{
				wait();
			}catch(InterruptedException e){}
		}
		availble = false;
		notifyAll();	
		return value;	
	}
	
	public synchronized void setData(int v)	{
		while(availble == true)
		{
			try 
			{
				wait();
			}catch(InterruptedException e){}
		}

		value=v;
		availble = true;	
		notifyAll();	

	}	
	
}