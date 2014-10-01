/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Projet
#	Fichier  : Compte.java
#	Class    : Compte
*/

// Le fichier Compte.java se trouve dans le répertoire 
// Sources/Projet/Chapitre12/NetBeansProjects/ProjetChapitre12/src/Projet

package Projet;

import java.util.*;
import java.io.*;
public class Compte implements Serializable	{
 private String typeCpte ;
 private double valInitiale, solde;
 private String numeroCpte ;
 private ArrayList<LigneComptable> ligne;
 public static final int NBLigne = 10 ;
 
 
 public  Compte( String num, String ntype, double val)  {
       numeroCpte = num;
       valInitiale = val;
       typeCpte = ntype;
       ligne = new ArrayList<LigneComptable> ();  
       solde = valInitiale;
 }
 public String getNumero(){
     return numeroCpte;
 }
  public String getType(){
     return typeCpte;
 }
   public String getValCourante(){
     return Double.toString(valInitiale);
 }
    public double getSolde(){
         int nbLignes = ligne.size();
        double calculeSolde=valInitiale;
 	if (nbLignes > 0) {
 		for (LigneComptable tmp : ligne) calculeSolde+=tmp.getValeur();
 	}
        solde = calculeSolde;
     return solde;
 }
 public  void afficher() {
		System.out.println("Le compte n° : " + numeroCpte );
		System.out.println(" est un compte "+typeCpte);	
		System.out.println("Valeur courante : " + solde);
		if (solde< 0) System.out.println("Attention compte dÈbiteur ... !!!");
                int nbLignes = ligne.size();
        
 	if (nbLignes > 0) {
 		for (LigneComptable tmp : ligne) tmp.afficher();
 	}
 	else {
 		System.out.println("La liste des formes est vide  ");
 	}
 }
 public void setLigne(LigneComptable tmp){
      ligne.add((LigneComptable) tmp);
     
 }
 public ArrayList<LigneComptable> getLigne(){
     return ligne;
     
 }
}
