/* Montan Lopez Erick Alfonso - A01379766
 * Luis Ángel García Méndez - A01633335
 */
public class BinaryTreeTest {
    int minValue(BinaryTreeNode root) 
    { 
        int minv = root.value; 
        while (root.left != null) 
        { 
            minv = root.left.value; 
            root = root.left; 
        } 
        return minv; 
    } 
	
    
    
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		BinaryTreeNode tmpValue = new BinaryTreeNode(55);
		BinaryTreeNode anotherValue = new BinaryTreeNode(29);
		BinaryTreeNode node43 = new BinaryTreeNode(43);
		BinaryTreeNode node44 = new BinaryTreeNode(44);
		BinaryTreeNode node110 = new BinaryTreeNode(110);
		BinaryTreeNode node150 = new BinaryTreeNode(150);
		BinaryTreeNode node60 = new BinaryTreeNode(60);
		BinaryTreeNode node70=new BinaryTreeNode(70);
		BinaryTreeNode root = null;
		
		BinaryTree bt = new BinaryTree();
		root = bt.insertNode(root, tmpValue);
		root = bt.insertNode(root, anotherValue);
		root = bt.insertNode(root, new BinaryTreeNode(17));
		root = bt.insertNode(root, new BinaryTreeNode(42));
		root = bt.insertNode(root, node60);
		root=bt.insertNode(root, new BinaryTreeNode(58));
		root=bt.insertNode(root, new BinaryTreeNode(70));
		root=bt.insertNode(root, new BinaryTreeNode(7));
		root = bt.insertNode(root, node70);
		bt.search(root, 110);

		
		
		bt.printInOrder(root);
		System.out.println();
		System.out.println(bt.printHeigh(root));
		System.out.println(bt.sum(node70));
		
		
			
		
		//---------------------------------------------------
		//Imprime los valores de el arbol
		//BinaryTreeNode tmp = root;
		
		/*while(tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.left;
		}*/
		//------------------------------------------------
		
		//System.out.println("Nodo encontrado: "+bt.search(root, 117).value);
		
	
		//bt.removeNode(root, 17);
				
		//---------------------------------------------------
		//Imprime el arbol despues de eliminar el nodo 17
		/*tmp = root;
		while(tmp != null) {
			System.out.println(tmp.value);
			tmp = tmp.left;
		}
		//------------------------------------------------------

		*/
		}
		catch(NullPointerException e){
			System.out.println("No existe el valor");
		}
	}

}