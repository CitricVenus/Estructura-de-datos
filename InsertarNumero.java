

public class InsertarNumero {
	static int [][] arreglo;
	
	
	public static void insertarNumeros(int tama�o,int posX,int posY,int valor) {
		int cont=0;
		arreglo=new int[tama�o][tama�o];
		cont++;
		for(int i=0;i<tama�o;i++) {
				for(int j=0;j<tama�o;j++) {
						arreglo[posX][posY]=valor;
					}
		}
		
	}
	public static void main (String[]args) {
		insertarNumeros(2, 0, 1, 6);
	}
}
