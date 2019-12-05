//Montan Lopez Erick Alfonso - A01379766
//Luis Ángel García Méndez - A01633335
public class NodeSong {
	int ID;
	String songName;
	String artist;
	String album;
	String year;
	
	public NodeSong(String songName,String artist,String album, String year, int ID) {
		this.songName=songName;
		this.artist=artist;
		this.album=album;
		this.year=year;
		this.ID=ID;
	}
	
	NodeSong next, prev;
}
