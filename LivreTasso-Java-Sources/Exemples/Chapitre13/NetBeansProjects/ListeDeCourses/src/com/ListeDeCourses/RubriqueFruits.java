/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 13 : Développer une application Android
#	Section  : L’application « Liste de courses »
#	Fichier  : RubriqueFruits.java
#	Class    : RubriqueFruits
*/

// Le fichier RubriqueFruis.java se trouve dans le répertoire 
// Sources/Exemples/Chapitre13/NetBeansProjects/ListeDeCourses/src/com/ListeDeCourses;
package com.ListeDeCourses;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class RubriqueFruits extends Activity implements View.OnClickListener{
    
    // Déclaration d’objets de type CheckBox comme variables de classe
    private CheckBox chkBanane, chkCerise, chkFraise, chkKiwi;
    private Button btnSave;
   
    
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fruits);
    //  Associer les CheckBox définies dans le fichier fruits.xml avec les variables de classe
    String listeFruits = lireListeFruits();
    
    chkBanane = (CheckBox) findViewById(R.id.banane);
    chkCerise = (CheckBox) findViewById(R.id.cerise);
    chkFraise = (CheckBox) findViewById(R.id.fraise);
    chkKiwi = (CheckBox) findViewById(R.id.kiwi);  
    
    majCheckBox(listeFruits);
    btnSave = (Button) findViewById(R.id.Save);
    // Mettre en place d’un écouteur d’événements sur le bouton Enregistrer
    btnSave.setOnClickListener(this);   
    }
    // 
    public void majCheckBox(String tmp){
      // Créer un objet st qui détecte des champs de mots et des séparateurs "+"
      StringTokenizer st = new StringTokenizer(tmp,"+");
      int i=0;
      String mot[] = new String[st.countTokens()];
      // Tant qu’il y a des champs séparés par des "+"
      while (st.hasMoreTokens()) {
          // Enregistrer le champs courant dans le tableau mot à l’indice i
         mot[i] = st.nextToken();
         // Si mot[i] vaut "banane", cocher la case correspondante 
         if (mot[i].equals("banane")){
            chkBanane.setChecked(true); 
         }
         // Si mot[i] vaut "fraise", cocher la case correspondante 
         else if (mot[i].equals("fraise")){
            chkFraise.setChecked(true); 
         }
         // Si mot[i] vaut "cerise", cocher la case correspondante 
         else if (mot[i].equals("cerise")){
            chkCerise.setChecked(true); 
         }
         // Si mot[i] vaut "kiwi", cocher la case correspondante 
         else if (mot[i].equals("kiwi")){
            chkKiwi.setChecked(true); 
         }
         i++;
      }
        
    }
     // Lorsqu’on clique sur le bouton Enregistrer
     public void onClick(View v) {
        Toast toaster;
        String msg="";
        // Traiter l’état des CheckBox 
        if (chkFraise.isChecked())
            msg+="fraise+";
        if (chkBanane.isChecked())
            msg+="banane+";
        if (chkCerise.isChecked())
            msg+="cerise+";   
        if (chkKiwi.isChecked())
            msg+="kiwi+";
        // Afficher un message éphémère s’il n’est pas vide
        if (!msg.equals("")){
          String msgToast = msg.replace("+", " ");
          toaster = Toast.makeText(this, msgToast, Toast.LENGTH_LONG);
          toaster.show();
        }
        // Mémoriser les fruits sélectionnés
        ecrireListeFruits(msg); 
        // Fermer l’activité en cours 
        fermerLesFruits();
     }
     
     public void ecrireListeFruits(String tmp) { 
        FileOutputStream fos;
        try {
             fos = openFileOutput("Fruits.txt", Context.MODE_PRIVATE);
             Log.i("-----------  Fichier : ", getFilesDir().toString());
             fos.write(tmp.getBytes());        
             fos.close();
        }
        catch (IOException ex){
             Log.i("-----------  Fichier : ", "Erreur d'écriture ...");
        }
       
     }
     
    public String lireListeFruits() {
        FileInputStream fis;
        String  data="";
        try {
            fis= openFileInput("Fruits.txt");
            char[] charLus = new char[255];
            InputStreamReader isr = new InputStreamReader(fis);
            isr.read(charLus);
            data = new String(charLus);
            fis.close();
        }
        catch (IOException ex){
             Log.i("-----------  Fichier : ", "Erreur de lecture ...");
        }
        return data;
     }
     public void fermerLesFruits(){
         this.finish();
     }
}
