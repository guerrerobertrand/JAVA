/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 4 : Faire des r�p�titions
#	Section  : La boucle for
#	Fichier  : QuelUnicode.java
#	Class    : QuelUnicode
*/

import java.util.*;
public class QuelUnicode {
 public static void main (String [] param�tre)  {
  int i;
  char recherche, atrouver;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.print("Quel caractere recherchez-vous : ");
  recherche = lectureClavier.next().charAt(0);
  for (i = 0; i <= 127; i++)  {  
   atrouver = (char) i;
   if (atrouver == recherche)   {
    System.out.print("le code Unicode de " + atrouver);
    System.out.println(" est \\u00" + Integer.toString(i,16));
   } // Fin du if
  } // Fin du for
 } // Fin du main()
}// Fin de QuelUnicode