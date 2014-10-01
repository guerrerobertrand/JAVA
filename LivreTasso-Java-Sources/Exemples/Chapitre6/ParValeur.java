/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 6 : Fonctions, notions avanc�es
#	Section  : Les fonctions communiquent
#	Fichier  : ParValeur.java
#	Class    : ParValeur 
*/

public class ParValeur { 
public static void main (String [] param�tre)   {
   // D�claration des variables
   int valeur = 2 ;
   System.out.println("Valeur = " + valeur + " avant tripler() ");
   tripler(valeur);
   System.out.println("Valeur = " + valeur + " apres tripler() ");
} // fin de main()

  public static void tripler (int valeur)  {
   System.out.println("Valeur = " + valeur + " dans tripler() ");  
    valeur = 3 * valeur;
   System.out.println("Valeur = " + valeur + " dans tripler() ");  
  } // fin de tripler
} //fin de class ParValeur