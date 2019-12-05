

public class InsertarNumero {
	static int [][] arreglo;
	
	
	public static void insertarNumeros(int tamaño,int posX,int posY,int valor) {
		int cont=0;
		arreglo=new int[tamaño][tamaño];
		cont++;
		for(int i=0;i<tamaño;i++) {
				for(int j=0;j<tamaño;j++) {
						arreglo[posX][posY]=valor;
					}
		}
		
	}
	public static void main (String[]args) {
		insertarNumeros(2, 0, 1, 6);
	}
}
