
public class Exercices_Chapitre2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	//instruction for
 * 
 	int i, n, som ;
	    som = 0 ;
	    for (i=0 ; i<4 ; i++)
	    { System.out.println ("donnez un entier ") ;
	      n = Clavier.lireInt() ;
	      som += n ;
	    }
	    System.out.println ("Somme : " + som) ;
*/	

/*		//instruction while
 * 
		int i, n, som ;
	    som = 0 ;
	    i=0;

	    while(i<4){
	    	  System.out.println ("donnez un entier ") ;
		      n = Clavier.lireInt() ;
		      som +=n;
	    	  i++;
	    	}
	    System.out.println ("Somme : " + som) ;
	    
*/	    
	
		//instruction do...while
	/*	
		int i, n, som ;
	    som = 0 ;
	    i=0;

	    do{
	    	System.out.println ("donnez un entier ") ;
		      n = Clavier.lireInt() ;
		      som +=n;
		      i++;
	    }while(i<4);
 	
	    System.out.println ("Somme : " + som) ;*/
		
		// Exercice 19 = OK sauf dŽclaration de Math.sqrt(reponse) que j'ai mis dans une variable calcul et qui demande une initialisation...
/*		
		double reponse;
	
		do{
			System.out.println("donnez un nombre positif: ");
			reponse=Clavier.lireDouble();
			if(reponse>0){
			System.out.println("la racine de votre chiffre positif est : "+Math.sqrt(reponse));
			}
			else if(reponse<0){
				System.out.println("veuillez donnez un nombre positif et diffŽrent de zŽro: ");
			}
			else
			{
				System.out.println("FIN");
			}
		}while(reponse!=0);	*/	

		//Exercice 20 = pas OK... "sŽrie harmonique"
	
		int nt ; // nombre de termes de la serie harmonique
		float som ; // pour la somme de la serie
		int i ;

	do
		{ System.out.print ("combien de termes : ") ;
		nt = Clavier.lireInt() ;
		}
		while (nt<1) ;
		for (i=1, som=0 ; i<=nt ; i++) som += (float)1/i ;
		System.out.println ("Somme des " + nt + " premiers termes = " + som) ;
		
	}

}
	