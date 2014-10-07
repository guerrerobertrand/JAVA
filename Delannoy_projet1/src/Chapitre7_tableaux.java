
public class Chapitre7_tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		int i , nbEl, nbElSupMoy;
		double somme;
		double moyenne;
		
		System.out.println("Combien d'élèves ");
		nbEl=Clavier.lireInt();
		double notes[]=new double[nbEl];
		
		for(i=0; i<nbEl;i++)
		{
			System.out.println("donnez la note numero "+(i+1) + " : ");
			notes[i]=Clavier.lireDouble();
		}
		
		for (i=0, somme=0; i<nbEl; i++) somme+=notes[i];
		moyenne = somme / nbEl;
		System.out.println("la moyenne de la classe est : "+moyenne);
		
		for(i=0,nbElSupMoy=0;i<nbEl; i++)
			if(notes[i]>moyenne)nbElSupMoy++;
		System.out.println(nbElSupMoy+" élèves ont plus de la moyenne");*/

//****************************************************************************	
/*		int i;
		int j;
		
		int [] t1=new int [3];
		for(i=0; i<3;i++){
			t1[i]=i;
			System.out.println("tableau 1 : "+t1[i]);
		}
		
		int[] t2=new int[2];
		for(j=0; j<2;j++) 
			{t2[j]=10+j;
			//affichage des valeurs du tableau (ici des int), avec tableau de char (tc) le println fontionne directement println(tc);
			System.out.println("tableau 2 : "+t2[j]);
			}
		//affectation la référence contenue dans t2 est recopiée dans t1
		t1=t2;
		System.out.println("valeur 1 tableau 1 : "+t1[0]);
		
		System.out.println("longueur du tableau 1 : "+t1.length); //affiche 2
*/

		//****************************************************************************	
		// tableau d'objets point
/*		Point [] tp;
		tp = new Point[3];
		tp[0]= new Point(1,2);
		tp[1]= new Point(3,4);
		tp[2]= new Point(5,6);
		
		for(int i =0; i<tp.length; i++){
			tp[i].affiche();
		}
	}
}

class Point{
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public void affiche(){
		System.out.println("Point :" +x +" et "+y);
	}

	private int x, y;
}*/
		
		//****************************************************************************	
		// tableau à 2 indices [][]

		int t[] [] = { {1, 2, 3}, {11, 12}, {21, 22, 23, 24} } ;
		System.out.println ("t avant raz : ") ;
		Util.affiche(t) ;
		Util.raz(t) ;
		System.out.println ("t apres raz : ") ;
		Util.affiche(t) ;
	}
}
class Util
	{ static void raz (int t[] [])
		{ int i, j ;
			for (i= 0 ; i<t.length ; i++) // for... each non applicable ici
				for (j=0 ; j<t[i].length ; j++) // puisque modification des valeurs de t
					t[i] [j] = 0 ;
		}

	static void affiche (int t[] [])
		{ int i, j ;
			for (i= 0 ; i<t.length ; i++)
				{ System.out.print ("ligne de rang " + i + " = ") ;
				for (j=0 ; j<t[i].length ; j++) // pour utiliser for... each (JDK 1.5)
					System.out.print (t[i] [j] + " ") ; // voir paragraphe suivant
				System.out.println() ;
				}
		}
	}



	


		