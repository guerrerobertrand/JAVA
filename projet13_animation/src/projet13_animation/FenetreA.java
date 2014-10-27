package projet13_animation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FenetreA extends JFrame {

	private PanneauA pan = new PanneauA();
	private JButton bouton = new JButton("Lancement"); //bouton classique
	//private BoutonA bouton = new BoutonA("Mon bouton"); //bouton perso
	private JButton bouton2 = new JButton("Arr�t"); //bouton classique
	private JPanel container = new JPanel();
	private JLabel label = new JLabel("Mon JLabel");

	//compteurs de clics
	private int compteur=0;
	
	//bouton Lancement et Arr�t de l'animation
	private boolean animated = true;
	private boolean backX, backY;
	private int x, y;
	
	//avec des Threads
	private Thread t;
	
	
	public FenetreA(){
		this.setTitle("Animation SDZ");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		container.add(pan, BorderLayout.CENTER);
		
		//nous ajoutons la fen�tre (this) � la liste des auditeurs de notre bouton
		//bouton.addActionListener(this); // classique
		//bouton2.addActionListener(this); // classique
		
		bouton.addActionListener(new BoutonListener()); // classique
		bouton.setEnabled(false);
		bouton2.addActionListener(new Bouton2Listener()); // classique
		
		// on cr�� un deuxi�me JPanel pour y placer nos 2 boutons puis on l'ins�re dans le Content Pane
		JPanel south = new JPanel();
		south.add(bouton);
		south.add(bouton2);
		container.add(south, BorderLayout.SOUTH);
		
		//D�finition d'une police d'�criture
		Font police = new Font("Tahoma", Font.BOLD,16);
		//On l'applique � JLabel
		label.setFont(police);
		//Changement de couleur
		label.setForeground(Color.blue);
		// Alignement
		label.setHorizontalAlignment(JLabel.CENTER);
		
		container.add(label, BorderLayout.NORTH);
		this.setContentPane(container);
		this.setVisible(true);
		go();
		

		
	}
	
	
	// M�thode classique actionPerformed()
/*	//M�thode appel�e lors d'un clic bouton
	public void actionPerformed(ActionEvent Arg0){
		// lorsque l'on clique on met � jour le JLabel
		this.compteur++;
		label.setText("Vous avez cliqu� "+ this.compteur + " fois !");
	}*/
	
	// Version rond qui passe et qui s'efface apr�s chaque tour de boucle
/*	private void go(){
		for(;;){
			//coordonn�es de d�part de notre rond
			int x = pan.getPosX(), y = pan.getPosY();
			x++;
			y++;
			pan.setPosX(x);
			pan.setPosY(y);
			// instruction de reconstruction (redessiner) de JPanel (rappel de la m�thode paintComponent())
			pan.repaint();
			try{
				//suspendre le traitement (cf. Threads) temps en milliseconde soit 1000 = 1 seconde
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			if(x==pan.getWidth()||y==pan.getHeight()){
				pan.setPosX(-50);
				pan.setPosY(-50);
			}
		}
		
	}*/
	
/*	// Version rond qui rebondit contre les bords de la fen�tre
	private void go(){
		for(;;){
			//coordonn�es de d�part de notre rond
			int x = pan.getPosX(), y = pan.getPosY();
			//booleen qui sert si on avance ou non sur l'axe X
			boolean backX = false;
			//boolee qui sert si on avance ou non sur l'axe Y
			boolean backY = false;
			//Exemple de boucle while
			while(true){
				
				// si la coordonn�e X est inf�rieure � 1 on avance
				if(x < 1)backX=false;
				
				// si la coordonn�e X est sup�rieure � la taille du panneau-la taille du rond, on recule
				if(x>pan.getWidth()-50)backX=true;
				
				//m�me chose pour l'axe Y
				if(y<1)backY=false;
				if(y>pan.getHeight()-50)backY=true;
				
				//si on avance alors on incr�mente
				//if (backX == false)
				if(!backX)
					pan.setPosX(++x);
				//sinon on d�cr�mente
				else
					pan.setPosX(--x);
				
				//idem axe Y
				if(!backY)
					pan.setPosY(++y);
				else
					pan.setPosY(--y);
		
				// instruction de reconstruction (redessiner) de JPanel (rappel de la m�thode paintComponent())
				pan.repaint();
			try{
				//suspendre le traitement (cf. Threads) temps en milliseconde soit 1000 = 1 seconde
				Thread.sleep(5);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			}
		}
		
	}*/
	
	// Version Animation avec bouton lancement et arret = nouvelles variables ... animated...
	private void go(){
			//coordonn�es de d�part de notre rond
			int x = pan.getPosX(), y = pan.getPosY();
		
			while(this.animated){
				
    			// si la coordonn�e X est inf�rieure � 1 on avance
				if(x < 1)backX=false;
				
				// si la coordonn�e X est sup�rieure � la taille du panneau-la taille du rond, on recule
				if(x>pan.getWidth()-50)backX=true;
				
				//m�me chose pour l'axe Y
				if(y<1)backY=false;
				if(y>pan.getHeight()-50)backY=true;
				
				//si on avance alors on incr�mente
				//if (backX == false)
				if(!backX)
					pan.setPosX(++x);
				//sinon on d�cr�mente
				else
					pan.setPosX(--x);
				
				//idem axe Y
				if(!backY)
					pan.setPosY(++y);
				else
					pan.setPosY(--y);
		
				// instruction de reconstruction (redessiner) de JPanel (rappel de la m�thode paintComponent())
				pan.repaint();
			try{
				//suspendre le traitement (cf. Threads) temps en milliseconde soit 1000 = 1 seconde
				Thread.sleep(3);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			}
		
			}	
	
	
	
/*	// Classe interne qui �coute notre premier bouton
	class BoutonListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0){
		animated = true;
		bouton.setEnabled(false);
		bouton2.setEnabled(true);
		go();
		//Red�finition de la m�thode actionPerformed()
		//public void actionPerformed(ActionEvent arg0){
		//	label.setText("Vous avez cliqu� sur le bouton 1");
		}
	}*/
	
	
	// Classe interne qui �coute notre premier bouton, avec des Thread
	public	class BoutonListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0){
		animated = true;
		t = new Thread(new PlayAnimation());
		t.start();
		bouton.setEnabled(false);
		bouton2.setEnabled(true);
		
		//Red�finition de la m�thode actionPerformed()
		//public void actionPerformed(ActionEvent arg0){
		//	label.setText("Vous avez cliqu� sur le bouton 1");
		}
	}
	
	// Classe interne qui �coute le bouton 2
	class Bouton2Listener implements ActionListener{
		//Red�finition de la m�thode actionPerformed()
		public void actionPerformed(ActionEvent e){
			//label.setText("Vous avez cliqu� sur le bouton 2");
			animated=false;
			bouton.setEnabled(true);
			bouton2.setEnabled(false);
			
		}
	}
	
	class PlayAnimation implements Runnable{
		public void run(){
			go();
		}
	}
	
	
	
}
