
public class Main {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		String name = "1";
		
		try {
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = Integer.valueOf(name);
			}
			
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array");
		} catch (Exception e) {
			numbers[0] = 0;
		} finally {
			System.out.println("Finally");
		}
		
		System.out.println(numbers[0]);

	}

}
