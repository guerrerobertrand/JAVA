/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 11 : Dessiner des objets
#	Section  : Projet  - Les types utilis�s dans cette applications sont d�finis dans le r�pertoire commun
#	Fichier  : Saisir.java
#	Class    : Saisir
*/

import java.awt.*;
import java.awt.event.*;
public class Saisir implements ActionListener {
	TextField tf;
	public Saisir( TextField tmp){
		tf = tmp;
	}
	public void actionPerformed(ActionEvent evt) {
	int j  =Integer.parseInt(tf.getText(), 10);		
		System.out.println("J = "+j);
	}
}