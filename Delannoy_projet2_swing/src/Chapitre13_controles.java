import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;


public class Chapitre13_controles {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FenetreL fenL = new FenetreL();
		fenL.setVisible(true);
		
	}

}

/*//JCheckBox
class FenetreL extends JFrame implements ActionListener{

	public FenetreL(){
		setTitle("Exemple de controleurs");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		
		coche1=new JCheckBox("case 1");
		contenu.add(coche1);
		coche1.addActionListener(this);
		
		coche2=new JCheckBox("case 2");
		contenu.add(coche2);
		coche2.addActionListener(this);
		
		Etat=new JButton("Etat");
		contenu.add(Etat);
		Etat.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ev){
		Object source = ev.getSource();
		if(source == coche1) System.out.println("Action sur la case 1");
		if(source == coche2) System.out.println("Action sur la case 2");
		if(source == Etat) System.out.println("Etats des 2 CASES : " + coche1.isSelected()+" et "+coche2.isSelected());
	}
	
	private JCheckBox coche1, coche2;
	private JButton Etat;
}
*/
/*// JRadioButton avec ActionListener
class FenetreL extends JFrame implements ActionListener{

	public FenetreL(){
		setTitle("Exemple de boutons radio");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		
		ButtonGroup groupe = new ButtonGroup();
		radio1 = new JRadioButton("Radio1", true);
		groupe.add(radio1);
		contenu.add(radio1);
		radio1.addActionListener(this);
		
		radio2 = new JRadioButton("Radio2"); // équivaut à new JRadioButton("Radio2", false);
		groupe.add(radio2);
		contenu.add(radio2);
		radio2.addActionListener(this);
		
		radio3 = new JRadioButton("Radio3");
		groupe.add(radio3);
		contenu.add(radio3);
		radio3.addActionListener(this);
		
		Etat=new JButton("Etat");
		contenu.add(Etat);
		Etat.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ev){
		Object source = ev.getSource();
		if(source == radio1) System.out.println("Action sur radio1");
		if(source == radio2) System.out.println("Action sur radio2");
		if(source == radio3) System.out.println("Action sur radio3");
		if(source == Etat) System.out.println("Etats des RADIOS : " + radio1.isSelected()+" et "+radio2.isSelected()+" et "+radio3.isSelected());
	}
	
	private JRadioButton radio1, radio2, radio3;
	private JButton Etat;
}

*/

/*//JRadioButton avec ActionListener et ItemListener
class FenetreL extends JFrame implements ActionListener, ItemListener{

	public FenetreL(){
		setTitle("Exemple de boutons radio");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		
		ButtonGroup groupe = new ButtonGroup();
		radio1 = new JRadioButton("Radio1", true);
		groupe.add(radio1);
		contenu.add(radio1);
		radio1.addActionListener(this);
		radio1.addItemListener(this);
		
		radio2 = new JRadioButton("Radio2"); // équivaut à new JRadioButton("Radio2", false);
		groupe.add(radio2);
		contenu.add(radio2);
		radio2.addActionListener(this);
		radio2.addItemListener(this);
		
		radio3 = new JRadioButton("Radio3");
		groupe.add(radio3);
		contenu.add(radio3);
		radio3.addActionListener(this);
		radio3.addItemListener(this);
		
		Etat=new JButton("Etat");
		contenu.add(Etat);
		Etat.addActionListener(this);
		

		
	}
	
	public void actionPerformed(ActionEvent ev){
		Object source = ev.getSource();
		if(source == radio1) System.out.println("Action sur radio1");
		if(source == radio2) System.out.println("Action sur radio2");
		if(source == radio3) System.out.println("Action sur radio3");
		if(source == Etat) System.out.println("Etats des RADIOS : " + radio1.isSelected()+" et "+radio2.isSelected()+" et "+radio3.isSelected());
	}
	
	public void itemStateChanged(ItemEvent ev){
		Object source = ev.getSource();
		if(source == radio1) System.out.println("changement radio1");
		if(source == radio2) System.out.println("changement radio2");
		if(source == radio3) System.out.println("changement radio3");
	}
	
	private JRadioButton radio1, radio2, radio3;
	private JButton Etat;

	
}
*/

/*//JLabel

class FenetreL extends JFrame implements ActionListener{

	public FenetreL(){
		setTitle("Exemple de labels");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		
		//JLabel
		boutonC= new JButton("COMPTEUR");
		boutonC.addActionListener(this);
		contenu.add(boutonC);

		nbClics=0;
		compte=new JLabel("nombre de clics sur COMPTEUR = "+nbClics);
		contenu.add(compte);

		
	}
	
	public void actionPerformed(ActionEvent ev){

		nbClics++;
		compte.setText("nombre de clics sur COMPTEUR = "+nbClics);
		
	}
	
	
	private JButton boutonC;
	private int nbClics;
	private JLabel compte;

	
}
*/

/*//JTextField
class FenetreL extends JFrame implements ActionListener{

	public FenetreL(){
		setTitle("Exemple de champs de saisie");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		
		saisie = new JTextField(20);
		contenu.add(saisie);
		saisie.addActionListener(this);

		boutonC=new JButton("COPIER");
		contenu.add(boutonC);
		boutonC.addActionListener(this);
		
		copie= new JTextField(20);
		copie.setEditable(false);
		contenu.add(copie);
	}
	
	public void actionPerformed(ActionEvent ev){
		if(ev.getSource()==boutonC){
			String texte = saisie.getText();
			copie.setText(texte);
		}
	}
	
	private JButton boutonC;
	private JTextField saisie, copie;
	private JLabel compte;
}*/

/*//JTextField plus élaboré avec validation, perte de focus,...
class FenetreL extends JFrame implements ActionListener, FocusListener{

	public FenetreL(){
		setTitle("Exemple de champs de saisie");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
		
		saisie = new JTextField(20);
		contenu.add(saisie);
		saisie.addActionListener(this);
		saisie.addFocusListener(this);
				
		copie= new JTextField(20);
		copie.setEditable(false);
		copie.setBackground(Color.gray);
		contenu.add(copie);
	}
	
	public void actionPerformed(ActionEvent ev){
		System.out.println("validation de la saisie");
			String texte = saisie.getText();
			copie.setText(texte);
	}
	
	public void focusLost(FocusEvent ev){
		System.out.println("perte focus saisie");
			String texte = saisie.getText();
			copie.setText(texte);
	}
	
	public void focusGained(FocusEvent ev){
		System.out.println("focus sur saisie");
	}
	
	private JTextField saisie, copie;
	private JLabel compte;
}*/

/*// JList (boîte de liste)

class FenetreL extends JFrame implements ListSelectionListener{

	public FenetreL(){
		setTitle("Exemple de champs de saisie");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
	
		liste = new JList(couleurs);
		contenu.add(liste);
		liste.addListSelectionListener(this);

	}
	
	public void valueChanged(ListSelectionEvent ev){
	if(!ev.getValueIsAdjusting()){
		System.out.println("**Action Liste - valeurs sélectionnées :");
		Object[] valeurs = liste.getSelectedValues();
		for(int i=0; i<valeurs.length; i++)
			System.out.println((String) valeurs[i]);
	}
	
	}
	
	private JList liste;
	private String[] couleurs ={"rouge", "bleu", "gris","vert","jaune","noir"};
}
*/

/*//JComboBox (boîte de liste combinée non éditable)

class FenetreL extends JFrame implements ActionListener, ItemListener{

	public FenetreL(){
		setTitle("Exemple de combo box non éditable");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
	
		combo = new JComboBox(couleurs);
		contenu.add(combo);
		combo.addActionListener(this);
		combo.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ev){
			System.out.println("item combo : ");
			Object valeur=combo.getSelectedItem();
			System.out.println((String)valeur);
	}
	
	public void actionPerformed(ActionEvent ev){
		System.out.println("action combo : ");
		Object valeur=combo.getSelectedItem();
		System.out.println((String)valeur);
	}
	
	private JComboBox combo;
	private String[] couleurs ={"rouge", "bleu", "gris","vert","jaune","noir"};
}*/

//JComboBox (boîte de liste combinée éditable: sélection, ajout, suppression,...)

class FenetreL extends JFrame implements ActionListener{

	public FenetreL(){
		setTitle("Exemple de combo box éditable");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());
	
		combo = new JComboBox(couleurs);
		combo.setEditable(true);
		combo.setMaximumRowCount(6);
		contenu.add(combo);
		combo.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ev){
		System.out.println("action combo - ");
		Object valeur=combo.getSelectedItem();
		int rang = combo.getSelectedIndex();
		if(rang == -1){
			System.out.println("saisie d'une nouvelle valeur : "+valeur);
			combo.addItem(valeur);
		}
		else
			System.out.println("sélection d'une valeur existante : "+valeur+" de rang : "+rang);
	}
	
	private JComboBox combo;
	private String[] couleurs ={"rouge", "bleu", "gris","vert","jaune","noir"};
}

