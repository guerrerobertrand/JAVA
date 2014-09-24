package projet1;

import java.util.Scanner;

public class Classe1_sdz1 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Contenu de notre classe
		System.out.println("les variables et les opérateurs");
		//System.out.println("Bertrand");

		byte temperature;
		temperature=64;
		
		short vitesseMax;
		vitesseMax=32000;
		
		int temperatureSoleil;
		temperatureSoleil=15600000;
		
		long anneeLumiere;
		anneeLumiere= 946070000;
		
		float pi;
		pi=3.141592653f;
	
		float nombreF;
		nombreF=2.0f;

		double division;
		division=0.3333333333333333333333333333334;
		
		char caractere;
		caractere='A';

		boolean question;
		question=true;
		
		String str=new String();
		str="une déclaration de chaine de caractères";

		int resultat;
		resultat= temperatureSoleil/vitesseMax;
		System.out.println("Le résultat est =" +resultat);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Veuillez taper un mot s'il vous plait :");
		String str1=sc.nextLine();
		System.out.println("Vous avez saisi : " +str1);
	}

}
