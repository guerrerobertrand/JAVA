package heritage;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// Code Polymorphisme
//		
//		//D�finition d'un tableau de villes null
//		Ville[] tableau = new Ville[6];
//		         
//		//D�finition d'un tableau de noms de villes et un autre de nombres d'habitants
//		String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
//		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
//		          
//		//Les trois premiers �l�ments du tableau seront des villes,
//		//et le reste, des capitales
//		for(int i = 0; i < 6; i++){
//		     if (i <3){
//		       Ville V = new Ville(tab[i], tab2[i], "france");
//		       tableau[i] = V;
//		     }
//		          
//		     else{
//		       Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
//		       tableau[i] = C;
//		     }
//		}
//		    //description du tableau avec la m�thode polymorphe toString()
//		for(Object obj:tableau){
//			System.out.println(obj.toString()+"\n");
//		}
////		//Il ne nous reste plus qu'� d�crire tout notre tableau !
////		for(Ville v : tableau){
////		     System.out.println(v.decrisToi()+"\n");
////		}
		
		//Classe abstraites = Animal
		Chien c = new Chien("Gris", 20);
		c.boire();
		c.manger();
		c.deplacement();
		c.crier();
		System.out.println(c.toString());		
		System.out.println("---------------------------");
		//m�thodes de l'interface
		c.faireCalin();
		c.faireLeBeau();
		c.faireLechouille();
		System.out.println("---------------------------");
		//polymorphisme de notre interface
		Rintintin r=new Chien();
		r.faireCalin();
		r.faireLeBeau();
		r.faireLechouille();
		
	}
		
}

