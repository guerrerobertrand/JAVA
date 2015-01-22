package projet9_exceptions;

public class Classe1_Chapitre14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int j = 20, i=0;
	try{
		System.out.println(j/i);
	}catch(ArithmeticException e){
		System.out.println("Division par zéro! ");
	}
	
	System.out.println("FIN DU PROGRAMME");
*/
		try{
		Point a = new Point(4,9);
		a.affiche();
		a = new Point(-1,9);
		a.affiche();
		}catch(ErrCoord e){
			System.out.println(e.getMessage());
			System.exit(-1);
		}
	}//fin de main
}//fin de Classe
	
class Point{
		public Point(int abs, int ord) throws ErrCoord{
			if((abs<0) || (ord<0)) throw new ErrCoord("Erreur de construction avec les coordonnées "+abs+" "+ord);
			this.x=abs;
			this.y=ord;
		}
		public void affiche(){
			System.out.println("Point de coordonnées x= "+x+" et y= "+y );
		}

		private int x,y;
			
	}
class ErrCoord extends Exception{
	ErrCoord(String message){
		super(message);
	}
}
	