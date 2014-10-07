
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
			tab[i]=(2*i+1)*(2*i+1);
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
		System.out.println("la valeur min est : "+min);*/
		
		// EXERCICE 53
		// Tableau en argument (2) = somme de valeurs, incrŽmentation et affichage de valeurs
		
		
		double tabD[]={1.25, 2.5, 3.5, 5.};
		System.out.print("tabD initial = ");
		UtilTab.affiche(tabD);
		System.out.println("somme = "+UtilTab.somme(tabD));
		UtilTab.incre(tabD, 1.25);
		System.out.print("tabD incrŽmentŽ = ");
		UtilTab.affiche(tabD);
		System.out.println("somme = "+UtilTab.somme(tabD));
	}
}

class UtilTab{
			
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
		}
		static void affiche(double[]t){
			for(int i=0; i<t.length; i++){
				System.out.print(t[i]+ " ");
				//System.out.println();				
			}
		}
	}
			
		
