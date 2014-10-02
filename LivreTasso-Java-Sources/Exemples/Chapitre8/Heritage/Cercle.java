/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 8 : Les principes du concept objet
#	Section  : L'h�ritage
#	Fichier  : Cercle.java
#	Class    : Cercle 
*/
import java.util.*;
public class Cercle extends Forme {
 public final static int TailleEcran = 600 ;private int  r ; 
 public Cercle(int xx, int yy)	{
   super(xx, yy);
   couleur = 10;
   r = rayonV�rifi�();
 }
 public void afficher()  {
  super.afficher();
  System.out.println("Rayon : " + r);
 }
 private int rayonV�rifi�() {
        Scanner lectureClavier = new Scanner(System.in);
	int tmp;
	do  {
		System.out.print("Rayon          :  ");
		tmp = lectureClavier.nextInt();
	} while ( tmp < 0 || tmp > TailleEcran) ;
	return tmp; 
 } 
 private int rayonV�rifi� (int tmp) {
	if (tmp < 0) return 0;
	else if ( tmp > TailleEcran) return TailleEcran ; 
	else return tmp;
 }
 public double p�rim�tre() {
  return 2*Math.PI*r;
 }
 public void agrandir(int nr) {
  r = rayonV�rifi�(r + nr);	
 }
} // Fin de la classe Cercle