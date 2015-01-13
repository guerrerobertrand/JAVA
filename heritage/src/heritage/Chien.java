package heritage;

public class Chien extends Canin implements Rintintin{

	public Chien(){	}

	public Chien(String couleur, int poids){
		this.couleur=couleur;
		this.poids=poids;
	}

	void crier(){
		System.out.println("J'aboie sans raison");
	}
	
	public void faireCalin(){
		System.out.println("Je fais un calin");
	}
	public void faireLechouille(){
		System.out.println("Je fais un bisou");
	}
	public void faireLeBeau(){
		System.out.println("Je fais le beau");
	}
	
}
