
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

	
	
	// EXERCICE 61
	
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
}

