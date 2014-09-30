package projet10_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Classe3_Chapitre15_File_WR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File ("testFileWriter.txt");
		FileWriter fw;
		FileReader fr;
		
		try{
			//Cr�ation de l'objet
			fw=new FileWriter(file);
			String str="Bonjour les amis\n";
			str+="\t Comment ca va ? \n";
			
			//On �crit la chaine
			fw.write(str);
			
			//On ferme le flux
			fw.close();
		
			//Cr�ation de l'objet de lecture
			fr=new FileReader(file);
			str="";
			int i=0;
			
			//Lecture des donn�es
			while((i=fr.read()) != -1)
					str+=(char)i;
			
			//Affichage
			System.out.println(str);

		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
