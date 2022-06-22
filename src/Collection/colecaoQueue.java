import java.util.LinkedList;
import java.util.Queue;

public class colecaoQueue {

	public static void main(String[] args) {
		
		Queue<String> fila  = new LinkedList<>();
		fila.add("thiago");
		fila.add("natan");
		fila.add("lucas");
		
		System.out.println(fila.peek());
		System.out.println(fila.poll());
		System.out.println(fila);
		
		LinkedList<String> f = (LinkedList<String>) fila;
        f.addFirst("luan");
        f.addLast("pedro");
        System.out.println(f);
         
        boolean c = f.contains("juca");
        System.out.println(c);
        
	}

}
