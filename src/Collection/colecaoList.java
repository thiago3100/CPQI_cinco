import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class colecaoList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("futebol");
	    list.add("volei");
	    list.add("frisbe");
	    list.add("hockey");
	    list.add("handball");
	    list.add("basquete");
	    
	    System.out.println(list);
	    
		for(int i=0; i < list.size(); i++) {
			String letra = list.get(i);
			list.set(i, letra.toUpperCase());
		}
		
		System.out.println(list);
		System.out.println(list.indexOf("HANDBALL"));
		
		list.subList(2, 5).clear();
		System.out.println(list);

	}

}
