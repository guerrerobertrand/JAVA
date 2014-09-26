
public class Ville {

	private String nomVille;
	private String nomPays;
	private int nbreHabitants;
	private char categorie;
	
	//variables de classes qui vont compter les instances
	public static int nbreInstances =0;
	private static int nbreInstancesBis=0;
	
	
	//Constructeur par défaut
	public Ville(){
	
		//On incrémente nos variables à chaque appel des constructeurs
		nbreInstances++;
		nbreInstancesBis++;
				
		System.out.println("Création d'une ville !");
		nomVille="inconnu";
		nomPays="inconnu";
		nbreHabitants=0;
		this.setCategorie();
	}
	
	//Constructeur avec paramètres (méthode surchargée...)
	public Ville(String pNom, int pNbre, String pPays){
		
		//On incrémente nos variables à chaque appel des constructeurs
		nbreInstances++;
		nbreInstancesBis++;
		
		System.out.println("Création d'une ville avec paramètres !");
		nomVille=pNom;
		nomPays=pPays;
		nbreHabitants=pNbre;
		this.setCategorie();
	}
	
	//ACCESSEURS
	
	public String getNom(){
		return nomVille;
	}
	
	public String getPays(){
		return nomPays;
	}
	
	public int getNombreHabitants(){
		return nbreHabitants;
	}
	
	// Retourne la categorie de la Ville
	public char getCategorie(){
		return categorie;
	}
	
	public static int getNombreInstancesBis(){
		return nbreInstancesBis;
	}
	
	//MUTATEURS
	public void setNom(String pNom){
		nomVille=pNom;
	}
	
	public void setPays(String pPays){
		nomPays=pPays;
	}
	
	public void setNombreHabitants(int nbre){
		nbreHabitants=nbre;
	}

	//Définit la catégorie de la Ville
	public void setCategorie(){
		int bornesSuperieures[]={0,1000,10000,100000,500000,1000000};
		char categories[]={'?', 'A', 'B', 'C', 'D', 'E','F'};
		
		int i=0;
		while(i<bornesSuperieures.length&&this.nbreHabitants>=bornesSuperieures[i])
			i++;
		
		this.categorie=categories[i];
	}

	//Retourne la desciption de la ville
	public String decrisToi(){
		return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte : "+this.nbreHabitants+" habitant(s). Elle est de catégorie : "+this.categorie;
	}

	//Retourne une chaine de caractères selon le résultat de la comparaison
	public String comparer(Ville v1){
		String str=new String();
		if(v1.getNombreHabitants()>this.nbreHabitants)
			str="\t"+v1.getNom()+" est une ville plus peuplée que "+this.nomVille;
		else
			str="\t"+this.nomVille+" est une ville plus peuplée que "+v1.getNom();
		return str;
	}
}
