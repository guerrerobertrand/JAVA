
public class NombreHabitantException extends Exception{

	public NombreHabitantException(int nbre){
		System.out.println("Vous essayez de cr�er une ville avec un nombre d'habitants n�gatif");
		System.out.println("\t => "+nbre);
	}
	
}
