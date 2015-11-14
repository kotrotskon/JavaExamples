
public class Main {

	public static void main(String[] args) {
		hello();
		int num1 = 3;
		int num2 = 7;
		int num = add(num1, num2);
		
		System.out.println(add(5, 8));
	}
	
	public static void hello(){
		System.out.println("Hello!!!");
	}
	
	public static int add(int x, int y){
		int sum = x + y;
		return sum;
	}

}
