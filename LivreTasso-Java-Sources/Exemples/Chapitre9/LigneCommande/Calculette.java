/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 9 : Collectionner un nombre fixe d'objets
#	Section  : Quelques techniques utiles
#	Fichier  : Calculette.java
#	Class    : Calculette 
*/
import java.util.*;
public class Calculette {
 public static void main( String [] argument) {
  int a, b;
  char op�rateur;
  double calcul;
  if (argument.length > 0) {
	  a = Integer.parseInt(argument[0]);
	  op�rateur = argument[1].charAt(0);
	  b = Integer.parseInt(argument[2]);
  }
  else {
    Scanner lectureClavier = new Scanner(System.in);
    op�rateur = menu();
    System.out.println("Entrer la premi�re valeur ");
    a = lectureClavier.nextInt();
    System.out.println("Entrer la seconde valeur ");
    b = lectureClavier.nextInt();
  }
    calcul = calculer(a, b, op�rateur );
   afficher(a, b, op�rateur, calcul); 
 }
 public static double calculer (int x, int y, char o) {
  double r�sultat =0;
  switch (o) {
   case '+' : r�sultat = x + y;
              break;
   case '-' : r�sultat = x - y;
              break;
   case '/' : r�sultat = x / y;
              break;
   case '*' : r�sultat = x * y ; 
              break;
    }
    return r�sultat;
 }
 public static void afficher(int x, int y, char o, double r) {
   System.out.println(x + "  " +o+ " "+ y + " =  " + r);  
 }
 public static char menu() {
  char op�ration ;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.println("Entrer en premier l'op�ration choisie : ");
  System.out.print(" (+, -, *, /)  ? : ");
  op�ration = lectureClavier.next().charAt(0);
  return op�ration ;
 }
}