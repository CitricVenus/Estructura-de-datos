//Montán López Erick Alfonso
//A01379766
//Estructura de datos 
public class TorreDeHanoi {
	//Torre de hanoi con 3 bases
	public static void resuelveTorre(int numdisc,String primero,String tercero,String segundo) {
		    if (numdisc >= 1) {
		    	//Se hace la operacion mientras haya mas de un disco 
		        resuelveTorre(numdisc-1,primero,segundo,tercero);
		        imprimeMovimiento(primero,tercero);
		        resuelveTorre(numdisc-1,segundo,tercero,primero);
		    	}
			}

		
		public static void imprimeMovimiento(String primerlugar,String segundolugar){
			//Imprime los movimientos de los discoas hacia las torres
		    System.out.println("mover disco de: "+ primerlugar +",a :"+segundolugar);
		}
		    public static void main (String []args) {
		    	//Se prueba con una torre de 3 discos
		    	resuelveTorre(3,"A","B","C");
		    	//se hace prueba con torre de 4 discos
		    	//resuelveTorre(4,"A","B","C");
		    	//Se hace prueba con 5 discos
		    	//resuelveTorre(5,"A","B","C");
		    	
		    	
		    }
}
