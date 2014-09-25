package projet4;

import java.util.Scanner;

public class Classe_Chapitre7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char tableauCaractere[]={'a','b','c','d','e','f','g'};
		int i=0, emplacement=0;
		
		char reponse=' ', carac=' ';
		Scanner sc=new Scanner(System.in);
	
	do{//Boucle Principale
		do{//On répète cette boucle tant que la lettre saisie n'est pas dans le tableau
			i=0;
			System.out.println("Rentrez une lettre minuscule, SVP ?");
			carac=sc.nextLine().charAt(0);
			//Boucle de recherche dans le tableau
			while(i<tableauCaractere.length && carac != tableauCaractere[i])
			i++;
			
			//Si i<7 c'est que la boucle n'a pas dépassé le nombre de cases du tableau 
			if(i<tableauCaractere.length)
				System.out.println("La lettre saisie "+carac+ " se trouve bien dans le tableau" );
			else //sinon
				System.out.println("La lettre "+carac+" n'est pas dans le tableau!");
		}while(i>=tableauCaractere.length);
		
		//Tant que la lettre de l'utilisateur ne correspond pas à une lettre du tableau 
		do{
			System.out.println("Voulez-vous essayer à nouveau O/N ?");
			reponse=sc.nextLine().charAt(0);
		}while(reponse!='N'&&reponse!='O');
		
	}while(reponse=='O');
	
	System.out.println("Aurevoir!");
	
		//for(int i=0;i<tableauCaractere.length;i++){
		//	System.out.println("A l'emplacement"+i +" du tableau nous avons = " +tableauCaractere[i]);
		//}
		
	}

}
