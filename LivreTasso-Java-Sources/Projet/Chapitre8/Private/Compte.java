/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 8 : Les principes du concept "objet"
#	Section  : Projet - La protection priv�e
#	Fichier  : Compte.java
#	Class    : Compte
*/
import java.util.*;
public class Compte {
 private String typeCpte ;
 private double val_courante, taux ;
 private String num�roCpte ;
 private LigneComptable ligne;
 private int nbLigneR�el ;  
	// Acc�der en lecture aux donn�es de la classe
	public String quelTypeDeCompte() 	{
		return typeCpte;
	}
	public String quelNum�roDeCompte()	{
		return num�roCpte;
	}
	public double quelleValeurCourante()	{
		return val_courante;
	}
	public double quelTaux()	{
		return taux;
	}
	 public void cr�erCpte() 	{ 
                Scanner lectureClavier = new Scanner(System.in);
		char tmp;
		do {
			System.out.print("Type du compte [Types possibles :" ); 
			System.out.print("C(ourant), J(oint), E(pargne)] : ");
			tmp = lectureClavier.next().charAt(0);
		} while ( tmp != 'C' && tmp!= 'J' && tmp != 'E');
		switch (tmp)	{
			case 'C' : typeCpte = "Courant";
			break;
			case 'J' : typeCpte = "Joint";
			break;
			case 'E' : typeCpte = "Epargne";
			break;
	}
	System.out.print("Num�ro du compte : ");
	num�roCpte = lectureClavier.next();
	if ( typeCpte.equalsIgnoreCase("Epargne"))	{
		System.out.print("Taux de placement :     ");
		taux = lectureClavier.nextDouble();
	}
	System.out.print("Valeur initiale du compte : ");
	val_courante = lectureClavier.nextDouble();   
	nbLigneR�el = 0;
}
	public void cr�erLigne()	{
		ligne = new LigneComptable();
		ligne.cr�erLigneComptable();
		nbLigneR�el = 1;
		// val_courante = val_courante + ligne.valeur;
                val_courante = val_courante + ligne.quelleValeur();
	}
	public  void afficherCpte() {
		System.out.print("Le compte n� : " + num�roCpte );
		System.out.println(" est un compte " + typeCpte);
		if ( typeCpte.equalsIgnoreCase("Epargne"))
			System.out.println(" dont le taux est  " + taux);
		if (nbLigneR�el > 0) ligne.afficherLigne();
		System.out.println("Valeur courante : " + val_courante);
	}
}