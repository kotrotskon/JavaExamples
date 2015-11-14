
public class Main {

	public static void main(String[] args) {
		Fruit fruit = new Fruit("Red", 5);
		Orange orange = new Orange("Yellow", 6);
		
		fruit.eat();
		orange.eat();
		orange.squeeze();
		
		System.out.println(fruit.getSize());
		System.out.println(orange.getSize());

	}

}
