
public class Main {

	public static void main(String[] args) {

		Car myCar = new Car(5, 50);
		Car yourCar = new Car();
		
		myCar.start();
		
		System.out.println(myCar.getFuel());
		
	}

}
