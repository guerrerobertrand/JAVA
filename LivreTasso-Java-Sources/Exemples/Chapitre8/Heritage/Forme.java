/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 8 : Les principes du concept objet
#	Section  : L'h�ritage
#	Fichier  : Forme.java
#	Class    : Forme
*/

public class Forme {
 protected int x, y, couleur ;
 public Forme(int nx, int ny) {	
  x = nx ;	
  y = ny ;
  couleur = 0;
 }
 public void afficher() {
  System.out.println("Position en " + x + ", " + y);
  System.out.println("Couleur : " + couleur);
 }
 public void �changerAvec(Forme autre) {
  int tmp; 		
  tmp = x;
  x = autre.x;
  autre.x = tmp;
  tmp = y;
  y = autre.y;
  autre.y = tmp;
 }
 public void d�placer(int nx, int ny)   {						
  x = nx;						
  y = ny;	
 }
} // Fin de la classe Forme