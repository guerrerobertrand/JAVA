package projet13_animation;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class PanneauA extends JPanel {

	private int posX = -50;
	private int posY = -50;
	
	public void paintComponent(Graphics g){
		
		//couleur de fond pour le rectangle
		g.setColor(Color.white);
		//On dessine le rectangle sur tout le fond de la fenêtre cela permet de redessiner le fond en blanc à chaque tour de boucle
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		//définition de la couleur pour le rond
		g.setColor(Color.red);
		//dessin du rond aux coordonnées souhaitées
		g.fillOval(posX, posY, 50, 50);
	}

	public int getPosX(){
		return posX;
	}
	
	public int getPosY(){
		return posY;
	}
	
	public void setPosX(int posX){
		this.posX=posX;
	}
	public void setPosY(int posY){
		this.posY=posY;
	}
	
}
