/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 11 : Dessiner des objets
#	Section  : Projet  - Les types utilis�s dans cette applications sont d�finis dans le r�pertoire commun
#	Fichier  : GestionQUitter.java
#	Class    : GestionQuitter
*/

import java.awt.event.*;

public class GestionQuitter extends WindowAdapter implements ActionListener {
 
  public void actionPerformed(ActionEvent e) {
   System.exit(0);
 }
  public void windowClosing(WindowEvent e) {
   System.exit(0);
 }
}