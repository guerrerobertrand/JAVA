package projet16_TP_Calculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
   
public class Calculatrice extends JFrame {
  
   private JPanel container = new JPanel();
   
   //Tableau sotckant les éléments à afficher dans la calculatrice
   
   String[] tab_string = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                     ".", "=", "C", "+", "-", "*", "/"};
   // Un bouton par élément du tableau
   JButton[] tab_button = new JButton[tab_string.length];

   // Affichage
   private JLabel ecran = new JLabel();

   private Dimension dim = new Dimension(50, 40);
   private Dimension dim2 = new Dimension(50, 31);
   
   // Résultat calculs
   private double chiffre1;
   
   // Booléen si opérateur sélectionné
   private boolean clicOperateur = false, update = false;
   private String operateur = "";
    
   public Calculatrice(){
      this.setSize(240, 260);
      this.setTitle("Calculette");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      this.setResizable(false);
      // on initialise le conteneur (container) et tous ses composants
      initComposant();
      // on ajoute le conteneur
      this.setContentPane(container);
      this.setVisible(true);
   }
         

   private void initComposant(){
	   // définition de police
      Font police = new Font("Arial", Font.BOLD, 20);
      ecran = new JLabel("0");
      ecran.setFont(police);
      // aligenement à droite du JLabel
      ecran.setHorizontalAlignment(JLabel.RIGHT);
      ecran.setPreferredSize(new Dimension(220, 20));
      JPanel operateur = new JPanel();       
      operateur.setPreferredSize(new Dimension(55, 225));
      JPanel chiffre = new JPanel();
      chiffre.setPreferredSize(new Dimension(165, 225));
      JPanel panEcran = new JPanel();
      panEcran.setPreferredSize(new Dimension(220, 30));
 
      // Parcourt du tableau pour créer nos boutons
      for(int i = 0; i < tab_string.length; i++){
         tab_button[i] = new JButton(tab_string[i]);
         tab_button[i].setPreferredSize(dim);
         // pour chaque élément de bouton qui n'est pas un chiffre (=, C, +, -, *, /) on définit le comportement grâce à un listener
         switch(i){
            case 11 :
               tab_button[i].addActionListener(new EgalListener());
               chiffre.add(tab_button[i]);
               break;
            case 12 :
               tab_button[i].setForeground(Color.red);
               tab_button[i].addActionListener(new ResetListener());
               operateur.add(tab_button[i]);
               break;
            case 13 :
               tab_button[i].addActionListener(new PlusListener());
               tab_button[i].setPreferredSize(dim2);
               operateur.add(tab_button[i]);
               break;
            case 14 :
               tab_button[i].addActionListener(new MoinsListener());
               tab_button[i].setPreferredSize(dim2);
               operateur.add(tab_button[i]);
               break;  
           case 15 :   
               tab_button[i].addActionListener(new MultiListener());
               tab_button[i].setPreferredSize(dim2);
               operateur.add(tab_button[i]);
               break;
            case 16 :
               tab_button[i].addActionListener(new DivListener());
               tab_button[i].setPreferredSize(dim2);
               operateur.add(tab_button[i]);
               break;
               // par défaut, ce sont les premiers éléments du tableau donc des chiffres, on affecte le bon listener
            default :
               chiffre.add(tab_button[i]);
               tab_button[i].addActionListener(new ChiffreListener());
               break;
         }
      }
      panEcran.add(ecran);
      panEcran.setBorder(BorderFactory.createLineBorder(Color.black));
      container.add(panEcran, BorderLayout.NORTH);
      container.add(chiffre, BorderLayout.CENTER);
      container.add(operateur, BorderLayout.EAST);
   }
         // Méthode permettant d'effectuer le bon calcul selon l'opérateur choisi
   private void calcul(){
      if(operateur.equals("+")){
         chiffre1 = chiffre1 +
                  Double.valueOf(ecran.getText()).doubleValue();
         ecran.setText(String.valueOf(chiffre1));
      }
      if(operateur.equals("-")){
         chiffre1 = chiffre1 -
                  Double.valueOf(ecran.getText()).doubleValue();
         ecran.setText(String.valueOf(chiffre1));
      }              
      if(operateur.equals("*")){
         chiffre1 = chiffre1 *
                  Double.valueOf(ecran.getText()).doubleValue();
         ecran.setText(String.valueOf(chiffre1));
      }      
      if(operateur.equals("/")){
         try{
            chiffre1 = chiffre1 /
               Double.valueOf(ecran.getText()).doubleValue();
               ecran.setText(String.valueOf(chiffre1));
         }catch(ArithmeticException e){
            ecran.setText("0");
         }
      }
   }
         // Listener utilisé pour les chiffres
   		//Permet de stocker les chiffres et les afficher
   class ChiffreListener implements ActionListener{
	   public void actionPerformed(ActionEvent e) {
         //On affiche le chiffre en plus dans le label
         String str = ((JButton)e.getSource()).getText();
         if(update){
            update = false;
         }
         else{
            if(!ecran.getText().equals("0"))
               str = ecran.getText() + str;
         }
         ecran.setText(str);
      }
   }
  //Listener affecté au bouton =
   class EgalListener implements ActionListener{
      public void actionPerformed(ActionEvent arg0) {
         calcul();
         update = true;
         clicOperateur = false;
      }
   }
   //Listener affecté au bouton +         
   class PlusListener implements ActionListener{
      public void actionPerformed(ActionEvent arg0) {
         if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
         }
         else{
            chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
            clicOperateur = true;
         }
         operateur = "+";
         update = true;
      }
   }
   //Listener affecté au bouton -
   class MoinsListener implements ActionListener{
      public void actionPerformed(ActionEvent arg0) {
         if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
         }
         else{
            chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
            clicOperateur = true;
         }
         operateur = "-";
         update = true;
      }
   }
   //Listener affecté au bouton *
   class MultiListener implements ActionListener{
      public void actionPerformed(ActionEvent arg0) {
         if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
         }
         else{
            chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
            clicOperateur = true;
         }
         operateur = "*";
         update = true;
      }
   }
   //Listener affecté au bouton /
   class DivListener implements ActionListener{
      public void actionPerformed(ActionEvent arg0) {
         if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
         }
         else{
            chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
            clicOperateur = true;
         }
         operateur = "/";
         update = true;
      }
   }
   //Listener affecté au bouton C
   class ResetListener implements ActionListener{
      public void actionPerformed(ActionEvent arg0) {
         clicOperateur = false;
         update = true;
         chiffre1 = 0;
         operateur = "";
         ecran.setText("");
      }
   }       
}