package projet_Javadoc;
//package fr.dworkin.sdz.javadoc;

/**
 * <b>SDZLevel est un type �num�r� "type-safe".</b>
 * <p>
 * Il existe cinq types de membres sur le Site du Z�ro :
 * <ul>
 * <li>Membre</li>
 * <li>Newser</li>
 * <li>Validateur</li>
 * <li>Mod�rateur</li>
 * <li>Administrateur</li>
 * </ul>
 * </p>
 * <p>
 * <b>Note : </b>Cette �num�ration a �t� modifi�e il y a un mois pour rajouter le niveau "Newser"
 * </p>
 * 
 * @author dworkin, zozor
 * @version 3.1
 */
public enum SDZLevel {

        /**
         * L'�num�ration des niveaux
         * 
         * <p>Note : le niveau newser a �t� rajout� en 2007
         * 
         * @since 2007
         */
        ZERO ("Z�ro", 0),
        NEWSER ("Newser", 1),
        VALIDATEUR ("Validateur", 2),
        MODERATEUR ("Mod�rateur", 3),
        ADMIN ("Administrateur", 4);
        
        /**
         * Le nom du "level"
         */
        private String nom;
        
        /**
         * La valeur du "level"
         */
        private int valeur;
        
        /**
         * Constructeur SDZLevel.
         * 
         * @param nom
         *            Le nom du "level".
         * @param valeur
         *            La valeur du "level".
         */
        private SDZLevel(String nom, int valeur){
                this.nom = nom;
                this.valeur = valeur;
        }
        
        /**
         * Retourne le nom du "level".
         * 
         * @return Le niveau correspondant, sous forme d'une chaine de
         *         caract�res.
         */
        public String getNom() {
                return this.nom;
        }
        
        /**
         * Retourne la valeur du "level".
         * 
         * @return Le valeur du niveau, sous la forme d'un entier.
         */
        public int getValeur(){
                return this.valeur;
        }

}