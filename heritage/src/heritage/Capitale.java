package heritage;

public class Capitale extends Ville {
    
	   private String monument;
	     
	   //Constructeur par dfaut
	   public Capitale(){
	     //Ce mot cl appelle le constructeur de la classe mre
	     super();
	     monument = "aucun";
	   }   
	       
	   //Constructeur d'initialisation de capitale
	   public Capitale(String nom, int hab, String pays, String monument){
	    super(nom, hab, pays);
	    this.monument = monument;
	   }   
	      
	   /**
	    * Description d'une capitale
	    * @return String retourne la description de l'objet
	    */
	   public String decrisToi(){
	     String str = super.decrisToi() + "\n \t ==>>" +
	     this.monument + " en est un monument";
	     return str;
	    }
	 
	   /**
	     * @return le nom du monument
	     */
	   public String getMonument() {
	      return monument;
	   }
	 
	   //Dfinit le nom du monument
	   public void setMonument(String monument) {
	      this.monument = monument;
	   }  
	   @Override
	   public String toString(){
		     String str = super.toString() + "\n \t ==>>" +
		     this.monument + " en est un monument";
		     return str;
	    }
}