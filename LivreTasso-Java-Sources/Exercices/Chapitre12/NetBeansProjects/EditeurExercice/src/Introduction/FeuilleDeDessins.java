/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 12 : Créer une interface graphique
#	Section  : Exercice 12.8 à 12.12
#	Fichier  : FeuilleDeDessins.java
#	Class    : FeuilleDeDessins
*/

// Le fichier FeuilleDeDessins.java se trouve dans le répertoire 
// Sources/Exercices/Chapitre12/NetBeansProjects/EditeurExercice/src/Introduction
package Introduction;


import java.awt.Cursor;
import java.awt.Graphics;
import java.util.ArrayList;
public class FeuilleDeDessins extends javax.swing.JPanel {

  private int debutX, debutY, deltaX, deltaY;
  private int couleur=Forme.NOIR;
  private String forme="cercle";
  
  // La propriété principale de la classe : la liste d’affichage listeAdessiner
  private ListeDeFormes listeAdessiner;
  // Le constructeur prend en paramètre la liste des formes créée par l’application Main.
  public FeuilleDeDessins (ListeDeFormes ldf) {
     // Initialiser la liste d’affichage à la liste des objets passé en paramètre du constructeur
     listeAdessiner = ldf;
     // Afficher les composants et leurs gestionnaires d’événements créés dans la fenêtre Design.
     initComponents();
     // Rendre visible la feuille de dessin.
     setVisible(true);
     // Donner une position et une taille à la feuille de dessin.
     setBounds(0, 0,500, 500);
     // Modifier le curseur de la souris, lorsqu’il se trouve sur la feuille de dessin.
     setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR)); 
  }
    
  public void paintComponent (Graphics g)  {
    // L’appel à la méthode paintComponent() de la classe mère permet l’affichage des éventuels autres 
    // composants placés dans le panneau de contenu.
    super.paintComponent(g); 
    // Récupérer toutes les formes placées dans la listeAdessiner
    ArrayList<Forme> tmpListe = listeAdessiner.getListeFormes();
    int nbFormes = tmpListe.size();
    if (nbFormes > 0) {
      // Pour chaque forme contenue dans la liste,
      for (Forme f : tmpListe) {   
        //  dessiner la forme, en utilisant la méthode dessiner() de la classe Cercle ou Rectangle, selon son type. 
        f.dessiner(g);       
      }
    }  else {
        System.out.print("Il n'y a pas de forme dans cette liste ");
    }
  }

  public void setCouleur(int ncol){
        couleur = ncol;
  }
  public void setForme(String nf){
        forme = nf;
  }
         
  public void dessinerLesFormes(ListeDeFormes liste){
      listeAdessiner = liste;
      repaint();    
  }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(254, 254, 254));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 298, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
  private void dessinerUnCercle( ){
   int delta=0;
   int decalageX = 0;
   int decalageY = 0;
   // Si la largeur de la boîte englobante est supérieure à sa hauteur :
   if (Math.abs(deltaX) > Math.abs(deltaY) ) {
   // stocker la largeur de la boîte englobante.
       delta = deltaX;
       // Si le tracé de la boîte s’est effectué  de la droite vers la gauche :
       if (delta < 0) {
           // placer l’origine de la boîte englobante  au coin supérieur gauche du tracé
           decalageX = delta;
          // rendre positif le diamètre
           delta = -delta;
       }
       // Le tracé de la boîte s’est effectué de la gauche vers la droite, il n’y a pas de décalage.
       else   decalageX = 0;   
   }
   // Si la hauteur de la boîte englobante est supérieure à sa largeur
   if (Math.abs(deltaY) > Math.abs(deltaX) ) {
       // stocker la hauteur de la boîte englobante..
       delta = deltaY;
       // Si le tracé de la boîte s’est effectué  du bas vers le haut :
       if (delta < 0) {
            // placer l’origine de la boîte englobante  au coin supérieur gauche du tracé
            decalageY = delta;
            delta = -delta;
       }
       // Le tracé de la boîte s’est effectué du haut vers le bas, il n’y a pas de décalage.
       else decalageY = 0;
   }
   // Créer un cercle avec les valeurs de saisie.
   Cercle c = new Cercle(debutX + decalageX, 
                         debutY + decalageY, delta, couleur );
   // Ajouter le cercle à la liste d’affichage.
   listeAdessiner.ajouterUneForme(c); 
   // Repeindre la fenêtre qui a pour effet d’appeler la méthode paintComponent().
   repaint();
}

  private void dessinerUnRectangle( ){
   // 12.8.a Dessiner un rectangle
   int decalageX = 0;
   int decalageY = 0;
   // Si le tracé de la boîte s’est effectué  de la droite vers la gauche :
   if (deltaX < 0) {
       // placer l’origine de la boîte englobante  au coin supérieur gauche du tracé
       decalageX = deltaX;
       // rendre positif le largeur du rectangle
       deltaX = -deltaX;
   }
   // Le tracé de la boîte s’est effectué de la gauche vers la droite, il n’y a pas de décalage.
   else  decalageX = 0;
   // Si le tracé de la boîte s’est effectué  du bas vers le haut :
   if (deltaY < 0) {
       // placer l’origine de la boîte englobante  au coin supérieur gauche du tracé
        decalageX = deltaX;
        // rendre positif le hauteur du rectangle
        deltaY = -deltaY;
   }
   // Le tracé de la boîte s’est effectué du haut vers le bas, il n’y a pas de décalage.
   else decalageY = 0;
   // Créer un rectangle avec les valeurs de saisie.
   Rectangle r = new Rectangle(debutX + decalageX, debutY+decalageY, deltaX, deltaY, couleur );
   listeAdessiner.ajouterUneForme(r);       
   repaint();
  }


private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
 // Enregistrer les coordonnées de la souris au moment du clic
   debutX = evt.getX();
   debutY = evt.getY();
}//GEN-LAST:event_formMousePressed

private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
   // Enregistrer la distance parcourue par la souris, en x et en y, entre le moment du clic et celui du relâchement.
   deltaX = evt.getX()- debutX;
   deltaY = evt.getY()- debutY; 
   // Si la forme est un cercle, le dessiner.
   if (forme.equals("cercle")){
       dessinerUnCercle();
   }
   // 12.8.b Si la forme est un rectangle, le dessiner.
   else if (forme.equals("rectangle")){
       dessinerUnRectangle();
   }
}//GEN-LAST:event_formMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
