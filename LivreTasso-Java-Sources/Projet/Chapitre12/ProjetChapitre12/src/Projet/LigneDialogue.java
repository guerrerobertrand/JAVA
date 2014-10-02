/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Projet
#	Fichier  : LigneDialogue.java
#	Class    : LigneDialogue
*/

// Le fichier LigneDialogue.java se trouve dans le répertoire 
// Sources/Projet/Chapitre12/NetBeansProjects/ProjetChapitre12/src/Projet

package Projet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class LigneDialogue extends javax.swing.JFrame {
 // Définition des propriétés
 private String motif="Divers", transaction="C.B.";
 private Compte compte;

    public LigneDialogue(Compte cpt) {
        initComponents(); 
        compte = cpt;
        // Afficher le type, le numéro et le solde du compte dans le cadre du composant
        Border cadre = BorderFactory.createTitledBorder("   Compte " +  cpt.getType()+ "  n°  " + cpt.getNumero()+ "  : " +  cpt.getSolde()+ " Euros  ");
        boiteMenu.setBorder(cadre);
       
        setBounds(200, 320,500, 485);
        setVisible(true);
         // Afficher d'une image en fond de fenêtre
        ImageIcon iconPhoto = new ImageIcon("Ressources/FondCompte.png");
        photoFond.setIcon(iconPhoto);
       
    }
    
   


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boiteMenu = new javax.swing.JPanel();
        valeurAsaisir = new javax.swing.JTextField();
        debitBtn = new javax.swing.JButton();
        labelSolde = new javax.swing.JLabel();
        labelEuros = new javax.swing.JLabel();
        creditBtn = new javax.swing.JButton();
        choixMotif = new javax.swing.JComboBox();
        choixTransaction = new javax.swing.JComboBox();
        labelTransaction = new javax.swing.JLabel();
        labelMotif = new javax.swing.JLabel();
        photoFond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Créer une ligne comptable");
        setBackground(new java.awt.Color(190, 190, 190));
        setResizable(false);

        boiteMenu.setBorder(javax.swing.BorderFactory.createTitledBorder("   Ligne comptable   "));

        valeurAsaisir.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valeurAsaisir.setText("0.0");

        debitBtn.setText("Débit");
        debitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitBtnActionPerformed(evt);
            }
        });

        labelSolde.setText("Valeur :");

        labelEuros.setText("Euros");

        creditBtn.setText("Crédit");
        creditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditBtnActionPerformed(evt);
            }
        });

        choixMotif.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choisir ...", "Salaire", "Loyer", "Alimentation", "Énergie", "Taxes", "Divers" }));
        choixMotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixMotifActionPerformed(evt);
            }
        });

        choixTransaction.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choisir ...", "C.B.", "Virement", "Chèque" }));
        choixTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixTransactionActionPerformed(evt);
            }
        });

        labelTransaction.setText("Transaction :");

        labelMotif.setText("Motif : ");

        org.jdesktop.layout.GroupLayout boiteMenuLayout = new org.jdesktop.layout.GroupLayout(boiteMenu);
        boiteMenu.setLayout(boiteMenuLayout);
        boiteMenuLayout.setHorizontalGroup(
            boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(boiteMenuLayout.createSequentialGroup()
                .addContainerGap()
                .add(boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(boiteMenuLayout.createSequentialGroup()
                        .add(labelSolde)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(valeurAsaisir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(labelEuros))
                    .add(boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, boiteMenuLayout.createSequentialGroup()
                            .add(debitBtn)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(creditBtn))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, boiteMenuLayout.createSequentialGroup()
                            .add(boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(labelTransaction)
                                .add(labelMotif))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(choixTransaction, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(choixMotif, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        boiteMenuLayout.setVerticalGroup(
            boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(boiteMenuLayout.createSequentialGroup()
                .addContainerGap()
                .add(boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(labelSolde)
                    .add(labelEuros)
                    .add(valeurAsaisir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelMotif)
                    .add(choixMotif, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labelTransaction)
                    .add(choixTransaction, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 31, Short.MAX_VALUE)
                .add(boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(debitBtn)
                    .add(creditBtn))
                .add(27, 27, 27))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(131, 131, 131)
                        .add(photoFond))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(boiteMenu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(boiteMenu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(photoFond)
                .addContainerGap(533, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void debitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitBtnActionPerformed
    // Récupérer la valeur du montant de la transaction
    // Le montant devient négatif
    double valeur =  - Double.parseDouble(valeurAsaisir.getText());
    // Créer un objet de type LigneComptable
    LigneComptable tmp = new LigneComptable(valeur, motif, transaction);
    // Modifier la propriété ligne du compte en cours de traitement
     compte.setLigne(tmp);
     //compte.afficher();
     // Enregistrer le compte dans un fichier objet dont le nom porte le numéro du compte
     FichierCompte fc = new FichierCompte();
     fc.ouvrir("Comptes/"+compte.getNumero()+".dat","W");
     fc.ecrire(compte);
     fc.fermer();
     // Fermer la fenêtre en cours sans quitter l’application
     this.dispose();

}//GEN-LAST:event_debitBtnActionPerformed

private void creditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditBtnActionPerformed
    // Récupérer la valeur du montant de la transaction
    double valeur =  Double.parseDouble(valeurAsaisir.getText());
    // Créer un objet de type LigneComptable
    LigneComptable tmp = new LigneComptable(valeur, motif, transaction);
    // Modifier la propriété ligne du compte en cours de traitement
    compte.setLigne(tmp);
    // compte.afficher();
    // Enregistrer le compte dans un fichier objet dont le nom porte le numéro du compte
    FichierCompte fc = new FichierCompte();
    fc.ouvrir("Comptes/"+compte.getNumero()+".dat","W");
    fc.ecrire(compte);
    fc.fermer();
    // Fermer la fenêtre en cours sans quitter l’application
    this.dispose();
}//GEN-LAST:event_creditBtnActionPerformed

private void choixMotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choixMotifActionPerformed
// TODO add your handling code here:
    motif = (String)choixMotif.getSelectedItem();
}//GEN-LAST:event_choixMotifActionPerformed

private void choixTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choixTransactionActionPerformed
// TODO add your handling code here:
    transaction = (String)choixTransaction.getSelectedItem();
}//GEN-LAST:event_choixTransactionActionPerformed

    /**
    * @param args the command line arguments
    */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boiteMenu;
    private javax.swing.JComboBox choixMotif;
    private javax.swing.JComboBox choixTransaction;
    private javax.swing.JButton creditBtn;
    private javax.swing.JButton debitBtn;
    private javax.swing.JLabel labelEuros;
    private javax.swing.JLabel labelMotif;
    private javax.swing.JLabel labelSolde;
    private javax.swing.JLabel labelTransaction;
    private javax.swing.JLabel photoFond;
    private javax.swing.JTextField valeurAsaisir;
    // End of variables declaration//GEN-END:variables

}