/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 13 : Développer une application Android
#	Section  : Exercices
#	Fichier  : Main.java
#	Class    : Main
*/

// Le fichier Main.java se trouve dans le répertoire 
// Sources/Exemples/Chapitre13/NetBeansProjects/ListeDeCourses/src/com/ListeDeCourses;
package com.ListeDeCourses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity implements OnClickListener
{
     // Définir des constantes pour distinguer les rubriques
     private static final int FRUIT=0;
     private static final int LEGUME=1;
     private static final int LAITIER=2;
     private static final int BOULANGERIE=3;
     private static final int POISSONNERIE=4;
     private static final int BOUCHERIE=5;
     private static final int CHARCUTERIE=6;
     private static final int ENTRETIEN=7;
     // Les boutons sont stockés dans un tableau
     public  Button [] listeBoutons = new Button[8];
    
  
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Afficher les composants graphiques définis dans le fichier Resources/layout/accueil.xml 
        setContentView(R.layout.accueil);
         // Stocker les boutons dans le tableau en fonction de l’id défini dans le fichier Resources/layout/accueil.xml 
        listeBoutons[FRUIT]=((Button)this.findViewById(R.id.fruit)); 
        listeBoutons[LEGUME]=((Button)this.findViewById(R.id.legume));
        listeBoutons[LAITIER]=((Button)this.findViewById(R.id.laitier));
        listeBoutons[BOULANGERIE]=((Button)this.findViewById(R.id.boulangerie));
        listeBoutons[POISSONNERIE]=((Button)this.findViewById(R.id.poissonnerie)); 
        listeBoutons[BOUCHERIE]=((Button)this.findViewById(R.id.boucherie));
        listeBoutons[CHARCUTERIE]=((Button)this.findViewById(R.id.charcuterie));
        listeBoutons[ENTRETIEN]=((Button)this.findViewById(R.id.entretien));
       
        // Chaque bouton écoute l’événement onClick
        for (int i=0; i < listeBoutons.length; i++) {
            listeBoutons[i].setOnClickListener(this);
        }
       
    }
    // Action à réaliser lorsqu’un événement onClick est entendu
    public void onClick(View v) {
       String msg="";
       int activite=FRUIT;
       // tester l’identifiant de l’objet ayant capturer l’événement onClick et agir en conséquence
       switch (v.getId()) {
           case R.id.fruit :
               msg="Choisir des fruits";
               activite=FRUIT;
               break;
           case R.id.legume :
               msg="Choisir des légumes";
               activite=LEGUME;
               break;
           case R.id.laitier :
               msg="Choisir des produits laitiers";
               activite=LAITIER;
               break;
           case R.id.boulangerie :
               msg="Choisir dans la boulangerie";
               activite=BOULANGERIE;
               break;
           case R.id.poissonnerie:
               msg="Choisir dans la poissonnerie";
               activite=POISSONNERIE;
               break;
           case R.id.boucherie : 
               msg="Choisir dans la boucherie";
               activite=BOUCHERIE;
               break;
           case R.id.charcuterie :
               msg="Choisir dans la charcuterie";      
               activite=CHARCUTERIE;
               break;
           case R.id.entretien :
               msg="Choisir des produits d'entretien";
               activite=ENTRETIEN;
               break; 
       }
       // Afficher le message correspondant au bouton sélectionné
       Toast  msgT  = Toast.makeText(this, msg, Toast.LENGTH_SHORT);   
       msgT .show();
       // Créer une nouvelle activité en fonction de la rubrique sélectionnée
       creerActivite(activite);
    }
    //  Créer une activité en fonction de la valeur passée en paramètre
    public void creerActivite(int tmp){
        Intent nvActivite;
         switch (tmp) {
           case FRUIT :
               // Création de l’Intent 
               nvActivite = new Intent(Main.this, RubriqueFruits.class);
               startActivityForResult(nvActivite, FRUIT);
               break;
         }
    }
}
