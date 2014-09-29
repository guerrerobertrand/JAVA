
public class NombreHabitantException extends Exception{

	public NombreHabitantException(int nbre){
		System.out.println("Vous essayez de crŽer une ville avec un nombre d'habitants nŽgatif");
		System.out.println("\t => "+nbre);
	}
	
}
