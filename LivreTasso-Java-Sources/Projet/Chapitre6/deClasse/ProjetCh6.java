/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 6 : Fonctions, notions avanc�es
#	Section  : Projet - Les variables de classes
#	Fichier  : ProjetCh6.java
#	Class    : ProjetCh6
*/

import java.util.*;
public class ProjetCh6 { 
 // Les variables caract�risant un compte sont d�clar�es comme variables de classe
 static byte choix;
 static char typeCpte ='\0';
 static double val_courante = 0.0, taux = 0.0;
 static long num�roCpte = 0, num�roLu = 0 ;
 public static void main (String [] argument) {
  Scanner lectureClavier = new Scanner(System.in);
  do {
  	choix = menuPrincipal();
  	switch (choix){
  		case 1 :
  			do {
			  System.out.print("Type du compte [Types possibles :" ); 
			  System.out.print("C(ourant), J(oint), E(pargne)] :");
  				typeCpte = lectureClavier.next().charAt(0);
  			} while ( typeCpte != 'C' && typeCpte != 'J' && typeCpte != 'E');
  		System.out.print("Numero du compte :");
  		num�roCpte = lectureClavier.nextLong();
  		System.out.print("Premiere valeur creditee :");
  		val_courante  = lectureClavier.nextDouble();
  		if (typeCpte == 'E') {
  			System.out.print("Taux de placement :  ");
  			taux = lectureClavier.nextDouble();
  		} 
  		break;
  		case 2 :
  			System.out.print ( " Quel compte souhaitez vous afficher ? : ");
  			num�roLu = lectureClavier.nextLong();
  			if (num�roLu == num�roCpte)  afficherCpte( );
  			else
			 System.out.println("Le systeme ne connait pas le compte " + num�roLu);
		break;
  		case 3 : System.out.println("Option non programmee");
		break;
  		case 4 : sortir(); 
  		break;
  		case 5 : alAide();
		break;
  		default : System.out.println("Cette option n'existe pas ");
  	}
 } while (choix != 4);
}

 // Affiche le compte 
 public static void afficherCpte( ){
 	System.out.print("Le compte n� : " + num�roCpte + " est un compte ");
 	if (typeCpte == 'C') System.out.println(" courant  ");
 	else if (typeCpte == 'J') System.out.println(" joint  ");
 	else if (typeCpte == 'E') 
 		 System.out.println(" epargne  dont le taux est  " + taux);
	System.out.println("Premiere valeur creditee  : " + val_courante);
 }
// Affiche le menu principal, retourne la valeur de l'option choisie
 public static byte menuPrincipal() {
 	byte tmp;
        Scanner lectureClavier = new Scanner(System.in);
 	System.out.println("1. Creation d'un compte");
 	System.out.println("2. Affichage d'un compte");
 	System.out.println("3. Ecrire une ligne comptable");
 	System.out.println("4. Sortir");
 	System.out.println("5. De l'aide");
 	System.out.println();
 	System.out.print("Votre choix : ");
 	tmp  = lectureClavier.nextByte();
 	return tmp;
 }
 public static void sortir( ) {
	System.out.println("Au revoir et � bientot");
	System.exit(0) ; 
 }
 public static void alAide( ) {
  System.out.println("Option 1. Pour creer un compte Courant entrer C ");
  System.out.println("          Pour creer un compte Joint entrer J ");
  System.out.println("          Pour creer un compte Epargne entrer E");
  System.out.print("            Puis, entrer le numero du compte, et"); 
  System.out.println(" sa premiere valeur creditee ");
  System.out.println("          Dans le cas d'un compte epargne, entrer le taux ");
  System.out.println("Option 2. Le systeme affiche les donnees du compte choisi ");
  System.out.println("Option 3. Ecrire une ligne comptable");
  System.out.println("Option 4. Pour quitter le programme");
  System.out.println("Option 5. Pour afficher de l'aide");
 } 
}