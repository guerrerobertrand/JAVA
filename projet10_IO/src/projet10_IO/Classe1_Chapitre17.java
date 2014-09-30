package projet10_IO;

import java.util.ArrayList;

public class Classe1_Chapitre17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		al.add(12);
		al.add("une chaine de caractères !");
		al.add(12.02f);
		al.add('d');

		for (int i=0; i<al.size(); i++){
			System.out.println("La donnée à l'indice i= "+i+" est "+al.get(i));
		}
	}

}
