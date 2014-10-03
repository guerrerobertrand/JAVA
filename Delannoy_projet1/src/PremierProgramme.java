
public class PremierProgramme {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Mon premier programme Java");
	
		//Canevas de programmation
		//Déclaration de variables n'importe où mais avant d'être utilisée
		//Affichage dans console et concaténation
		//Récupération de saisie Clavier (classe Clavier.java) ? Classe Scanner
		//Types primitifs
		//opérateurs, expressions

 * ****************************************************************************************		
 
		Scanner sc=new Scanner(System.in);
		
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
		System.out.println("le résultat est : "+resultat);


 * *****************************************************************************************		
 
		//Calcul de racines carrées
		//Classe qui utilise Clavier.java
		
		final int NFOIS=5; //la variable est figée "final", ne doit pas être redéfinie, ici est une  constante symbolique
		//Constante en MAJUSCULE (convention)
		int i;
		double x;
		double racx;
		
		System.out.println("Bonjour je vais calculer "+NFOIS+" racines carrées");
		for(i=0; i<NFOIS;i++){
			System.out.println("Donnez un nombre :");
			x = Clavier.lireDouble();
			
			if(x<0.0)
				System.out.println(x+ " ne possède pas de racine carrée !");
			else
			{ racx=Math.sqrt(x);
			System.out.println(x+ " a pour racine carrée : "+racx);
			}
 		}
		System.out.println("FIN DU PROGRAMME");		
	

		 * *****************************************************************************************		

// Chapitre 4 = Les opérateurs et expressions, faire les exercices.
		
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
		i=i+k; //équivaut à i+=k;
		a=a*b; //équivaut à a*=b;
		
		
		
		
		
		
	}*/

/*	static String texte="alfred";
	
	static void imprimeTexte(){
		String texte="jules";
		System.out.println(texte + " après jules");
		texte="dupont";
		System.out.println(texte + " après dupont");
	}
	public static void main (String[]args){
		System.out.println(texte + " main, avant jules");
		imprimeTexte();
		System.out.println(texte + " main après dupont");
	}
*/
	public static void main (String[]args){
		
		int somme=0;
		for(int i=1; i<=10;i=i+1){
			somme=i;
			System.out.println(somme);
		}
		
	}
	
}


