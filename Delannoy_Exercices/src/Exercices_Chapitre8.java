
public class Exercices_Chapitre8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	

		EntNat n1 = new EntNat(20);
		System.out.println("n1= "+n1.getN());
		EntNat n2 = new EntNat(-12);
		System.out.println("n2= "+n2.getN());
}
catch(ErrConst e){
		System.out.println("****Erreur de construction***** avec valeur : "+e.valeur);
		System.exit(-1);
}
	}

}

class EntNat {
	
	public EntNat(int n) throws ErrConst{
	if(n<0) throw new ErrConst(n);
		this.n=n;
	}
	public int getN(){
		return n;
	}
	private int n;

}

class ErrConst extends Exception{
	ErrConst(int valeur){
		this.valeur=valeur;
	}
	public int getValeur(){
		return valeur;
	}
	public int valeur;
}