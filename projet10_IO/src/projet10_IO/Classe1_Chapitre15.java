/*package projet10_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Classe1_Chapitre15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cr�ation de l'objet File
		File f=new File("test.txt");
		System.out.println("Chemin absolu du fichier f: "+f.getAbsolutePath());
		System.out.println("Nom du fichier f: "+f.getName());
		System.out.println("Est-ce qu'il existe ? "+f.exists());
		System.out.println("Est-ce un r�pertoire ? "+f.isDirectory());
		System.out.println("Est ce un fichier ? "+f.isFile());

		System.out.println("Affichage des lecteurs � la racine du PC :");
		for(File file:f.listRoots())
		{
			System.out.println(file.getAbsolutePath());
			try{
				int i=1;
				// On parcourt la liste des fichiers et r�pertoires
				for(File nom:file.listFiles()){
					//S'il s'agit d'un dossier on ajoute un "/"
					System.out.println("\t\t"+((nom.isDirectory()) ? nom.getName()+"/": nom.getName()));
				if ((i%4)==0){
					System.out.println("\n");
				}
				i++;
				}
				System.out.println("\n");
			}catch(NullPointerException e){
				//L'instruction peut g�n�rer une NullPointerException s'il n'y a pas de sous-fichier !
			}
		
	}


		//Nous d�clarons nos objets en dehors du bloc try/catch
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try{
			//on instancie nos objets
			//fis va lire le fichier entr�e et fos va �crire un nouveau
			fis=new FileInputStream(new File("test.txt"));
			fos=new FileOutputStream(new File("test2.txt"));

			//on cr�e un tableau de byte pour indiquer le nombre de bytes lus � chaque tour de boucle
			byte [] buf =new byte[8];

			//On cr�e une variable de type int pour y affecter le r�sultat de la lecture et vaut -1 quand c'est termin�
			int n=0;
			
			//Tant que l'affectation est possible, on boucle
			//Lorsque la lecture est termin�e, l'affectation n'est plus possible
			//on sort de la boucle
			while((n=fis.read(buf)) >=0)
			{
				//On �crit dans notre deuxi�me et nouveau fichier avec l'objet ad�quat
				fos.write(buf);
				//On affiche ce qu'a lu notre boucle au format byte et au format char
				for(byte bit:buf)
					System.out.println("\t"+bit + "("+(char)bit+")");
					System.out.println("");
			}
			System.out.println("Copie termin�e !!");
		}catch(FileNotFoundException e){
			//Cette exception est lev�e si l'objet fis ne trouve aucun fichier
			e.printStackTrace();
		}catch(IOException e){
			//Cette exception est lev�e si il y a une erreur de lecture ou d'�criture
			e.printStackTrace();
		}finally{
			//On ferme les flux de donn�es dans un bloc finally pour s'assurer que les instructions
			//seront ex�cut�es m�me si une exception est lev�e!
			try{
				if(fis!=null)
					fis.close();
				if(fos!=null)
					fos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}*/