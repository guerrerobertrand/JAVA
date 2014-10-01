/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre13 : Développer une application Android
#	Section  : Exercice
#	Fichier  : Main.java
#	Class    : Main
*/

// Le fichier Main.java se trouve dans le répertoire 
// Sources/Exercice/Chapitre13/NetBeansProjects/Exercice13_1/src/android/PremierProjet

package android.PremierProjet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
// a. La classe Main implémente l’écouteur OnClickListener.
public class Main extends Activity implements OnClickListener
{
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // b.	Dans la méthode onCreate(), créez un bouton calculerBtn 
        //      l’associer au bouton calculer défini dans le fichier main.xml. 
        Button calculBtn=((Button)this.findViewById(R.id.calculer));
        // c.	Ajouter un écouteur d’événement sur le bouton calculerBtn.  
        calculBtn.setOnClickListener(this);
    }
    
     public void onClick(View v) {
       EditText texteIn =((EditText)this.findViewById(R.id.valeur));
       // d. Récupérer la valeur du périmètre
       String texte = texteIn.getText().toString();
       // e. Stockez le résultat dans une variable nommée perimetre de type double
       double rayon = Double.parseDouble(texte);
       float perimetre = (float) (Math.PI*2*rayon);
       // f. Créez un texte d’affichage (TextView resultatText) 
       //    l’associer au texte d’affichage resultat défini dans le fichier main.xml. 
       TextView resulatText = ((TextView)this.findViewById(R.id.resultat));
       // g. Afficher la valeur du périmètre en appliquant la méthode setText() à l’objet resultatText 
       resulatText.setText("Perimetre : " + perimetre);
       
       
    }
}
