
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class MaFenetreF extends JFrame implements ActionListener, ItemListener,FocusListener{ 
	static public final String[] nomCouleurs= {"rouge", "vert", "jaune", "bleu"} ;
	static public final Color[] couleurs= {Color.red, Color.green, Color.yellow, Color.blue} ;

		public MaFenetreF (){ // gestionnaire par défaut de JFrame = BorderLayout
			setTitle ("FIGURES") ;
			setSize (450, 200) ;
			Container contenu = getContentPane() ;

			/*** panneau pour les dessins ***/
			panDes = new PaneauDessin() ;
			contenu.add(panDes) ;
			panDes.setBackground(Color.cyan) ; // panneau initialement bleu

			/*** panneau pour les commandes ***/ // gestionnaire par défaut de JPanel = FlowLayout
			panCom = new JPanel() ;
			contenu.add (panCom, "South") ;

			/* choix couleur */
			comboCoulFond = new JComboBox (nomCouleurs) ;
			panCom.add(comboCoulFond) ;
			comboCoulFond.addItemListener (this) ;

			/* choix dimensions */
			JLabel dim = new JLabel ("DIMENSIONS") ;
			panCom.add (dim) ;
			txtLargeur = new JTextField ("50", 5) ;
			txtLargeur.addActionListener (this) ;
			txtLargeur.addFocusListener (this) ;
			panCom.add (txtLargeur) ;
			txtHauteur = new JTextField ("20", 5) ;
			panCom.add (txtHauteur) ;
			txtHauteur.addActionListener (this) ;
			txtHauteur.addFocusListener (this) ;

			/* choix formes */
			cOvale = new JCheckBox ("Ovale") ;
			panCom.add (cOvale) ;
			cOvale.addActionListener (this) ;
			cRectangle = new JCheckBox ("Rectangle") ;
			panCom.add (cRectangle) ;
			cRectangle.addActionListener (this) ;
		}
		
		public void actionPerformed (ActionEvent ev){ 
			if (ev.getSource() == txtLargeur) setLargeur() ;
			if (ev.getSource() == txtHauteur) setHauteur() ;
			if (ev.getSource() == cOvale) panDes.setOvale(cOvale.isSelected()) ;
			if (ev.getSource() == cRectangle) panDes.setRectangle(cRectangle.isSelected()) ;
			panDes.repaint() ;
		}
		
		public void focusLost (FocusEvent e){
			if (e.getSource() == txtLargeur){
				setLargeur() ;
				System.out.println ("perte focus largeur") ;
				panDes.repaint() ;
				}
			if (e.getSource() == txtHauteur){
				setHauteur() ;
				panDes.repaint() ;
				}
		}
		
		public void focusGained (FocusEvent e){}

		private void setLargeur(){
			String ch = txtLargeur.getText() ;
			System.out.println ("largeur " + ch) ;
			panDes.setLargeur (Integer.parseInt(ch)) ; // on convertir la chaine saisie dans largeur en Integer
		}
		
		private void setHauteur(){
			String ch = txtHauteur.getText() ;
			System.out.println ("hauteur " + ch) ;
			panDes.setHauteur (Integer.parseInt(ch)) ;
		}
		
		public void itemStateChanged(ItemEvent e){
			String couleur = (String)comboCoulFond.getSelectedItem() ;
			panDes.setCouleur (couleur) ;
		}

		private PaneauDessin panDes ;
		private JPanel panCom ;
		private JComboBox comboCoulFond ;
		private JTextField txtLargeur, txtHauteur ;
		private JCheckBox cOvale, cRectangle ;
}

class PaneauDessin extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g) ;
			if (ovale) g.drawOval (10, 10, 10 + largeur, 10 + hauteur) ;
			if (rectangle) g.drawRect (10, 10, 10 + largeur, 10 + hauteur) ;
	}
	
	public void setRectangle(boolean b) { rectangle = b ; }
	
	public void setOvale(boolean b) { ovale = b ; }
	
	public void setLargeur (int l) { largeur = l ; }

	public void setHauteur (int h) { hauteur = h ; }

	public void setCouleur (String c){
		for (int i = 0 ; i<MaFenetreF.nomCouleurs.length ; i++)
			if (c == MaFenetreF.nomCouleurs[i]) setBackground (MaFenetreF.couleurs[i]) ;
	}
	
	// déclaration+initialisation pas de dessins et taille 50*50
	private boolean rectangle = false, ovale = false ;
	private int largeur=50, hauteur=50 ;
}

public class Formes{ 
	public static void main (String args[]){ 
		MaFenetreF fenFormes = new MaFenetreF() ;
		fenFormes.setVisible(true) ;
	}
}
