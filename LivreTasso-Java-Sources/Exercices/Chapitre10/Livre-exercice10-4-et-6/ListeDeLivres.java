/*
#	Le livre de Java, premier langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre ind�termin� d'objets 
#	Exercice   : 10.4 et 10.6 
#	Fichier    : ListeDeLivres.java
#	Class      : ListeDeLivres
*/
import java.util.*;
import java.io.*;
 public class ListeDeLivres implements Serializable  {
 private HashMap<String, Livre> liste;
 public ListeDeLivres()   {
	liste = new HashMap<String, Livre> ();		
 }
 
 public void ajouterUnLivre() {
	Livre nouveau = new Livre();
	String cl� = nouveau.getCode();
	if (liste.get(cl�) == null) liste.put(cl�, nouveau);
	else System.out.println("Ce livre a deja ete saisi !");
 }
 public void rechercherUnLivre(String na, String pa,String c, String i) {
	Livre tmp = new Livre(null, c, na, pa,  i);
	String cl� = tmp.getCode();
    System.out.println("---> " + cl�);
	tmp = (Livre) liste.get(cl�);
	if (tmp != null) tmp.afficherUnLivre();
	else System.out.println(pa + " " + na + " est inconnu ! ");
 }
 public void supprimerUnLivre(String na, String pa,String c, String i) {
	Livre tmp = new Livre(null, c, na, pa,  i);
	String cl� = tmp.getCode();
	tmp = (Livre) liste.get(cl�);
	if (tmp != null)  {
		liste.remove(cl�);
		System.out.println(pa + " " + na + " a ete supprime ");
	} 
	else System.out.println(pa + " " + na + " est inconnu ! ");
 }

 public void afficherLesLivres() 	{
	if(liste.size() != 0) {
           Collection<Livre> c = liste.values();
           for (  Livre tmp : c)  tmp.afficherUnLivre(); 	
	}
	else System.out.println("Il n'y a pas de livre dans cette liste");
 }
}