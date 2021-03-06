/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Projet
#	Fichier  : Main.java
#	Class    : Main
*/

// Le fichier Main.java se trouve dans le répertoire 
// Sources/Projet/Chapitre12/NetBeansProjects/ProjetChapitre12/src/Projet

package Projet;

import javax.swing.ImageIcon;

public class Main extends javax.swing.JFrame {
     // Définition des propriétés
     String choixAction = "Creer";
     String numeroCompte = " " ;
 

    public Main() {
        initComponents();
        this.setBounds(100, 100,500, 600);
        // Affichage d'une image en fond de fenêtre
        ImageIcon iconPhoto = new ImageIcon("Ressources/FondMain.png");
        photoFond.setIcon(iconPhoto);
        
        // Créer un groupe de boutons
        creerGroupeBox();
      
        
    }
    private void creerGroupeBox() {   
         groupeBtn.add(creerRdBtn);
         groupeBtn.add(modifierRdBtn);
         groupeBtn.add(editerRdBtn);
         creerRdBtn.setSelected(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupeBtn = new javax.swing.ButtonGroup();
        photoFond = new javax.swing.JLabel();
        grandeBoite = new javax.swing.JPanel();
        boiteMenu = new javax.swing.JPanel();
        creerRdBtn = new javax.swing.JRadioButton();
        modifierRdBtn = new javax.swing.JRadioButton();
        editerRdBtn = new javax.swing.JRadioButton();
        boiteSaisie = new javax.swing.JPanel();
        numeroAsaisir = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        barreMenu = new javax.swing.JMenuBar();
        menuMichier = new javax.swing.JMenu();
        quitter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de comptes bancaires");
        setBackground(new java.awt.Color(190, 190, 190));
        setResizable(false);

        photoFond.setText("photoDuFond");
        photoFond.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        photoFond.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(photoFond, java.awt.BorderLayout.CENTER);

        boiteMenu.setBorder(javax.swing.BorderFactory.createTitledBorder("   Comptes   "));

        creerRdBtn.setText("Créer");
        creerRdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creerRdBtnActionPerformed(evt);
            }
        });

        modifierRdBtn.setText("Ajouter une ligne comptable");
        modifierRdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierRdBtnActionPerformed(evt);
            }
        });

        editerRdBtn.setText("Éditer");
        editerRdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editerRdBtnActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout boiteMenuLayout = new org.jdesktop.layout.GroupLayout(boiteMenu);
        boiteMenu.setLayout(boiteMenuLayout);
        boiteMenuLayout.setHorizontalGroup(
            boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(boiteMenuLayout.createSequentialGroup()
                .add(100, 100, 100)
                .add(boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(editerRdBtn)
                    .add(creerRdBtn)
                    .add(modifierRdBtn))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        boiteMenuLayout.setVerticalGroup(
            boiteMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(boiteMenuLayout.createSequentialGroup()
                .add(12, 12, 12)
                .add(creerRdBtn)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(modifierRdBtn)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(editerRdBtn)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        boiteSaisie.setBorder(javax.swing.BorderFactory.createTitledBorder("  Numéro :   "));

        numeroAsaisir.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout boiteSaisieLayout = new org.jdesktop.layout.GroupLayout(boiteSaisie);
        boiteSaisie.setLayout(boiteSaisieLayout);
        boiteSaisieLayout.setHorizontalGroup(
            boiteSaisieLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(boiteSaisieLayout.createSequentialGroup()
                .add(95, 95, 95)
                .add(numeroAsaisir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(86, 86, 86)
                .add(btnOK)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        boiteSaisieLayout.setVerticalGroup(
            boiteSaisieLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(boiteSaisieLayout.createSequentialGroup()
                .add(boiteSaisieLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(numeroAsaisir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnOK))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout grandeBoiteLayout = new org.jdesktop.layout.GroupLayout(grandeBoite);
        grandeBoite.setLayout(grandeBoiteLayout);
        grandeBoiteLayout.setHorizontalGroup(
            grandeBoiteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(grandeBoiteLayout.createSequentialGroup()
                .addContainerGap()
                .add(grandeBoiteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(grandeBoiteLayout.createSequentialGroup()
                        .add(0, 0, 0)
                        .add(boiteSaisie, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(boiteMenu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        grandeBoiteLayout.setVerticalGroup(
            grandeBoiteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, grandeBoiteLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(boiteMenu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(boiteSaisie, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(grandeBoite, java.awt.BorderLayout.PAGE_START);

        menuMichier.setText("Fichier");

        quitter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        quitter.setText("Quitter");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });
        menuMichier.add(quitter);

        barreMenu.add(menuMichier);

        setJMenuBar(barreMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void modifierRdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierRdBtnActionPerformed
    // Initialiser l'action à "Modifier"
    choixAction = "Modifier";
}//GEN-LAST:event_modifierRdBtnActionPerformed

private void creerRdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creerRdBtnActionPerformed
    // Initialiser l'action à "Creer"
    choixAction = "Creer";
}//GEN-LAST:event_creerRdBtnActionPerformed

private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
    // Récupérer le numéro du compte
    numeroCompte = numeroAsaisir.getText();
    // Si l'action est "Creer"
    if(choixAction.equals("Creer")){
        // Ouvrir la boite de dialogue CompteDaliogue
        new CompteDialogue(numeroCompte);
        
    }
    // Si l'action est "Modifier"
    else  if(choixAction.equals("Modifier")){
        // Lire le fichier associé au compte
        FichierCompte fc = new FichierCompte();
        if (fc.ouvrir("Comptes/"+numeroCompte+".dat","R")) {
            // Si le fichier existe, stocker les informations lues dans un objet unCompte
           Compte unCompte = fc.lire();
           fc.fermer();
           // Ouvrir la boite de dialogue LigneDialogue en passant en paramètre les informations lues
           new LigneDialogue(unCompte);
        }
        // Si le fichier n'existe pas, afficher un message d'alerte
        else new Message("Le compte : ", numeroCompte , " n'existe pas");
    }
    // Si l'action est "Editer"
    else  if(choixAction.equals("Editer")){
        // Lire le fichier associé au compte
        FichierCompte fc = new FichierCompte();
        if (fc.ouvrir("Comptes/"+numeroCompte+".dat","R")){
           // Si le fichier existe, stocker les informations lues dans un objet unCompte
          Compte unCompte = fc.lire();
          fc.fermer();
          // Ouvrir la boite de dialogue CompteEdit en passant en paramètre les informations lues
          new CompteEdit(unCompte);
        }
        // Si le fichier n'existe pas, afficher un message d'alerte
        else new Message("Le compte : ", numeroCompte , " n'existe pas");  
    }
    
}//GEN-LAST:event_btnOKActionPerformed

private void editerRdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editerRdBtnActionPerformed
    // Initialiser l'action à "Modifier"
    choixAction = "Editer";
}//GEN-LAST:event_editerRdBtnActionPerformed

private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
// Quitter l'application
    System.exit(0);
}//GEN-LAST:event_quitterActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barreMenu;
    private javax.swing.JPanel boiteMenu;
    private javax.swing.JPanel boiteSaisie;
    private javax.swing.JButton btnOK;
    private javax.swing.JRadioButton creerRdBtn;
    private javax.swing.JRadioButton editerRdBtn;
    private javax.swing.JPanel grandeBoite;
    private javax.swing.ButtonGroup groupeBtn;
    private javax.swing.JMenu menuMichier;
    private javax.swing.JRadioButton modifierRdBtn;
    private javax.swing.JTextField numeroAsaisir;
    private javax.swing.JLabel photoFond;
    private javax.swing.JMenuItem quitter;
    // End of variables declaration//GEN-END:variables

}
