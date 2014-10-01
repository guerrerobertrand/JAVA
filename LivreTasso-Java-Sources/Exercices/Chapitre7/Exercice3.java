/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 7 : Les classes et les objets
#	Exercice : 7.3
#	Fichier  : Exercice3.java
#	Class    : Exercice3
*/
import java.util.*;
public class Exercice3  {  
  public static void main (String [] parametre)  {
   byte nbjours = 0 ; 
   String mois="";
   short annee ;
   Scanner lectureClavier = new Scanner(System.in);
   System.out.println("De quel mois s'agit-il ? :") ;
   mois =  lectureClavier.nextLine(); 
   // remplacer les � �ventuels par u
   mois  = mois.replace("�", "u");
   // Remplacer tous les � �ventuels par e
   mois  = mois.replace("�", "e");
   // Supprimer les �ventuelles majuscules
   mois = mois.toLowerCase();
   System.out.println("De quelle annee ? :") ;
   annee =  lectureClavier.nextShort(); 
   switch(mois)   {
     case "janvier" : case "mars" :		// Pour les mois � 31 jours 
     case "mai" : case "juillet" : 
     case "aout"  : case "octobre" :	
     case "decembre"  : 
            nbjours = 31 ; 
            break ;
     case "avril" : case "juin" :		// Pour les mois � 30 jours
     case "septembre" : case "novembre" :
            nbjours  = 30 ;
            break ;
     case "fevrier" :  			
	  // Pour le cas particulier du mois de fevrier
          if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0)
               nbjours  = 29 ; 
          else  nbjours  = 28 ;
          break ;
     default :			// En cas d'erreur de frappe
              System.out.println("Impossible, ce mois n'existe pas ") ;
              System.exit(0) ;
   }
   System.out.print(" En " + annee + ", le mois de " + mois) ;
   System.out.println(" a " + nbjours + " jours ") ;
  } 
} 