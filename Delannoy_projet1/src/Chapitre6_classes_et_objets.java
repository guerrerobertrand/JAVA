
public class Chapitre6_classes_et_objets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point a=new Point(3, 6);
		a.affiche();
		a.deplace(2, 0);
		a.affiche();
		
		Point b=new Point(5, 6);
		b.affiche();

		System.out.println("a et b coincident-ils ? " + a.coincide(b)+ " "+ b.coincide(a));
	
		
		Cercle c = new Cercle(1, 2, 3.5f);
		c.affiche();
		
	}

}
