
public class PremierProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Mon premier programme Java");
	
		//Canevas de programmation
		//D�claration de variables n'importe o� mais avant d'�tre utilis�e
		//Affichage dans console et concat�nation
		//R�cup�ration de saisie Clavier (classe Clavier.java) ? Classe Scanner
		//Types primitifs
		//op�rateurs, expressions
/*
 * ****************************************************************************************		
 */
/*		Scanner sc=new Scanner(System.in);
		
		int n;
		double x;
		n=5;
		x=2*n+1.5;
		System.out.println("n= "+n);
		System.out.println("x= "+x);
		double y;
		y= n*x +12;
		System.out.println("y= "+y);
		double resultat;
		
		System.out.println("Veuillez saisir une note: ");
		double var=sc.nextDouble();
		
		resultat=var+y;
		System.out.println("le r�sultat est : "+resultat);
*/
/*
 * *****************************************************************************************		
 */
/*		//Calcul de racines carr�es
		//Classe qui utilise Clavier.java
		
		final int NFOIS=5; //la variable est fig�e "final", ne doit pas �tre red�finie, ici est une  constante symbolique
		//Constante en MAJUSCULE (convention)
		int i;
		double x;
		double racx;
		
		System.out.println("Bonjour je vais calculer "+NFOIS+" racines carr�es");
		for(i=0; i<NFOIS;i++){
			System.out.println("Donnez un nombre :");
			x = Clavier.lireDouble();
			
			if(x<0.0)
				System.out.println(x+ " ne poss�de pas de racine carr�e !");
			else
			{ racx=Math.sqrt(x);
			System.out.println(x+ " a pour racine carr�e : "+racx);
			}
 		}
		System.out.println("FIN DU PROGRAMME");		
	*/
/*
		 * *****************************************************************************************		
*/
// Chapitre 4 = Les op�rateurs et expressions, faire les exercices.
		
		int n;
		float x;

		n=1234;
		x=n;
		
		System.out.println("n : "+n+ " et x : "+x);

		
		n=123456789;
		x=n;
		
		System.out.println("n : "+n+ " et x : "+x);
		
		x=n;
		int na =(int) x;
		
		System.out.println("ecart : "+ (na-n));
		
		int i =2;
		int k= 4;
		int a, b;
		a = 56;
		b = 4;
		
		//Exemple d'affectations
		i=i+k; //�quivaut � i+=k;
		a=a*b; //�quivaut � a*=b;
		
		
		
		
		
		
	}

}


