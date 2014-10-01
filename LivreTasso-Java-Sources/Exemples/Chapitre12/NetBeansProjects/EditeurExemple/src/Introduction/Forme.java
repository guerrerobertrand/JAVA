/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Un éditeur pour dessiner
#	Fichier  : Forme.java
#	Class    : Forme
*/
// Le fichier Forme.java se trouve dans le répertoire 
// Sources/Exemples/Chapitre12/NetBeansProjects/EditeurExemple/src/Introduction
package Introduction;

import java.util.*;
import java.awt.Graphics;
import java.awt.Color;
public class Forme {
 public final static int largeurEcran = 800 ;
 public final static int hauteurEcran = 600 ;

 public final static   Color [] couleurDessin = {Color.red, Color.green, Color.blue, Color.white, Color.black};
 public final static byte  ROUGE=0;
 public final static byte  VERT=1;
 public final static byte  BLEU=2;
 public final static byte  BLANC=3;
 public final static byte  NOIR=4;
    
    
 public final static int couleurMax = couleurDessin.length;
 protected int x, y, couleur ;
 
 public Forme( int nx, int ny, int nc) {	
 	x = verifier(nx, 0, largeurEcran) ;	
        y = verifier(ny, 0, hauteurEcran) ;
        couleur = verifier(nc, 0, couleurMax);
 }

    @SuppressWarnings("empty-statement")
 public Forme() {	
 	x = verifier("en X", 0, largeurEcran);
        y = verifier("en Y", 0, hauteurEcran);
	couleur = verifier("couleur", 0, couleurMax);;
 }

 public void dessiner(Graphics g) {

	g.setColor(couleurDessin[couleur]);
  }
 public void setColor(int col){
     couleur = col;
 }



 public void afficher() {
 	System.out.println("Couleur : " + couleur);
 	System.out.println("Position en " + x + ", " + y); 
 }

 public  int verifier(String s, int a, int b) {
    Scanner lectureClavier = new Scanner(System.in);
    int resultat;
    do  {
	System.out.print(s+"          :  ");
    	resultat= lectureClavier.nextInt();
    } while ( resultat < a || resultat > b) ;
    return resultat ;
}

 
 public  int verifier(int tmp, int a, int b) {
	if (tmp < a) return a;
	else if ( tmp > b) return b ; 
	else return tmp;
}
 
 
 public void deplacer(int nx, int ny)   {						
 	x = verifier(x+nx, 0, largeurEcran) ;	
    y = verifier(y+ny, 0, hauteurEcran) ;
 }
 
 public void colorier(int nc)   {						
    couleur = verifier(nc, 0, couleurMax);					
 }

 public String getInfos() {
 	return couleur+";"+x+";"+y;
 }


 public int trouverLeXMin(){
  return x;
 }
} // Fin de la classe Forme