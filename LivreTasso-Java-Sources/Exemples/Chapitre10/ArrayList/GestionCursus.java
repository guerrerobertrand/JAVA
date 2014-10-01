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
 public static void main(String [] argument)  {
	byte choix = 0 ;
	Cursus C = new Cursus();
        Scanner lectureClavier = new Scanner(System.in);
	do   {
		System.out.println("1. Ajoute un etudiant");
		System.out.println("2. Affiche la liste des etudiants");
		System.out.println("3. Pour sortir");
		System.out.print("Votre choix : ");
		choix  = lectureClavier.nextByte();
		switch (choix) {
			case 1 :		C.ajouteUnEtudiant();
			break;
			case 2 :		C.afficheLesEtudiants(); 
			break;
			case 3 :		System.exit(0);
			default :
			System.out.println("Cette option n'existe pas ");
		}
	} while (choix != 3);
 }
}