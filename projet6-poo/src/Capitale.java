
public class Capitale extends Ville {

/*	private String monument;
	
	//Constructeur par d�faut (=sans param�tres)
	public Capitale(){
		// Ce mot cl� appelle le constructeur de la classe m�re
		super();
		monument="aucun"; //initialisation
	}

	//Constructeur d'initialisation de Capitale (=avec les param�tres de la classe M�re+h�rit�e)
	public Capitale(String nom, int hab, String pays, String monument){
		super(nom, hab,pays);
		this.monument=monument;
	}
	
	*//**Description d'une capitale
	*@return String retourne la description de l'objet
	*
	**//*
	public String decrisToi(){
		String str=super.decrisToi()+"\n \t ==>"+this.monument+" en est un monument";
		return str;
	}

	public String toString(){
		String str=super.toString()+"\n \t ==> "+ this.monument+ " en est un monument";
		return str;
	}
	
	*//**
	 * @return le nom du monument 
	 *//*
	public String getMonument(){
		return monument;
	}
	
	//d�finit le nom du monument
	public void setMonument(String monument){
		this.monument=monument;
	}
	*/
}
