package projet12_swing;

import java.awt.Color;
import javax.swing.JFrame;

public class FenetreSDZ extends JFrame{

	public FenetreSDZ(){
		
	//rend visible la fenetre qui est par défaut non visible
	this.setVisible(true);
	
	//définition du titre de la fenetre
	this.setTitle("Ma première fenêtre");
	//définition de la taille de fenetre
	this.setSize(100, 150);
	//Définition de la position de la fenetre par rapport à l'écran
	this.setLocationRelativeTo(null);
	//Termine le processus quand on ferme la fenetre
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	this.setContentPane(new PanneauSDZ());

	

		
	}
}
