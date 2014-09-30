package projet11_genericite;

public class Solo<T> {
	
	//Variable d'instance
	private T valeur;
	
	//Constructeur par d�faut
	public Solo(){
		this.valeur=null;
	}
	
	//Constructeur avec param�tre inconnu pour l'instant
	public Solo(T val){
		this.valeur=val;
	}

	//D�finit la valeur avec le param�tre
	public void setValeur(T val){
		this.valeur=val;
	}

	//Retourne la valeur d�j� "cast�e" par la signature de la m�thode!
	public T getValeur(){
		return this.valeur;
	}
}
