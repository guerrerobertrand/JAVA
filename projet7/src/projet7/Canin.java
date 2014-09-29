package projet7;

public abstract class Canin extends Animal {
	  
	//notation @Override pour la JavaDoc et qui dit ~que l'on redéfinit la méthode deplacement() héritée de class Animal
    @Override
    void deplacement() {
            System.out.println("Je me déplace en meute !");
    }

}