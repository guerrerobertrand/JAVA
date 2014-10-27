package projet17_IRunnable;

public class CompteEnBanque {

	private int solde =100;
	
	public int getSolde(){
		if(this.solde<0)
			System.out.println("Vous tes ˆ dŽcouvert !");
			return this.solde;
		}
/*	public void retraitArgent(int retrait){
		solde = solde - retrait;
		System.out.println("Solde = "+solde);
	}*/
	// la mme mŽthode mais en synchronized elle se libre que quand le 1er thread a terminŽ
	public synchronized void retraitArgent(int retrait){
		solde = solde - retrait;
		System.out.println("Solde = "+solde);
	}
	
}
