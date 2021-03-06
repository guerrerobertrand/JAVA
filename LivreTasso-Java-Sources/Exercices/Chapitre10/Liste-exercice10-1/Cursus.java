/*
#	Le livre de Java, premier langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre indetermine d'objets 
#	Exercice   : 10.1 
#	Fichier    : Cursus.java
#	Class      : Cursus
*/
import java.util.*;
 public class Cursus  {
 private ArrayList<Etudiant>  liste;
 public Cursus()   {
 	liste = new ArrayList<Etudiant>();		
 }
 public void ajouteUnEtudiant() {
	liste.add(new Etudiant());
 }
 public void afficheLesEtudiants() 	{
	int nbEtudiants = liste.size();
	if (nbEtudiants > 0) {
         for (Etudiant e : liste) e.afficheUnEtudiant();
	}
	else System.out.println("Il n'y a pas d'etudiant dans cette liste");
 }
}