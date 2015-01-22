
public class Exercices_Chapitre5 {
/*// EXERCICE 60
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1=new Point();
		p1.initialise(3,10);
		System.out.println("les coordonnées de Point sont : x= "+p1.getX()+" et y= "+p1.getY());
		
		PointA p=new PointA();
		p.initialise(5,9);
		p.affiche();
	}

}

class PointA extends Point{
	public void affiche(){
		System.out.println("les coordonnées de PointA sont : x= "+getX()+" et y= "+getY());
	}
}

class Point{
	public void initialise(int x, int y){
		this.x=x;
		this.y=y;
	}

	public void deplace(int dx, int dy){
		x += dx;
		y += dy;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
	private int x, y;
}*/

	
	
/*	// EXERCICE 61
	
public static void main(String[] args) {
	
	Point pt1=new Point();
	pt1.setPoint(3,5);
	pt1.affCoord();
	
	
	PointNom pt2=new PointNom();
	pt2.setPointNom(6, 9, 'D');
	pt2.affCoordNom();
	pt2.setNom('E');
	pt2.affCoordNom();
	pt2.deplace(-3, -3);
	pt2.affCoord();
}	
}

class Point{
	public void setPoint(int x, int y){
		this.x=x;
		this.y=y;
	}

	public void deplace(int dx, int dy){
		x += dx;
		y += dy;
	}

	public void affCoord()
	{
		System.out.println("Coordonnées : "+x+" et "+y);
	}
	
	private int x, y;
}

class PointNom extends Point{
	public void setPointNom(int abs, int ord, char nom){
		super.setPoint(abs,ord);
		this.c=nom;
	}
	
	public void setNom(char nom){
		this.c=nom;
	}
	
	public void affCoordNom(){
		super.affCoord();
		System.out.println(" et mon nom est : "+this.c);
	}
	
	private char c;
}*/

/*	// EXERCICE 62
	
public static void main(String[] args) {
	
	PointNom pt1=new PointNom(8,3,'E');
	pt1.affCoordNom();
	
	PointNom pt2=new PointNom(6, 9,'D');
	pt2.affCoordNom();
	pt2.affCoord();
}	
}

class Point{
	//Constructeur Point 2 arguments Lon, Lat
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void affCoord()
	{
		System.out.println(" Mes coordonnées sont : "+x+" et "+y);
	}
	
	private int x, y;
}

class PointNom extends Point{

	public PointNom(int abs, int ord, char nom){
		super(abs,ord);
		this.c=nom;
	}
	
	public void affCoordNom(){
		System.out.println("Mon nom est : "+this.c);
		affCoord();
	}
	
	private char c;
}*/

/*	// EXERCICE 63
	
public static void main(String[] args) {
	
	Point pt1=new Point(8,3);
	pt1.affiche(); //Méthode de Point
	System.out.println();
	PointNom pt2=new PointNom(6, 9,'D');
	pt2.affiche(); //méthode de PointNom
	}	
}

class Point{
	//Constructeur Point 2 arguments Lon, Lat
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void affiche(){
		System.out.print(" Coordonnées sont : "+x+" et "+y);
	}
	
	private int x, y;
}

class PointNom extends Point{

	public PointNom(int abs, int ord, char nom){
		super(abs,ord);
		this.c=nom;
	}
	
	@Override
	public void affiche(){
		System.out.print(" Mon nom est : "+this.c+" ");
		super.affiche();
	}
	
	private char c;
}*/
	
/*	//EXERCICE 69 = Polymorphisme (limites)
	
	 public static void main (String args[]){
		Point p = new Point(2,4);
	    PointNom pn1 = new PointNom (2, 4, 'A') ;
	    PointNom pn2 = new PointNom (2, 4, 'B') ;
	    System.out.println (pn1.identique(pn2)) ;
	    System.out.println (Point.identiques(pn1, pn2)) ;
	    System.out.println (p.identique(pn1)) ;
	    System.out.println (pn1.identique(p)) ;
	  }
}

	class Point{ 
		public Point (int x, int y) { 
			this.x = x ; this.y = y ; 
		}
		
		public static boolean identiques(Point a, Point b){
			return ( (a.x==b.x) && (a.y==b.y) ) ; 
		}
		public boolean identique (Point a){
		  	return ( (a.x==x) && (a.y==y) ) ; 
		}
		private int x,y; //variables private et sans Getters public
}
	
	class PointNom extends Point{
		PointNom (int x, int y, char nom){
			super (x, y) ; 
			this.nom = nom ; 
			
		}
		
		public static boolean identiques(PointNom a, PointNom b){
			return ( Point.identiques(a, b) && (a.nom==b.nom) ) ; //appel méthode de Point
		}

		public boolean identique (PointNom a){
		  	return ( super.identique(a) && (nom==a.nom) ) ; //appel méthode de Point
		}
		private char nom ;
}*/
		
/*	//EXERCICE 70 = Classe Abstraite et Polymorphisme
	
	 public static void main (String args[]){

	  }
}

abstract class Figure{
	//méhtodes abstraites (sans corps)
	abstract public void affiche();

	abstract public void homothetie(double coef);
	
	abstract public void rotation(double angle);
	
}

	
class Point extends Figure{
	
	//redefinition  des methodes de la classe abstraite
	public void affiche(){
		
	}
	public void homothetie(double coef){
		
	}
	public void rotation(double angle){
		
	}
}*/
/*	//EXERCICE 71 = Classe Abstraite et Polymorphisme
	
	 public static void main (String args[]){

	  }
}

abstract class Figure{
	//méhtodes abstraites (sans corps)
	abstract public void affiche();

	abstract public void homothetie(double coef);
	
	abstract public void rotation(double angle);
	
	public void homoRot(double coef,double rot){
		homothetie(coef);
		rotation(rot);
	}
	
	public static void afficheFigures(Figure[] f){
		for(int i=0;i<f.length;i++){
			f[i].affiche();
		}
	}
	public static void homothetieFigures(double coef, Figure[] f){
		for(int i=0;i<f.length;i++){
			f[i].homothetie(coef);
		}
	}
	public static void rotationFigures(double rot, Figure[] f){
		for(int i=0;i<f.length;i++){
			f[i].rotation(rot);
		}
	}
	
}

	
class Point extends Figure{
	
	//redefinition  des methodes de la classe abstraite
	public void affiche(){
		
	}
	public void homothetie(double coef){
		
	}
	public void rotation(double angle){
		
	}
}*/
	//EXERCICE 71 = Classe Abstraite et Polymorphisme
	
	 public static void main (String args[]){

	  }
}

interface Affichable{
	abstract public void affiche();
}

interface Transformable{
	abstract public void homothetie(double coef);
	abstract public void rotation(double rot);	
}

class Rectangle implements Affichable, Transformable{
	
	//implémentation des methodes des 2 interfaces (obligatoire)
	public void affiche(){
			}
	public void homothetie(double coef){
			}
	public void rotation(double angle){
			}
}
	