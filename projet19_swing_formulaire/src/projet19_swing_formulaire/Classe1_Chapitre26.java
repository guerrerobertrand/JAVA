package projet19_swing_formulaire;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

/*import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;*/

public class Classe1_Chapitre26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JComboBox
		//FenetreF fenF = new FenetreF();
		//fenF.setVisible(true);
		
		// JCheckBox : Cases à cocher
		//FenetreG fenG = new FenetreG();
		//fenG.setVisible(true);
		
		// JRadioButton
		//FenetreH fenH = new FenetreH();
		//fenH.setVisible(true);

		// JTextField et JFormattedTextField
		FenetreI fenI = new FenetreI();
		fenI.setVisible(true);

		/*// Vérifier l'intégrité des données utilisateur:
		- tester chaque numéro
		- tester la saisie entière
		- vérifier le type de chaque caractère
		- utiliser une expression régulère
		- empêcher la saisie d'un type de caractère (caractères spéciaux)
						
		 */	
		}

}

/*
class FenetreF extends JFrame{
	private JPanel container = new JPanel();
	private JComboBox combo = new JComboBox();
	private JLabel label = new JLabel("Une ComboBox");
	
	public FenetreF(){
		setTitle("Animation");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		
		// Personnalisation de la combo box
		
		// Ajout d'élements solution 1
		combo.addItem("Option 1");
		combo.addItem("Option 2");
		combo.addItem("Option 3");
		combo.addItem("Option 4");

		// Ajout d'élements solution 2 = le Tableau
		String[] tab={"Option 1","Option 2","Option 3","Option 4"}; 
		combo = new JComboBox(tab);
		
		//Ajout du Listener
		combo.addItemListener(new ItemState());
		combo.addActionListener(new ItemAction());
		combo.setPreferredSize(new Dimension(100, 20));
		combo.setForeground(Color.blue);
		
		JPanel top = new JPanel();
		top.add(label);
		top.add(combo);
		container.add(top, BorderLayout.NORTH);
		setContentPane(container);
		
		}
	//Classe interne implémentant l'interface ItemListener
	class ItemState implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			System.out.println("évènement déclenché sur : "+e.getItem());
		}
	}
	
	class ItemAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("Action Listener : action sur "+combo.getSelectedItem());
		}
	}
	
}*/

/*class FenetreH extends JFrame{
	private JPanel container = new JPanel();
	private JRadioButton jr1 = new JRadioButton("Radio 1");
	private JRadioButton jr2 = new JRadioButton("Radio 2");
	
	//Groupe de boutons
	private ButtonGroup bg = new ButtonGroup();
	
	public FenetreH(){
		setTitle("Animation");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		
		//Ajout de 2 Listener
		jr1.setSelected(true);
		jr1.addActionListener(new StateListener());
		jr2.addActionListener(new StateListener());

		//on ajoute les boutons au groupe
		bg.add(jr1);
		bg.add(jr2);
		
		JPanel top = new JPanel();
		top.add(jr1);
		top.add(jr2);
		container.add(top, BorderLayout.NORTH);
		setContentPane(container);
		
		}
	
	
	class StateListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("source : "+((JRadioButton)e.getSource()).getText()+" - état : "+((JRadioButton)e.getSource()).isSelected());
		}
	}
}*/


class FenetreI extends JFrame{
	
	private JPanel container = new JPanel();
	private JFormattedTextField jtf= new JFormattedTextField(NumberFormat.getIntegerInstance());
	private JFormattedTextField jtf2= new JFormattedTextField();
	private JLabel label = new JLabel("Un JTextField formatté");
	private JButton bouton = new JButton("OK");
	
	
	
	public FenetreI(){
		
		setTitle("Fenêtre I");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 150);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		JPanel top = new JPanel();
		Font police = new Font("Arial", Font.BOLD, 14);
		jtf.setFont(police);
		jtf.setPreferredSize(new Dimension(150,30));
		bouton.addActionListener(new BoutonListener());
		top.add(label);
		top.add(bouton);
		top.add(jtf);

		setContentPane(top);
		
		try{
			MaskFormatter tel = new MaskFormatter("## ## ## ## ##");
			JFormattedTextField jtf2= new JFormattedTextField(tel);	
			}catch (ParseException e){
				e.printStackTrace();
			}
		jtf2.setFont(police);
		jtf2.setPreferredSize(new Dimension(150,30));
		top.add(jtf2);
		
		
	}
	
	class BoutonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("TEXT : jtf "+jtf.getText());
			System.out.println("TEXT : jtf2 "+jtf2.getText());
		}
	}
	
	
}