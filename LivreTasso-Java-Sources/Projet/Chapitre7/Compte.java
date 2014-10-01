/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 7 : Les classes et les objets
#	Section  : Projet - Le type Compte
#	Fichier  : Compte.java
#	Class    : Compte
*/
import java.util.*;
public class Compte {
 // Les variables caract�risant un compte sont d�clar�es comme variables de classe
 public String typeCpte ;
 public double val_courante, taux ;
 public String num�roCpte ;
 public LigneComptable ligne;
 public int nbLigneR�el ;  
 public void cr�erCpte() 	{ 
        Scanner lectureClavier = new Scanner(System.in);
	char tmp;
	do {
			System.out.print("Type du compte [Types possibles :" ); 
			System.out.print("C(ourant), J(oint), E(pargne)] :");
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
 	val_courante = val_courante + ligne.valeur;
 }
 public  void afficherCpte() {
	System.out.println("Le compte n� : " + num�roCpte + " est un compte "+typeCpte);
	if ( typeCpte.equalsIgnoreCase("Epargne"))
		System.out.println(" dont le taux est  " + taux);
	if (	 nbLigneR�el > 0) ligne.afficherLigne();
	System.out.println("Valeur courante : " + val_courante);
 }    
}