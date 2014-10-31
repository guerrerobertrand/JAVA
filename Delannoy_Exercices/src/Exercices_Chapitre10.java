import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
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
		
//		Fenetre115 fen115 = new Fenetre115();
//		fen115.setVisible(true);

//		Fenetre116 fen116 = new Fenetre116();
//		fen116.setVisible(true);
		
		Fenetre117 fen117 = new Fenetre117();
		fen117.setVisible(true);
		
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

/*//EXERCICE 115 = JTextField, FlowLayout, JLabel,...
	class Fenetre115 extends JFrame implements ActionListener{
	
		public Fenetre115(){
			
			//fenêtre
			setTitle("champ de Texte");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setSize(400,340);
						
			//conteneur
			Container contenu=getContentPane();
			contenu.setLayout(new FlowLayout());
			
			
			// JLabel et JTextField et évenements 
			nombre=new JLabel("Nombre = ");
			contenu.add(nombre);
			texte = new JTextField(10);
			texte.setEditable(true);
			contenu.add(texte);
			// bouton
			calcul = new JButton("CALCUL");
			contenu.add(calcul,"South");
			calcul.addActionListener(this);

			carre=new JLabel("Carré = ");
			contenu.add(carre);
			
		
		
		}
	
		public void actionPerformed(ActionEvent ev){
			// on attrape la source
			Object source = ev.getSource();
			//System.out.println("Action sur :"+source);
			if(ev.getSource()==calcul)
				try{
					String nombre=texte.getText();
					int n=Integer.parseInt(nombre);
					long resultat=(long)n*(long)n;
					carre.setText((etiqCarre)+resultat);
				}catch(NumberFormatException e){
					nombre.setText(etiqNombre);
					carre.setText(etiqCarre);
				}
		}
		
		private JButton calcul;
		private JLabel nombre, carre;
		private JTextField texte;
		static private String etiqNombre="Nombre = ", etiqCarre="Carré = ";
}
*/


/*//EXERCICE 116 = avec FocusListener, et méthode valdiate(), JTextField, FlowLayout, JLabel,...
	class Fenetre116 extends JFrame implements ActionListener, FocusListener{
	
		public Fenetre116(){
			
			//fenêtre
			setTitle("champ de Texte");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setSize(400,100);
						
			//conteneur
			Container contenu=getContentPane();
			contenu.setLayout(new FlowLayout());
			
			
			// JLabel et JTextField et évenements 
			nombre=new JLabel("Nombre = ");
			contenu.add(nombre);
			texte = new JTextField(10);
			//texte.setEditable(true);
			contenu.add(texte);
			texte.addFocusListener(this); //pour la perte de Focus
			texte.addActionListener(this); // pour la validation

			carre=new JLabel("Carré = ");
			contenu.add(carre);
	
		}

		public void focusLost(FocusEvent fe){
			actualise();
		}
		public void focusGained(FocusEvent fe){
			
		}
		
		public void actionPerformed(ActionEvent ev){
			actualise();
		}

		public void actualise(){
			try{
				String nombre=texte.getText();
				int n=Integer.parseInt(nombre);
				long resultat=(long)n*(long)n;
				carre.setText((etiqCarre)+resultat);
			}catch(NumberFormatException e){
				nombre.setText(etiqNombre);
				carre.setText(etiqCarre);
			}
		}
		
		private JLabel nombre, carre;
		private JTextField texte;
		static private String etiqNombre="Nombre = ", etiqCarre="Carré = ";
}
*/

/**
 * EXERCICE 120 = Synthèse Chapitre 10 : une pendule...
 */

class Fenetre117 extends JFrame implements ActionListener{
	public Fenetre117(){
		setSize(500,500);
		setTitle("Ma Fenêtre Pendule");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		//conteneur
		Container contenu = getContentPane();
		panControles=new JPanel();
		contenu.add(panControles, "North");
		
		saisieHeure=new JTextField(5);
		panControles.add(saisieHeure);
		
		labHeure=new JLabel(" Heures");
		panControles.add(labHeure);
		
		saisieMinute=new JTextField(5);
		panControles.add(saisieMinute);
		
		labMinute=new JLabel(" Minutes");
		panControles.add(labMinute);
		
		boutHeure=new JButton("Mise à l'heure");
		panControles.add(boutHeure);
		boutHeure.addActionListener(this);
	
		//la pendule
		panPendule = new PanPendule(this);
		contenu.add(panPendule);
		panPendule.setBackground(Color.white);
	}
	
	public int getMinutes(){
		return minutes;
	}
	public int getHeures(){
		return heures;
	}
	
	public void actionPerformed(ActionEvent ev){
		int h,m;
		
		if(ev.getSource() == boutHeure){
			try{
				String chHeures=saisieHeure.getText();
				h=Integer.parseInt(chHeures);
			}catch(NumberFormatException ex){
				h=-1; // on force une valeur invalide
				saisieHeure.setText("");
			}
			try{
				String chMinutes=saisieMinute.getText();
				m=Integer.parseInt(chMinutes);
			}catch(NumberFormatException e){
				m=-1; // idem valeur invalide
				saisieMinute.setText("");
			}
				//////////
			/// Si les valeurs sont valides(tests) on les place dans les champs minutes et heures et on force le dessin
			if((h>=0) && (h<24) && (m>=0) && (m<60)){
				heures=h;
				minutes=m;
				repaint();
			}
			else{ // affiche des 0 ?
				saisieMinute.setText(""+minutes);
				saisieHeure.setText(""+heures);
			}
			
			
		}
}
	
	private JButton boutHeure;
	private JLabel labHeure, labMinute;
	private JTextField saisieHeure, saisieMinute;
	private JPanel panControles;
	private int minutes=0, heures=0;
	private PanPendule panPendule;
}

class PanPendule extends JPanel{
	public PanPendule(Fenetre117 fenP){
		this.fenP=fenP;
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//dessin du Cercle
		Dimension dim = getSize();
		int largeur = dim.width, hauteur= dim.height;
		boolean panTropLarge = (largeur>hauteur);
		int xCentre = largeur/2, yCentre = hauteur/2;
		int rayon ;
		if(panTropLarge)
			rayon = hauteur/2 - 2;
		else
			rayon = largeur/2 - 2;
		g.drawOval(xCentre-rayon, yCentre-rayon, 2*rayon, 2*rayon);
		
		//dessin des aiguilles...
		//la grande
		int minutes = fenP.getMinutes();
		double angle = Math.PI/2*(1. - minutes/15.);
		g.drawLine(xCentre, yCentre, (int)(xCentre+rayon*Math.cos(angle)),(int)(yCentre-rayon*Math.sin(angle)));
		
		//la petite
		int heures=fenP.getHeures();
		angle= Math.PI/2*(1. - heures/3. - minutes/180.);
		g.drawLine(xCentre, yCentre,(int)(xCentre+rayon/2.*Math.cos(angle)),(int)(yCentre-rayon/2.*Math.sin(angle)));
	}
	private Fenetre117 fenP;
}


