/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre indéterminé d'objets
#	Section  : Les fichiers d'objets
#	Fichier  : GestionCursus.java
#	Class    : GestionCursus
*/

import java.io.*;
import java.util.*;
public class GestionCursus  {
 public static void main (String [] argument) throws IOException, ClassNotFoundException {
	Scanner lectureClavier = new Scanner(System.in);
	int choix = 0 ;
	Cursus C = new Cursus();
	FichierEtudiant F = new FichierEtudiant();
 	F.ouvrir("L");
 	C = F.lire();
 	F.fermer();
 
	

	String prénom, nom;
	do {
	  choix = menuPrincipal();
	  switch (choix) {
		case 1 :		C.ajouteUnEtudiant();
		break;
		case 2 :
			System.out.print("Entrer le prenom de l'étudiant a supprimer ");
			prénom = lectureClavier.nextLine();
			System.out.print("Entrer le nom de l'étudiant a supprimer ");
			nom = lectureClavier.nextLine();
			C.supprimeUnEtudiant(prénom, nom);
		break;
		case 3 :		C.afficheLesEtudiants(); 
		break;
		case 4 :
			System.out.print("Entrer le prenom de l'étudiant recherche ");
			prénom = lectureClavier.nextLine();
			System.out.print("Entrer le nom de l'étudiant recherche ");
			nom = lectureClavier.nextLine();
			C.rechercheUnEtudiant(prénom, nom);
		break;
		case 5 : //option 5,  le programme termine son exécution
			System.out.println("Sauvegarde des données dans Cursus.dat");	
			F.ouvrir("Ecriture"); 
			F.ecrire(C);
			F.fermer();
			sortir();    
		break;
		default : System.out.println("Cette option n'existe pas ");
	 }
  } while (choix != 5);
 }
 public static int menuPrincipal() {
	Scanner lectureClavier = new Scanner(System.in);
	int tmp;
	System.out.println("1. Ajoute un etudiant");
	System.out.println("2. Supprime un etudiant");
	System.out.println("3. Affiche la liste des etudiants");
	System.out.println("4. Affiche un etudiant");
	System.out.println("5. Sortir");
	System.out.println();
	System.out.print("Votre choix : ");
	tmp  = lectureClavier.nextInt();
	return tmp;
 }
 public static void sortir( ) {
	System.out.println("Au revoir et à bientôt");
	System.exit(0) ;
 }
}