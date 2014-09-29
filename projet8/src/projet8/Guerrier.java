package projet8;

import com.sdz.comportement.*;

/*    public void combattre() {
        if(this.armes.equals("pistolet"))
            System.out.println("Attaque au pistolet !");
        else if(this.armes.equals("fusil de sniper"))
            System.out.println("Attaque au fusil de sniper !");
        else
            System.out.println("Attaque au couteau !");
    }*/
public class Guerrier extends Personnage{
	public Guerrier(){
		this.espritCombatif=new CombatPistolet();
	}

	public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep){
		super(esprit,soin,dep);
	}
}

