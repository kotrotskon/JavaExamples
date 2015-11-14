
public class GrapePress {
	
	int totalWine = 0;
	
	public void getWine(Grape[] grapes){
		for (int i=0; i<grapes.length; i++) {
			totalWine = totalWine + grapes[i].crash();
		}
		
		System.out.println(totalWine);
	}

}
