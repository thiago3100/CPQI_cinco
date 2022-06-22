package Threads;

public class Ciclo extends Thread{
	
	String palavra;
	long tempo;
	
	public Ciclo(String palavra, long tempo) {
		super();
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run() {
		
			for(int i=0; i < 5; i++) {
				System.out.println(palavra);
		try {		
				Thread.sleep(tempo);
				
			}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	public static void main(String[] args) {
		 new Ciclo("Ping", 1500).start();;
		 new Ciclo("Pong", 2000).start();;
		 
		 System.out.println("ver Thread");

	}

	

}
