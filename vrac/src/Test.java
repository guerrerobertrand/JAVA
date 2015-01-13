import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		//comparer 2 String
		
		String name1= "Fred";
		String name2= "Brad";
		
		if(name1.equals(name2)){
			System.out.println("mêmes noms");
		}
		else{
			System.out.println("noms différents");
		}
*/
		
/*		//exemple de enhanced for loop (boucle for optimisée)
		int[] numbers = {1,3,5,7,9,11,13,15,17,19}; 
		int sum=0;
		for (int item : numbers) { sum = sum + item;
		}
		System.out.println("La somme est : " + sum);
		System.out.println("");
		
		//recherche dans tableau
		char tableau []={'a','b','c','d','e'};
		int i=0;
		int emplacement=0;
		char reponse=' ', carac=' ';
		
		do{//boucle principale
			i=0;
			carac='p';
			
			while(i<tableau.length && carac != tableau[i])
				i++;
			if(i<tableau.length && carac == tableau[i])
				System.out.println("la lettre "+carac+" se trouve dans le tableau");
			else
				System.out.println("la lettre "+carac+" n'est pas dans le tableau !");
			
		}while(reponse==carac);
			
		*/
		
		
		//FLUX D'ENTREE/SORTIE
		
/*	    //Création de l'objet File
	    File f = new File("test.txt");
	    System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
	    System.out.println("Nom du fichier : " + f.getName());
	    System.out.println("Est-ce qu'il existe ? " + f.exists());
	    System.out.println("Est-ce un répertoire ? " + f.isDirectory());
	    System.out.println("Est-ce un fichier ? " + f.isFile());
		
	    System.out.println("Affichage des lecteurs à la racine du PC : ");
	    for(File file : File.listRoots())
	    {
	      System.out.println(file.getAbsolutePath());
	      try {
	        int i = 1;	
	        //On parcourt la liste des fichiers et répertoires
	        for(File nom : file.listFiles()){
	          //S'il s'agit d'un dossier, on ajoute un "/"
	          System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName()+"/" : nom.getName()));
						
	          if((i%4) == 0){
	            System.out.print("\n");
	          }
	          i++;
	        }
	        System.out.println("\n");
	      } catch (NullPointerException e) {
	        //L'instruction peut générer une NullPointerException
	        //s'il n'y a pas de sous-fichier !
	      }
	    }
*/
		 Point [] tabPts = new Point [4] ;
		    tabPts [0] = new Point (0, 2) ;
		    tabPts [1] = new Pointcol (1, 5, (byte)3) ;
		    tabPts [2] = new Pointcol (2, 8, (byte)9) ;
		    tabPts [3] = new Point (1, 2) ;
		    for (int i=0 ; i< tabPts.length ; i++)
		      tabPts[i].affiche() ; //la méthode affiche varie selon le type réel de l'objet du tableau = POLYMORPHISME
	}	//	fin du main
	
} //fin de classe
class Point
{ public Point (int x, int y)
  { this.x = x ; this.y = y ;
  }
  public void affiche ()
  { System.out.println ("Je suis en " + x + " " + y) ;
  }
  private int x, y ;
}
class Pointcol extends Point
{ public Pointcol (int x, int y, byte couleur)
  { super (x, y) ;               // obligatoirement comme premiËre instruction
    this.couleur = couleur ;
  }
  public void affiche ()
  { super.affiche() ;
    System.out.println ("  et ma couleur est : " + couleur) ;
  }
  private byte couleur ;
}
		  
		  


		
		
		
		
		
