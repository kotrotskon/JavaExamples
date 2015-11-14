
public class Array2d {

	public static void main(String[] args) {
		int[][] array = {{2, 1, 8},{2, 6},{7, 9}};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
