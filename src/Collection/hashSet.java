package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hashSet {
     
	public static void main(String[] args) {
		
		String[] cores = {"verde", "azul", "amarelo", "vermelho", "verde", "azul"};
		
		List<String> list = Arrays.asList(cores);
		System.out.println(list);
		
		Set<String> set = new HashSet<>(list);
		System.out.println(set);

	}
}
