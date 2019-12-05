/* Montan Lopez Erick Alfonso - A01379766
 * Luis Ángel García Méndez - A01633335
 */

public class BinaryTree {
	
	BinaryTreeNode root;
	
	
	public BinaryTreeNode insertNode(BinaryTreeNode root, BinaryTreeNode node) {
		if(root == null) {
			root = node;
			//return root;
		}
		else {
			/// If the value to be inserted is smaller 
			/// it will be inserted in the left sub-tree
			if(node.value < root.value) {
				///Go left
				root.left = insertNode( root.left,node);
			}
			/// If the value to be inserted is larger 
			/// it will be inserted in the right sub-tree
			else if(node.value > root.value) {
				//// Go right
				root.right = insertNode( root.right,node);
			}
		}
		return root;
	}
	
	public BinaryTreeNode removeNode(BinaryTreeNode root, int key) {
		
		if(root == null) {
			return root;
		}
		
		///Else go down the tree
		
		if(key > root.value) {
			root.right = removeNode(root.right, key);
		}
		else if(key < root.value) {
			root.left = removeNode(root.left, key);
		}
		
		 // if key is same as root value, then THIS IS THE NODE 
		 // WE ARE TRYING TO DELEVE
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            
            root.value = minValue(root.right); 
  
            
            root.right = removeNode(root.right, root.value); 
        } 
		
		
		
		
	    return root;	
	}
	
	public void printInOrder(BinaryTreeNode root) {
		if(root==null){
			return ; //Se verifica si no es null el primer nodo
		}else {
			printInOrder(root.left); 
			System.out.print(root.value+","); 
			printInOrder(root.right);
			
		}
		//Otra implementacion 
		/*
		 * if (root.left!=null){
		 * printInOrder()
		 * }
		 * if()
		 * 
		 */
	}
	public int printHeigh(BinaryTreeNode root) {
		if(root==null) {
			return 0; //Se verifica si no es null el primer nodo
		}
		else {
			int auxleft=printHeigh(root.left);
			int auxright=printHeigh(root.right);
			//los valores de aux se inician en 0;
			if(auxleft==auxright) {
				return auxleft+1;
				//en caso de que los dos sean iguales, se pude devolver cualquiera
				//de los dos auxiliares
			}
			if(auxleft>auxright) {
				return (auxleft+1);
				//cada que pasa a el siguiente nodo, como inicia los aux en 0,
				//Se va a ir sumando uno 
				//en este caso si al ir sumando +1, si el auxleft vale mas que 
				// el auxright, se devuelve el valor de auxleft
			}
			else{
				return (auxright+1);
				//contrario a el if anterior, aquí se devuelve auxright ya que 
				//este tendra un valor mayor.
				
			}
		}
	}
	public int sum(BinaryTreeNode node) {
		if(node==null) {
			return 0;//Se verifica si no es null el primer nodo
		}
	    if(node.left == null && node.right==null){
	    	//hasta que que de los dos lados el siguiente sea null,
	    	//Va a parar la recursividad
	        return node.value;
	    }
	    return sum(node.left)+sum(node.right)+node.value;
	    //ya sabiendo hasta donde se va a detener, se va a ir regresando
	    //y va a sumar hasta que que llegue al vaor de el nodo que se pasa como parametro
	}
	public int minValue(BinaryTreeNode root) {
		while(root.left != null) {
			root = root.left;
		}
		return root.value;
	}

	public BinaryTreeNode search(BinaryTreeNode root, int key){
		if(root==null) {
			return null;//Se verifica si no es null el primer nodo
		}
		else{
			if(root.value==key) {
				return root; //si el valor a encontrar es igual a la raiz, se regresa la raiz
			} 
			else if(key<root.value) {
				return search(root.left, key);
			} //Si la llave es menor a la raiz, se va a ir buscando 
				//de la rama izq hasta encontrar el valor
			else if(key>root.value) {
				return search(root.right, key);
			}
			//si el valor es mayor, va a buscar por la raiz derecha
		}
		return null;
	
	}	
	
	
    

}
