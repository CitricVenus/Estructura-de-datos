//Montan Lopez Erick Alfonso - A01379766
//Luis Ángel García Méndez - A01633335
public class PortaPapeles {
	NodoStack puntero;
	int cont;
	public void addNodeAtEnd(NodoStack n) {  //El push mete los nodos a la lista enlazada
										//Se verifica si no hay nada primero
		NodoStack tmp=puntero;
		if(puntero==null) {
			puntero=n;
			puntero.next=null;
		}
		else {
			while(tmp.next!=null) {
				tmp=tmp.next;
			}
				tmp.next=n;
				tmp=tmp.next;
				tmp.next=null;
			
		}
	}
	public void peek() { //El metodo peek se utiliza para saber el tamaño de la lista enlazada
							//este ismo metodo le da el valor al contador que se usara en los demas metodos
		NodoStack tmp=puntero;
		while(tmp.next!=null) {
			tmp=tmp.next;
			this.cont++;  //contador se suma hasta la utima posicion de la lista
		}

	}
	public void deshacer() { //El metodo deshacer funciona un poco similar al metodo rehacer
							//Este metodo resta el cont, haciendo que se imprima de 0 a cont-1; 
		int aux=0;
		NodoStack tmp=puntero;
		while(tmp.next!=null && cont > aux) {
			System.out.print(tmp.letra);
			tmp=tmp.next;
			aux++;
			}
		cont--;
		System.out.println();
		}
	public void rehacer() { // hace la funcion de CTRL+Y
		int aux = 0;              //Se usa un auxiliar para que imprima las letras hasta la posicion del cont++
		NodoStack tmp=puntero;		
		this.cont++;						//cont++ guarda la posicion en la que se queda el apuntador
		while(tmp!=null && aux<=this.cont) { //mientras sea tmp diferente de null y el aux menor que cont, va a imprimir la palabra 
												//que contiene el nodo
			System.out.print(tmp.letra);
			tmp=tmp.next;
			aux++;
		}
		System.out.println();
		
	}
	public void print() { //Imprime la palabra para ver que palabra esta escrita
		NodoStack tmp=puntero;
		while (tmp!=null) {
			System.out.print(tmp.letra);
			tmp=tmp.next;
			
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		
		//Tests para verificar el funcionamiento de la clase
		
		
		PortaPapeles paper=new PortaPapeles();
		NodoStack letra1=new NodoStack("H");
		NodoStack letra2=new NodoStack("E");
		NodoStack letra3=new NodoStack("L");
		NodoStack letra4=new NodoStack("L");
		NodoStack letra5=new NodoStack("O");
		
		paper.addNodeAtEnd(letra1);
		paper.addNodeAtEnd(letra2);
		paper.addNodeAtEnd(letra3);
		paper.addNodeAtEnd(letra4);
		paper.addNodeAtEnd(letra5);
		
	
		paper.peek();
		paper.print();
		paper.deshacer();
		paper.deshacer();
		paper.deshacer();
		paper.deshacer();
		paper.deshacer();
		paper.rehacer();
		paper.rehacer();
		paper.rehacer();
		paper.rehacer();
		paper.rehacer();
		paper.rehacer();
		
		
		
		
	}
}
	