package projet5;

/* 
 * M�thodes primitives, void, objets
 * Parcours de tableau 
 * Surcharge de m�thode
 *
 */


public class Classe_Chapitre8_methodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] tabStr={"toto","tata","titi","tutu"};
		int[]tabInt={1,2,3,4,5};
		String[][]tabStr2={{"10","20","30","40","50"},{"bibi","bobo","bubu"}};
		parcourirTableau(tabStr);
		//System.out.println(toString(tab));
		parcourirTableau(tabInt);
		parcourirTableau(tabStr2);
		}
//m�thode 1 Parcours de Tableau
	static void parcourirTableau(String[]tab)
	{
		for(String str :tab)
			System.out.println(str);
	}
	//Exemple de surcharge de m�thode avec int et tableau 2 dimensions
	static void parcourirTableau(int[]tab)
	{
		for(int str :tab)
			System.out.println(str);
	}
	
	static void parcourirTableau(String[][]tab)
	{
		for (String tab2[]:tab)
			{
			for(String str :tab2)
			System.out.println(str);
			}
		
	}
/*//m�thode 2 Renvoie une chaine de caract�res
	static String toString(String[]tab)
	{
		System.out.println("M�thode toString() !\n------");
		String retour="";
		
		for(String str : tab)
			retour +=str + "\n";
		return retour;
		
	}*/
}
