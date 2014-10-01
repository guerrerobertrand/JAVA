/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Gestion de bulletins de notes
#	Fichier  : Cursus.java
#	Class    : Cursus
*/

// Le fichier Cursus se trouve dans le répertoire 
// Sources/Exemples/Chapitre12/NetBeansProjects/GestionClasseExemple/src/Introduction
package Introduction;

import java.util.*;
import java.io.*;
public class Cursus implements Serializable {
 private HashMap<String, Etudiant> listeClassee;
 public Cursus()   {
	listeClassee = new HashMap<String, Etudiant> ();		
 }
  public String creerUneCle(Etudiant e) {
  	 String tmp;
  	 tmp = (e.getPrenom()).charAt(0)+ e.getNom();
  	 tmp.toUpperCase();
  	 return tmp;
  }
  public String creerUneCle(String p, String n ) {
  	 String tmp;
  	 tmp = p.charAt(0)+ n;
  	 tmp.toUpperCase();
  	 return tmp;
  }	
  public void ajouteUnEtudiant(String nn, String np, String nph, String [] nm, String ns, double [] moy) {
	 Etudiant e = new Etudiant(nn, np, nph,  nm,  ns, moy);
 	 String cle = creerUneCle(e);	
 	 Etudiant nouveau = (Etudiant) listeClassee.get(cle);
 	 if (nouveau == null) listeClassee.put(cle, e);
  }	
  public Etudiant rechercheUnEtudiant(String p, String n) {
 	 String cle = creerUneCle(p, n);
 	 Etudiant e = (Etudiant) listeClassee.get(cle);
 	 if (e != null)  return e;
        else return null;
  }
 
 public boolean supprimeUnEtudiant(String p, String n) {
	String cle = creerUneCle(p, n);
    	Etudiant e = (Etudiant) listeClassee.get(cle);
 	  if (e != null)  {
 	   	listeClassee.remove(cle);
 	  	  	System.out.println(p + " " + n + " a ete supprime ");
                        return true;
 	  } 
 	  else {
            System.out.println(p + " " + n + " est inconnu ! ");
            return false;
          }
  }
  public void afficheLesEtudiants() 	{
	if(listeClassee.size() != 0)
	{
           Collection<Etudiant> c = listeClassee.values();
 
           for (  Etudiant e : c) {
  		  e.afficheUnEtudiant(); 	
        }
	}
	else System.out.println("Il n'y a pas d'etudiant dans cette liste");
 }
}