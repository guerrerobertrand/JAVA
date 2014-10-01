/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 9 : Collectionner un nombre fixe d'objets
#	Section  : Projet
#	Fichier  : Compte.java
#	Class    : Compte
*/
import java.util.*;
public class Compte	{
 private String typeCpte ;
 protected double val_courante;
 private String num�roCpte ;
 private LigneComptable []ligne;
 public static final int NBLigne = 10 ;
 private int nbLigneR�el ;  
  public Compte () 	{ 
        Scanner lectureClavier = new Scanner(System.in);
	typeCpte = contr�leType();
	System.out.print("Num�ro du compte : ");
	num�roCpte = lectureClavier.next();
	val_courante = contr�leValinit();  
	ligne = new LigneComptable[NBLigne];
	nbLigneR�el = -1;
  }

  public  Compte( String type)  {
        Scanner lectureClavier = new Scanner(System.in);
	if (type.equalsIgnoreCase("Epargne")) {
		typeCpte = type;
		System.out.print("Num�ro du compte : ");
		num�roCpte = lectureClavier.next();
		val_courante = contr�leValinit();   
		ligne = new LigneComptable[NBLigne];
		nbLigneR�el = -1;
   	}
  }
  public String quelTypeDeCompte() 	{
		return typeCpte;
  }
  public String quelNum�roDeCompte()	{
		return num�roCpte;
  }
  public double quelleValeurCourante()	{
		return val_courante;
  }
  private String contr�leType()		{
                Scanner lectureClavier = new Scanner(System.in);
		char tmpc;
		String tmpS = "";
		do {
				System.out.print("Type du compte [Types possibles :" ); 
				System.out.print("C(ourant), J(oint)] : ");
				tmpc = lectureClavier.next().charAt(0);
		} while ( tmpc != 'C' && tmpc != 'J' );
		switch (tmpc) {
			case 'C' : tmpS = "Courant";
			break;
			case 'J' : tmpS = "Joint";
			break;
		}
		return tmpS;
  }
  private double contr�leValinit()	 {
                Scanner lectureClavier = new Scanner(System.in);
		double tmp, tmpval;
		do {
			System.out.print("Valeur initiale du compte : ");
			tmpval= lectureClavier.nextDouble();  
		} while ( tmpval <= 0);
		return tmpval;
  }
  public void cr�erLigne() {
		nbLigneR�el++;
		if (nbLigneR�el < NBLigne) 
			ligne [nbLigneR�el] = new LigneComptable();
		else {
			nbLigneR�el--;
			d�calerLesLignes();
			ligne [nbLigneR�el] = new LigneComptable();
		}
		val_courante = val_courante + ligne[nbLigneR�el].quelleValeur();
  }
  private void d�calerLesLignes() {
		for(int i = 1; i < NBLigne ; i++)
		ligne[i-1] = ligne[i];
  }
  public  void afficherCpte() {
		System.out.print("Le compte n� : " + num�roCpte );
		System.out.println(" est un compte "+typeCpte);
		if (nbLigneR�el >=0) {
			for (int i = 0; i <= nbLigneR�el; i++) ligne[i].afficherLigne();
		}
		System.out.println("Valeur courante : " + val_courante);
		if (val_courante < 0) System.out.println("Attention compte d�biteur ... !!!");
  }
}