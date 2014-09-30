package projet10_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//packages à importer afin d'utiliser l'objet File

public class Classe2_Chapitre15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Nous déclarons nos objets en dehors du bloc Try/Catch
		FileInputStream fis;
		BufferedInputStream bis;
		FileOutputStream fos;
		BufferedOutputStream bos;
		
		DataInputStream dis;
		DataOutputStream dos;
		
		ObjectInputStream ois;
		ObjectOutputStream oos;
		
		
		try{
			fis=new FileInputStream(new File("test.txt"));
			fos=new FileOutputStream(new File("test2.txt"));
			bis=new BufferedInputStream(new FileInputStream(new File("test.txt")));
			bos=new BufferedOutputStream(new FileOutputStream(new File("test3.txt")));
			byte[]buf=new byte[8];
			
			//On récupère le temps du système
			long startTime=System.currentTimeMillis();
			
			//Inutile d'effectuer des traitements dans notre boucle
			while(fis.read(buf) != -1){
				fos.write(buf);
			}
			//On affiche le temps d'exécution
			System.out.println("Temps de lecture/écriture avec FileInputStream/FileOutputStream: "+(System.currentTimeMillis()-startTime));
			
			//On réinitialise
			startTime=System.currentTimeMillis();
			//Inutile d'effectuer des traitements dans notre boucle
			while(bis.read(buf) != -1)
			{
				bos.write(buf);
			}
			//On réaffiche
			System.out.println("Temps de lecture/écriture avec BufferedInputStream/BufferedOutputStream: "+(System.currentTimeMillis()-startTime));
			
			//On ferme les flux
			fis.close();
			bis.close();
			
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	
	try{
		dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File ("test4.txt"))));
		
		//Nous allons écrire chaque type primitif
		dos.writeBoolean(true);
		dos.writeByte(100);
		dos.writeChar('C');
		dos.writeDouble(12.05);
		dos.writeFloat(100.52f);
		dos.writeInt(1024);
		dos.writeLong(123456789654321L);
		dos.writeShort(2);
		dos.close();

		//on récupère maintenant les données !
		dis=new DataInputStream(new BufferedInputStream(new FileInputStream(new File("test4.txt"))));

		System.out.println(dis.readBoolean());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		System.out.println(dis.readFloat());
		System.out.println(dis.readInt());
		System.out.println(dis.readInt());
//		System.out.println(dis.readLong());
		System.out.println(dis.readShort());
	
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}
		
	try{
		oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("game.txt"))));
		// Nous écrivons nos objets dans le fichier
		oos.writeObject(new Game("Assassin Creed", "Aventure", 45.69));
		oos.writeObject(new Game("Tomb Raider", "Plateforme", 23.49));
		oos.writeObject(new Game("Tetris", "Stratégie", 10.49));
		// NE PAS OUBLIER DE FERMER LE FLUX !!
		oos.close();
	
		//On récupère maintenant les données
		ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("game.txt"))));
		try{
			System.out.println("\n\nAffichage des jeux : ");
			System.out.println("***********************\n");
			System.out.println(((Game)ois.readObject()).toString());
			System.out.println(((Game)ois.readObject()).toString());
			System.out.println(((Game)ois.readObject()).toString());
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		ois.close();
	}catch (FileNotFoundException e){
		e.printStackTrace();
	}catch (IOException e){
		e.printStackTrace();
	}
	
	
	
	}

}
