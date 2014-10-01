/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 5 : De l'algorithme param�tr� � l'�criture de fonction
#	Section  : Les fonctions au sein d'un programme Java
#	Fichier  : Cercle.java
#	Class    : Cercle
*/
import java.util.*;
public class Cercle  {  
public static void main(String [] parametre)  {
   // D�claration des variables
   int valeur ;
   double r�sultat ;
   Scanner lectureClavier = new Scanner(System.in);
   System.out.print("Valeur du rayon : ") ;
   valeur = lectureClavier.nextInt() ;
   r�sultat = p�rim�tre (valeur) ;
   System.out.println("rayon = " + valeur + " perimetre = " + r�sultat);
  } // fin de main()

  public static double p�rim�tre (int r)  {
	double p ;
	p = 2 * Math.PI * r ;
	return p ;
  } // fin de p�rim�tre()
} //fin de class Cercle