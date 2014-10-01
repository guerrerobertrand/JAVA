
public class Exercices_Chapitre1 {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1=10, b2=20;
		short p =200;
		int n =500;
		long q=100;
		float x =2.5f;
		double y=5.25;
		
		 // expressions:
		
		b1+b2=> 30 int
		p+b1=> int 210
		b1*b2=> int 200
		q+p*(b1+b2)=>6100 long
		x+q*n=>float 50002.5
		b1*q/x=>400.O float
		b1*q*2./x=>float 800.0
		b1*q*2.f/x=>float
		
	
		*/
		
 public static void main (String args[])
	  { 
	 /*int i=10, j=5 ;
	    
	  if (i<5 && j++<10)  System.out.println ("&&1 vrai") ;
	                   else System.out.println ("&&1 faux") ;
	    System.out.println ("i = " + i + "  j = " + j) ;

	    if (i<5 & j++<10)   System.out.println ("& vrai") ;
	                   else System.out.println ("& faux") ;
	    System.out.println ("i = " + i + "  j = " + j) ;
	  
	    if (i<15 && j++<10) System.out.println ("&&2 vrai") ;
	                   else System.out.println ("&&2 faux") ;
	    System.out.println ("i = " + i + "  j = " + j) ;
	    
	    if (i<15 || j++<10) System.out.println ("|| vrai") ;
	                   else System.out.println ("|| faux") ;
	    System.out.println ("i = " + i + "  j = " + j) ;
	    
	    *
	    * REMARQUE sur l'incrŽmentation :
	    *++i => valeur de i aprs incrŽmentation, ex: si i=5, alors n=++i-5 => n=1;
	    *i++ => valeur de i avant incrŽmentation, ex: si i=5, alors n=i++-5 => n=0;
	    *
	    */

	 int i, j, n ;

	    i = 0 ; n = i++ ;
	    System.out.println ("A : i = " + i + "  n = " +  n ) ;

	    i = 10 ; n = ++ i ;
	    System.out.println ("B : i = " + i + "  n = " +  n ) ;

	    i = 20 ; j = 5 ; n = i++ * ++ j ;
	    System.out.println ("C : i = " + i + "  j = " + j + "  n = " + n ) ;

	    i = 15 ; n = i += 3 ;
	    System.out.println ("D : i = " + i + "  n = " +  n) ;

	    i = 3 ; j = 5 ; n = i *= --j ;
	    System.out.println ("E : i = " + i + "  j = " + j + "  n = " + n) ;
	  
	  }
}