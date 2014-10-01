/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 6 : Fonctions, notions avanc�es
#	Section  : La visibilit� des variables
#	Fichier  : Visibilite.java
#	Class    : Visibilite 
*/

public class Visibilite {
  public static void main(String [] param�tre)   {
   // D�claration des variables
   int valeur = 2 ;
   System.out.println("Valeur = " + valeur + " avant modifier() ");
   modifier();
   System.out.println("Valeur = " + valeur + " apres modifier() ");
 } // fin de main()

  public static void modifier ()  {
   valeur = 3 ;
   System.out.println("Valeur = " + valeur + " dans modifier() ");
  } // fin de modifier
} //fin de class Visibilite