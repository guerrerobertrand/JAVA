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
/*		//EXERCICE 101 = cr�ation de 3 fen�tres de type ma classe FenetreE
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
/*//SOLUTION 1 = fen�tre = propre �couteur
class FenetreE extends JFrame implements MouseListener{
	
	public FenetreE(){
		setTitle("Ma fen�tre");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,200);
		//setBounds(10,20,300,200);
		JPanel panneau = new JPanel();
		getContentPane().add(panneau);
		panneau.setBackground(Color.white);
		//Evenements
		addMouseListener(this); // la fen�tre sera son propre �couteur d'�venements souris
	}	
	public void mouseClicked(MouseEvent ev){}	//appel� aussi "Clic complet"
	
	public void mouseEntered(MouseEvent ev){}
	
	public void mouseReleased(MouseEvent ev){
		// r�cup�ration des coordonn�es relatives � la fen�tre de la souris m�thodes sp�cifiques � MouseEvent
		int x=ev.getX();
		int y=ev.getY();
			System.out.println("je relache dans la fen�tre aux coordonn�es : "+x+" et "+y);
	}
	
	public void mousePressed(MouseEvent ev){ // simple clic
		// r�cup�ration des coordonn�es relatives � la fen�tre de la souris m�thodes sp�cifiques � MouseEvent
		System.out.println("je clique dans la fen�tre aux coordonn�es : "+ev.getX()+" et "+ev.getY());
	}

	public void mouseExited(MouseEvent ev){}

}
*/

/*//SOLUTION 2 = fen�tre avec comme �couteur une nouvelle classe qui impl�mente MouseListener = objet de type Ecout
class FenetreE extends JFrame{
	
	public FenetreE(){
		setTitle("Ma fen�tre");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,200);
		//setBounds(10,20,300,200);
		JPanel panneau = new JPanel();
		getContentPane().add(panneau);
		panneau.setBackground(Color.white);
		//Evenements
		addMouseListener (new Ecout()); // la fen�tre aura comme �couteur un objet Ecout
	}	

}

class Ecout implements MouseListener{
	public void mouseClicked(MouseEvent ev){}	//appel� aussi "Clic complet"
	
	public void mouseEntered(MouseEvent ev){}
	
	public void mouseReleased(MouseEvent ev){
		// r�cup�ration des coordonn�es relatives � la fen�tre de la souris m�thodes sp�cifiques � MouseEvent
		int x=ev.getX();
		int y=ev.getY();
			System.out.println("je relache dans la fen�tre aux coordonn�es : "+x+" et "+y);
	}
	
	public void mousePressed(MouseEvent ev){ // simple clic
		// r�cup�ration des coordonn�es relatives � la fen�tre de la souris m�thodes sp�cifiques � MouseEvent
		System.out.println("je clique dans la fen�tre aux coordonn�es : "+ev.getX()+" et "+ev.getY());
	}

	public void mouseExited(MouseEvent ev){}

}*/


/*//SOLUTION 3 = fen�tre avec comme �couteur une nouvelle classe qui impl�mente MouseAdapter = objet de type Ecout
class FenetreE extends JFrame{
	
	public FenetreE(){
		setTitle("Ma fen�tre");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,200);
		//setBounds(10,20,300,200);
		JPanel panneau = new JPanel();
		getContentPane().add(panneau);
		panneau.setBackground(Color.white);
		//Evenements
		addMouseListener (new Ecout()); // la fen�tre aura comme �couteur un objet Ecout
	}	

}

// Classe d�riv�e de MouseAdapter on impl�mente que les m�thodes n�cessaires les autres sont d�finies dans un corps vide, plus �conomique en code
class Ecout extends MouseAdapter{
	
	public void mouseReleased(MouseEvent ev){
		// r�cup�ration des coordonn�es relatives � la fen�tre de la souris m�thodes sp�cifiques � MouseEvent
		int x=ev.getX();
		int y=ev.getY();
			System.out.println("je relache dans la fen�tre aux coordonn�es : "+x+" et "+y);
	}
	
	public void mousePressed(MouseEvent ev){ // simple clic
		// r�cup�ration des coordonn�es relatives � la fen�tre de la souris m�thodes sp�cifiques � MouseEvent
		System.out.println("je clique dans la fen�tre aux coordonn�es : "+ev.getX()+" et "+ev.getY());
	}

}*/

/*//SOLUTION 4 = fen�tre avec comme �couteur une classe anonyme qui impl�mente MouseAdapter
class FenetreE extends JFrame{
	
	public FenetreE(){
		setTitle("Ma fen�tre");
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
				// r�cup�ration des coordonn�es relatives � la fen�tre de la souris m�thodes sp�cifiques � MouseEvent
				int x=ev.getX();
				int y=ev.getY();
					System.out.println("je relache dans la fen�tre aux coordonn�es : "+x+" et "+y);
			}
			
			public void mousePressed(MouseEvent ev){ // simple clic
				// r�cup�ration des coordonn�es relatives � la fen�tre de la souris m�thodes sp�cifiques � MouseEvent
				System.out.println("je clique dans la fen�tre aux coordonn�es : "+ev.getX()+" et "+ev.getY());
			}
		}
		); 
	}	
}
*/

//EXERCICE 101
/*//SOLUTION 1 = fen�tre = propre �couteur
class FenetreE extends JFrame implements MouseListener{
	
	public FenetreE(){
		nbFen++;
		num = nbFen;
		setTitle("Ma fen�tre "+num);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,200);
		//setBounds(10,20,300,200);
		JPanel panneau = new JPanel();
		getContentPane().add(panneau);
		panneau.setBackground(Color.white);
		//Evenements
		addMouseListener(this); // la fen�tre sera son propre �couteur d'�venements souris
	}	
	public void mouseClicked(MouseEvent ev){}	//appel� aussi "Clic complet"
	
	public void mouseEntered(MouseEvent ev){}
	
	public void mouseReleased(MouseEvent ev){
		// r�cup�ration des coordonn�es relatives � la fen�tre de la souris m�thodes sp�cifiques � MouseEvent
		int x=ev.getX();
		int y=ev.getY();
			System.out.println("je relache dans la fen�tre "+num+" aux coordonn�es : "+x+" et "+y);
	}
	
	public void mousePressed(MouseEvent ev){ // simple clic
		// r�cup�ration des coordonn�es relatives � la fen�tre de la souris m�thodes sp�cifiques � MouseEvent
		System.out.println("je clique dans la fen�tre "+num+" aux coordonn�es : "+ev.getX()+" et "+ev.getY());
	}

	public void mouseExited(MouseEvent ev){}

	private static int nbFen=0;
	private int num;
	
}*/
/*//SOLUTION 2 = fen�tre avec comme �couteur une nouvelle classe qui impl�mente MouseListener = objet de type Ecout
class FenetreE extends JFrame{
	
	public FenetreE(){
		nbFen++;
		num=nbFen;
		setTitle("Ma fen�tre "+num);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,200);
		//setBounds(10,20,300,200);
		JPanel panneau = new JPanel();
		getContentPane().add(panneau);
		panneau.setBackground(Color.white);
		//Evenements
		addMouseListener (new Ecout(num)); // la fen�tre aura comme �couteur un objet Ecout
	}	
	private static int nbFen=0;
	private int num;
}

class Ecout extends MouseAdapter{

	public Ecout (int num){
		this.num=num;
	}
	
	public void mouseReleased(MouseEvent ev){
		// r�cup�ration des coordonn�es relatives � la fen�tre de la souris m�thodes sp�cifiques � MouseEvent
		int x=ev.getX();
		int y=ev.getY();
			System.out.println("je relache dans la fen�tre "+num+" aux coordonn�es : "+x+" et "+y);
	}
	
	public void mousePressed(MouseEvent ev){ // simple clic
		// r�cup�ration des coordonn�es relatives � la fen�tre de la souris m�thodes sp�cifiques � MouseEvent
		System.out.println("je clique dans la fen�tre "+num+" aux coordonn�es : "+ev.getX()+" et "+ev.getY());
	}


	private int num; // num�ro de la fen�tre �cout�e
	
}*/

/*//EXERCICE 103
class FenetreE extends JFrame{
	
	public FenetreE(int nBoutons){
		setTitle("Fen�tre Boutons");
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

/*//EXERCICE 104 = gestion de plusieurs boutons d'une fen�tre avec un seul �couteur
class FenetreE extends JFrame implements ActionListener{
	
	public FenetreE(int nBout){
		this.nBout=nBout;
		setTitle("Fen�tre Boutons");
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
//EXERCICE 105 = SYNTHESE cr�ation/suppression de boutons s�lection, modification,...
//***********************************************************************************

class FenetreE extends JFrame implements ActionListener{
	
	public FenetreE(int nBoutMax){
		setTitle("Fen�tre Boutons (maxi "+nBoutMax+")");
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
		contenu.add(pan); //au centre par d�faut
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
