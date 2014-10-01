/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Un éditeur pour dessiner
#	Fichier  : ListeDeFormes.java
#	Class    : ListeDeFormes
*/

// Le fichier ListeDeFormes.java se trouve dans le répertoire 
// Sources/Exemples/Chapitre12/NetBeansProjects/EditeurExemple/src/Introduction
package Introduction;
import java.util.*;

public class ListeDeFormes  {
 private ArrayList<Forme> listeFormes;

 public ListeDeFormes()	{
  listeFormes = new ArrayList<Forme>();  
 }
 
 public void ajouterUneForme(Forme f)  {
   // Si la forme passée en paramètre est un Cercle
   if (f instanceof Cercle) {
     // L’ajouter à la liste comme forme de type Cercle
     listeFormes.add((Cercle) f);
   }
   // Si la forme passée en paramètre est un Rectangle
 
}

public ArrayList<Forme> getListeFormes(){
    return listeFormes;
}

 public void supprimerLesFormes(){
   // La méthode clear() vide la liste de son contenu
   listeFormes.clear();
}

  public void supprimerLaDerniereForme(){
      int index = listeFormes.size();
      if (index >0)
      listeFormes.remove(index-1);
  }
 
 public void afficherLesFormes() {
   int nbFormes = listeFormes.size();
   System.out.println("---------------------------------");
   if (nbFormes > 0) {
      // Pour toutes les formes de la liste, afficher son contenu. 
      // La méthode afficher() utilisée est soit celle de la classe Cercle soit celle de la classe 
      // Rectangle, selon le type de la forme
      for (Forme tmp : listeFormes) tmp.afficher();
   }
   else {
      System.out.println("La liste des formes est vide ");
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
       
      }
    } while (mot != null);
    
 }

}

