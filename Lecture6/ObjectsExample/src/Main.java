
public class Main {

	public static void main(String[] args) {

		Car myCar = new Car(5, 50);
		Car yourCar = new Car();
		
		myCar.start();
		myCar.wheels = 6;
		yourCar.wheels = 8;
		
		System.out.println(myCar.getFuel());
		
		System.out.println(myCar.wheels);
		
		double pi = Math.sqrt(90);
	}
}
