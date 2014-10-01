/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 3 : Faire des choix
#	Section  : Tester des chaines de caractères à partir de la version 7 de Java
#	Fichier  : SwitchAvecString.java
#	Class    : SwitchAvecString
*/
import java.util.*;
public class SwitchAvecString { 
  public static void main (String [] parametre)  {
  	String choix ;	Scanner lectureClavier = new Scanner(System.in);	System.out.println("Votre choix  (oui/non) ? : ") ;	choix = lectureClavier.nextLine();	switch (choix)	{  		case  "oui" :  			System.out.println("Vous avez saisi oui !") ;  		break ; 		case "non" :			System.out.println("Vous avez saisi non !") ;		break ;		default : 	
			System.out.println("Vous avez saisi ni oui ni non !") ;	} // Fin du switch 
  } // Fin du main ()
} // Fin de la classe SwitchAvecString