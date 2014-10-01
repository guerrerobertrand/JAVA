/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre indetermine d'objets
#	Section  : Les listes
#	Fichier  : GestionCursus.java
#	Class    : GestionCursus
*/
import java.util.*;
public class GestionCursus  {
 public static void main (String [] argument) {
  byte choix = 0 ;
  Cursus C = new Cursus();
  String prenom, nom;
  Scanner lectureClavier = new Scanner(System.in);
  do  {
	System.out.println("1. Ajoute un etudiant");
	System.out.println("2. Supprime un etudiant");
	System.out.println("3. Affiche la liste des etudiants");
	System.out.println("4. Affiche un etudiant");
	System.out.println("5. Sortir");
	System.out.println();
	System.out.print("Votre choix : ");
	choix  = lectureClavier.nextByte();
	switch (choix) {
		case 1 : 
                    C.ajouteUnEtudiant();
		    break;
		case 2 :
		    System.out.print("Entrer le prenom de l'etudiant a supprimer : ");
		    prenom = lectureClavier.next();
		    System.out.print("Entrer le nom de l'etudiant a supprimer : ");
		    nom = lectureClavier.next();
		    C.supprimeUnEtudiant(prenom, nom);
		    break;
		case 3 :	
                    C.afficheLesEtudiants(); 
		    break;
		case 4 :
		    System.out.print("Entrer le prenom de l'etudiant recherche : ");
		    prenom = lectureClavier.next();
		    System.out.print("Entrer le nom de l'etudiant recherche : ");
		    nom = lectureClavier.next();
		    C.rechercheUnEtudiant(prenom, nom);
		    break;
		case 5 : 
                    System.exit(0) ;    
		default : 
                    System.out.println("Cette option n'existe pas ");
	}
  } while ( choix != 5);
 }
}