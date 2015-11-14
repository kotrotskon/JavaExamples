
public class Main {

	public static void main(String[] args) {
		
		String name = "kostas";
		
		System.out.println(name.toUpperCase());		
		
		Car myCar = new Car();
		Car yoursCar = new Car();
		
		yoursCar.passengers = 8;
		
		myCar.fuel = 45;
		myCar.passengers = 5;
		
		System.out.println(myCar.passengers);
		System.out.println(yoursCar.passengers);
		
		myCar.start();
		
		

	}

}
