public class TstValues
{ public static void main (String args[])
  { // On cr�e un tableau des valeurs du type, � l'aide de la m�thode values
   Suite[] valeurs = Suite.values () ;
   int nbVal = valeurs.length ;
   System.out.println ("le type Suite comporte " + nbVal + " valeurs" ) ;
   System.out.println ("valeurs de rang impair = ") ;  
   for (int i =0 ; i < nbVal ; i+=2)
      System.out.println (valeurs[i]) ;
   System.out.println ("derniere valeur du type : ") ;
   System.out.println (valeurs[nbVal-1]) ;
 }
enum Suite { ut, re, mi, fa, sol, la, si }
