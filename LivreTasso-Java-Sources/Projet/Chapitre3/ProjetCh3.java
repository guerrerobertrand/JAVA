/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 3 : Faire des choix
#	Section  : Projet
#	Fichier  : ProjetCh3.java
#	Class    : ProjetCh3
*/
import java.util.*;
public class ProjetCh3	{
 public static void main (String [] argument) {
  byte choix;
  char typeCpte ='\0';
  double val_courante = 0.0, taux = 0.0;
  long num�roCpte = 0, num�roLu = 0 ;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.println("1. Cr�ation d'un compte");
  System.out.println("2. Affichage d'un compte");
  System.out.println("3. Ecrire une ligne comptable");
  System.out.println("4. Sortir");
  System.out.println("5. De l'aide");
  System.out.println();
  System.out.print("Votre choix :  ");
  choix = lectureClavier.nextByte();
  switch (choix)  {
    case 1 :
     System.out.print("Type du compte [Types possibles : "); 
     System.out.print("C(ourant), J(oint), E(pargne)] :");
     typeCpte = lectureClavier.next().charAt(0);
     System.out.print("Numero du compte :");
     num�roCpte = lectureClavier.nextLong();
     System.out.print("Premiere valeur creditee :");
     val_courante = lectureClavier.nextDouble();  
     if ( typeCpte == 'E')   {
       System.out.print("Taux de placement :     ");
       taux = lectureClavier.nextDouble();
     } 
    break;
    case 2 :
      //demande � l'utilisateur de saisir le num�ro du compte � afficher
      System.out.print ( " Quel compte souhaitez vous afficher ? : ");
      num�roLu = lectureClavier.nextLong();
     // v�rifie que le num�ro du compte existe, 
      if ( num�roLu == num�roCpte)   {  
        //Si oui, affiche le num�ro du compte, le type, la valeur initiale
        System.out.print("Le compte n� : " + num�roCpte + " est un compte ");
        if (typeCpte == 'C') System.out.println(" courant  ");
        else if (typeCpte == 'J') System.out.println(" joint  ");
        else if (typeCpte == 'E')        {
          // affiche son taux dans le cas d'un compte �pargne.
          System.out.println("epargne  dont le taux est  " + taux);
        }
        System.out.println(" Premiere valeur cr�dit�e : " + val_courante);
      }
      else  {
        // Sinon, affiche un message indiquant que num�ro du compte non valide.
        System.out.println("Le systeme ne connait pas le compte " + num�roLu);
      } 
    break;
    case 3 :
      //option 3, le programme affiche "option non programm�e"
      System.out.println("Option non programmee");
    break;
    case 4 :
      //option 4,  le programme termine son ex�cution
      System.out.println("Au revoir et a bientot");
      System.exit(0) ;    
    break;
    case 5 :
      //le programme affiche une ligne d'explication pour chaque option.
      System.out.println("Option 1. Pour creer un compte Courant entrer C ");
      System.out.println("          Pour creer un compte Joint entrer J ");
      System.out.println("          Pour creer un compte Epargne entrer E");
      System.out.print("          Puis, entrer le numero du compte, et"); 
      System.out.println(" sa premiere valeur creditee ");
      System.out.println("          Dans le cas d'un compte epargne, entrer le taux ");
      System.out.println("Option 2. Le systeme affiche les donnees du compte choisi ");
      System.out.println("Option 3. Ecrire une ligne comptable");
      System.out.println("Option 4. Pour quitter le programme");
      System.out.println("Option 5. Pour afficher de l'aide");
  }
 }
}