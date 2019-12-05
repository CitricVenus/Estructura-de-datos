
public class CircularLinkedListManager {
	CircularNode head;
	CircularNode last;
	public CircularLinkedListManager() {
		head=null;
		last= null;
	}
	public void printList() {
		CircularNode tmp;
		tmp=head;
		while(tmp!=last) {
			System.out.println("Name: "+tmp.name);
			tmp=tmp.next;
		}
		if(tmp==last) {
			System.out.println("Name: "+tmp.name);
		}
	}
	public void insertNodeAtEnd(CircularNode n) {
		if(head==null) {
			head=n;
			last=n;
		}
		else {
			n.next=head;
			last.next=n;
			last=n;
		}
	

	}
	public void deletNodeAtBeginning() {
		CircularNode tmp;
		tmp=head;
		if(last!=null & head!=null) {
			head=head.next;
			last.next=tmp.next;
			tmp.next=null;
			tmp=null;
		}
	}
	public static void main (String []args) {
		CircularNode node=new CircularNode("Nuevo");
		CircularNode node2=new CircularNode("Nuevo2");
		CircularNode node3=new CircularNode("Nuevo3");
		CircularLinkedListManager mgr= new CircularLinkedListManager();
		mgr.insertNodeAtEnd(node);
		mgr.insertNodeAtEnd(node2);
		mgr.insertNodeAtEnd(node3);
		
	}
}
class CircularNode {
	public CircularNode(String n) {
	this.name=n;
	}
	
	String name="";
	CircularNode next;
}

	