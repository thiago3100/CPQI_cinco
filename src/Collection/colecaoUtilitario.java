package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class colecaoUtilitario {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("manga");
		list.add("goiaba");
		list.add("pera");
		list.add("uva");
		list.add("maca");
		list.add("pera");
		list.add("carambola");

		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);
		Collections.replaceAll(list, "manga", "avela");
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.addAll(list, "fruta do conde", "banana", "kiwi");
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);

	}

}
