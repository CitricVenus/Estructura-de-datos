//Montan Lopez Erick Alfonso - A01379766
//Luis Ángel García Méndez - A01633335

public class LinkedListManager {	
	Node head=null;
	public void addNode(Node n) {
		//// The list is brand new
		if(head==null) {
			head=n;
			head.next=null;
		}
		else {////I already have a list with at least One node
	 		Node tmp=head;
			////Searchig for the last node
			while(tmp.next!=null) {
				tmp=tmp.next;
			}
			/// i found it and i need to add it to the end
			tmp.next=n;
			////move the tmp to the last one
			tmp=tmp.next;
			////next of last one should be NULL
			tmp.next=null;
		}

	}
	public void printList() {
		Node tmp=head;
		while (tmp!=null) {
			System.out.println(tmp.title);
			tmp=tmp.next;
			
		}
	}
	public void deletNode(int id) {
		Node tmp=this.head;
		while(tmp.next!=null && tmp.next.ID!=id){//se hace el while comparando que el nodo no sea null
												//al igual que sea diferente de el ID para cuando se quiera borrar el ultimo nodo
		tmp=tmp.next;
		  }
		if(tmp.next.ID==id){ 
		tmp.next=tmp.next.next;
		}
	}
	
	
	public void updateNode(int ID, String author, String title) {
		Node tmp=head;
		if(ID==head.ID) {
			head.name=author;
			head.title=title;
		}
		while(tmp.next!=null) {
			tmp=tmp.next;
			if(tmp.ID==ID) {//Cuando coinciden los ID se cambian los datos, se actualiza
				tmp.name=author;
				tmp.title=title;
				}
			}
		}
	
	public void insertNode(int index, Node n) {			
		Node tmp=head;
		Node prev;
			if(index==0) {
				n.next=head;
				head=n;
			}
			for(int i=0;tmp.next!=null && i<index;i++) {	
				if(i==index-1) {
					prev=tmp;
					tmp=tmp.next;
					prev.next=n;
					n.next=tmp;
				}
				else if(tmp.next==null) {
					n.next=tmp;
					tmp.next=n;
				}
			tmp=tmp.next;
			}				
		}
	public boolean hasLoop(Node head) {//Para este metodo se uso dos nodos, uno que brinaca de uno en uno, el segundo va de dos en dos
						//En algun momento los dose se encontraran, en ese momento el metodo regresara true ,
						//Si el caso es que el ultimo nodo.next es igual a null regresará false
			Node tmp=head;
			Node tmp2=head;
			while(tmp2 != null && tmp2.next != null) {
				tmp=tmp.next;
				tmp2=tmp2.next.next;
				if(tmp==tmp2) {
					return true;
				}
			}	
			 return false;
		}
	public static void main (String[]args) {
		Node test1=new Node("Victor Hugo","Los miserales 1",1);
		Node test2=new Node("Desconocido2","Libro 2",2);
		Node test3=new Node("Desconocido 3","Libro 3",3);
		//Mas Nodos para verificar la funcion de eliminar e insertar
		//Node test4=new Node("Desconocido 4","Libro 4",4);
		//Node test5=new Node("Desconocido 5","Libro 5",5);
		//Node test6=new Node("Desconocido 6","Libro 6",6);
		//Node test7=new Node("Desconocido 7", "Libro 7", 7);
		LinkedListManager llMgr= new LinkedListManager();
		llMgr.addNode(test1);
		llMgr.addNode(test2);
		llMgr.addNode(test3);
		//llMgr.addNode(test4);
		//llMgr.addNode(test5);
		//llMgr.addNode(test6);
		llMgr.printList();
		//Division de los nodos agregados
		System.out.println("--------");
		//Test de los metodos de tarea
		llMgr.deletNode(0);
		//llMgr.insertNode(1,test7);
		llMgr.updateNode(3, "Actualizacion 1", "Titulo actualizado");//Prueba de que se actualizan los datos
		llMgr.printList();
		
		//llMgr.agregarLoop();
		//Prueba de  hasLoop
		/*if(llMgr.hasLoop(test6)==true) {
			System.out.println("Si tiene loop");
		}
		else {
			System.out.println("No tiene loop");
		}
	
		
	}*/
	}
}
class Node{
	public Node(String name,String title,int ID) {
		this.name=name;
		this.ID=ID;
		this.title=title;
	}
	String name,title;
	int ID;
	Node next;
}


