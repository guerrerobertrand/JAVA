public class ArgLC
{ public static void main (String args[])
  { int nbArgs = args.length ;
    if (nbArgs != 2) { System.out.println ("nombre arguments incorrect") ;
                       System.exit(-1) ;
                     }
    int n1, n2 ;
    n1 = Integer.parseInt (args[0]) ;
    n2 = Integer.parseInt (args[1]) ;
    System.out.println (n1 + " + " + n2 + " = " + (n1+n2)) ;
  }
}

/*
 - arguments ligne de commande
 - conversion chaine en num�rique
*/


/* commentaires :
  - penser avec EDI � fournir les param�tres ...
*/
/*
12 + 58 = 70
*/

/* titre :
*/

/* Ennonc� :
  Ecrire un programme (main) qui r�cup�re deux nombres entiers
  par la ligne de commande et en affiche la somme.
*/


/* notes perso
  - v�rifier exit(-1)
  - voir ce qu'on a pour arguments non num�riques
*/
