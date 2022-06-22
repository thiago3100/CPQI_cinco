package Threads;

public class ContaConjunta {
      
	private int saldo = 500;
	
	public int getSaldo() {
		return saldo; 
	}
	
	public synchronized void sacar(int valor, String cliente) throws InterruptedException {
		if(saldo >= valor) {
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar "); 
			Thread.sleep(1000);
			saldo -= valor;
			System.out.println(cliente + " Sacou " + valor 
					+ "[Saldo original = "+saldoOriginal+" + Saldo Final= "+saldo + "]");
		}else {
			System.out.println("Saldo insuficiente para " +cliente);
		}
	}
}
