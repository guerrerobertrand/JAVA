/*
public class Exercices_Chapitre3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Point a = new Point(3);
	a.affiche();

	Point b=new Point(12);
	b.affiche();
	
	b.setOrigine(3);
	b.affiche();
	
		Ident a = new Ident();
		Ident b = new Ident();
		
		System.out.println("numero de a : " + a.getIdent());
		System.out.println("numero de b : " + b.getIdent());
		System.out.println("dernier numero attribué : " + Ident.getIdentMax());
		Ident c = new Ident();
		System.out.println("numero de c : " + c.getIdent());
		System.out.println("dernier numero attribué : " + Ident.getIdentMax());
	}
}	


class Ident{
	
	public Ident(){
		num = numCourant;
		numCourant++;
	}
	
	public int getIdent(){
		return num;
	}
	
	public static int getIdentMax(){ //méthode de classe indépendante de tout objet... appel ex: Ident.getIdentMax();
		return numCourant-1;
	}
		
	private static int numCourant=0; // dernier numéro attribué
	private int num; // numéro de l'objet
	
	//Bloc d'initialisation statique pour récupérer la valeur initiale des objets depuis la saisie clavier
	// cela implique de déclarer numCourant avant et le bloc est exécuté même si aucun objet n'est créé...
	static{
		System.out.println("Veuillez saisir l'identifiant de l'objet: ");
		do{
			numCourant=Clavier.lireInt();
			}
		while(numCourant<=0);
	}
	
	
}

class Point{
		
	public static int origineInit=0;
	public static int origineCourante;
	
		//constructeur
		public Point(int abs){
			x=origineInit+abs;
			origineCourante=x;
		}
		
		//méthodes de classe
		public void affiche(){
			System.out.println("l'abscisse du point est : "+x);
			System.out.println("par rapport à l'origine absolue : "+origineInit);
		}

		public void setOrigine(int dep){
			t=dep;
			origineInit+=t;
			origineCourante=t;
			System.out.println("On place l'origine en "+origineCourante);
		}
		
		public int getOrigine(){
			return origineCourante;
		}
		
	public static void main (String args[]){
		//Déclarations
		private int x;
		private int t;	
	}

		Point a = new Point(1, 3) ;
		Point b = new Point(4, 8) ;
		a.affiche() ; b.affiche() ;
		Segment s1 = new Segment (a, b) ;
		s1.affiche() ;
		s1.deplaceOrigine (2, 5) ;
		s1.affiche() ;
		Segment s2 = new Segment (3, 4, 5, 6) ;
		s2.affiche() ;
		System.out.println ("longeur = " + s2.longueur()) ;
		s2.deplaceExtremite (-2, -2) ;
		s2.affiche() ;
	}
}
	
	class Point{ 
		public Point (double x, double y) { this.x = x ; this.y = y ; }
		public void deplace (double dx, double dy) { x += dx ; y += dy ; }
		public double getX () { return x ; }
		public double getY () { return y ; }
		public void setX (double x) { this.x = x ; }
		public void setY (double y) { this.y = y ; }

		public void affiche ()
			{ System.out.println ("coordonnees = " + x + " " + y ) ;
			}
		private double x, y ;
	}
	
	class Segment{
		public Segment (Point or, Point ext){
			this.or = or ; this.ext = ext ;
		}
		public Segment (double xOr, double yOr, double xExt, double yExt){
			or = new Point (xOr, yOr) ;
			ext = new Point (xExt, yExt) ;
		}
		public double longueur(){
			double xOr = or.getX(), yOr = or.getY() ;
			double xExt = ext.getX(), yExt = ext.getY() ;
			return Math.sqrt ( (xExt-xOr)*(xExt-xOr) + (yExt-yOr)*(yExt-yOr) ) ;
		}
		public void deplaceOrigine (double dx, double dy){
			or.setX (or.getX() + dx) ;
			or.setY (or.getY() + dy) ;
		}
		public void deplaceExtremite (double dx, double dy){
			ext.setX (ext.getX() + dx) ;
			ext.setY (ext.getY() + dy) ;
		}
		public void affiche (){
			System.out.print ("Origine - ") ; or.affiche() ;
			System.out.print ("Extremite - ") ; ext.affiche() ;
		}
		private Point or, ext ;
	}
	


*/