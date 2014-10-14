/*// Exemple de création et d'utilisation d'une classe dérivée
// ici classe PointCol dérivée de Point, on utilise les méthodes de Point avec les objets pc
public class Chapitre8_heritage {
	public static void main(String[] args) {
	PointCol pc1=new PointCol(3,5,(byte)2);
	pc1.affiche();
	//pc1.initialise(3,5);
	pc1.colore((byte)3);
	//pc1.affiche();
	pc1.affiche();
	PointCol pc2=new PointCol(6,9,(byte)2);
	//pc2.initialisec(6,9,(byte)2);
	pc2.affiche();
	pc2.deplace(1, -3);
	pc2.affiche();
	}
}

class Point{	
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void initialise (int abs, int ord){
		x=abs;
		y=ord;
	}
	
	public void deplace(int dx, int dy){
		x+=dx;
		y+=dy;
	}
	
	public void affiche(){
		System.out.println("Je suis un point de coordonnées : x= "+x +" et y= "+y);
	}
	
	private int x, y;
	
	}


class PointCol extends Point{
	//Constructeur de la classe dérivée
	public PointCol(int x, int y, byte couleur){
		super(x,y); // obligatoirement la première instruction (appel du constructeur classe mère, dans le cas de dérivation multiple, alors super => niveau supérieur)
		this.couleur=couleur;
	}
	
	public void colore (byte couleur){
		this.couleur=couleur;
	}
	public void affiche (){
		super.affiche();
		System.out.println(" et ma couleur est : "+couleur);
	}
	public void initialisec (int x, int y, byte couleur){
		initialise(x,y);
		this.couleur=couleur;
	}	
	private byte couleur;
}


*/