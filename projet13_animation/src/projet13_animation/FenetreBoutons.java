package projet13_animation;

//Chapitre 22 = boutons

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.Dimension;

public class FenetreBoutons extends JFrame {
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");
	//private PanneauA pan = new PanneauA();
	

/*	//  premier exemple (simple)
	public FenetreBoutons(){
		this.setTitle("Fenetre avec Boutons");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//On définit le Layout à utiliser sur le content Pane
		this.setLayout(new GridLayout(3,2));
		
		//on ajoute les boutons au ContentPane de la JFrame (getContentPane())
		this.getContentPane().add(new JButton("1"));
		this.getContentPane().add(new JButton("2"));
		this.getContentPane().add(new JButton("3"));
		this.getContentPane().add(new JButton("4"));
		this.getContentPane().add(new JButton("5"));
		this.getContentPane().add(new JButton("6"));
		
		// ajout du bouton à notre ContentPane
		//pan.add(bouton);
		//this.setContentPane(pan);
		
		this.setVisible(true);
		
	}
*/	
	
	// deuxième exemple avec des BorderLayout, CardLayout, tableau, listenner,...
	
	
	CardLayout cl = new CardLayout();
	JPanel content = new JPanel();
	//Liste des noms de nos conteneurs dans la pile de cartes
	String[] listContent = {"CARD_1","CARD_2","CARD_3"};
	int indice = 0;
	
	
	public FenetreBoutons(){
		this.setTitle("Fenetre avec CardLayout");
		this.setSize(600,120);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//Création de 3 conteneurs de couleur différente
		JPanel card1 = new JPanel();
		card1.setBackground(Color.blue);
		
		JPanel card2 = new JPanel();
		card2.setBackground(Color.red);

		JPanel card3 = new JPanel();
		card3.setBackground(Color.green);
		
		JPanel boutonPane = new JPanel();
		JButton bouton = new JButton("Contenu suivant");
		//définition de l'action du bouton
		bouton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				//Via cette instruction on passe au prochain conteneur de la pile
				cl.next(content);
			}
		});
		
		//deuxième bouton
		JButton bouton2 = new JButton("Contenu par indice");
		//Définition de l'action du bouton2
		bouton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				if(++indice>2)
					indice=0;
				//Via cette instruction on passe au conteneur correspondant au nom fourni en entrée
				cl.show(content, listContent[indice]);
			}	
		
		
			});
		
		
		boutonPane.add(bouton);
		boutonPane.add(bouton2);
		//On définit le layout
		content.setLayout(cl);
		//On ajoute les cartes à la pile avec un nom pour les retrouver
		content.add(card1, listContent[0]);
		content.add(card2, listContent[1]);
		content.add(card3, listContent[2]);
		
		this.getContentPane().add(boutonPane, BorderLayout.NORTH);
		this.getContentPane().add(content, BorderLayout.CENTER);
		
		this.setVisible(true);
		
	}
		
		
		
	}
	
	

