package projet19_swing_formulaire;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FenetreK extends JFrame {

	
	private JPanel container = new JPanel();
	private JTextField jtf;
	private JLabel label = new JLabel("T�l�phone FR ");
	private JButton b = new JButton("OK");
	
	public FenetreK(){
		setTitle("Fenetre KeyListener");
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		
		
		jtf = new JTextField();
		JPanel top = new JPanel();
		
		Font police = new Font("Arial", Font.BOLD,14);
		jtf.setFont(police);
		jtf.setPreferredSize(new Dimension(150,30));
		jtf.setForeground(Color.BLUE);
		//On ajout l'�couteur � notre composant
		jtf.addKeyListener(new ClavierListener());
				
		top.add(label);
		top.add(b);
		top.add(jtf);
		
		setContentPane(top);
		
		
	}
	
	class ClavierListener implements KeyListener{
		public void keyPressed(KeyEvent event){
			System.out.println("Code touche press�e : "+event.getKeyCode()+" - caract�re : "+event.getKeyChar());
			pause();
		}
		public void keyReleased(KeyEvent event){
			System.out.println("Code touche rel�ch�e : "+event.getKeyCode()+" - caract�re : "+event.getKeyChar());
			pause();
		}
		public void keyTyped(KeyEvent event){
			System.out.println("Code touche tap�e : "+event.getKeyCode()+" - caract�re : "+event.getKeyChar());
			pause();
		}
	}
	
	private void pause(){
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FenetreK fenK = new FenetreK();
		fenK.setVisible(true);
		
	}

}
