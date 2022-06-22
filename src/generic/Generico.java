package generic;

import java.util.ArrayList;

public class Generico <E> {
	
	E elemento;
	
	public void setElemento(E elemento) {
		this.elemento = elemento;
	}
	
	public E getElemento() {
		return this.elemento;
	}
	
	public double soma(ArrayList<? extends Number>lista) {
		double total = 0;
		for (Number number : lista) {
			total += number.doubleValue();
		}
		return total;
	}

	public static void main(String[] args) {
		Generico<String> generico = new Generico();
		generico.setElemento("brasilia");
		
		System.out.println(generico.getElemento().toUpperCase());
		
		
		Generico<Number> number = new Generico();
		ArrayList<Number> numberAll = new ArrayList<>();
		
		numberAll.add(5);
		numberAll.add(32);
		
		System.out.println(number.soma(numberAll));

	}

}
