
public class CopiaArreglos {
		
	public static void  CopiaArreglo(int[][]arreglo1) {
		int tamaño=0;
		int contador=0;
		for (int i=0;i<arreglo1.length;i++) {
				tamaño++;
		}
		int [][]arreglo2=new int[tamaño][tamaño];
				while(contador<tamaño) {
					for (int i=0;i<arreglo1.length;i++) {
						arreglo2[i][contador]=arreglo1[i][contador];			
				}
					contador++;
		}
		for (int i=0;i<tamaño; i++) {
			for (int j = 0; j < arreglo2[i].length; j++) {
				System.out.print(arreglo2[i][j]+", ");
			}
		}
	}
	
	
	public static void main (String[]args) {
		int[][]arreglocopia= {{2,3,3},{5,4,5},{3,3,7}};
		CopiaArreglo(arreglocopia);
	}
}
