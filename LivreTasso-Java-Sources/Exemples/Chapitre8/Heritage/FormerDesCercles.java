/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 8 : Les principes du concept objet
#	Section  : L'h�ritage
#	Fichier  : FormerDesCercles .java
#	Class    : FormerDesCercles 
*/

public class FormerDesCercles {
 public static void main(String [] arg) {
  Cercle A  = new Cercle(5, 5);
  A.afficher();
  double p = A.p�rim�tre();
  System.out.println("Votre cercle a pour perimetre : " + p);
  A.d�placer(5, 10);
  System.out.println("Apres d�placement : ");
  A.afficher();
  A.agrandir(10);
  System.out.println("Apres agrandissement : ");
  A.afficher();
  Forme F = new Forme (10, 10);
  F.�changerAvec(A);
  A.afficher();
  F.afficher();
  A.�changerAvec(F);
  A.afficher();
  F.afficher();
 }
}