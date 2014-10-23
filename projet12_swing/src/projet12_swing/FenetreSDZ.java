package projet12_swing;

import java.awt.Color;
import javax.swing.JFrame;

public class FenetreSDZ extends JFrame{

	public FenetreSDZ(){
		
	//rend visible la fenetre qui est par d�faut non visible
	this.setVisible(true);
	
	//d�finition du titre de la fenetre
	this.setTitle("Ma premi�re fen�tre");
	//d�finition de la taille de fenetre
	this.setSize(100, 150);
	//D�finition de la position de la fenetre par rapport � l'�cran
	this.setLocationRelativeTo(null);
	//Termine le processus quand on ferme la fenetre
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	this.setContentPane(new PanneauSDZ());

	

		
	}
}
