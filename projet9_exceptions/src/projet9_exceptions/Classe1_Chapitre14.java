package projet9_exceptions;

public class Classe1_Chapitre14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int j = 20, i=0;
try{
	System.out.println(j/i);
	}catch(ArithmeticException e){
	System.out.println("Division par zéro! ");
}
	System.out.println("FIN DU PROGRAMME");
	}

}
