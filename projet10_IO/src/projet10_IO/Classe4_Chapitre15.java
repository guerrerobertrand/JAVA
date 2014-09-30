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
		
		//D�claration des objets
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileChannel fc;
		
		try{
			//Cr�ation des objets
			fis=new FileInputStream(new File("test.txt"));
			bis=new BufferedInputStream(fis);
			
			//On lance le chrono
			long time=System.currentTimeMillis();
			
			//Lecture
			while(bis.read() != -1);
			//On affiche le temps d'ex�cution
			System.out.println("Temps d'ex�cution avec un buffer conventionnel : "+(System.currentTimeMillis()-time));
			
			//Cr�ation d'un nouveau flux de fichier
			fis=new FileInputStream(new File("test.txt"));
			//On r�cup�re le canal (channel)
			fc=fis.getChannel();
			//On en d�duit la taille
			int size=(int)fc.size();
			//On cr�e un buffer
			ByteBuffer bBuff=ByteBuffer.allocate(size);
			
			//D�marrage du chrono
			time=System.currentTimeMillis();
			//D�marrage de la lecture
			fc.read(bBuff);
			//On pr�pare � la lecture avec l'appel � flip
			bBuff.flip();
			//Affichage du temps d'ex�cution
			System.out.println("Temps d'ex�cution avec un nouveau buffer de 'nio' : "+(System.currentTimeMillis()-time));
			
			//Puisque nous avons utilis� un buffer de byte, afin de r�cup�rer
			//les donn�es on peut utliser un tableau de byte, la m�thode array retourne un tableau de byte
			byte [] tabByte=bBuff.array();
			
			
			}catch(FileNotFoundException e){
				e.printStackTrace();
			
			}catch(IOException e){
				e.printStackTrace();
			}	
		
	
	


	
	}
}