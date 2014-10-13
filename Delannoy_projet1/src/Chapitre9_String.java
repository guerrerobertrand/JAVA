
public class Chapitre9_String{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String mot;
		System.out.println("donnez un mot : ");
		mot=Clavier.lireString();
		
		System.out.println("voici votre mot en colonne : ");
		for (int i=0; i<mot.length(); i++){
			System.out.println(mot.charAt(i));
		}*/
/*		String ch="la Java";
		StringBuffer chBuf=new StringBuffer(ch);
		System.out.println(chBuf);
		chBuf.setCharAt(3, 'j');
		System.out.println(chBuf);
		chBuf.setCharAt(1, 'e');
		System.out.println(chBuf);
		chBuf.append(" 8");
		System.out.println(chBuf);
		chBuf.insert(3, "langage ");
		System.out.println(chBuf);*/

		// Types ŽnumŽrŽs
/*		Jour courant;
		courant=Jour.vendredi;

		switch(courant){
			case lundi :System.out.println("c'est ravioli"); break;
			case mardi:
			case mercredi:
			case jeudi: System.out.println("c'est ravioli"); break;
			case vendredi: System.out.println("c'est bient™t le WE "); break;
			case samedi:
			case dimanche:System.out.println("rien"); break;
*/			
/*		String chJour;
		System.out.println("Donnez un jour de la semaine:");
	
		chJour=Clavier.lireString();
		
		
		//premire dŽmarche (valueOf attention si valeur n'existe pas dans enum)
		
		Jour courant=Jour.valueOf(chJour);
		int numJour=courant.ordinal();
		System.out.println("MŽthode 1 : "+courant+" est le jour de rang "+numJour);

		//deuxime dŽmarche(recherche de la bonne valeur) pas Mal
		for(Jour j:Jour.values()){
			if(chJour.equals(j.toString()))
			{numJour=j.ordinal();
			System.out.println("MŽthode 2 : "+courant+" est le jour de rang "+numJour);
			}
		}*/
		
/*		//crŽation d'un tableau des valeurs type ŽnumŽrŽs avec .values()
		for (Jour j:Jour.values()){
			System.out.println(j.toString());
		}
*/

			}
		
	}

//enum Jour{lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche};
