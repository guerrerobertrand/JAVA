package projet7;

public class Chien extends Canin implements Rintintin {
	  
    public Chien(){
             
    }
    
    public Chien(String couleur, int poids){
            this.couleur = couleur;
            this.poids = poids;
    }      
     
    void crier() {
            System.out.println("J'aboie sans raison ! ");
    }

   public void faireCalin(){
    	System.out.println("Je te fais un gros calin!");
   }

   public void faireLeBeau(){
	   System.out.println("Je sais faire le k�k�");
   }
}