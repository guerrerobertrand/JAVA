/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Projet
#	Fichier  : FichierCompte.java
#	Class    : FichierCompte
*/

// Le fichier FichierCompte.java se trouve dans le répertoire 
// Sources/Projet/Chapitre12/NetBeansProjects/ProjetChapitre12/src/Projet

package Projet;


import java.io.*;
public class FichierCompte  {
  private  String nomDuFichier = "Compte.dat";
  private   ObjectOutputStream fWo;
  private    ObjectInputStream fRo;
  private char mode;
	public boolean ouvrir(String tmp, String s) {
		try {
			mode = (s.toUpperCase()).charAt(0);
                        nomDuFichier = tmp;
			if (mode == 'R' || mode == 'L') 
				fRo  = new ObjectInputStream(new FileInputStream(nomDuFichier));
			else		if (mode == 'W' || mode == 'E') 
				fWo  = new ObjectOutputStream(new FileOutputStream(nomDuFichier));
			return true;
		}
		catch (IOException e)	{
			return false;
		}
	}
	public void fermer() {
		try   {
			if (mode == 'R' || mode == 'L') fRo.close();
			else	if (mode == 'W' || mode == 'E')  fWo.close();
		}
		catch (IOException e)  {
			System.out.println(nomDuFichier+" : Erreur ‡ la fermeture "); 
		}
	}
	public Compte lire() {
		try {
			Compte tmp = (Compte) fRo.readObject();
			return tmp;
		}
		catch (IOException e) { 
			System.out.println(nomDuFichier+" : Erreur  de lecture "); 
		}
		catch (ClassNotFoundException e) { 
			System.out.println(nomDuFichier+" n'est pas du bon format "); 
		}
		return null;
	}
	public void ecrire(Compte tmp) {
		try {
			if (tmp != null)  fWo.writeObject(tmp);
		}
		catch (IOException e) {  
			System.out.println(nomDuFichier+" : Erreur en cours d'Ècriture "); 
		}
	}
}
