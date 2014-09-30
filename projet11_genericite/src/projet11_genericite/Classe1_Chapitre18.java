package projet11_genericite;

public class Classe1_Chapitre18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solo<Integer> val=new Solo<Integer>(12);
		int nbre=val.getValeur();
		
		//Fonctionne avec plusieurs types de données (classes de types primitifs:Float, Double,...)
		Solo<String> valS=new Solo<String>("TOTOTO");
		String chaine =valS.getValeur();
		
		//Affichage
		System.out.println(nbre);
		System.out.println(chaine);
	}

}
