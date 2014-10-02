
public class Exercices_Chapitre6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Point p = new Point('c', 6);
	p.affiche();
	p.translate(10);
	p.affiche();
	
	}
}	

class Point{
		
		//constructeur
		public Point(char nom, int abs){
			identifiant=nom;
			x=abs;
		}
		
		//méthodes de classe
		public void affiche(){
			System.out.println("le nom du point est : "+identifiant+" et l'abscisse est : "+x);
		}

		public void translate(int dep){
			t=dep;
			x+=t;
		}
		//Déclarations
		private char identifiant;
		private int x;
		private int t;	
	}


