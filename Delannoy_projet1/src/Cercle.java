
public class Cercle {

	public Cercle(int x, int y, float rayon){
	//constructeur	
	
		c=new Point(x, y);
		this.rayon=rayon;
		
	}
	
	public void affiche(){
		System.out.println("Je suis un cercle de rayon : "+rayon);
		System.out.print(" et de centre : "+c.getX()+" et "+c.getY());
	}
	
	public void deplace(int dx, int dy){
		
	}

	private Point c; // Centre du cercle (coordonnŽes x et y => objet de type Point)
	private float rayon; // Rayon du cercle
	
}
