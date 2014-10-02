
public class Chapitre5_boucles {
	/*
	 ***********************************************************************
	 */
	
	//Instructions de contr�le : choix (conditions) et boucles (r�p�titions)
	
	/*
	 ***********************************************************************
	 */
/*
 * choix = instructions if...else; et switch;
 * 
 * boucles = do...while; while; et for;	
 * 
 * instructions de branchements inconditionnels : break; continue;
 * 
 * if (condition)
 * 		instruction_1;
 * [else
 * 		instruction_2;] // entre crochets est facultatif
 * 
 */
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double taux_tva=21.6;
		double ht, ttc, net, tauxr, remise;
		System.out.println("Donnez le prix HT: ");
		ht=Clavier.lireDouble();

		ttc=ht*(1.+taux_tva/100.);
		if(ttc<1000.)
				tauxr=0;
		else if(ttc <2000)
				tauxr=1.;
		else if(ttc<5000)
				tauxr=3.;
		else
				tauxr=5.;
		remise=ttc*tauxr/100.;
		net=ttc-remise;

		System.out.println("prix ttc = "+ttc);
		System.out.println("remise = "+remise);
		System.out.println("net � payer ="+net);
		
	}*/

	/*
	 ***********************************************************************
	 * Instruction switch: en g�n�ral expression != type float...
	 * 
	 *int n;
	 *switch(expression constante)
	 *{
	 *case x1: instruction1;
	 *			break;
	 *case x2: instruction2;
	 *			break;
	 *case xx: instructionx;
	 *			break;
	 *[default: instruction par d�faut;]
	 *}
	 *
	 */
		
/*	
	 ***********************************************************************
	 *
	 * Instruction do...while
	 * 
	 * do {instruction}
	 * 	while (condition); //o� condition est une expression bool�enne quelconque
	 * 
	 * structure parcourue au moins une fois
	 * 
*/	 

/*		
	 ***********************************************************************
	 *
	 * Instruction while
	 * 
	 * while (condition) 
	 * 		{instruction}
	 *
	 *  l'inverse de do...while la condition est examin�e avant la boucle
	 *  cette structure peut donc n'�tre parcourue aucune fois
	 * 
		
	
	
	public static void main(String[] args) {

		int n, som;
		
		som=0;
		
		while(som<100)
		{
			System.out.println("donnez un nombre � ajouter :");
			n= Clavier.lireInt();
			som+=n;
		}
		System.out.println("La somme obtenue est : "+som);
		
	}	*/

	/*	
	 ***********************************************************************
	 *
	 * Instruction FOR
	 * 
	 * 
	 * for([initialisation],[condition],[incr�mentation]){instruction}
	 * 
	 * 3 expressions: 
	 * 1>initialisation du compteur=
	 *  i=1; lu (une seule fois) en d�but de boucle, instruction quelconque
	 * 2> Condition d'arr�t
	 * condition �valu�e � chaque tour de boucle (qui d�termine la fin de boucle) : i<=5, expression bool�enne
	 * 3> Incr�mentation du compteur, instruction quelconque
	 * incr�ment : �valu� � chaque tour de boucle
	 * 
	 * break pour sortir d'une boucle
	 * utilisation d'�tiquettes pour se rebrancher o� l'on souhaite...
	 * 
	 * 
	 * while
	 * {
	 * 		for (....)
	 * 		{
	 * 			break;
	 * 		}
 * 			...<- ici, on est rebranch� apr�s le break
	 * }
	 * 
	 * bloc:for(....)
	 * 		{....
	 * 		break bloc;
	 * 		...
	 *		}
	 * 
	 * 
*/	
/*	public static void main(String[] args) {
	
		int i;
		for(i=1; i<=5; i++){
			System.out.print("bonjour ");
			System.out.println(+i+" fois !");
			if(i==4) break; //Je sors d'un niveau d'imbrication (boucle ou switch) avec break
			
		}

		System.out.println("\n");		
		
		//�quivaut � une structure while:
		
		int j=1;
		while(j<=5){
			System.out.println("Bonjour "+j+" fois !");
			j++;
		}
					
	}*/

/*	public static void main(String[] args) {
		
	}*/
}
