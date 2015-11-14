import java.util.ArrayList;
import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		
		ArrayList<String> greece = new ArrayList<>();
		greece.add("Athens");
		greece.add("Thessaloniki");
		map.put("Greece", greece);
		
		System.out.println(map.get("Greece").get(0));
		System.out.println(map.values());

	}

}
