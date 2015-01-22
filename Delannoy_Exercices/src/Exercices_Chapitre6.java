
public class Exercices_Chapitre6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
/*	//EXERCICE 75 STRING
		String mot;
		System.out.println("veuillez saisir un mot : ");
		mot=Clavier.lireString();
		
		//affichage un caractère sur 2
		for(int i=0;i<mot.length();i=i+2){
			System.out.println(mot.charAt(i));
		}
		
		//affichage du premier et du dernier caractère:
		System.out.println("le premier caractère est : "+mot.charAt(0));
		System.out.println("le dernier caractère est : "+mot.charAt(mot.length()-1));
*/
		
/*		//EXERCICE 76
		int n;
		System.out.println("Veuillez saisir un chiffre entier : ");
		n=Clavier.lireInt();
		String ch =String.valueOf(n);
		
		System.out.println("votre chiffre en vertical : ");
		for(int i=0; i<ch.length();i++){
			System.out.println(ch.charAt(i));
		}*/

		
	/*	//EXERCICE 77 Comptage de Voyelles

		char voy[]={'a', 'e', 'i', 'o', 'u', 'y'};
		int nVoy[]=new int[voy.length];
		for (int i=0;i<nVoy.length;i++)
			nVoy[i]=0;
		
		String mot;
		System.out.println("Veuillez saisir un mot : ");
		mot=Clavier.lireString();
		mot=mot.toLowerCase();	
		for(int i=0; i<mot.length();i++)
			for(int j=0; j<voy.length;j++)
				if(mot.charAt(i)==voy[j])nVoy[j]++;
				System.out.println("ce mot comporte : ");
			
			for(int i=0; i<voy.length;i++)
				System.out.println(nVoy[i]+" fois la lettre "+voy[i]);
*/
			
			//EXERCICE 79 Redéfinition de toString
		
/*		PointN a=new PointN();
		a.setPointN(5,8,"origine");
		//a.affiche();
		//appelle de la méthode toString() redéfinie
		System.out.println("a = "+a); //OK
		//Sans redéfinition de toString on affiche le type et la référence a = PointN@664883c
		
	}
}
class PointN{
	public void setPointN(int abs, int ord, String nom){
		this.x=abs;
		this.y=ord;
		this.nom=new String(nom);
		
	}
	public String toString(){
		String ch="Méhtode toString : Point nommé "+nom+" et de coordonnées : "+x+" "+y;
		return ch;
	}
	public void affiche(){
		System.out.println("Méhtode affiche : Point nommé "+nom+" et de coordonnées : "+x+" "+y);
	}
	
	private int x,y;
	private String nom;
}*/


/*		//EXERCICE 80 = Conjugaison de verbes Premier groupe
		String verbe;
		
		String[] sujets={"je", "tu", "il/elle","nous", "vous", "ils"};

		String[] terminaisons={"e","es","e","ons","ez","ent"}; 
		
		int nbreLettres;
		
		System.out.println("Donnez un verbe régulier du premier groupe :");
		
		
		while(true){
			verbe=Clavier.lireString();
			nbreLettres=verbe.length();
			String fin  = verbe.substring(nbreLettres-2, nbreLettres);
			if(fin.equals("er"))break;
			System.out.println("*** il ne se termine pas par -er, donnez-en un autre : ");	
		}
		String rad=verbe.substring(0,nbreLettres-2);
		int n = terminaisons.length;
		for(int i=0; i<n;i++){
			System.out.println(sujets[i]+" "+rad+terminaisons[i]);
		}*/
	
//EXERCICE 81 = Tri de mots Classe String et chaînes de caractères = Exo Synthèse 1

		String[] mots ;
		int nbreMots;
	
		// lecture des donnees
		System.out.println("Combien de mots :");
		nbreMots=Clavier.lireInt();
		mots=new String[nbreMots];
		System.out.println("Donnez vos mots :");
	    for (int i=0 ; i<nbreMots ; i++)
	        mots[i] = Clavier.lireString() ;		
		
	    // conversion de chaque mot en minuscules
	    String [] motsMin = new String[nbreMots] ;
	    for (int i=0 ; i<nbreMots ; i++)
	      motsMin[i] = mots[i].toLowerCase() ;

	    //  tri par reorganisation des references (mots d'origine et en minuscules)
	    // (on compare chaque mot (minuscule a tous ses suivants)
	    String temp ;
	    for (int i=0 ; i<nbreMots-1 ; i++)
	      for (int j=i+1 ; j<nbreMots ; j++)
	        if (motsMin[i].compareTo(motsMin[j]) >= 0)
	          { temp = motsMin[i] ; motsMin[i] = motsMin[j] ; motsMin[j] = temp ; // CHAUD
	            temp = mots[i] ;    mots[i] = mots[j] ;       mots[j] = temp ;
	          }

	    // affichage des chaines triees
	    System.out.println ("Liste par ordre alphabetique :") ;
	    for (int i=0 ; i<nbreMots ; i++)
	      System.out.println (mots[i]) ;
			
	} //fin de méthode main
}//fin de Classe


//EXERCICE 82


	/*	//EXERCICE 84 / 85 / 86 itérations valeurs d'un type énuméré, accès aux valeurs, lecture et affichage du rang
		Suite[] valeurs=Suite.values();
		System.out.println("Liste des valeurs du type Suite : ");
		for(int i=0; i<valeurs.length;i++){
			System.out.println(valeurs[i]);
		}
		int nbreValeurs;
		nbreValeurs=valeurs.length;
		System.out.println("La suite comporte : "+nbreValeurs+" valeurs");
		System.out.println("Les valeurs impair de la suite sont : ");
			for(int i=0; i<nbreValeurs;i+=2){
				System.out.println(valeurs[i]);
		System.out.println("La dernière valeur de la suite est : ");
				System.out.println(valeurs[nbreValeurs-1]);
			}
		//86
				int numNote;
				System.out.println("tapez une note de la Suite :");
				String note = Clavier.lireString();
				boolean trouve=true;
				for(Suite j : Suite.values()){
					if(note.equals(j.toString()))
					{	trouve=true;
						numNote=j.ordinal();
						System.out.println(note+" correspond à la valeur de rang "+(numNote+1)+ " type de suite");
					}
				}
					if(!trouve)
						System.out.println(note+ " ne correspond pas au type Suite");
				
				
				}
}	
	enum Suite {ut, re, mi, fa, sol, la, si};

*/
