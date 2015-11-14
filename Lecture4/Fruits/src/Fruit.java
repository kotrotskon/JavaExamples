
public class Fruit {
	
	private int size;
	private String color;
	
	public Fruit(String color, int size) {
		this.color = color;
		this.size = size;
	}
	
	public int getSize(){
		return size;
	}
	
	public void eat(){
		System.out.println("Yummy!!!");
	}

}
