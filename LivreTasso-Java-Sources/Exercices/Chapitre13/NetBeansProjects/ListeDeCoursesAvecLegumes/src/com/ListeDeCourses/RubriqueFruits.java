/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 13 : Développer une application Android
#	Section  : Exercice
#	Fichier  : RubriqueFruit.java
#	Class    : RubriqueFruit
*/

// Le fichier RubriqueLegume.java se trouve dans le répertoire 
// Sources/Exercice/Chapitre13/NetBeansProjects/ListeDeCoursesAvecLegumes/src/android/PremierProjet

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

/**
 *
 * @author  AnneT
 */
public class RubriqueFruits extends Activity implements View.OnClickListener{
    
    private CheckBox chkBanane, chkCerise, chkFraise, chkKiwi;
    private Button btnSave;
   
    
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fruits);
    String listeFruits = lireListeFruits();
    
    chkBanane = (CheckBox) findViewById(R.id.banane);
    chkCerise = (CheckBox) findViewById(R.id.cerise);
    chkFraise = (CheckBox) findViewById(R.id.fraise);
    chkKiwi = (CheckBox) findViewById(R.id.kiwi);  
    
    rechercherFruits(listeFruits);
    btnSave = (Button) findViewById(R.id.SaveFruit);
    btnSave.setOnClickListener(this); ;
  
    }
    
    public void rechercherFruits(String tmp){
      StringTokenizer st = new StringTokenizer(tmp,"+");
      int i=0;
      String mot[] = new String[st.countTokens()];
      while (st.hasMoreTokens()) {
         mot[i] = st.nextToken();
         if (mot[i].equals("banane")){
            chkBanane.setChecked(true); 
         }
         else if (mot[i].equals("fraise")){
            chkFraise.setChecked(true); 
         }
         else if (mot[i].equals("cerise")){
            chkCerise.setChecked(true); 
         }
         else if (mot[i].equals("kiwi")){
            chkKiwi.setChecked(true); 
         }
         i++;
      }
        
    }
    
     public void onClick(View v) {
        Toast toaster;
        String msg="";

        if (chkFraise.isChecked())
            msg+="fraise+";
        if (chkBanane.isChecked())
            msg+="banane+";
        if (chkCerise.isChecked())
            msg+="cerise+";   
        if (chkKiwi.isChecked())
            msg+="kiwi+";
        if (!msg.equals("")){
          String msgToast = msg.replace("+", " ");
          toaster = Toast.makeText(this, msgToast, Toast.LENGTH_LONG);
          toaster.show();
        }
        ecrireListeFruits(msg);  
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
