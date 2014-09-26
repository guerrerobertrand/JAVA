
public class ClasseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville v = new Ville();
		Ville v1 = new Ville("Marseille",123456789,"France");
		Ville v2 = new Ville("Rio",123456789,"Brésil");
		
		//on accède aux données des objets villes créées
		System.out.println("\n v= "+v.getNom()+" ville de "+v.getNombreHabitants()+" habitants se situant en "+v.getPays());
		System.out.println("\n v1= "+v1.getNom()+" ville de "+v1.getNombreHabitants()+" habitants se situant en "+v1.getPays());
		System.out.println("\n v2= "+v2.getNom()+" ville de "+v2.getNombreHabitants()+" habitants se situant en "+v2.getPays());

		//on modifie des valeurs de villes
		v1.setNom("Djibouti");
		v2.setPays("Allemagne");
		System.out.println("\n v1= "+v1.getNom()+" ville de "+v1.getNombreHabitants()+" habitants se situant en "+v1.getPays());
		System.out.println("\n v2= "+v2.getNom()+" ville de "+v2.getNombreHabitants()+" habitants se situant en "+v2.getPays());

		Ville V= new Ville("Lyon", 654, "France");
		Ville V2 = new Ville("Toulouse", 1345609, "France");

		System.out.println("\n\n"+V.decrisToi());
		System.out.println("\n\n"+V2.decrisToi()+"\n\n");
		System.out.println(V.comparer(V2));

		
		System.out.println("Le nombre d'instances de la classe Ville est : "+Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : "+Ville.getNombreInstancesBis());
		
		
	}

}
