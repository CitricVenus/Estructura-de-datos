import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * SOCIAL NETWORK
 * Hecho por:
 * Luis Ángel García Méndez A01633335
 * Erick Montán 
 * 
 * IMPORTANTE: Agrandar la consola para visualizar mejor el contenido y
 * asegurarse de estar dentro para poder usar el programa y elegir las opciones
 */


public class AdjList {

	int n;
	LinkedList<Persona> arrpersona[];

	
	@SuppressWarnings("unchecked")
	public AdjList(int i) {
		
		this.n= i;
		
		arrpersona = new LinkedList[i];
		for(int j =0; j < n; j++) {
			arrpersona[j] = new LinkedList<Persona>();
		}			
	}
	/*Agrega directamente en el grafo al nodo*/
	public void agregarPersonas(Persona persona) {
				arrpersona[persona.ID].add(persona);
		
	}
	public void aconectarPersona(Persona persona, Persona persona2) {
		if(persona.ID==persona2.ID){
			JOptionPane.showMessageDialog(null, "No te peudes gregar a ti mismo");
			
		}else {
		arrpersona[persona.ID].add(persona2);		
		arrpersona[persona2.ID].add(persona);
		}
	}
	/*Este metodo llama al metodo aceptarDenegar, 
	 y recibe la persona a quien se le va a mandar la solicitud
	 se hizo un metodo para que sea mas sencillo hacer las acciones
	*/
	public void enviarSolicitud(Persona persona) {
		acptDen();
	}
	
	
	/*
	 * Menu con el que ocurre todo el programa
	 * Debe llamarse en la main
	 * Todo el proceso ocurre en consola
	 * Recibe una persona que simula como si inicará sesión
	 */
	public void menu(Persona personau) {
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
        	System.out.println("¡BIENVENIDO A CARA LIBRO " + personau.name + "!");
        	System.out.println("\n");
        	System.out.println("ELIGE UNA OPCION DEL SIGUIENTE MENU: \n");
        	System.out.println("******");
            System.out.println("1. Agregar amigo");
            System.out.println("2. Buscar Amigo");
            System.out.println("3. Salir \n");
            System.out.println("******");
 
            try {
 
                System.out.println("¿Que quieres hacer?");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Agregar amigo");
                        	Scanner sn1 = new Scanner(System.in);
                        	int opcion2;
                        	System.out.println("Escribe el ID de la persona a agregar");
                        	 opcion2 = sn.nextInt();
                        	 agregaAristas(personau, arrpersona[opcion2].element());
                        	 printGraph();
                        	
                        	
                        break;
                    case 2:
                        System.out.println("Has seleccionado Buscar amigo");
                        System.out.println("1. Personas Disponibles ");
                        System.out.println("2. Amigos de un amigo ");
                        Scanner sn2 = new Scanner(System.in);
                        
                        int bamigo = sn2.nextInt();
                        if(bamigo == 1) {
                       
                        System.out.println("Dame el id de la personas disponibles que quieres agregar: ");
                        DFSRecursion(0);
                        agregaAristas(personau, arrpersona[bamigo].element());
                        printGraph();
                        }
                        if(bamigo == 2) {
                        	System.out.println("Elige la persona de quien quieres ver sus amigos: ");
                        	for(Integer i = 0; i < arrpersona[personau.ID].size()-1; i++) {
                        	System.out.println(arrpersona[personau.ID].get(i));
                        	}   
                        	   Scanner sn3 = new Scanner(System.in);
                        	   int valor2 = sn3.nextInt();
                        	   DFSRecursion(valor2);
                        	   System.out.println("Elige el id de la persona que quieres agregar:" );
                        	   Scanner sn4 = new Scanner(System.in);
                        	   int valor3 = sn4.nextInt();
                               agregaAristas(personau, arrpersona[valor3].element());
                               printGraph();
                        }
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
		
	/*
	 * Aqui se conectan a las dos personas en el grafo
	 * 
	 */
	public void agregaAristas(Persona persona, Persona persona2) {
		if(acptDen()==true) {
				if(persona.ID==persona2.ID) {
					JOptionPane.showMessageDialog(null, "No te peudes gregar a ti mismo");
					System.out.println("Regresando al menú");
					menu(persona);
					}else {
						arrpersona[persona.ID].add(persona2);		
						arrpersona[persona2.ID].add(persona);
					}
				}
			else {
				System.out.println("No se acepto la solicitud");
			}
		
	}
	
	/*
	 * Aquí se la parte del request que se le envia a una persona
	 */
	public void solicitud(Persona persona, Persona persona2) {
		acptDen();
	}
	
	/*
	 * Aquí se se tiene el Connect Confirmation
	 */
	public boolean acptDen() {
		int resp=JOptionPane.showConfirmDialog(null, "Acepta solicitud?");
		if(resp==0) {
			 return true;
		}
		else {
			return false;
		}
	}

	//Metodo para visualizar la lista de adyacencia del grafo
	public void printGraph() { 
		System.out.println("Printing the graph");
		System.out.println("----------------------------------------------");
		for(Integer i = 0; i < arrpersona.length; i++) {			
			System.out.println("La persona " + i + " esta conectada con: ");
			
			for(Persona current: arrpersona[i]) {
				System.out.print(current+"---->");
				}
			System.out.println("\n");
			}
			
		}
	
	//Metodo recursivo para buscar todas las personas en el grafo
	//Que serían todas las personas disponibles en la Red Social
    public void DFSRecursion(Integer startVertex){
        boolean [] visited = new boolean[n];
        dfs(startVertex, visited);
    }

    public void dfs(Integer start, boolean [] visited){
        visited[start] = true;
        System.out.print(arrpersona[start].element() + " || ");
        for (int i = 0; i <arrpersona[start].size() ; i++) {
            Integer destination = (arrpersona[start].get(i)).ID;
            if(!visited[destination])
                dfs(destination,visited);
        }
    }
			
	
	public static void main (String[]args) {
		AdjList sn=new AdjList(10);
		Persona p0=new Persona(0, "Erick");
		Persona p1=new Persona(1, "Luis");
		Persona p2=new Persona(2, "Emanuel");
		Persona p3= new Persona(3, "Hyuntae");
		Persona p4 = new Persona(4, "Salas");
		Persona p5 = new Persona(5, "Isaac");
		Persona profe = new Persona(6, "Pineda");
		sn.agregarPersonas(p0);
		sn.agregarPersonas(p1);
		sn.agregarPersonas(p2);
		sn.agregarPersonas(p3);
		sn.agregarPersonas(p4);
		sn.agregarPersonas(p5);
		sn.aconectarPersona(p0, p0);
		sn.aconectarPersona(p0, p1);
		sn.aconectarPersona(p0, p2);
		sn.aconectarPersona(p0, p3);
		sn.aconectarPersona(p0, p4);
		sn.menu(profe);
	}
}
