import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		String[] names = new String[10];
		
		list.add("Kostas");
		list.add("Maria");
		System.out.println(list.size());
		
		list.add("Nikos");
		System.out.println(list.size());
		
		System.out.println(list);
		
		list.add(1, "Giota");
		
		System.out.println(list.get(1));
		
		System.out.println(list);

	}

}
