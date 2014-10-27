//Chapitre 23 = bouton personnalis� 

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;


public class FenetreH extends JFrame {
	private JPanel pan = new JPanel();
	private BoutonH bouton = new BoutonH("Mon bouton Perso !");
	

public FenetreH(){
		this.setTitle("Fenetre avec Bouton Perso");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//On d�finit le Layout � utiliser sur le content Pane
		this.setLayout(new GridLayout(3,2));
		
		// ajout du bouton � notre ContentPane
		pan.add(bouton);
		this.setContentPane(pan);
		this.setVisible(true);
		
	}
	
	

		
		
}
	
	

