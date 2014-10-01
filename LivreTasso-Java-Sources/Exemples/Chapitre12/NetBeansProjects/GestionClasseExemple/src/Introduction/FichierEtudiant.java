/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Gestion de bulletins de notes
#	Fichier  : FichierEtudiant.java
#	Class    : FichierEtudiant
*/

// Le fichier FichierEtudiant.java se trouve dans le répertoire 
// Sources/Exemples/Chapitre12/NetBeansProjects/GestionClasseExemple/src/Introduction

package Introduction;
import java.io.*;
 public class FichierEtudiant  {
  private ObjectOutputStream fWo;
  private ObjectInputStream fRo;
  private char mode;
  // Modifier l'url d'accès au fichier Cursus.dat selon votre système d'exploitation
  private String nomDuFichier = "/Users/VotreCompte/Ressources/Cursus.dat";
  public boolean ouvrir(String s) 	{
    try {
	 mode = (s.toUpperCase()).charAt(0);
	 if (mode == 'R' || mode == 'L') 
		fRo = new ObjectInputStream(new FileInputStream(nomDuFichier));
	 else 	if (mode == 'W' || mode == 'E') 
		fWo = new ObjectOutputStream(new FileOutputStream(nomDuFichier));
         return true;
     } 
    catch (IOException e){
        System.out.print("erreur : "+ e);
         return false;
    }
  }
  public void fermer()  {
   try {
	if (mode == 'R' || mode == 'L') fRo.close();
	else	if (mode == 'W' || mode == 'E')  fWo.close();
        } 
    catch (IOException e)	{
   	  System.out.print("erreur : "+ e);
    }
  }
  public Cursus lire()   {
    try {
         Cursus tmp = (Cursus) fRo.readObject();
	return tmp;
     } 
    catch (IOException e)	{
        System.out.print("erreur : "+ e);
   	return null;
    }
     catch (ClassNotFoundException e)	{
        System.out.print("erreur : "+ e);
   	return null;
    }
  }
  public void ecrire(Cursus tmp) {
      try {
           if (tmp != null)  fWo.writeObject(tmp);
      } 
      catch (IOException e) {
            System.out.print("erreur : "+ e);
    }
  }
}