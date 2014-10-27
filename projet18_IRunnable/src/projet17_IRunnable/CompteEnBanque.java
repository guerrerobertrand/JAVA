package projet17_IRunnable;

public class CompteEnBanque {

	private int solde =100;
	
	public int getSolde(){
		if(this.solde<0)
			System.out.println("Vous �tes � d�couvert !");
			return this.solde;
		}
/*	public void retraitArgent(int retrait){
		solde = solde - retrait;
		System.out.println("Solde = "+solde);
	}*/
	// la m�me m�thode mais en synchronized elle se lib�re que quand le 1er thread a termin�
	public synchronized void retraitArgent(int retrait){
		solde = solde - retrait;
		System.out.println("Solde = "+solde);
	}
	
}
