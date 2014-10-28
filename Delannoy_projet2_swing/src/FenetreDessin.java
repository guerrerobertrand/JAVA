import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FenetreDessin extends JFrame implements ActionListener{
		public FenetreDessin() // constructeur de fenêtre
			{
			setTitle ("Exemple d'appel Repaint");
			setSize (300, 200);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			panneau = new PanneauD();
			getContentPane().add(panneau);
			panneau.setBackground(Color.white);
			
			Container contenu = getContentPane();
			contenu.add(panneau);
			
			//Création du bouton "Rectangle"
			rectangle = new JButton("Rectangle");
			contenu.add(rectangle,"North");
			rectangle.addActionListener(this);	
			
			//Création du bouton "Ovale"
			ovale= new JButton("Ovale");
			contenu.add(ovale, "South");
			ovale.addActionListener(this);
			}

		public void actionPerformed(ActionEvent ev){
			if(ev.getSource()==rectangle)
				panneau.setRectangle();
			if(ev.getSource()==ovale)
				panneau.setOvale();
			panneau.repaint(); // force la peinture dès maintenant
		}
		
		private PanneauD panneau;
		private JButton ovale, rectangle;
		
		class PanneauD extends JPanel{

			public void setRectangle(){
				rectangle = true;
				ovale= false;
			}
			
			public void setOvale(){
				rectangle=false;
				ovale=true;
			}
			
			public void paintComponent(Graphics g){
				super.paintComponent(g);
				if(ovale) g.drawOval(80,20,120,60);
				if(rectangle) g.drawRect(80,20,120,60);
			}
			
			private boolean rectangle=false, ovale=false;
		}

}
