package projet3_TP;

import java.util.Scanner;

public class Classe_Chapitre6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char choixConvertisseur;
		double resultatC;
		double resultatF;
		int temperatureAConvertir;
		char reponse;
		Scanner sc= new Scanner(System.in);
		
	
		do{
			reponse = ' '; // initialisation sinon on ne rentre pas dans la boucle

			System.out.println("Choisissez le mode de conversion: (1/2)");
			System.out.println("1- Convertisseur Celsisus vers Fahrenheit");
			System.out.println("2- Convertisseur Fahrenheit vers Celsius");
			
			choixConvertisseur=' ';
			temperatureAConvertir=' ';
			
			choixConvertisseur=sc.nextLine().charAt(0);
			
		if (choixConvertisseur==1)//condition
			{
			//exécution des instructions si la condition est remplie
			System.out.println("Convertisseur Celsisus vers Fahrenheit");
			System.out.println("Veuillez saisir la température à convertir: ");
			temperatureAConvertir=sc.nextInt();
			
			resultatF=((9/5)*temperatureAConvertir+32);
			System.out.println("Le résultat est : "+resultatF);
			}
		else 
		{
			//exécution des instructions si la condition n'est pas remplie
			System.out.println("Convertisseur Fahrenheit vers Celsius");
			System.out.println("Veuillez saisir la température à convertir: ");
			temperatureAConvertir=sc.nextInt();
			
			resultatC=(((temperatureAConvertir-32)*5)/9);
			System.out.println("Le résultat est : "+resultatC);
		}
		//reponse=' ';			
	    
		//On invite l'utilisateur à recommencer ou à quitter
	     do{      
	       System.out.println("Souhaitez-vous convertir une autre température ?(O/N)");
	       reponse = sc.nextLine().charAt(0);
	        
	     }while(reponse != 'O' && reponse != 'N');
	      
		}while(reponse == 'O');
		//System.out.println("Souhaitez vous convertir une autre température ? (O/N)");
		//reponse=sc.nextLine().charAt(0);
		System.out.println("Vous quittez le convertisseur, Au revoir!)");
	}

}
