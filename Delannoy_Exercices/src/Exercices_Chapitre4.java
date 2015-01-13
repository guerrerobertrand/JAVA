
public class Exercices_Chapitre4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*	// EXERCICE 47	
		
		int tab[];
		int n;
		System.out.println("Combien de valeurs : ");
		n=Clavier.lireInt();
		tab=new int[n];
		
		int i;
		for (i=0;i<tab.length;i++){
			tab[i]=(2*i+1)*(2*i+1); //carrŽ des chiffres impairs...
		}
		for (i=0;i<n;i++){
			System.out.println((2*i+1)+" a pour carrŽ "+tab[i]);
		}
*/		
		
		// EXERCICE 48
		// Moyenne, Maxmimum, Minimum
		
/*		double moyenne;
		double somme;
		double min;
		double max;
		
		float tabx[];
		tabx=new float[5];
		int i;
		float n;
		n=0;
		for (i=0; i<tabx.length; i++){
			System.out.println("Indice : "+i+ " => valeurs : "+n);
			n=Clavier.lireFloat();
			}
		
		somme=0;
		moyenne=0;
		min=tabx[0];
		max=tabx[0];
		
		for (i=0; i<tabx.length; i++){
			if(tabx[i]>max) max=tabx[i];
			if(tabx[i]<min) min=tabx[i];
			somme += tabx[i];
			moyenne = somme / tabx.length;
		}
		
		System.out.println("la moyenne est : "+moyenne);
		System.out.println("la valeur max est : "+max);
		System.out.println("la valeur min est : "+min);
	*/
		
		// EXERCICE 50 / 52
	/*	
		final int N = 4 ;
	    int t1[] = new int [N] ;
	    int t2[] = new int [N] ;
	    for (int i=0 ; i<N ; i++) t1[i] = i+1 ;
	    for (int i=0 ; i<N ; i++) t2[i] = 2*i+1 ;

	         // affichage des valeurs de t1 et de t2
	    System.out.print ("t1 = ") ; affiche (t1) ;
	    System.out.print ("t2 = ") ; affiche (t2) ;

	    t1 = t2 ;
	    t1[0] = 10 ; t2[1] = 20 ; t1[2] = 30 ; t2[3] = 40 ;

	         // affichage des valeurs de t1 et de t2
	    System.out.print ("t1 = ") ; affiche (t1) ;
	    System.out.print ("t2 = ") ; affiche (t2) ;
	  }
	
	
	
	  static void affiche (int [] t)        // ou (depuis JDK 5.0)
	  { for (int i=0 ; i<t.length ; i++)    // for (int v : t)
	      System.out.print (t[i] + " ") ;   //   System.out.print (v + " ") ;
	    System.out.println () ;
	  }
	*/	
		
			
/*		// EXERCICE 53
		// Tableau en argument (2) = somme de valeurs, incrŽmentation et affichage de valeurs
		
		
		double tabD[]={1.25, 2.5, 3.5, 5.};
		System.out.print("tabD initial = ");
		affiche(tabD);
		System.out.println("somme = "+somme(tabD));
		incre(tabD, 1.25);
		System.out.println();
		System.out.print("tabD incrŽmentŽ = ");
		affiche(tabD);
		System.out.println("somme = "+somme(tabD));
	
	} //fin de main

	  static void affiche (double [] t)        // ou (depuis JDK 5.0)
	  { for (int i=0 ; i<t.length ; i++)    // for (int v : t)
	      System.out.print (t[i] + " ") ;   //   System.out.print (v + " ") ;
	    System.out.println () ;
	  }
	
		static double somme(double[] t){
			double s=0.;
			for(int i =0; i<t.length;i++){
				s+=t[i];
				}
			System.out.println();	
			return s;
		}
		
		static void incre (double[] t, double a){
			for (int i=0; i<t.length; i++){
				t[i]+=a;
			}
		}*/
		
/*		// EXERCICE 54
		// Tableau en valeurs de retours, incrŽmentation, somme, vecteurs, et affichage de valeurs
		
		
		int ta[]={1,5,9};
		System.out.print("ta = ");
		affiche(ta);
		
		int tb[]=genere(3);
		System.out.print("tb = ");
		affiche(tb);
	
		int tc[]=somme(ta,tb);
		System.out.print("tc = ");
		affiche(tc);
		
	} //fin de main

	  static void affiche (int [] t)        // ou (depuis JDK 5.0)
	  { for (int i=0 ; i<t.length ; i++)    // for (int v : t)
	      System.out.print (t[i] + " ") ;   //   System.out.print (v + " ") ;
	    System.out.println () ;
	  }
	
		static int[] somme(int[] t1, int[] t2){
			int n=t1.length;
			if(n!=t2.length) 
				return null;
			int res[]=new int[n];
			for(int i=0;i<n;i++)
				res[i]=t1[i]+t2[i];
				return res;
		}
		
		static int[] genere (int n){
			int []res=new int[n];
			for (int i=0, j=1; i<n; i++, j+=2) //syntaxe assez complexe pour gŽnŽrer un tableau de longueur n, des chiffres impairs (j)....
				res[i]=j;
			return res;
		}
		*/
		
		
		//EXERCICE 56
		
		final int NS1=8, MAX1=5, NS2=10000, MAX2=9 ;
	    Aleat suite1 = new Aleat (NS1, 10) ;
	    System.out.print ("suite1, valeur par valeur = ") ;
	    for (int i=0 ; i<NS1 ; i++)
	      System.out.print (suite1.getValeur(i) + " ") ;
	    System.out.println () ;
	    System.out.print ("suite1, globale           = ") ;
	    int[] valeurs = suite1.getValeurs() ;
	    for (int i=0 ; i<NS1 ; i++)
	      System.out.print (valeurs[i] + " ") ;
	    System.out.println() ;
	    int [] hist = suite1.histo() ;
	    System.out.print ("histogramme de suite1 = " ) ;
	    for (int i=0 ; i<=MAX1 ; i++) System.out.print (hist[i] + " ") ;
	    System.out.println() ;

	    Aleat suite2 = new Aleat (NS2, MAX2) ;
	    hist = suite2.histo() ;
	    System.out.print ("histogramme de suite2 = " ) ;
	    for (int i=0 ; i<=MAX2 ; i++) System.out.print (hist[i] + " ") ;
	  } //fin du main
} //fin de classe
			
class Aleat { public Aleat (int n, int l)
  { nVal = n ; limite = l ;
    val = new int[n] ;
    for (int i=0 ; i<nVal ; i++)
      val[i] = (int)((l+1)*Math.random()) ;
  }
  public int getValeur (int num)
  { return val[num] ;
  }
  public int[] getValeurs ()
  { int[] res = new int[nVal] ;
    for (int i=0 ; i<nVal ; i++)
      res[i] = val[i] ;
    return res ;
  }
  public int[] histo ()
  { int[] res = new int[limite+1] ;  // pour aller de 0 à limite
    for (int i=0 ; i<nVal ; i++) res[val[i]]++ ;
    return res ;
  }
  private int[] val ;
  private int nVal, limite ;
}	
