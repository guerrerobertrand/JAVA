/*
#	Le livre de Java, premier langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre ind�termin� d'objets 
#	Exercice   : 10.4 et 10.6 
#	Fichier    : Bibliotheque.java
#	Class      : Biblioth�que
*/

import java.util.*;
public class Bibliotheque {

  public static void main(String [] arg){
    byte choix = 0 ;
    ListeDeLivres LdL = new ListeDeLivres();
	FichierDeLivres F = new FichierDeLivres();
 	if (F.ouvrir("L")) {
 		LdL = F.lire();
 		F.fermer();
 	}
	
    Scanner lectureClavier = new Scanner(System.in);
    String pr�nom, nom, categorie, isbn;
    do  {
	System.out.println("1. Ajouter un livre");
	System.out.println("2. Supprimer un livre");
	System.out.println("3. Afficher la liste des livres");
	System.out.println("4. Afficher un livre");
	System.out.println("5. Sortir");
	System.out.println();
	System.out.print("Votre choix : ");
	choix  = lectureClavier.nextByte();
	switch (choix) {
	   case 1 : LdL.ajouterUnLivre();
		break;
	   case 2 :
		 System.out.print("Entrer le prenom de l'auteur du livre a supprimer : ");
		 pr�nom = lectureClavier.next();
		 System.out.print("Entrer le nom de l'auteur du livre a supprimer : ");
		 nom = lectureClavier.next();
	         System.out.print("Entrer la categorie du livre a supprimer : ");
		 categorie = lectureClavier.next();
                 System.out.print("Entrer les deux derniers chiffres du code ISBN : ");
		 isbn = lectureClavier.next();
		 LdL.supprimerUnLivre(nom, pr�nom, categorie, isbn);
		 break;
	   case 3 :	
                 LdL.afficherLesLivres(); 
		 break;
	   case 4 :
		 System.out.print("Entrer le prenom de l'auteur du livre recherch� : ");
		 pr�nom = lectureClavier.next();
		 System.out.print("Entrer le nom de l'auteur du livre recherch� : ");
		 nom = lectureClavier.next();
	         System.out.print("Entrer la categorie du livre recherch� : ");
		 categorie = lectureClavier.next();
                 System.out.print("Entrer les deux derniers chiffres du code ISBN : ");
		 isbn = lectureClavier.next();
		 LdL.rechercherUnLivre(nom, pr�nom, categorie, isbn);
		break;
	   case 5 : 
		System.out.println("Sauvegarde des donn�es dans Bibliotheque.dat");	
		F.ouvrir("Ecriture"); 
		F.ecrire(LdL);
		F.fermer(); 
                System.exit(0) ;    
	   default : System.out.println("Cette option n'existe pas ");
	}
  } while ( choix != 5);

	}
}


