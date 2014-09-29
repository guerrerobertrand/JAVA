package projet7;

public class Loup extends Canin {
	  
    public Loup(){
             
    }
    public Loup(String couleur, int poids){
            this.couleur = couleur;
            this.poids = poids;
    }      

    void crier() {
            System.out.println("J'hurle ˆ la lune en faisant ouhouh ! ! ");               
    }
}