//Montán López Erick Alfonso
//A01379766
//Para este codigo obtuve la ayuda de Luis Angel Garcia Mendez.
public class BinarySearch {
	public static void bidimensionalBinarySearch(int[][] array, int x) {
		int temp = 0;
		
		for(int i = 0; i < array.length;i++) {
			for(int j = 0; j < array[i].length; j++) {
				temp = array[i][j];
				
				if(temp == x) {
					System.out.println(x +"" + i + "," + j);
					}
				}
			}
		}
}
