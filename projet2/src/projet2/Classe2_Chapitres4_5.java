package projet2;

import java.util.Scanner;

public class Classe2_Chapitres4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// la structure if...else...
/*
	int i = -5;
		
	if (i<0)//condition
		{
		//ex�cution des instructions si la condition est remplie
		System.out.println("le nombre est n�gatif");
		}
	else 
	{
		//ex�cution des instructions si la condition n'est pas remplie
		if (i==0)
		{
			System.out.println("le nombre est �gal � z�ro");
		}
		else
		{
			System.out.println("le nombre est positif");
		}
	}
*/
		
		// la structure switch
/* 
	Scanner sc=new Scanner(System.in);
	System.out.println("Veuillez saisir une note: ");
	int note=sc.nextInt(); //note 0, 10, ou 20
	
switch(note)
{
	case 0:
		System.out.println("Ouch!");
		break;
	
	case 10:
		System.out.println("bien mais pas top");
		break;

	case 20:
		System.out.println("Parfait!");
		break;
	default:
		System.out.println("Il faut davantage travailler.");
}
		*/

		// une boucle while
/*String prenom; // variable vide qui prend la saisie clavier
char reponse='O'; // initialisation � Oui 'O'
Scanner sc = new Scanner(System.in);
// Tant que la r�ponse est Oui tu ex�cutes
while (reponse == 'O')
{
	System.out.println("Donnez un pr�nom : ");
	prenom =sc.nextLine();
	System.out.println("Bonjour "+prenom+" comment vas tu ?");
	
	//Deuxi�me boucle (imbriqu�e) = initialisation sinon on ne rentre jamais dedans.
	reponse = ' ';
	while (reponse != 'O' && reponse != 'N')
		{
		System.out.println("Voulez vous recommencez ? R�pondre par O/N ");
		reponse=sc.nextLine().charAt(0);
		}
		
} // RETOUR en d�but de boucle tant que la condition est respect�e
System.out.println("Aurevoir, merci ! ");
//FIN de boucle
*/	
/*
		// une boucle Do...While structure et foncitonnement assez similaire
		
		String prenom; // variable vide qui prend la saisie clavier
		char reponse=' '; // plus besoin d'initialiser la variable, on rentre une fois dans la boucle et on sort si la condition n'est pas v�rifi�e

		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Donnez un pr�nom : ");
			prenom =sc.nextLine();
			System.out.println("Bonjour "+prenom+" comment vas tu ?");
			do{
				System.out.println("Voulez vous recommencez ? R�pondre par O/N ");
				reponse=sc.nextLine().charAt(0);
				}while(reponse!= 'O' && reponse !='N');
				
		}while (reponse == 'O');
		System.out.println("Aurevoir, merci ! ");
		//FIN de boucle
*/
		// une boucle for
		
		for(int i =10; i >=0; i--)
			System.out.println("Il reste "+i+" lignes � �crire !");
		
	}
}
