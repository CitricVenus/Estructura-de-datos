import java.awt.Dimension;

import javax.swing.JFrame;

public class NetworkSocial extends JFrame {
	public NetworkSocial() {
		super("Social Network");
		this.setSize(new Dimension(800, 700));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		this.setResizable(true);
		this.setVisible(true);	
		MenuPrincipal mp=new MenuPrincipal(this);
		this.add(mp);
		this.pack();
	}
	public static void main (String []args) {
		NetworkSocial vtn=new NetworkSocial();

	}
}
