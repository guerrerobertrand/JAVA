package projet10_IO;

import java.io.Serializable;

public class Game implements Serializable {

		private String nom, style;
		private Double prix;
		
		public Game(String nom, String style, double prix){
			this.nom=nom;
			this.style=style;
			this.prix=prix;
		}

		public String toString(){
			return "Nom du jeu : "+this.nom+"\nStyle de jeu : "+this.style+"\nPrix du jeu : "+this.prix+"\n";
		}
		
}
