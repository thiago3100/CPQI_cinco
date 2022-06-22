package Threads;

public class ComprasEmFamilia implements Runnable{
	
	ContaConjunta conta = new ContaConjunta();
    
	public static void main(String[] args) {
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();   
		
		new Thread(irAsCompras, "Pai").start();;
		new Thread(irAsCompras, "mae").start();
		new Thread(irAsCompras, "filho").start();
		new Thread(irAsCompras, "filha").start();

	}

	@Override
	public void run() {
		String cliente = Thread.currentThread().getName();
		for(int i=0; i<5;i++) {
		try {
			conta.sacar(20, cliente);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(conta.getSaldo() < 0) {
			System.out.println("Cartão estourou !!");
		}
		
	}
}
}