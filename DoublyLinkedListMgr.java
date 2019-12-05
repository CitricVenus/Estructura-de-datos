//Montan Lopez Erick Alfonso - A01379766
//Luis Ángel García Méndez - A01633335
public class DoublyLinkedListMgr {
	Node2 head;
	// Adding a node to the end of the list
		// This is making the list behave as queue	
		public void addNodeAtEnd(Node2 n) {		
			//checking if head is null, meaning there is nothing in the list yet
			if(head == null) {
				head = n;
				head.prev = null;
				head.next = null;
			}		
			// comes here if there is at least one node in the list 
			else {
				Node2 tmp = head;
				// this could be the 2nd or n-th node in the list, so we go to the edge of the list, with this while
				while(tmp.next != null)
					tmp = tmp.next;		
				// connect the node n to the end of the list
				tmp.next = n;
				n.prev = tmp;
				n.next = null;
			}
		}	
		
	//Aqui se supone que se debe hacer sin recorrer el arreglo
	//INsert based on the ID value 
		
	
	
	public void deleteNodeAtFront() {
		// checking that the head is not null, otherwise, the list is empty
		// This will continue making the list behave as a queue
		if(head != null) {			
			// moving the head to the next one because the current will deleted
			head = head.next;
			if(head != null)
				head.prev = null;
		}		
	}
	public void insertNode(int index, Node2 n) {
		Node2 tmp;
		tmp=head;
		int i=0;
		if(index==0) {
			tmp.prev=n;
			n.next=tmp;
			n.prev=null;
			head=n;
		}
		
		for( i=0; tmp.next!=null && i<index;i++) {
			tmp=tmp.next;
		}
			if(i==index) {
				tmp.prev.next=n;
				n.prev=tmp.prev;
				n.next=tmp;
				tmp.prev=n;
				
			}
			if(tmp.next==null) {
				tmp.next=n;
				n.prev=tmp;
				n.next=null;
			}
			
		}
	public void printList() {
		Node2 tmp = head;
		if(tmp == null) {
			System.out.println("The list is empty");
		}
		
		while(tmp != null) {
			System.out.println(tmp.name);
			tmp = tmp.next;
		}
		
	}
	public void findNode(int ID) {
			Node2 tmp;
			tmp=head;
			if(head==null) {
				System.out.println("No hay datos");
			}
			else {
			while(tmp.next!=null) {
				tmp=tmp.next;
				if(tmp.ID==ID ) {
				System.out.println(tmp.ID+" "+tmp.name);
				}
				
				}
			}
	}
	public void removeNode(int index) {
		Node2 tmp;
		tmp=head;
		int i=0;
		if(index==0) {
			head=tmp.next;
			head.prev=null;
			tmp.next=null;
		}
		else {
		
		for( i=0; tmp.next!=null && i<index;i++) {
			tmp=tmp.next;
		}
		if(tmp.next==null) {
			tmp.prev.next=null;
			tmp.prev=null;
		}
		else {
				tmp.prev.next=tmp.next;
				tmp.next.prev=tmp.prev;
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX_NODES = 3;
		
		DoublyLinkedListMgr mgr = new DoublyLinkedListMgr();
		Node2 tmp = null;
		Node2 test1=new Node2("Nodo insertado1", 4);
		Node2 test2=new Node2("Nodo insertado2", 6);
		Node2 test3=new Node2("Nodo insertado3", 0);

		
		//Creating nodes in a loop
		for(int i = 0; i < MAX_NODES; i++ ) {
			tmp = new Node2("Node " + i, i );
			mgr.addNodeAtEnd(tmp);	
		}
		
		
		
		mgr.printList();
		System.out.println("-------------------------------------------------------");
		
		mgr.insertNode(1,test1);
		mgr.insertNode(2, test2);
		mgr.insertNode(3, test3);
		mgr.removeNode(2);
		mgr.printList();
		mgr.findNode(3);

	}
}

class Node2{
	public Node2(String name,int ID) {
		this.name=name;
		this.ID=ID;
	}
	String name;
	int ID;
	Node2 next, prev;
}



