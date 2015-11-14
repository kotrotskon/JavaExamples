
public class Main {

	public static void main(String[] args) {
		
		Grape grape1 = new Grape();
		Grape grape2 = new Grape();
		Grape grape3 = new Grape();
		
		Grape[] grapes = {grape1, grape2, grape3};
		
		GrapePress press = new GrapePress();
		
		press.getWine(grapes);

	}

}
