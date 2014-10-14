public class Chapitre10_Exceptions {

/*//méthode 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Point a = new Point(1,4);
			a.affiche();
			//a.deplace(-3,5); //erreur de deplacement
			a=new Point(-3,5);
			a.affiche();
		}
		catch(ErrConst e){
			System.out.println("Erreur de construction classe Point");
			System.out.println(" coordonnées souhaitées : "+e.abs+" et "+e.ord);
			System.exit(-1);
		}
		catch(ErrDepl e){
			System.out.println("Erreur de deplacement classe Point");
			System.exit(-1);
		}
	}

}

class Point { //instructions de définition de champs et des méthodes de la classe

	public Point (int x, int y) throws ErrConst // ce constructeur est succeptible de déclencher une exception
	{ if ((x<0) || (y<0)) throw new ErrConst(x,y); // lancement de l'exception
		this.x=x;
		this.y=y;
	}
		
	public void affiche(){
		System.out.println("Je suis un point de coordonnées : x= "+x +" et y= "+y);
	}
	
	private int x;	//abscisse
	private int y; //ordonnée

	public void deplace(int dx, int dy) throws ErrDepl 
	{
		if(((x+dx)<0)||((y+dy)<0)) throw new ErrDepl();
		x+=dx;
		y+=dy;
	}
	
}

class ErrConst extends Exception { //ici exemple avec affichage des coordonnées provoquant l'erreur
ErrConst(int abs, int ord){
	this.abs=abs;
	this.ord=ord;
}
public int abs, ord;
}
class ErrDepl extends Exception { //ici exemple vide
	
}*/

//méthode 2 avec message et héritage de super classe Exception !!	catch avec .getMessage()
// METHODE A UTILISER
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			Point a = new Point(1,4);
			a.affiche();
			a=new Point(-3,5);
			a.affiche();
		}
		catch(ErrConst e){
			System.out.println(e.getMessage());
			System.exit(-1);
		}
	}

}

class Point { //instructions de définition de champs et des méthodes de la classe

	public Point (int x, int y) throws ErrConst // ce constructeur est succeptible de déclencher une exception
	{ if ((x<0) || (y<0)) throw new ErrConst("Erreur construction de Point avec coordonnées "+x+" "+y); // lancement de l'exception
		this.x=x;
		this.y=y;
	}
		
	public void affiche(){
		System.out.println("Je suis un point de coordonnées : x= "+x +" et y= "+y);
	}
	
	private int x;	//abscisse
	private int y; //ordonnée


}

class ErrConst extends Exception { //ici exemple avec affichage des coordonnées provoquant l'erreur
ErrConst(String mes){
	super(mes);
}
}
