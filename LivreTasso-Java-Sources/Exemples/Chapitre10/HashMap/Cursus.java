/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre indeterminé d'objets
#	Section  : Les dictionnaires
#	Fichier  : Cursus.java
#	Class    : Cursus
*/
import java.util.*;
 public class Cursus  {
 private HashMap<String, Etudiant> listeClassee;
 public Cursus()   {
	listeClassee = new HashMap<String, Etudiant> ();		
 }
 private String creerUneCle(Etudiant e) {
	String tmp;
	tmp = (e.quelPrenom()).charAt(0)+ e.quelNom();
	tmp.toUpperCase();
	return tmp;
 }
 private String creerUneCle(String p, String n ) {
	String tmp;
	tmp = p.charAt(0)+ n;
	tmp.toUpperCase();
	return tmp;
 }
 public void ajouteUnEtudiant() {
	Etudiant nouveau = new Etudiant();
	String cle = creerUneCle(nouveau);
	if (listeClassee.get(cle) == null) listeClassee.put(cle, nouveau);
	else System.out.println("Cet etudiant a deja ete saisi !");
 }
 public void rechercheUnEtudiant(String p, String n) {
	String cle = creerUneCle(p, n);
	Etudiant eClasse = (Etudiant) listeClassee.get(cle);
	if (eClasse != null)		eClasse.afficheUnEtudiant();
	else System.out.println(p + " " + n + " est inconnu ! ");
 }
 public void supprimeUnEtudiant(String p, String n) {
	String cle = creerUneCle(p, n);
	Etudiant eClasse = (Etudiant) listeClassee.get(cle);
	if (eClasse != null)  {
		listeClassee.remove(cle);
		System.out.println(p + " " + n + " a ete supprime ");
	} 
	else System.out.println(p + " " + n + " est inconnu ! ");
 }

 public void afficheLesEtudiants() 	{
	if(listeClassee.size() != 0) {
           Collection<Etudiant> c = listeClassee.values();
           for (  Etudiant e : c)  e.afficheUnEtudiant(); 	
	}
	else System.out.println("Il n'y a pas d'etudiant dans cette liste");
 }
}