
public class Orange extends Fruit{
	
	public Orange(String color, int size) {
		super(color, size);
	}
	
	public void squeeze(){
		System.out.println("Juice");
	}
	
	@Override
	public int getSize() {
		System.out.println("go go");
		return super.getSize();
		
	}
}
