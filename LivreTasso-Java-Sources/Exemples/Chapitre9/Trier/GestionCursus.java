/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 9 : Collectionner un nombre fixe d'objets
#	Section  : Quelques techniques utiles
#	Fichier  : GestionCursus
#	Class    : GestionCursus  
*/

public class GestionCursus {
	public static void main(String [] argument)  {
		Cursus C = new Cursus();
		System.out.println("------------  Recapitulatif  --------------");
		C.afficheLesEtudiants();
		C.classerParMoyenne();
		System.out.println("--------------  Classement  ---------------");
		C.afficheLesEtudiants();
	}
}