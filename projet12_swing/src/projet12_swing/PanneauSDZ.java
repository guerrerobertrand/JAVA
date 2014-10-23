package projet12_swing;

import java.awt.Color;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Image;
import java.io.File;
import java.io.IOException;



public class PanneauSDZ extends JPanel{

	public PanneauSDZ(){
		
	
	//Définition de la couleur de fond
	this.setBackground(Color.ORANGE);
	//On prévient notre JFrame que notre JPanel sera son ContentPane
	//this.setContentPane(pan);
	}
	
	public void paintComponent(Graphics g){
		//On voit cette phrase à chaque fois que la méthode est invoquée
		//System.out.println("J'execute paintComponent");
		
		int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;
				
		g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
		
		try{
			Image img = ImageIO.read(new File ("/Users/bertrand/Downloads/images.jpg"));
			//Pour une image dans ses propres dimensions
			//g.drawImage(img, 0, 0, this);
			
			//Pour une image de fond
			g.drawImage(img,0,0,this.getWidth(), this.getHeight(), this);
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
}
