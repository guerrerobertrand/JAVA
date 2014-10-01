/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 13 : Développer une application Android
#	Section  : Exercice
#	Fichier  : Main.java
#	Class    : Main
*/

// Le fichier Main.java se trouve dans le répertoire 
// Sources/Exercice/Chapitre13/NetBeansProjects/ListeDeCoursesAvecLegumes/src/android/PremierProjet
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
     private static final int FRUIT=0;
     private static final int LEGUME=1;
     private static final int LAITIER=2;
     private static final int BOULANGERIE=3;
     private static final int POISSONNERIE=4;
     private static final int BOUCHERIE=5;
     private static final int CHARCUTERIE=6;
     private static final int ENTRETIEN=7;
    
    public  Button [] listeBoutons = new Button[8];
    
  
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);
        
        listeBoutons[FRUIT]=((Button)this.findViewById(R.id.fruit)); 
        listeBoutons[LEGUME]=((Button)this.findViewById(R.id.legume));
        listeBoutons[LAITIER]=((Button)this.findViewById(R.id.laitier));
        listeBoutons[BOULANGERIE]=((Button)this.findViewById(R.id.boulangerie));
        listeBoutons[POISSONNERIE]=((Button)this.findViewById(R.id.poissonnerie)); 
        listeBoutons[BOUCHERIE]=((Button)this.findViewById(R.id.boucherie));
        listeBoutons[CHARCUTERIE]=((Button)this.findViewById(R.id.charcuterie));
        listeBoutons[ENTRETIEN]=((Button)this.findViewById(R.id.entretien));
       
        
        for (int i=0; i < listeBoutons.length; i++) {
            listeBoutons[i].setOnClickListener(this);
        }
       
    }

    public void onClick(View v) {
       String msg="";
       int activite=FRUIT;
    
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
       Toast  msgT  = Toast.makeText(this, msg, Toast.LENGTH_SHORT);   
       msgT .show();
       creerActivite(activite);
    }
    
    public void creerActivite(int tmp){
        Intent nvActivite;
         switch (tmp) {
           case FRUIT :
               nvActivite = new Intent(Main.this, RubriqueFruits.class);
               startActivityForResult(nvActivite, FRUIT);
               break;
         // 13.6.a Créez la nouvelle activité RubriqueLegumes.
         case LEGUME :
               nvActivite = new Intent(Main.this, RubriqueLegumes.class);
               startActivityForResult(nvActivite, LEGUME);
               break;
         }
    }
}
