/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 6 : Fonctions, notions avanc�es
#	Section  : Variables locales � une fonction
#	Fichier  : VariableLocale.java
#	Class    : VariableLocale 
*/

public class VariableLocale {
  public static void main(String [] param�tre)   {
   // d�claration de variables locales
   int valeur = 2 ;
   System.out.println("Valeur = " + valeur + " avant modifier() ");
   modifier();
   System.out.println("Valeur = " + valeur + " apres modifier() ");
  } // fin de main()

  public static void modifier ()  {
   // d�claration de variables locales
   int valeur ;
   valeur = 3 ;
   System.out.println("Valeur = " + valeur + " dans modifier() ");
  } // fin de modifier
} //fin de class VariableLocale