/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Exercice 12.4 à 12.7
#	Fichier  : Etudiant.java
#	Class    : Etudiant
*/

// Le fichier Etudiant.java se trouve dans le répertoire 
// Sources/Exercices/Chapitre12/NetBeansProjects/GestionClasseExercice/src/Introduction

package Introduction;
import java.io.Serializable;


public class Etudiant implements Serializable	{
    // Propriétés d'un étudiant
    private String nom, prenom;
    private String photo;
    private String semestre;
    private String [] matieres;
    public double [] moyenne;
    // Constructeur
    public Etudiant(String nn, String np, String nph, String [] nm, String ns, double [] moy)   	{
	setNom(nn);
	setPrenom(np);
	setPhoto(nph);
        setMatieres(nm);
        setSemestre(ns);
        moyenne = new double[matieres.length];
        setMoyenne(moy);
   }

   public void afficheUnEtudiant()  {
        System.out.print(nom + "  " + prenom + " " + photo );
        for(int i=0; i < moyenne.length; i++)
  		System.out.println(moyenne[i]);
   }

  // Fonctions d'accession en écriture : modifier le contenu des propriétés d'un étudiant
  private void setNom(String tmp) { 
  	nom = tmp;
  }
 
  private void setSemestre(String tmp) { 
  	semestre = tmp;
  }
  
  private void setMatieres(String [] tmp) {
        matieres = new String[tmp.length];
        for(int i=0; i < tmp.length; i++)
 		matieres[i] = tmp[i];
  }
  
  private void setMoyenne(double [] tmp) {
        for(int i=0; i < tmp.length; i++)
    	 moyenne[i] = tmp[i];
  }
  
  public void setMoyenne(double tmp, int index) {      
  	moyenne[index] = tmp;
  }
  
  private void setPrenom(String tmp) { 
  	prenom = tmp;
  }
                
  private void setPhoto(String tmp) { 
  	photo = tmp;
  }
	
  public String getNom() { 
  	return nom;
  }
  
  // Fonctions d'accession en lecture : récupérer le contenu des propriétés d'un étudiant
  public String [] getMatieres() { 
  	return matieres;
  }
  public double [] getMoyenne() { 
  	return moyenne;
  }
  public String getPrenom() { 
  	return prenom;
  }
                
  public String getPhoto() { 
  	return photo;
  }
  public String getSemestre() { 
  	return semestre;
  }
}
