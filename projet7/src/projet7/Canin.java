package projet7;

public abstract class Canin extends Animal {
	  
	//notation @Override pour la JavaDoc et qui dit ~que l'on red�finit la m�thode deplacement() h�rit�e de class Animal
    @Override
    void deplacement() {
            System.out.println("Je me d�place en meute !");
    }

}