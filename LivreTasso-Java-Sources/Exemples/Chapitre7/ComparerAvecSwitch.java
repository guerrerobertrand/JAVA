/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 7 : Les classes et les objets
#	Section  : Les diff�rentes m�thodes de la classe String
#	Fichier  : ComparerAvecSwitch.java
#	Class    : ComparerAvecSwitch 
*/
import java.util.*;
class ComparerAvecSwitch {
 public static void main(String [] argument) {
  	String quelleCouleur = "";
	Scanner lectureClavier = new Scanner(System.in);
	System.out.println("Quelle couleur choisissez - vous (rouge, vert, orange, bleu, violet, jaune) ? : ") ;
	quelleCouleur = lectureClavier.nextLine();
	quelleCouleur= quelleCouleur.toLowerCase();
	switch (quelleCouleur)
	{
 		case  "vert" :  
			System.out.println("Vous devez melanger du bleu avec du jaune ") ;
  		break ;
 		case  "violet" :  
			System.out.println("Vous devez melanger du bleu avec du rouge ") ;
  		break ;
 		case  "orange" :  
			System.out.println("Vous devez melanger du rouge avec du jaune ") ;
 		break ;
		default : 	
			System.out.println("C'est une couleur primaire !") ;
	} // Fin du switch 
 }
}