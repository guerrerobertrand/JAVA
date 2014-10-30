import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Exercices_Chapitre10 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Fenetre112 fen112 = new Fenetre112();
//		fen112.setVisible(true);

//		String[] libelles={"Cercle","Rectangle","Triangle","Pentagone","Ellipse","Carré"}; 
//		Fenetre114 fen114 = new Fenetre114(libelles);
//		fen114.setVisible(true);
		
		Fenetre115 fen115 = new Fenetre115();
		fen115.setVisible(true);
		
	}
}	
	
/*//EXERCICE 112

	class Fenetre112 extends JFrame implements ActionListener, ItemListener{
	
		public Fenetre112(){
			
			//fenêtre
			setTitle("Cases à cocher");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setSize(300,140);
			
			
			//conteneur
			Container contenu = getContentPane();
			//contenu.setLayout(new FlowLayout());
			
			// boutons
			raz = new JButton("RAZ");
			contenu.add(raz,"North");
			etat = new JButton("ETAT");
			contenu.add(etat, "South");
			
			//évenements boutons
			raz.addActionListener(this);
			etat.addActionListener(this);
			
			
			
			//panneau
			pan = new JPanel();
			contenu.add(pan); // au centre par défaut

			
			// cases à cocher et évenements JCheckBox
			case1 = new JCheckBox("Cercle");
			pan.add(case1);
			case1.addActionListener(this);
			case1.addItemListener(this);
			case2 = new JCheckBox("Rectangle");
			pan.add(case2);
			case2.addActionListener(this);
			case2.addItemListener(this);
			case3 = new JCheckBox("Triangle");
			pan.add(case3);
			case3.addActionListener(this);
			case3.addItemListener(this);
			
		}
	
		public void actionPerformed(ActionEvent ev){
			// on attrape la source
			Object source = ev.getSource();
			//si bouton RAZ
			if(source == raz){
				case1.setSelected(false);
				case2.setSelected(false);
				case3.setSelected(false);
			}
			//si bouton ETAT
			if(source == etat){
				System.out.println("les case sélectionnées sont :");
				if(case1.isSelected()) System.out.println("Cercle");
				if(case2.isSelected()) System.out.println("Rectangle");
				if(case3.isSelected()) System.out.println("Triangle");
				System.out.println("");
			}
			//log ActionListener
			if (source == case1)	System.out.println("action case 1");
			if (source == case2)	System.out.println("action case 2");
			if (source == case3)	System.out.println("action case 3");
		}
		
		public void itemStateChanged(ItemEvent ev){
			// on attrape la source
			Object source = ev.getSource();
			// log ItemListener
			if(source == case1) System.out.println("item case 1");
			if (source == case2)	System.out.println("item case 2");
			if (source == case3)	System.out.println("item case 3");
		}
		
		private JButton raz, etat;
		private JPanel pan;
		private JCheckBox case1, case2, case3;
	
}*/

/*//EXERCICE 114
	class Fenetre114 extends JFrame implements ActionListener{
	
		public Fenetre114(String []libelles){
			
			//fenêtre
			setTitle("boutons radio en nombre quelconque");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setSize(400,340);
						
			//conteneur
			Container contenu = getContentPane();
			//contenu.setLayout(new FlowLayout());
			
			// boutons
			etat = new JButton("ETAT");
			contenu.add(etat,"South");
			etat.addActionListener(this);
			
			//panneau
			pan = new JPanel();
			contenu.add(pan);
			// nombre de boutons
			this.libelles=libelles;
			nBoutons=libelles.length;
			// groupe 
			ButtonGroup groupe= new ButtonGroup();
			boutons=new JRadioButton[nBoutons];

			// boutons radio et évenements JRadioButton
			for (int i =0; i<nBoutons;i++){
				boutons[i]=new JRadioButton(libelles[i]);
				pan.add(boutons[i]);
				// on ajoute le groupe pour rendre unique la sélection d'un bouton radio !
				groupe.add(boutons[i]);
				boutons[i].addActionListener(this);
			}
			if(nBoutons>0) boutons[0].setSelected(true);
		}
	
		public void actionPerformed(ActionEvent ev){
			// on attrape la source
			Object source = ev.getSource();
			if(source == etat){
				System.out.println("Bouton sélectionné = ");
				for (int i=0;i<nBoutons;i++)
					if(boutons[i].isSelected()) System.out.println(libelles[i]+" ");
				System.out.println(" ");
			}
			for (int i=0; i<nBoutons;i++){
				if(source == boutons[i]) System.out.println("Action sur le bouton "+libelles[i]);
			}
		}
		
		private JRadioButton boutons[];
		private JButton etat;
		private JPanel pan;
		private String[] libelles; 
		private int nBoutons;
}
*/

//EXERCICE 115 = JTextField, FlowLayout, JLabel,...
	class Fenetre115 extends JFrame implements ActionListener{
	
		public Fenetre115(){
			
			//fenêtre
			setTitle("champ de Texte");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setSize(400,340);
						
			//conteneur
			setLayout(new FlowLayout());
			
			// boutons
			calcul = new JButton("CALCUL");
			pan.add(calcul,"South");
			calcul.addActionListener(this);
			
			//panneau
			pan = new JPanel();
	
			// JLabel et JTextField et évenements 
			nombre=new JLabel("Nombre :");
			pan.add(nombre);
			texte = new JTextField();
			texte.setEditable(true);
			pan.add(texte);
			carre=new JLabel("Carré = ");
			pan.add(carre);
			
		
		
		}
	
		public void actionPerformed(ActionEvent ev){
			// on attrape la source
			Object source = ev.getSource();
		}
		
		private JButton calcul;
		private JPanel pan;
		private JLabel nombre, carre;
		private JTextField texte;
}
