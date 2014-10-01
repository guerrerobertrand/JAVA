/*
#	Le livre de Java 1er langage
#	A. Tasso
#	Chapitre 13 : Développer une application Android
#	Section  : Bonjour le monde : votre première application mobile !
#	Fichier  : Main.java
#	Class    : Main
*/

// Le fichier Main.java se trouve dans le répertoire 
// Sources/Exemples/Chapitre13/NetBeansProjects/BonjourLeMonde/src/android/PremierProjet

package android.PremierProjet;

import android.app.Activity;
import android.os.Bundle;
// La classe Main hérite de la classe Activity
public class Main extends Activity
{
    // La méthode onCreate() est appelée à la création de l’application
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Afficher le layout défini au sein du fichier Resources/layout/main.xml
        setContentView(R.layout.main);
    }
}
