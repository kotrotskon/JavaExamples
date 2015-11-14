
public class Car {
	
	private int passengers = 8;
	private double fuel = 40;
	
	static int wheels = 4;
	
	Car(){
		System.out.println("You have an empty car");
	}
	
	Car(int passengers, double fuel){
		System.out.println("You have a car");
		this.passengers = passengers;
		this.fuel = fuel;
	}
	
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public double getFuel() {
		return fuel;
	}
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	void start(){
		System.out.println("Vroum vroum!!!");
		this.fuel--;
	}
}
