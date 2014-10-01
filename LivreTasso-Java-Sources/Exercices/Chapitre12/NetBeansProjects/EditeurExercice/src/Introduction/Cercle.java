/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Exercice 12.8 à 12.12
#	Fichier  : Cercle.java
#	Class    : Cercle
*/
// Le fichier Cercle.java se trouve dans le répertoire 
// Sources/Exercices/Chapitre12/NetBeansProjects/EditeurExercice/src/Introduction
package Introduction;


import java.awt.Graphics;
public class Cercle extends Forme {
 private int rayon ;
 
 public Cercle( int nx, int ny, int nr, int nc){
   super(nx, ny, nc);
   rayon = verifier(nr, 0, hauteurEcran);
 }
 public Cercle()	{
    rayon = verifier("Rayon : ", 0, hauteurEcran);
  }
@Override
public void dessiner(Graphics g) {
        super.dessiner(g);
	g.fillOval(x, y, rayon, rayon);
}
 
 @Override
 public void afficher()  {
  super.afficher();
  System.out.println("Rayon : " + rayon);
 }

@Override
public String getInfos() {
        String tmp = super.getInfos();
 	return "C;"+tmp+";"+rayon+";";
 }
} // Fin de la classe Cercle