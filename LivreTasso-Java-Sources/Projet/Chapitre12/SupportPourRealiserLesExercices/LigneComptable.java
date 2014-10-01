/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Projet
#	Fichier  : LigneComptable.java
#	Class    : LigneComptable
*/

// Le fichier LigneComptable.java se trouve dans le répertoire 
// Sources/Projet/Chapitre12/NetBeansProjects/ProjetChapitre12/src/Projet

package Projet;
import java.io.*;
public class LigneComptable implements Serializable {
	private double valeur;
	private String motif;
	private String mode;

	public LigneComptable(double nval, String nmot, String nmod) {     
		motif = nmot;
	    	mode = nmod;
   	        valeur = nval;
	}
        public void  afficher() {     
                System.out.println("----------------- " );
		System.out.println("valeur : " + valeur );
		System.out.println(" motif " + motif);	
		System.out.println("mode : " + mode);
	}
        public double getValeur(){
            return valeur;
        }
       public String getMotif(){
            return motif;
        }
        public String getMode(){
            return mode;
        }
        
}

