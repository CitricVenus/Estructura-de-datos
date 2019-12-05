
public class LinkedListSong {
	Node3 head;
	public void insertNode(int index) {
		Node3 tmp;
		tmp=head;
		if(tmp==null) {
			
		}
	}
	public void removeNode(int index) {
		
	}
	public void findNode(int ID) {
		
	}
	
	
}

class Node3{
	public Node3(String name,String title,int ID) {
		this.name=name;
		this.ID=ID;
		this.title=title;
	}
	String name,title;
	int ID;
	Node next;
}
