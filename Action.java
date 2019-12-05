//Montan Lopez Erick Alfonso - A01379766
//Luis Ángel García Méndez - A01633335
public class Action { //CContorles del reproductor
		NodeSong head;
		int song; //int song guarda la posicion de la cancion que e esta reproduciendo 
		public void addNodeAtEnd(NodeSong n) {		
			//Se va a agregando una cancion despues de la ultima agregada
			if(head == null) {
				head = n;
				head.prev = null;
				head.next = null;
			}		
			
			else {
				NodeSong tmp = head;
				while(tmp.next != null) {
				tmp = tmp.next;		
				}
				tmp.next = n;
				n.prev = tmp;
				n.next = null;
				}
			}
		public void play() { //Metodo play que inicia desde la cancion 0
			NodeSong tmp;
			tmp=head;
			this.song=0; //como se inicia desde la posicion 0, song es igual a 0
			if(head==null) {
				//Si la lista enlazada esta vacia se muestra mensaje de que no hay canciones
				System.out.println("No hay canciones");
			}
			else { //Si no estavacia la lista, se imprime la primera cancion
					System.out.println(tmp.songName+", "+tmp.artist+", "+tmp.album+", "+tmp.year);
				}
			}
			
		public void play(int ID) { //Metodo play con parametro de la cancion que se quiere escuchar por si
									//se sabe cual se quiere escuchar
			NodeSong tmp = head;
			this.song=ID; //song guarda la posicion de la cancion que se reproduce 
			if(head==null) {
				//Si la lista enlazada esta vacia se muestra mensaje de que no hay canciones
				System.out.println("No hay canciones");
			} 
			else {
			
				
			if(ID==0) {
				System.out.println(tmp.songName+", "+tmp.artist+", "+tmp.album+", "+tmp.year);

			}
				while(tmp.next != null) {
					//System.out.println("Play");
					//Verificar si entra al while
					 tmp=tmp.next;
					 if(tmp.ID==ID) {
						 	//Si el ID del nodo temp es igual al que se apsa como parametro
						 //imprime la cancion sin el ID
							System.out.println(tmp.songName+", "+tmp.artist+", "+tmp.album+", "+tmp.year);
					 		}	
					 	}
					}
			
		}
		//A continuacion se hicieron dos metodos mas con una implementacion diferente para el next y prev.
		
		/*public void next() {
			NodeSong tmp;
			tmp=head;
			while(tmp.next!=null) {
				tmp=tmp.next;
			if(tmp.ID==this.song) {
				this.song=this.song+1;
				play(this.song);
				}
			}
			
		}
		public void prev() {
			NodeSong tmp;
			tmp=head;
			int aux;
			while(tmp.next!=null) {
				tmp=tmp.next;
			
			if(tmp.ID==this.song) {
				this.song=this.song-1;
				play(this.song);
				}
			}
			
		}
		*/
		public void next() {
			//Se busca la cancion actual , luego se cambia a la siguiente canción
			NodeSong tmp;
			int i=0;
			tmp=head;
			for( i=0; tmp.next!=null && i<this.song;i++) { //Se busca la cancion actual 
				tmp=tmp.next;
				if(tmp.ID==this.song){
					
					if(tmp.next==null) {
						System.out.println(" "); //Cuando se de next, el siguiente debe solo imprimira espacio en blanco
					}else
						{
						tmp=tmp.next;
						play(tmp.ID); //Se llama al metodo que imprime la canción actual
						}
					}
				}
			}
		public void prev() {
			NodeSong tmp;
			tmp=head;
			int i=0;
			for( i=0; tmp.next!=null && i<this.song;i++) { //Se busca la cancion actual
				tmp=tmp.next;
				if(tmp.ID==this.song){
					tmp=tmp.prev;
					if(tmp.ID==0) {
						System.out.println(" "); //Si se quiere imprimir una cancion antes, se va a imprimir un espacio vacio
					}
					play(tmp.ID);//Se llama el metodo que imprime la canción actual
				}
			}
		}
		public static void main (String []args) {
			Action ac=new Action();
			NodeSong song1=new NodeSong("China", "Anuel AA", "Sencillo", "2019", 0);
			NodeSong song2=new NodeSong("Te boté", "Casper Magico", "Sencillo", "2017", 1);
			NodeSong song3=new NodeSong("BEBÉ", "6ix9ine", "Dummy Boy", "2018", 2);
			NodeSong song4=new NodeSong("Alone in a room", "Asking Alexandria", "When the lights come on", "2019", 3);
			NodeSong song5=new NodeSong("Throne", "BMTH", "That spirit", "2015", 4);
			
			
			//Test de las canciones
			ac.addNodeAtEnd(song1);
			ac.addNodeAtEnd(song2);
			ac.addNodeAtEnd(song3);
			ac.addNodeAtEnd(song4);
			ac.addNodeAtEnd(song5);
			ac.play(0);
			System.out.println("----------------------------------------------------");
			ac.prev();
			System.out.println("-----------------------------------------------------");
			ac.prev();
			System.out.println("-----------------------------------------------------");
			//ac.prev();
			
		}
}

