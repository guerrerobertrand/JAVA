package projet8;

import com.sdz.comportement.*;

class Test_ZArmy_Chapitre13 {

	public static void main(String[] args) {
        Personnage[] tPers = {new Guerrier(), new Civil(), new Medecin()};
       // String[] tArmes = {"pistolet", "pistolet", "couteau", "fusil ˆ pompe", "couteau"};
        for(int i = 0; i < tPers.length; i++){
            System.out.println("\nInstance de " + tPers[i].getClass().getName());
            System.out.println("*****************************************");
             // tPers[i].setArmes(tArmes[i]);
            tPers[i].combattre();
            tPers[i].seDeplacer();
            tPers[i].soigner();
        }      
    }
}
