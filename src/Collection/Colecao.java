import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		
		c.add("A");
		c.add("b");
		c.add("c");
		c.add("d");
		
		System.out.println(c.contains("A"));
		System.out.println(c.isEmpty());
		System.out.println(c.toString());
		c.remove("b");  
		
		   
		System.out.println(c.toString());

		Collection<String> c2 = Arrays.asList("O", "U");
		c.addAll(c2);
		
		System.out.println(c.toString());
		c.removeAll(c2);
		System.out.println(c.toString());
		
		for(String string : c) {
			System.out.println(string);
		}
		
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));

	}

}