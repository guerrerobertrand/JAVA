/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Exercice 12.8 à 12.12
#	Fichier  : ListeDeFormes.java
#	Class    : ListeDeFormes
*/

// Le fichier FeuilleDeDessins.java se trouve dans le répertoire 
// Sources/Exercices/Chapitre12/NetBeansProjects/EditeurExercice/src/Introduction
package Introduction;
import java.util.*;
import java.io.IOException;

public class ListeDeFormes  {
 private ArrayList<Forme> listeFormes;

 public ListeDeFormes()	{
  listeFormes = new ArrayList<Forme>();  
 }
 
 public void ajouterUneForme(Forme f)  {
   if (f instanceof Cercle) {
  	  listeFormes.add((Cercle) f);
  }
  else   if (f instanceof Rectangle) {
  	listeFormes.add((Rectangle) f);
  }
 }
public ArrayList<Forme> getListeFormes(){
    return listeFormes;
}

public void supprimerLesFormes(){
      listeFormes.clear();
  }
// Exercice 12.9 
public void supprimerLaDerniereForme(){
      // Calculer la taille de la liste
      int index = listeFormes.size();
      if (index >0)
      // Supprimer le drenier élément de la liste
      listeFormes.remove(index-1);
  }
 
public void afficherLesFormes() {
 	int nbFormes = listeFormes.size();
        System.out.println("------------------------------------------");
 	if (nbFormes > 0) {
 		for (Forme tmp : listeFormes) tmp.afficher();
 	}
 	else {
 		System.out.println("La liste des formes est vide  ");
 	}
 }


public void enregistrerLesFormes(Fichier f){

	int nbFormes = listeFormes.size();
 	if (nbFormes > 0) {
           String chaine = "";
 	   for (Forme tmp : listeFormes)  {
                  tmp.afficher();
 		  chaine = tmp.getInfos();
 		  if (chaine != null)  f.ecrire(chaine);	
 	    }
 	}
  } 

public void lireLesFormes(Fichier f) 
 {
    String chaine;
    String [] mot = {"", "","", "", "","","",""};
    char tt;
    int cc, xx0, yy0, xx1, yy1, xx2, yy2, ll, hh, rr; 
    do {
      mot = f.lire(); 
      if (mot != null) {
        tt = mot[0].charAt(0); 
        if ( tt == 'C') {
      	  cc = Integer.parseInt(mot[1]); 
      	  xx0 = Integer.parseInt(mot[2]); 
          yy0 = Integer.parseInt(mot[3]); 
          rr = Integer.parseInt(mot[4]); 
          listeFormes.add(new Cercle( xx0, yy0, rr, cc));
        }
       else  if( tt == 'R') {
   	  cc = Integer.parseInt(mot[1]); 
      	  xx0 = Integer.parseInt(mot[2]); 
          yy0 = Integer.parseInt(mot[3]); 
          ll = Integer.parseInt(mot[4]); 
          hh = Integer.parseInt(mot[5]); 
      	  listeFormes.add(new Rectangle( xx0, yy0, ll, hh, cc));

       }
      }
    } while (mot != null);
    
 }

}

