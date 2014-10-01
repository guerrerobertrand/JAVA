
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
		
		int i, n, som ;
	    som = 0 ;
	    i=0;

	    do{
	    	System.out.println ("donnez un entier ") ;
		      n = Clavier.lireInt() ;
		      som +=n;
		      i++;
	    }while(i<4);
 	
	    System.out.println ("Somme : " + som) ;
		
		
	}

}
	