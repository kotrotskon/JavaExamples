
public class Array1d {

	public static void main(String[] args) {
		
		String[] names = {"kostas", "nikos", "maria", "giota"};
		String[] array = names;
		
		array[0] = "giorgos";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println(array[2]);

	}

}
