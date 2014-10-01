/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 8 : Les principes du concept "objet"
#	Section  : Projet - La protection priv�e
#	Fichier  : ProjetCh8.java
#	Class    : ProjetCh8
*/
import java.util.*;
public class ProjetCh8 {
	// La fonction principale
	public static void main (String [] argument)	{
                Scanner lectureClavier = new Scanner(System.in);
 		byte choix = 0 ;
 		String num�roLu = "";
   	        Compte 	C = new Compte(); 
 		do	{
   		  choix = menuPrincipal();
   		  switch (choix)	{
     		    case 1 :	
                        C.cr�erCpte() ;
     		        break;
     		    case 2 :
        		//demande � l'utilisateur de saisir le num�ro du compte � afficher
        		System.out.print ( "Quel compte souhaitez vous afficher ? : ");
        		num�roLu = lectureClavier.next();
        		// v�rifie que le num�ro du compte existe, 
        		//if ( num�roLu.equalsIgnoreCase(C.num�roCpte)) -> num�roCpte inaccessible car private dans Compte
        		if ( num�roLu.equalsIgnoreCase(C.quelNum�roDeCompte()))
		         //Si oui, affiche le num�ro du compte, le type, la valeur initiale
     			  C.afficherCpte();
          	        else
	          	// Sinon, il affiche un message indiquant que le num�ro du compte n'est pas valide.
          		System.out.println("Le systeme ne connait pas le compte " + num�roLu);
      		        break;
     		case 3 :	
                        //option 3, cr�er une ligne comptable
        		System.out.print ( "Pour quel compte souhaitez vous cr�er une ligne ? : ");
        		num�roLu = lectureClavier.next();
        		if ( num�roLu.equalsIgnoreCase(C.quelNum�roDeCompte()))
       	   		    C.cr�erLigne();
        		else
          		    System.out.println("Le systeme ne connait pas le compte " + num�roLu);
      		        break;
     		case 4 :
       			//option 4,  le programme termine son ex�cution
       			sortir();    
                        break;
     		case 5 :
      			//le programme affiche une ligne d'explication pour chaque option du menu principal.
      			alAide();
      		        break;
     		default :		System.out.println("Cette option n'existe pas ");
   		}
 	 	} while (choix != 4);
 }
 // Affiche le menu principal, retourne la valeur de l'option choisie
 public static byte menuPrincipal() {
    byte tmp;
    Scanner lectureClavier = new Scanner(System.in);
    System.out.println("1. Cr�ation d'un compte");
    System.out.println("2. Affichage d'un compte");
    System.out.println("3. Ecrire une ligne comptable");
    System.out.println("4. Sortir");
    System.out.println("5. De l'aide");
    System.out.println();
    System.out.print("Votre choix : ");
    tmp  = lectureClavier.nextByte();
    return tmp;
 } 
  // pour sortir poliment du programme 
 public static void sortir( )	{
   System.out.println("Au revoir et � bient�t");
   System.exit(0) ;    
 }
  // Affiche une aide ...
  public static void alAide()	{
    System.out.println("Option 1. Pour cr�er un compte Courant entrer C ");
    System.out.println("                 Pour cr�er un compte Joint entrer J ");
    System.out.println("                 Pour cr�er un compte Epargne entrer E");       
    System.out.println("                 Entrer ensuite le num�ro du compte, sa premi�re valeur cr�dit�e");
    System.out.println("                 Dans le cas d'un compte �pargne, entrer le taux ");
    System.out.println("Option 2. Le syst�me affiche les donn�es du compte de votre choix ");
    System.out.println("Option 3. Ecrire une ligne comptable");
    System.out.println("Option 4. Pour quitter le programme");
    System.out.println("Option 5. Pour afficher de l'aide");
  } 
}