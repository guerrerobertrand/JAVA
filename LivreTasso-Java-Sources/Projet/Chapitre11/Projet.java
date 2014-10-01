/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 11 : Dessiner des objets
#	Section  : Projet  - Les types utilis�s dans cette applications sont d�finis dans le r�pertoire commun
#	Fichier  : Projet.java
#	Class    : Projet
*/
import java.util.*;
public class Projet	{
public static void main (String [] argument) {
	byte choix = 0 ;
	String num�roLu = "";
        Scanner lectureClavier = new Scanner(System.in);
	// Les classes ListeCompte et FichierCompte sont d�finies dans le dossier "commun"
	ListeCompte liste = new ListeCompte();
	FichierCompte F = new FichierCompte();
	if (F.ouvrir("L")) {
		liste = F.lire();
		F.fermer();
	}
	System.out.println("Affichage des statistiques");
	System.out.print ( "Quel compte souhaitez vous afficher ? : ");
	num�roLu = lectureClavier.next();
	Compte cpte = 	new Compte("");
	cpte = liste.quelCompte(num�roLu);
	if (cpte != null) {
		Stat s = new Stat(cpte);
		s.statParMotif();
	}
 }
}