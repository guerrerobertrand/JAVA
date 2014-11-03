package projet20_JOptionPane;

import javax.swing.JOptionPane;

public class Classe1_Chapitre27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JOptionPane jop1, jop2, jop3;
		
		
		//Bo”te d'information
		jop1=new JOptionPane();
		jop1.showMessageDialog(null, "Message d'information", "Information", JOptionPane.INFORMATION_MESSAGE);
		//Bo”te d'avertissement
		jop2=new JOptionPane();
		jop2.showMessageDialog(null, "Message d'avertissement", "Attention", JOptionPane.WARNING_MESSAGE);
		//Bo”te d'erreur
		jop3=new JOptionPane();
		jop3.showMessageDialog(null, "Message d'erreur", "Erreur", JOptionPane.ERROR_MESSAGE);
		
	}

}
