
public class ClasseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Ville v0 = new Ville();
		Ville v1 = new Ville("Marseille",123456789,"France");
		Ville v2 = new Ville("Rio",123456789,"Brésil");
		
		//on accède aux données des objets villes créées
		System.out.println("\n v= "+v0.getNom()+" ville de "+v0.getNombreHabitants()+" habitants se situant en "+v0.getPays());
		System.out.println("\n v1= "+v1.getNom()+" ville de "+v1.getNombreHabitants()+" habitants se situant en "+v1.getPays());
		System.out.println("\n v2= "+v2.getNom()+" ville de "+v2.getNombreHabitants()+" habitants se situant en "+v2.getPays());

		//on modifie des valeurs de villes
		v1.setNom("Djibouti");
		v2.setPays("Allemagne");
		System.out.println("\n v1= "+v1.getNom()+" ville de "+v1.getNombreHabitants()+" habitants se situant en "+v1.getPays());
		System.out.println("\n v2= "+v2.getNom()+" ville de "+v2.getNombreHabitants()+" habitants se situant en "+v2.getPays());

		Ville V4= new Ville("Lyon", 654, "France");
		Ville V2 = new Ville("Toulouse", 1345609, "France");

		System.out.println("\n\n"+V4.decrisToi());
		System.out.println("\n\n"+V2.decrisToi()+"\n\n");
		System.out.println(V4.comparer(V2));

		
		System.out.println("Le nombre d'instances de la classe Ville est : "+Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "+Ville.getNombreInstancesBis());

		
		Capitale cap = new Capitale("Paris",654987,"France","La tour Eiffel");
		System.out.println("\n"+cap.decrisToi());
		
		// Code Polymorphisme
		
		//Définition d'un tableau de villes null
		Ville[] tableau = new Ville[6];
		         
		//Définition d'un tableau de noms de villes et un autre de nombres d'habitants
		String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		          
		//Les trois premiers éléments du tableau seront des villes,
		//et le reste, des capitales
		for(int i = 0; i < 6; i++){
		     if (i <3){
		       Ville V = new Ville(tab[i], tab2[i], "france");
		       tableau[i] = V;
		     }
		          
		     else{
		       Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
		       tableau[i] = C;
		     }
		}
		    //description du tableau avec la méthode polymorphe toString()
		for(Object obj:tableau){
			System.out.println(obj.toString()+"\n");
		}
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(Ville v : tableau){
		     System.out.println(v.decrisToi()+"\n");
		}
	}*/
//Gestion des exceptions classe NombreHabitantException
		
                Ville v9 = null;
                try {                  
                        v9 = new Ville("Rennes", -900, "France");              
                }catch (NombreHabitantException e) { }
                finally{
                	if(v9==null)
                		v9=new Ville();
                }
                System.out.println(v9.toString());
        }   
}
