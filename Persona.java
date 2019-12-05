
public class Persona <T> {
	int ID;
	String name;
	Persona next;
	Boolean visita;
	
	public  Persona (int id, String name) {
		this.ID=id;
		this.name=name;
		visita = false;
	}
	
	public String toString() {
		return this.ID+", "+this.name;
	}
	 
}
