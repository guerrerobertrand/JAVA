import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Exercices_Chapitre9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*//EXERCICE 100
		FenetreE fenE = new FenetreE(); // nouvelle objet FenetreE dans reference fenE
		fenE.setVisible(true); //rendre visible 
*/		
/*		//EXERCICE 101 = création de 3 fenêtres de type ma classe FenetreE
		final int nFen=3;
		for (int i=0; i<nFen; i++){
		FenetreE fenE = new FenetreE(); // nouvelle objet FenetreE dans reference fenE
		fenE.setVisible(true); //rendre visible
		}
*/
/*		//EXERCICE 103 = FenetreE avec Boutons et FlowLayout
		//EXERCICE 104
		System.out.println("Combien de boutons ?");
		int nbBoutons = Clavier.lireInt();
		FenetreE fenE = new FenetreE(nbBoutons); // nouvelle objet FenetreE dans reference fenE
		fenE.setVisible(true); //rendre visible
*/	

		//EXERCICE 105
		FenetreE fenE = new FenetreE(50); // nouvelle objet FenetreE dans reference fenE
		fenE.setVisible(true); //rendre visible

		
	}
	

}
//EXERCICE 100
/*//SOLUTION 1 = fenêtre = propre écouteur
class FenetreE extends JFrame implements MouseListener{
	
	public FenetreE(){
		setTitle("Ma fenêtre");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,200);
		//setBounds(10,20,300,200);
		JPanel panneau = new JPanel();
		getContentPane().add(panneau);
		panneau.setBackground(Color.white);
		//Evenements
		addMouseListener(this); // la fenêtre sera son propre écouteur d'évenements souris
	}	
	public void mouseClicked(MouseEvent ev){}	//appelé aussi "Clic complet"
	
	public void mouseEntered(MouseEvent ev){}
	
	public void mouseReleased(MouseEvent ev){
		// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifiques à MouseEvent
		int x=ev.getX();
		int y=ev.getY();
			System.out.println("je relache dans la fenêtre aux coordonnées : "+x+" et "+y);
	}
	
	public void mousePressed(MouseEvent ev){ // simple clic
		// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifiques à MouseEvent
		System.out.println("je clique dans la fenêtre aux coordonnées : "+ev.getX()+" et "+ev.getY());
	}

	public void mouseExited(MouseEvent ev){}

}
*/

/*//SOLUTION 2 = fenêtre avec comme écouteur une nouvelle classe qui implémente MouseListener = objet de type Ecout
class FenetreE extends JFrame{
	
	public FenetreE(){
		setTitle("Ma fenêtre");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,200);
		//setBounds(10,20,300,200);
		JPanel panneau = new JPanel();
		getContentPane().add(panneau);
		panneau.setBackground(Color.white);
		//Evenements
		addMouseListener (new Ecout()); // la fenêtre aura comme écouteur un objet Ecout
	}	

}

class Ecout implements MouseListener{
	public void mouseClicked(MouseEvent ev){}	//appelé aussi "Clic complet"
	
	public void mouseEntered(MouseEvent ev){}
	
	public void mouseReleased(MouseEvent ev){
		// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifiques à MouseEvent
		int x=ev.getX();
		int y=ev.getY();
			System.out.println("je relache dans la fenêtre aux coordonnées : "+x+" et "+y);
	}
	
	public void mousePressed(MouseEvent ev){ // simple clic
		// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifiques à MouseEvent
		System.out.println("je clique dans la fenêtre aux coordonnées : "+ev.getX()+" et "+ev.getY());
	}

	public void mouseExited(MouseEvent ev){}

}*/


/*//SOLUTION 3 = fenêtre avec comme écouteur une nouvelle classe qui implémente MouseAdapter = objet de type Ecout
class FenetreE extends JFrame{
	
	public FenetreE(){
		setTitle("Ma fenêtre");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,200);
		//setBounds(10,20,300,200);
		JPanel panneau = new JPanel();
		getContentPane().add(panneau);
		panneau.setBackground(Color.white);
		//Evenements
		addMouseListener (new Ecout()); // la fenêtre aura comme écouteur un objet Ecout
	}	

}

// Classe dérivée de MouseAdapter on implémente que les méthodes nécessaires les autres sont définies dans un corps vide, plus économique en code
class Ecout extends MouseAdapter{
	
	public void mouseReleased(MouseEvent ev){
		// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifiques à MouseEvent
		int x=ev.getX();
		int y=ev.getY();
			System.out.println("je relache dans la fenêtre aux coordonnées : "+x+" et "+y);
	}
	
	public void mousePressed(MouseEvent ev){ // simple clic
		// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifiques à MouseEvent
		System.out.println("je clique dans la fenêtre aux coordonnées : "+ev.getX()+" et "+ev.getY());
	}

}*/

/*//SOLUTION 4 = fenêtre avec comme écouteur une classe anonyme qui implémente MouseAdapter
class FenetreE extends JFrame{
	
	public FenetreE(){
		setTitle("Ma fenêtre");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,200);
		//setBounds(10,20,300,200);
		JPanel panneau = new JPanel();
		getContentPane().add(panneau);
		panneau.setBackground(Color.white);
		//Evenements
		addMouseListener (new MouseAdapter(){
			public void mouseReleased(MouseEvent ev){
				// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifiques à MouseEvent
				int x=ev.getX();
				int y=ev.getY();
					System.out.println("je relache dans la fenêtre aux coordonnées : "+x+" et "+y);
			}
			
			public void mousePressed(MouseEvent ev){ // simple clic
				// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifiques à MouseEvent
				System.out.println("je clique dans la fenêtre aux coordonnées : "+ev.getX()+" et "+ev.getY());
			}
		}
		); 
	}	
}
*/

//EXERCICE 101
/*//SOLUTION 1 = fenêtre = propre écouteur
class FenetreE extends JFrame implements MouseListener{
	
	public FenetreE(){
		nbFen++;
		num = nbFen;
		setTitle("Ma fenêtre "+num);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,200);
		//setBounds(10,20,300,200);
		JPanel panneau = new JPanel();
		getContentPane().add(panneau);
		panneau.setBackground(Color.white);
		//Evenements
		addMouseListener(this); // la fenêtre sera son propre écouteur d'évenements souris
	}	
	public void mouseClicked(MouseEvent ev){}	//appelé aussi "Clic complet"
	
	public void mouseEntered(MouseEvent ev){}
	
	public void mouseReleased(MouseEvent ev){
		// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifiques à MouseEvent
		int x=ev.getX();
		int y=ev.getY();
			System.out.println("je relache dans la fenêtre "+num+" aux coordonnées : "+x+" et "+y);
	}
	
	public void mousePressed(MouseEvent ev){ // simple clic
		// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifiques à MouseEvent
		System.out.println("je clique dans la fenêtre "+num+" aux coordonnées : "+ev.getX()+" et "+ev.getY());
	}

	public void mouseExited(MouseEvent ev){}

	private static int nbFen=0;
	private int num;
	
}*/
/*//SOLUTION 2 = fenêtre avec comme écouteur une nouvelle classe qui implémente MouseListener = objet de type Ecout
class FenetreE extends JFrame{
	
	public FenetreE(){
		nbFen++;
		num=nbFen;
		setTitle("Ma fenêtre "+num);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,200);
		//setBounds(10,20,300,200);
		JPanel panneau = new JPanel();
		getContentPane().add(panneau);
		panneau.setBackground(Color.white);
		//Evenements
		addMouseListener (new Ecout(num)); // la fenêtre aura comme écouteur un objet Ecout
	}	
	private static int nbFen=0;
	private int num;
}

class Ecout extends MouseAdapter{

	public Ecout (int num){
		this.num=num;
	}
	
	public void mouseReleased(MouseEvent ev){
		// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifiques à MouseEvent
		int x=ev.getX();
		int y=ev.getY();
			System.out.println("je relache dans la fenêtre "+num+" aux coordonnées : "+x+" et "+y);
	}
	
	public void mousePressed(MouseEvent ev){ // simple clic
		// récupération des coordonnées relatives à la fenêtre de la souris méthodes spécifiques à MouseEvent
		System.out.println("je clique dans la fenêtre "+num+" aux coordonnées : "+ev.getX()+" et "+ev.getY());
	}


	private int num; // numéro de la fenêtre écoutée
	
}*/

/*//EXERCICE 103
class FenetreE extends JFrame{
	
	public FenetreE(int nBoutons){
		setTitle("Fenêtre Boutons");
		setSize(300,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		for(int i=0; i<nBoutons; i++){
			unBouton = new JButton("BOUTON"+(i+1));
			contenu.add(unBouton);
		}
		
	}
	private JButton unBouton;
}
*/

/*//EXERCICE 104 = gestion de plusieurs boutons d'une fenêtre avec un seul écouteur
class FenetreE extends JFrame implements ActionListener{
	
	public FenetreE(int nBout){
		this.nBout=nBout;
		setTitle("Fenêtre Boutons");
		setSize(300,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());

		boutons = new JButton[nBout];
		for(int i=0; i<nBout;i++){
			boutons[i]=new JButton("BOUTON"+(i+1));
			contenu.add(boutons[i]);
			boutons[i].addActionListener(this);
		}
	}
	
	public void actionPerformed(ActionEvent e){
		Object source = e.getSource();
		for(int i =0; i<nBout; i++){
			if(source ==boutons[i])
				System.out.println("Action sur le bouton"+(i+1));
		}
	}
	
	private JButton [] boutons;
	private int nBout;
}*/

//***********************************************************************************
//EXERCICE 105 = SYNTHESE création/suppression de boutons sélection, modification,...
//***********************************************************************************

class FenetreE extends JFrame implements ActionListener{
	
	public FenetreE(int nBoutMax){
		setTitle("Fenêtre Boutons (maxi "+nBoutMax+")");
		setSize(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		Container contenu = getContentPane();
		
		creation = new JButton("CREATION");
		contenu.add(creation,"North");
		creation.addActionListener(this);
		
		suppression = new JButton("SUPPRESSION");
		contenu.add(suppression,"South");
		suppression.addActionListener(this);
		
		pan = new JPanel();
		contenu.add(pan); //au centre par défaut
		boutons = new JButton[nBoutMax];
		boutSelec = new boolean[nBoutMax];
		
	}
	
	public void actionPerformed(ActionEvent e){
		Object source = e.getSource();
		if(source ==creation){
			boutons[nBout] = new JButton("BOUTON"+(nBout+1));
			boutons[nBout].setBackground(Color.yellow);
			boutSelec[nBout]=false;
			pan.add(boutons[nBout]);
			boutons[nBout].addActionListener(this);
			pan.validate(); // force le recalcul par le gestionnaire
			nBout++;
			
		}
		if(source == suppression){
			for(int i=0;i<nBout;i++)
				if(boutSelec[i])
					pan.remove(boutons[i]);
			pan.validate();
		}
		
		for(int i=0; i<nBout;i++){
			if(source ==boutons[i])
				if(boutSelec[i]){
					boutSelec[i]=false;
					boutons[i].setBackground(Color.yellow);
				}
				else
				{
					boutSelec[i]=true;
					boutons[i].setBackground(Color.red);
				}
		}
		
	}
	
	private JButton creation, suppression;
	private JPanel pan;
	private static int nBout =0;
	private JButton [] boutons;
	private boolean[] boutSelec;
}
