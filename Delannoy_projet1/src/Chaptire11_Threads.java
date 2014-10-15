
public class Chaptire11_Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 { 
/*//METHODE SUPER CLASSE THREAD, objets thread, run,...
		 Ecrit e1 = new Ecrit ("bonjour ", 10, 5) ;
		 Ecrit e2 = new Ecrit ("bonsoir ", 15, 10) ;
		 Ecrit e3 = new Ecrit ("\n", 5, 15) ;
		 e1.start() ;
		 e2.start() ;
		 e3.start() ;
		 Clavier.lireInt();
		 }
	 }
}
		 
class Ecrit extends Thread
		 { 
	public Ecrit (String texte, int nb, long attente)
		 { 
		 this.texte = texte ;
		 this.nb = nb ;
		 this.attente = attente ;
		 }
	 public void run ()
		 { 
		 try
		 { 
				 for (int i=0 ; i<nb ; i++)
			 { System.out.print (texte) ;
			 sleep (attente) ;
			 }
		 }
		 catch (InterruptedException e) {} // impos� par sleep
		 }
		 private String texte ;
		 private int nb ;
		 private long attente ;
	 }
*/
/*		 THREAD AVEC interface RUNNABLE
 		 Ecrit e1 = new Ecrit ("bonjour ", 10, 5) ;
		 Ecrit e2 = new Ecrit ("bonsoir ", 12, 10) ;
		 Ecrit e3 = new Ecrit ("\n", 5, 15) ;
		 e1.start() ;
		 e2.start() ;
		 e3.start() ;
	 }	 
	}
}
class Ecrit implements Runnable
		 { 
	public Ecrit (String texte, int nb, long attente)
		 { 
		 this.texte = texte ;
		 this.nb = nb ;
		 this.attente = attente ;
		 }
	public void start ()
		 { 
		Thread t = new Thread (this) ;
		t.start() ;
	}
	
	public void run ()
		 { 
		try
		 { 
			for (int i=0 ; i<nb ; i++)
		 	 { System.out.print (texte) ;
		 Thread.sleep (attente) ;
		 	 }
		 }
		 catch (InterruptedException e) {} // impose par sleep
	}
		 private String texte ;
		 private int nb ;
		 private long attente ;
}	*/	 
		 
		 Ecrit e1 = new Ecrit ("bonjour ", 5) ;
		 Ecrit e2 = new Ecrit ("bonsoir ", 10) ;
		 Ecrit e3 = new Ecrit ("\n", 35) ;
		 e1.start() ;
		 e2.start() ;
		 e3.start() ;
		 Clavier.lireString();
		 e1.interrupt() ; // interruption premier thread
		 System.out.println ("\n*** Arret premier thread ***") ;
		 Clavier.lireString();
		 e2.interrupt() ; // interruption deuxi�me thread
		 e3.interrupt() ; // interruption troisi�me thread
		 System.out.println ("\n*** Arret deux derniers threads ***") ;
		 }
		 }
}
class Ecrit extends Thread
		 { 
		 public Ecrit (String texte, long attente)
		 { this.texte = texte ;
		 this.attente = attente ;
		 }

		 public void run ()
		 { try
		 { while (true) // boucle infinie
		 { 
			 if (interrupted()) 
				 
				 return ;
		 System.out.print (texte) ;
		 sleep (attente) ;
		 }
		 }
		 catch (InterruptedException e)
		 { return ; // on peut omettre return ici
		 }
		 }
		 private String texte ;
		 private long attente ;
}
