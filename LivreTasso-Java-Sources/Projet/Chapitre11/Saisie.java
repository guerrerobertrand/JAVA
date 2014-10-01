/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 11 : Dessiner des objets
#	Section  : Projet  - Les types utilis�s dans cette applications sont d�finis dans le r�pertoire commun
#	Fichier  : Saisie.java
#	Class    : Saisie
*/

import java.awt.*;
import java.awt.event.*;
public class Saisie implements ActionListener {
	ListeCompte lc;
	TextField r�ponse;
	 public Saisie (ListeCompte tmp_lc)	{
		lc = tmp_lc;
		Frame f = new Frame ("Saisie du n� de Compte");
		f.setSize(300, 50);     // taille de la fenetre
		f.setBackground(Color.white);
		f.setLayout(new BorderLayout());
		f.add (new Label("Numero du compte :"), "West");
		r�ponse = new TextField(10);
		f.add(r�ponse, "East");
		r�ponse.addActionListener(this);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent evt) {
		String num�ro = r�ponse.getText();		
		Compte cpte = 	new Compte("");
		cpte = lc.quelCompte(num�ro);
		if (cpte != null) {
			Stat s = new Stat(cpte);
			new Fenetre (s);
		}
	}
}	