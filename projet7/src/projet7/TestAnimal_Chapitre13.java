package projet7;

public class TestAnimal_Chapitre13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chien l = new Chien("Gris", 20);
		l.boire();
		l.manger();
		l.deplacement();
		l.crier();
		System.out.println(l.toString());
		
		//les méthodes de l'interface
		l.faireCalin();
		l.faireLeBeau();
		
	}

}
