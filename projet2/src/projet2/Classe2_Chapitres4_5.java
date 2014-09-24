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
		//exŽcution des instructions si la condition est remplie
		System.out.println("le nombre est nŽgatif");
		}
	else 
	{
		//exŽcution des instructions si la condition n'est pas remplie
		if (i==0)
		{
			System.out.println("le nombre est Žgal ˆ zŽro");
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
String prenom; // variable vide qui prend la saisie clavier
char reponse='O'; // initialisation ˆ Oui 'O'
Scanner sc = new Scanner(System.in);
// Tant que la rŽponse est Oui tu exŽcute
while (reponse == 'O')
{
	System.out.println("Donnez un prŽnom : ");
	prenom =sc.nextLine();
	System.out.println("Bonjour "+prenom+" comment vas tu ?");
	System.out.println("Voulez vous recommencez ? O/N ");
	reponse=sc.nextLine().charAt(0);
}
		
	}
}
