import java.awt.event.*; //pour MouseEvent et MouseListener
import javax.swing.*; // pour JFrame
import java.awt.*; // classes Container et FlowLayout 

public class Chapitre12_bases {

	public static void main(String[] args) {
/*		// Ma première fenêtre
JFrame fen = new JFrame();
fen.setSize(300,150);
fen.setTitle("Ma fenêtre");
fen.setVisible(true);*/

		// Ma fenêtre perso
		MaFenetre fen = new MaFenetre(); // nouvelle objet MaFenetre dans reference fen
		fen.setVisible(true); //rendre visible
		
	}

}

/*// juste un listener dans la même fenêtre
class MaFenetre extends JFrame implements MouseListener{
	
	public MaFenetre() // constructeur de fenêtre
		{
		setTitle("Ma fenêtre gestion de clics");
		//setSize(500,500);
		setBounds(1200, 500, 500, 500); // centre la fenêtre
		//Evenements
		addMouseListener(this); // la fenêtre sera son propre écouteur d'évenements souris
		}

		public void mouseClicked(MouseEvent ev)
			{
			// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifques à MouseEvent
			int x=ev.getX();
			int y=ev.getY();
			System.out.println("Clic dans la fenêtre aux coordonnées : "+x+" et "+y);
			}	
		public void mouseEntered(MouseEvent ev){}
		public void mouseReleased(MouseEvent ev){}
		public void mousePressed(MouseEvent ev){}
		public void mouseExited(MouseEvent ev){}
}
*/

/*//CHAUD avec listener et fenêtre dans classes séparées et utilisation de classe anonyme...MouseAdapter
class MaFenetre extends JFrame{
	
	public MaFenetre() // constructeur de fenêtre
		{
		setTitle("Ma fenêtre gestion de clics");
		//setSize(500,500);
		setBounds(1200, 500, 500, 500); // centre la fenêtre
		//Evenements
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent ev)
			{
			// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifques à MouseEvent
			int x=ev.getX();
			int y=ev.getY();
			System.out.println("Clic dans la fenêtre aux coordonnées : "+x+" et "+y);
			}			
		});
	}
}
	*/
/*// premier Composant : le Bouton (JButton)et mise en forme (setLayout(new FlowLayout())
class MaFenetre extends JFrame{
	
	public MaFenetre() // constructeur de fenêtre
		{
		setTitle("Ma fenêtre avec Bouton");
		//setSize(500,500);
		setBounds(1200, 500, 500, 500); // centre la fenêtre
		//Evenements
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent ev)
			{
			// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifques à MouseEvent
			int x=ev.getX();
			int y=ev.getY();
			System.out.println("Clic dans la fenêtre aux coordonnées : "+x+" et "+y);
			}			
		});
	
		monBouton = new JButton("ESSAI");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(monBouton);
		}
	private JButton monBouton;
}
	*/

/*//Bouton mis en forme et clic bouton (addActionListener - actionPerformed)
class MaFenetre extends JFrame implements ActionListener{
	
	public MaFenetre() // constructeur de fenêtre
		{
		setTitle("Ma fenêtre gestion de clics");
		//setSize(500,500);
		setBounds(1200, 500, 500, 500); // centre la fenêtre
		//Evenements
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent ev)
			{
			// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifques à MouseEvent
			int x=ev.getX();
			int y=ev.getY();
			System.out.println("Clic dans la fenêtre aux coordonnées : "+x+" et "+y);
			}			
		});
	
		monBouton = new JButton("ESSAI");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(monBouton);
		monBouton.addActionListener(this);
		}
	public void actionPerformed(ActionEvent ev){
		System.out.println("action clic sur Bouton");
	}
	private JButton monBouton;
}
	*/
/*//2 Boutons mis en forme et Action sur 1 des 2 boutons (méthode getSource)
class MaFenetre extends JFrame implements ActionListener{
	
	public MaFenetre() // constructeur de fenêtre
		{
		setTitle("Ma fenêtre avec 2 boutons");
		setBounds(1200, 500, 500, 500); // centre la fenêtre
		monBouton1 = new JButton("Bouton A");
		monBouton2 = new JButton("Bouton B");
		//on se sert du Container
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		contenu.add(monBouton1);
		contenu.add(monBouton2);
		monBouton1.addActionListener(this);
		monBouton2.addActionListener(this);
		}
	public void actionPerformed(ActionEvent ev){
		if(ev.getSource() == monBouton1)
			System.out.println("action clic sur Bouton A");
		if(ev.getSource()== monBouton2)
			System.out.println("action clic sur Bouton B");
	}
	private JButton monBouton1, monBouton2;
}*/
	

/*//2 Boutons et 2 Listener avec un entier à renvoyer (objet écouteur d'une même classe par bouton)
class MaFenetre extends JFrame{
	
	public MaFenetre() // constructeur de fenêtre
		{
		setTitle("Ma fenêtre avec 2 boutons");
		setBounds(1200, 500, 500, 500); // centre la fenêtre
		monBouton1 = new JButton("Bouton A");
		monBouton2 = new JButton("Bouton B");
		//on se sert du Container
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		contenu.add(monBouton1);
		contenu.add(monBouton2);
		EcouteBouton ecout1=new EcouteBouton(10);
		EcouteBouton ecout2=new EcouteBouton(20);
		monBouton1.addActionListener(ecout1);
		monBouton2.addActionListener(ecout2);
		}
	private JButton monBouton1, monBouton2;
}

class EcouteBouton implements ActionListener{
	public EcouteBouton(int n){
		this.n=n;
	}
	public void actionPerformed(ActionEvent ev){
			System.out.println("action clic sur Bouton"+n);
	}
	private int n;
}
*/


// BOuton Dynamique = on clique cela crée des nouveaux boutons

class MaFenetre extends JFrame{
	public MaFenetre() // constructeur de fenêtre
		{
		setTitle ("Boutons dynamiques") ;
		setSize (500, 150) ;
		Container contenu = getContentPane() ;
		contenu.setLayout (new FlowLayout()) ;
		crBouton = new JButton ("CREATION BOUTON") ;
		contenu.add(crBouton) ;
		EcoutCr ecoutCr = new EcoutCr (contenu) ;
		crBouton.addActionListener (ecoutCr) ;
		}
	private JButton crBouton ;
}

class EcoutCr implements ActionListener{ 
	public EcoutCr (Container contenu){
		this.contenu = contenu ;
	}
	public void actionPerformed (ActionEvent ev){
		JButton nouvBout = new JButton ("BOUTON") ;
		contenu.add(nouvBout) ;
		EcoutCr ecoutBout = new EcoutCr(contenu) ;
		contenu.validate(); // pour recalculer
	}
	private Container contenu ;
}
