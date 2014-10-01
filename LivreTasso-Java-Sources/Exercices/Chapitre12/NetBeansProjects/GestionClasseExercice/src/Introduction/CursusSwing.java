/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Exercice 12.4 à 12.7
#	Fichier  : ClasseSwing.java
#	Class    : ClasseSwing
*/

// Le fichier ClasseSwing.java se trouve dans le répertoire 
// Sources/Exercices/Chapitre12/NetBeansProjects/GestionClasseExercice/src/Introduction
package Introduction;

import java.io.File;
import javax.swing.JFileChooser;

public class CursusSwing extends javax.swing.JFrame {
    // Initialiser la photo par défaut à celle d'une silhouette
    // Modifier l'url d'accès au fichier Inconnu.jpg selon votre système d'exploitation
    // Les photos se trouvent dans le répertoire 
    // Sources/Exemples/Chapitre12/NetBeansProjects/GestionClasseExemple/Photos
    private String urlPhoto="/Users/VotreCompte/Photos/Inconnu.jpg";
    private String periode ;
    private String [] listeMatieres;

    // 12.6.a  Gestion du survol de la JComboBox, déclaration et initialisation du drapeau
    private boolean etatComboBox = false; 

    
     // 12.4.d   La propriété choixAction est initialisée à "Creer"
     private String choixAction="Creer";
    
    public CursusSwing() {
        initComponents();
         this.setBounds(100, 100, 450, 500);
         // 12.4.c  Ajouter les boutons au groupe groupeRadioBtn
        groupeBtn.add(creerRadioBtn);
        groupeBtn.add(modifierRadioBtn);
        groupeBtn.add(supprimerRadioBtn);
        // 12.4.c  Le bouton creerRadioBtn est sélectionné par défaut
        creerRadioBtn.setSelected(true);
        info.setText("  Créer : Tous les champs doivent être renseignés !");
     
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
        PanelTitre = new javax.swing.JPanel();
        labelTitre = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        creerRadioBtn = new javax.swing.JRadioButton();
        modifierRadioBtn = new javax.swing.JRadioButton();
        supprimerRadioBtn = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        labelPrenom = new javax.swing.JLabel();
        labelPeriode = new javax.swing.JLabel();
        choixPeriode = new javax.swing.JComboBox();
        nomAsaisir = new javax.swing.JTextField();
        prenomAsaisir = new javax.swing.JTextField();
        labelPhoto = new javax.swing.JLabel();
        rechercherBtn = new javax.swing.JButton();
        labelNom = new javax.swing.JLabel();
        validerBtn = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        fermerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion des Etudiants");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        labelTitre.setFont(new java.awt.Font("Arial", 0, 18));
        labelTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitre.setText("Étudiant  ");

        org.jdesktop.layout.GroupLayout PanelTitreLayout = new org.jdesktop.layout.GroupLayout(PanelTitre);
        PanelTitre.setLayout(PanelTitreLayout);
        PanelTitreLayout.setHorizontalGroup(
            PanelTitreLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PanelTitreLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .add(labelTitre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 197, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(55, 55, 55))
        );
        PanelTitreLayout.setVerticalGroup(
            PanelTitreLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PanelTitreLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .add(labelTitre)
                .addContainerGap())
        );

        creerRadioBtn.setText("Créer");
        creerRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creerRadioBtnActionPerformed(evt);
            }
        });
        creerRadioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creerRadioBtnMouseEntered(evt);
            }
        });

        modifierRadioBtn.setSelected(true);
        modifierRadioBtn.setText("Modifier");
        modifierRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierRadioBtnActionPerformed(evt);
            }
        });
        modifierRadioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifierRadioBtnMouseEntered(evt);
            }
        });

        supprimerRadioBtn.setText("Supprimer");
        supprimerRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerRadioBtnActionPerformed(evt);
            }
        });
        supprimerRadioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supprimerRadioBtnMouseEntered(evt);
            }
        });

        org.jdesktop.layout.GroupLayout PanelMenuLayout = new org.jdesktop.layout.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .add(creerRadioBtn)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 80, Short.MAX_VALUE)
                .add(modifierRadioBtn)
                .add(45, 45, 45)
                .add(supprimerRadioBtn)
                .add(38, 38, 38))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PanelMenuLayout.createSequentialGroup()
                .add(PanelMenuLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(creerRadioBtn)
                    .add(supprimerRadioBtn)
                    .add(modifierRadioBtn))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelPrenom.setText("Prénom :");

        labelPeriode.setText("Période :");

        choixPeriode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quel semestre ?", "Semestre 1", "Semestre 2", "Semestre 3", "Semestre 4" }));
        choixPeriode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixPeriodeActionPerformed(evt);
            }
        });
        choixPeriode.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                choixPeriodePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                choixPeriodePopupMenuWillBecomeVisible(evt);
            }
        });

        nomAsaisir.setDragEnabled(false);
        nomAsaisir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nomAsaisirMouseEntered(evt);
            }
        });

        prenomAsaisir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prenomAsaisirMouseEntered(evt);
            }
        });

        labelPhoto.setText("Photo :");

        rechercherBtn.setText("Rechercher");
        rechercherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherBtnActionPerformed(evt);
            }
        });
        rechercherBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rechercherBtnMouseEntered(evt);
            }
        });

        labelNom.setText("Nom :");

        validerBtn.setText("Valider");
        validerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerBtnActionPerformed(evt);
            }
        });
        validerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                validerBtnMouseEntered(evt);
            }
        });

        info.setBackground(new java.awt.Color(250, 250, 250));
        info.setFont(new java.awt.Font("Arial", 2, 13));
        info.setForeground(new java.awt.Color(120, 120, 120));
        info.setText(" info :");
        info.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        info.setOpaque(true);

        fermerBtn.setText("Fermer");
        fermerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerBtnActionPerformed(evt);
            }
        });
        fermerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fermerBtnMouseEntered(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(PanelTitre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .add(jSeparator2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .add(PanelMenu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
            .add(info, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .add(86, 86, 86)
                .add(validerBtn)
                .add(73, 73, 73)
                .add(fermerBtn)
                .addContainerGap(140, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(35, 35, 35)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(labelPrenom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 79, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelPeriode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelPhoto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labelNom, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(nomAsaisir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 166, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prenomAsaisir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(rechercherBtn)
                    .add(choixPeriode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 193, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(PanelTitre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(3, 3, 3)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(PanelMenu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(2, 2, 2)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(42, 42, 42)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(107, 107, 107)
                        .add(rechercherBtn))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(nomAsaisir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(labelNom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prenomAsaisir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(choixPeriode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(36, 36, 36)
                        .add(labelPrenom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(labelPeriode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(labelPhoto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 63, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(validerBtn)
                    .add(fermerBtn))
                .add(18, 18, 18)
                .add(info, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void creerRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creerRadioBtnActionPerformed
    // 12.4.e La propriété choixAction est initialisée à "Creer"
    choixAction = "Creer";  
}//GEN-LAST:event_creerRadioBtnActionPerformed

private void choixPeriodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choixPeriodeActionPerformed
  // Récupérer le semestre sélectionné
  periode = (String) choixPeriode.getSelectedItem();
  // Rechercher la liste des matières en fonction du semestre
  rechercherMatiere(periode);
}//GEN-LAST:event_choixPeriodeActionPerformed

private void rechercherMatiere(String quelSemestre){    
  Fichier fichierTxt = new Fichier(); 
  listeMatieres = new String [5];
  String [] tousLesmots = new String[6];
   // Modifier l'url d'accès au fichier Inconnu.jpg selon votre système d'exploitation
  // Le fichier Ressources.txt se trouve dans le répertoire 
  // Sources/Exemples/Chapitre12/NetBeansProjects/GestionClasseExemple/Ressources
  if (fichierTxt.ouvrir("/Users/VotreCompte/Ressources/Ressources.txt", "R")){
      // Voir chapitre 10, corrigé de l'exercice 10.5
      do {
        tousLesmots = fichierTxt.lire();
        if (tousLesmots[0].equalsIgnoreCase(quelSemestre)){
         for (int i=1; i < tousLesmots.length; i++){
            listeMatieres[i-1] = tousLesmots[i]; 
         }
         break;
      }
    } while (tousLesmots[0]!= null);
    fichierTxt.fermer();
  }
}
private void rechercherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherBtnActionPerformed
    File fichierPhoto;
  // Création d’un composant JFileChooser 
  JFileChooser fichierArechercher= new JFileChooser();
  //  Ouvrir une boite de dialogue qui permet la recherche d’un fichier
  int etatRetour = fichierArechercher.showOpenDialog(CursusSwing.this);
  //  Si l’utilisateur a sélectionné un fichier
  if (etatRetour == JFileChooser.APPROVE_OPTION) {
    //  Récupérer le fichier sélectionné
    fichierPhoto = fichierArechercher.getSelectedFile();
    //  Stocker le chemin d’accès au fichier dans urlPhoto
    urlPhoto  = fichierPhoto.toString();
  } 
}//GEN-LAST:event_rechercherBtnActionPerformed

private void validerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerBtnActionPerformed
    // 12.4.f Tester l'action à réaliser
    String nom = nomAsaisir.getText();
    String prenom = prenomAsaisir.getText();
    if (choixAction.equalsIgnoreCase("Creer")){
      creerUnEtudiant (nom, prenom) ;
     }
    else if (choixAction.equals("Modifier")){
      modifierUnEtudiant(nom, prenom);
     }
    else if (choixAction.equals("Supprimer")){
      supprimerUnEtudiant(nom, prenom);
    }
}//GEN-LAST:event_validerBtnActionPerformed
// 12.4.f fonction creerUnEtudiant()
private void creerUnEtudiant(String nn, String np){
    double [] moyenne = new double[listeMatieres.length];
    for (int i=0; i < moyenne.length; i++) moyenne[i]=0;
    Etudiant eleve = new Etudiant(nn, np, urlPhoto, listeMatieres, periode, moyenne);
    BulletinNotes bn = new BulletinNotes(eleve);
    
}
// 12.4.f fonction supprimerUnEtudiant()
private void supprimerUnEtudiant(String nn, String np){
    // Lire la liste des étudiants dans le fichier objet 
    Cursus C = new Cursus();
    FichierEtudiant F = new FichierEtudiant();
    F.ouvrir("R");
    C = F.lire();
    F.fermer();
     // C.afficheLesEtudiants();
    Message msg; 
    String text =  nn+ " " + np;
    // Supprimer l'étudiant selon son nom et son prénom
    if( C.supprimeUnEtudiant(nn, np)) {
        // 12.7.e Si l'étudiant est supprimé l'indiquer par une boite de dialogue
        msg = new Message("L'etudiant(e) " ,text," a été supprimé(e) de la classe ");
    }
    // 12.7.e Si l'étudiant n'est pas supprimé l'indiquer par une boite de dialogue
    else msg = new Message("L'etudiant(e) " ,text, "est inconnu(e) !");
    // Enregistrer la suppression
    F.ouvrir("W"); 
    F.ecrire(C);
    F.fermer(); 
}
private void modifierUnEtudiant(String nn, String np){
    // Lire la liste des étudiants dans le fichier objet 
    Cursus C = new Cursus();
    FichierEtudiant F = new FichierEtudiant();
    F.ouvrir("R");
    C = F.lire();
    F.fermer();
    //  C.afficheLesEtudiants();
    // Rechercher l'étudiant par son nom et son prénom 
    Etudiant eleve = C.rechercheUnEtudiant(nn, np) ;
   
    if( eleve != null) {
        // Si l'étudiant existe, afficher son bulletin de notes
        BulletinNotes bn = new BulletinNotes(eleve);
        // Supprimer l'étdudiant de la liste et enregistrer cette supression
        C.supprimeUnEtudiant(nn, np);
        F.ouvrir("W"); 
        F.ecrire(C);
        F.fermer();
        eleve=null;
        // L'étdudiant sera à nouveau enregistré par le bouton enregistré du bulletin de notes
    }       
    else {
        // 12.7.e Si l'étudiant n'existe pas l'indiquer par une boite de dialogue
        Message msg;
        String text =  nn+ " " + np;
        msg = new Message("L'etudiant(e) " ,text, "est inconnu(e) !");
    }
}
private void modifierRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierRadioBtnActionPerformed
      // 12.4.e La propriété choixAction est initialisée à "Modifier"
      choixAction = "Modifier";
}//GEN-LAST:event_modifierRadioBtnActionPerformed

private void supprimerRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerRadioBtnActionPerformed
    // 12.4.e La propriété choixAction est initialisée à "Supprimer"
    choixAction = "Supprimer";
    
}//GEN-LAST:event_supprimerRadioBtnActionPerformed

private void fermerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerBtnActionPerformed
     // Cesser l'exécution de l'application
    System.exit(0);
}//GEN-LAST:event_fermerBtnActionPerformed

private void modifierRadioBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierRadioBtnMouseEntered
    // 12.5 Aide contextuelle
    // 12.6.c Gestion du survol de la JComboBox
    if(etatComboBox){
        info.setText("  Info : Choisir la période de validation des notes");
    }
    else info.setText("  Modifier un étudiant, vous devez connaître son nom et son prénom");
}//GEN-LAST:event_modifierRadioBtnMouseEntered

private void nomAsaisirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomAsaisirMouseEntered
    // 12.5 Aide contextuelle
    // 12.6.c Gestion du survol de la JComboBox
    if(etatComboBox){
        info.setText("  Info : Choisir la période de validation des notes");
    }
    else info.setText("  Info : Entrer le nom de l'étudiant ");
}//GEN-LAST:event_nomAsaisirMouseEntered

private void prenomAsaisirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prenomAsaisirMouseEntered
    // 12.5 Aide contextuelle
    // 12.6.c Gestion du survol de la JComboBox
    if(etatComboBox){
        info.setText("  Info : Choisir la période de validation des notes");
    }
    else info.setText("  Info : Entrer le prénom de l'étudiant ");
}//GEN-LAST:event_prenomAsaisirMouseEntered

private void rechercherBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercherBtnMouseEntered
    // 12.5 Aide contextuelle
    // 12.6.c Gestion du survol de la JComboBox
    if(etatComboBox){
        info.setText("  Info : Choisir la période de de validation des notes");
    }
    else info.setText("  Info : Choisir la photo de l'étudiant ");
}//GEN-LAST:event_rechercherBtnMouseEntered

private void validerBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validerBtnMouseEntered
    // 12.5 Aide contextuelle
    // 12.6.c Gestion du survol de la JComboBox
    if(etatComboBox){
        info.setText("  Info : Choisir la période de validation des notes");
    }
    else info.setText("  Info : Afficher le bulletin de notes de l'étudiant ");
}//GEN-LAST:event_validerBtnMouseEntered

private void fermerBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerBtnMouseEntered
    // 12.5 Aide contextuelle
    // 12.6.c Gestion du survol de la JComboBox
    if(etatComboBox){
        info.setText("  Info : Choisir la période de validation des notes");
    }
    else  info.setText("  Info : Quitter l'application ");
}//GEN-LAST:event_fermerBtnMouseEntered

private void creerRadioBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creerRadioBtnMouseEntered
     // 12.5 Aide contextuelle
    // 12.6c Gestion du survol de la JComboBox
    if(etatComboBox){
        info.setText("  Info : Choisir la période de validation des notes");
    }
    else  info.setText("  Créer : Tous les champs doivent être renseignés !");
}//GEN-LAST:event_creerRadioBtnMouseEntered

private void supprimerRadioBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerRadioBtnMouseEntered
    // 12.5 Aide contextuelle
    // 12.6.c Gestion du survol de la JComboBox
    if(etatComboBox){
        info.setText("  Info : Choisir la période de validation des notes");
    }
    else info.setText("  Supprimer un étudiant, vous devez connaître son nom et son prénom ");
}//GEN-LAST:event_supprimerRadioBtnMouseEntered

private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
    // 12.5 Aide contextuelle
    // 12.6.c Gestion du survol de la JComboBox
    if(etatComboBox){
        info.setText("  Info : Choisir la période de validation des notes");
    }
    else info.setText("  Info : Tous les champs doivent être renseignés !");
}//GEN-LAST:event_formMouseEntered

private void choixPeriodePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_choixPeriodePopupMenuWillBecomeInvisible
    // 12.6.c Gestion du survol de la JComboBox
    etatComboBox = false;
    info.setText("  Info : Tous les champs doivent être renseignés !");
}//GEN-LAST:event_choixPeriodePopupMenuWillBecomeInvisible

private void choixPeriodePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_choixPeriodePopupMenuWillBecomeVisible
    // 12.6.b Gestion du survol de la JComboBox
    etatComboBox = true;
    info.setText("  Info : Choisir la période de validation des notes");
}//GEN-LAST:event_choixPeriodePopupMenuWillBecomeVisible



    /**q
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursusSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelTitre;
    private javax.swing.JComboBox choixPeriode;
    private javax.swing.JRadioButton creerRadioBtn;
    private javax.swing.JButton fermerBtn;
    private javax.swing.ButtonGroup groupeBtn;
    private javax.swing.JLabel info;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelNom;
    private javax.swing.JLabel labelPeriode;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JLabel labelPrenom;
    private javax.swing.JLabel labelTitre;
    private javax.swing.JRadioButton modifierRadioBtn;
    private javax.swing.JTextField nomAsaisir;
    private javax.swing.JTextField prenomAsaisir;
    private javax.swing.JButton rechercherBtn;
    private javax.swing.JRadioButton supprimerRadioBtn;
    private javax.swing.JButton validerBtn;
    // End of variables declaration//GEN-END:variables

       

}
