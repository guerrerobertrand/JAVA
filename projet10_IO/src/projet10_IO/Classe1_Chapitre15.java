/*package projet10_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Classe1_Chapitre15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Création de l'objet File
		File f=new File("test.txt");
		System.out.println("Chemin absolu du fichier f: "+f.getAbsolutePath());
		System.out.println("Nom du fichier f: "+f.getName());
		System.out.println("Est-ce qu'il existe ? "+f.exists());
		System.out.println("Est-ce un répertoire ? "+f.isDirectory());
		System.out.println("Est ce un fichier ? "+f.isFile());

		System.out.println("Affichage des lecteurs à la racine du PC :");
		for(File file:f.listRoots())
		{
			System.out.println(file.getAbsolutePath());
			try{
				int i=1;
				// On parcourt la liste des fichiers et répertoires
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
				//L'instruction peut générer une NullPointerException s'il n'y a pas de sous-fichier !
			}
		
	}


		//Nous déclarons nos objets en dehors du bloc try/catch
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try{
			//on instancie nos objets
			//fis va lire le fichier entrée et fos va écrire un nouveau
			fis=new FileInputStream(new File("test.txt"));
			fos=new FileOutputStream(new File("test2.txt"));

			//on crée un tableau de byte pour indiquer le nombre de bytes lus à chaque tour de boucle
			byte [] buf =new byte[8];

			//On crée une variable de type int pour y affecter le résultat de la lecture et vaut -1 quand c'est terminé
			int n=0;
			
			//Tant que l'affectation est possible, on boucle
			//Lorsque la lecture est terminée, l'affectation n'est plus possible
			//on sort de la boucle
			while((n=fis.read(buf)) >=0)
			{
				//On écrit dans notre deuxième et nouveau fichier avec l'objet adéquat
				fos.write(buf);
				//On affiche ce qu'a lu notre boucle au format byte et au format char
				for(byte bit:buf)
					System.out.println("\t"+bit + "("+(char)bit+")");
					System.out.println("");
			}
			System.out.println("Copie terminée !!");
		}catch(FileNotFoundException e){
			//Cette exception est levée si l'objet fis ne trouve aucun fichier
			e.printStackTrace();
		}catch(IOException e){
			//Cette exception est levée si il y a une erreur de lecture ou d'écriture
			e.printStackTrace();
		}finally{
			//On ferme les flux de données dans un bloc finally pour s'assurer que les instructions
			//seront exécutées même si une exception est levée!
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