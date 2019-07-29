package course.java.jse.threads.sincronizzazione.tut01.locks;

public class CountRunnable implements Runnable{
	
	private String nome;
	
	public CountRunnable (String nome){
		this.nome=nome;	
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public synchronized void count(){
		
		System.out.println("Thread "+Thread.currentThread().getName()+" acquire lock");
		int i=0;
		while (i<15){
			
			i++;
			try {
				Thread.sleep(300);
				System.out.println("Thread "+Thread.currentThread().getName()+" : Count N."+ i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
		System.out.println("Thread "+Thread.currentThread().getName()+" Release lock");
		
		
	}


	@Override
	public void run() {
		count();
	}
	
	
	
	
	
	
	
	
}