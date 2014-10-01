/*
#	Le livre de Java, premier langage
#	A. Tasso
#	Chapitre 10 : Collectionner un nombre indetermine d'objets 
#	Exercice   : 10.3 
#	Fichier    : Etudiant.java
#	Class      : Etudiant
*/

import java.util.*;
import java.lang.Number.*;
public class Etudiant		{
	private String nom, prenom;
        private ArrayList<Double>  notes; 
	private double moyenne;

	public Etudiant(String p, String n)   	{
		Scanner lectureClavier = new Scanner(System.in);
                nom = n;
		prenom = p;
		System.out.print("Combien de notes pour l'etudiant  ");
		System.out.print( prenom + " " + nom + " :  ");
		int nombre = lectureClavier.nextInt();
		notes = new ArrayList<Double> ();
		for (int i = 0; i < nombre; i ++)	{
			System.out.print("Entrer la note  n° "+ (i+1)+ " :  ");
			notes.add(new Double(lectureClavier.nextDouble()));
		}
		moyenne = calculMoyenne();
	}

	public Etudiant()   	{
		Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Entrer le nom de l'etudiant : ");
		nom = lectureClavier.next();;
		System.out.print("Entrer le prenom de l'etudiant : ");
		prenom = lectureClavier.next();;
		System.out.print("Combien de notes pour l'etudiant  ");
		System.out.print( prenom + " " + nom + " :  ");
		int nombre = lectureClavier.nextInt();
		notes = new ArrayList<Double> ();
		for (int i = 0; i < nombre; i ++)	{
			System.out.print("Entrer la note  n° "+ (i+1)+ " :  ");
			notes.add(new Double(lectureClavier.nextDouble()));
		}
		moyenne = calculMoyenne();
	}
	public void afficheUnEtudiant()  {
		Scanner lectureClavier = new Scanner(System.in);
                System.out.print(" Les notes  de "+prenom+" "+nom+ " sont : ");
		int nbnotes = notes.size();
		for(Double valeur : notes) 
			System.out.print(" "+ valeur);
		System.out.println();
		System.out.println("Sa moyenne vaut  "+ moyenne);
	}

	private double calculMoyenne() 	{ 
		double somme = 0.0;
		int nbnotes = notes.size();
		for(Double valeur : notes) {
			somme = somme + valeur;
		}
		return somme/nbnotes;
	}

	public String quelNom()	{ 
		return nom;
	}
	public String quelPrenom()	{ 
		return prenom;
	}
	public double quelleMoyenne()	{ 
		return moyenne;
	}
}


