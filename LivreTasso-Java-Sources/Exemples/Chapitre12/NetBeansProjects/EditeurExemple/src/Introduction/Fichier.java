/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Un éditeur pour dessiner
#	Fichier  : Fichier.java
#	Class    : Fichier
*/

// Le fichier Fichier.java se trouve dans le répertoire 
// Sources/Exemples/Chapitre12/NetBeansProjects/EditeurExemple/src/Introduction
package Introduction;
import java.io.*;
import java.util.*;
public class Fichier {
 private   BufferedWriter fW;
 private   BufferedReader fR;
 private char mode;  
 public boolean ouvrir(String nomDuFichier, String s) {
   try {
        mode = (s.toUpperCase()).charAt(0);
	File f = new File(nomDuFichier);
	if (mode == 'R' || mode == 'L') 
		fR  = new BufferedReader(new FileReader(f));
	else 	if (mode == 'W' || mode == 'E') 
		fW = new BufferedWriter(new FileWriter(f)); 
        return true;
    } 
    catch (IOException e)	{
   	return false;
    }
 }


 public void fermer() {
     try {
         
  
	if (mode == 'R' || mode == 'L') fR.close();
	else 	if (mode == 'W' || mode == 'E')	 fW.close();
           }
      catch (IOException e)	{
   	
    }
 }
 
 public String [] lire()  {
    try {
        String ligne;
   
    ligne = fR.readLine();
    if (ligne != null) {
      StringTokenizer st = new StringTokenizer(ligne,";");
      int i=0;
      String mot[] = new String[st.countTokens()];
      while (st.hasMoreTokens()) {
         mot[i] = st.nextToken();
         i++;
       }
       return mot;
     }
     else return null; 
     }
      catch (IOException e)	{
   	return null;
    }
 }
 
 
 public void ecrire(String chaine)  {
     try {
 	System.out.println("chaine = " +chaine);
	fW.write(chaine,0,chaine.length());
	fW.newLine();
        }
         catch (IOException e)	{
   	
    }
  }
 

}