import java.util.*;

class Film {
    private String nom;
    private Calendar dateSortie;
    private String genre;

    public Film(String n, Calendar ds, String g) {
	nom = n;
	dateSortie = ds;
	genre = g;
    }
}

class Projection {
    private double prix;
    private int nbSpectateurs;
    private Calendar jour;

    //Film projete
    private Film leFilm;

    public Projection(double lePrix, Calendar leJour, Film f) {
	prix = lePrix;
	jour = leJour;
	leFilm = f;
    }

    public Calendar getJour() {
	return jour;
    }
    public double getPrix() {
	return prix;
    }
    public int getNbSpectateurs() {
	return nbSpectateurs;
    }
    public void setNbSpectateurs(int n) {
	nbSpectateurs = n;
    }
}

public class Salle {
    private String nom;
    private String adresse;
    private String codePostal;

    //Les projections faites dans la salle
    private Collection<Projection> lesProjs;

    public Salle(String n, String a, String cp) {
	nom = n;
	adresse = a;
	codePostal = cp;

	lesProjs = new ArrayList<Projection>();
    }

    public void addProj(Projection p) {
	lesProjs.add(p);
    }

    public double calculeRecette(Calendar jour) {
	double recetteTotale = 0;

	for (Projection p : lesProjs) {
	    if (p.getJour().equals(jour)) {
		recetteTotale += p.getNbSpectateurs() *
		    p.getPrix();
	    }
	}

	return recetteTotale;
    }

    public static void main(String[] args) {
	//Le 10/1/2014
	Calendar c = new GregorianCalendar(2014, 0, 10);
	//Le 12/1/2010
	Calendar c2 = new GregorianCalendar(2014, 0, 12);

	Film leFilm = new Film("Le retour", c, "Drame");
	Salle laSalle = new Salle("La toile", "rue du bac", "75000" );
	Projection p1, p2;

	p1 = new Projection(5.5, c, leFilm);
	p1.setNbSpectateurs(30);
	p2 = new Projection(7, c2, leFilm);
	p2.setNbSpectateurs(50);

	laSalle.addProj(p1);
	laSalle.addProj(p2);

	System.out.println(laSalle.calculeRecette(c));
    }
}