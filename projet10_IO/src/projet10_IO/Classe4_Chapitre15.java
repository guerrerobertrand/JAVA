package projet10_IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Classe4_Chapitre15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Déclaration des objets
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileChannel fc;
		
		try{
			//Création des objets
			fis=new FileInputStream(new File("test.txt"));
			bis=new BufferedInputStream(fis);
			
			//On lance le chrono
			long time=System.currentTimeMillis();
			
			//Lecture
			while(bis.read() != -1);
			//On affiche le temps d'exécution
			System.out.println("Temps d'exécution avec un buffer conventionnel : "+(System.currentTimeMillis()-time));
			
			//Création d'un nouveau flux de fichier
			fis=new FileInputStream(new File("test.txt"));
			//On récupère le canal (channel)
			fc=fis.getChannel();
			//On en déduit la taille
			int size=(int)fc.size();
			//On crée un buffer
			ByteBuffer bBuff=ByteBuffer.allocate(size);
			
			//Démarrage du chrono
			time=System.currentTimeMillis();
			//Démarrage de la lecture
			fc.read(bBuff);
			//On prépare à la lecture avec l'appel à flip
			bBuff.flip();
			//Affichage du temps d'exécution
			System.out.println("Temps d'exécution avec un nouveau buffer de 'nio' : "+(System.currentTimeMillis()-time));
			
			//Puisque nous avons utilisé un buffer de byte, afin de récupérer
			//les données on peut utliser un tableau de byte, la méthode array retourne un tableau de byte
			byte [] tabByte=bBuff.array();
			
			
			}catch(FileNotFoundException e){
				e.printStackTrace();
			
			}catch(IOException e){
				e.printStackTrace();
			}	
		
	
	


	
	}
}