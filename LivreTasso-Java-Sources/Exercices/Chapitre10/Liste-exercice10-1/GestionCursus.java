/*
#	Le livre de Java, premier langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre indetermine d'objets 
#	Exercice   : 10.1 
#	Fichier    : GestionCursus.java
#	Class      : GestionCursus
*/

public class GestionCursus  {
	public static void main(String [] argument)  {
       Cursus C = new Cursus();
		System.out.println("------------------  Recapitulatif  ------------------");
		C.afficheLesEtudiants();
	//	C.classerParMoyenne();
		C.ajouteUnEtudiant();
	//	System.out.println("------------------  Classement  ------------------ ");
		C.afficheLesEtudiants();
	}
}