package projet_Javadoc;

//package fr.dworkin.sdz.javadoc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * <b>Zero est la classe repr�sentant un membre du Site du Z�ro.</b>
 * <p>
 * Un membre du SDZ est caract�ris� par les informations suivantes :
 * <ul>
 * <li>Un identifiant unique attribu� d�finitivement.</li>
 * <li>Un pseudo, suceptible d'�tre chang�.</li>
 * <li>Un "level". Il peut �tre "z�ro", newser, validateur, mod�rateur, etc.</li>
 * </ul>
 * </p>
 * <p>
 * De plus, un Z�ro a une liste d'amis Z�ro. Le membre pourra ajouter ou enlever
 * des amis � cette liste.
 * </p>
 * 
 * @see SDZLevel
 * 
 * @author dworkin
 * @version 3.0
 */
public class Zero {

        /**
         * L'ID du Z�ro. Cet ID n'est pas modifiable.
         * 
         * @see Zero#Zero(int, String)
         * @see Zero#getId()
         */
        private int id;

        /**
         * Le pseudo du Z�ro. Ce pseudo est changeable.
         * 
         * @see Zero#getPseudo()
         * @see Zero#setPseudo(String)
         */
        private String pseudo;

        /**
         * Le "level" du Z�ro. Ce "level" peut �tre modifi�.
         * <p>
         * Pour de plus amples informations sur les "levels" possibles, regardez la
         * documentation de la classe SDZLevel.
         * <p>
         * 
         * @see SDZLevel
         * 
         * @see Zero#getLevel()
         * @see Zero#setLevel(SDZLevel)
         */
        private SDZLevel level;

        /**
         * La liste des amis du Z�ro.
         * <p>
         * Il est possible d'ajouter ou de retirer des amis dans cette liste.
         * <p>
         * 
         * @see Zero#getListeAmis()
         * @see Zero#ajouterAmi(Zero)
         * @see Zero#retirerAmi(Zero)
         */
        private List<Zero> listeAmis;

        /**
         * Constructeur Zero.
         * <p>
         * A la construction d'un objet Z�ro, le "level" est fix� � SDZLevel.ZERO, ce qui
         * correspond au niveau d'un membre. De plus la liste des amis est cr��e
         * vide.
         * </p>
         * 
         * @param id
         *            L'identifiant unique du Z�ro.
         * @param pseudo
         *            Le pseudo du Z�ro.
         * 
         * @see Zero#id
         * @see Zero#pseudo
         * @see Zero#level
         * @see Zero#listeAmis
         */
        public Zero(int id, String pseudo) {
                this.id = id;
                this.pseudo = pseudo;
                this.level = SDZLevel.ZERO;
                listeAmis = new ArrayList<Zero>();
        }
        
        /**
         * Ajoute un Zero � la liste des amis.
         * 
         * @param ami
         *            Le nouvel ami du Z�ro.
         * 
         * @see Zero#listeAmis
         */
        public void ajouterAmi(Zero ami) {
                listeAmis.add(ami);
        }
        
        /**
         * Retire un Zero � la liste des amis.
         * 
         * @param ancienAmi
         *            Un ancien ami du Z�ro.
         * 
         * @see Zero#listeAmis
         */
        public void retirerAmi(Zero ancienAmi) {
                listeAmis.remove(ancienAmi);
        }

        /**
         * Retourne l'ID du z�ro.
         * 
         * @return L'identifiant du membre. 
         */
        public int getId() {
                return id;
        }

        /**
         * Retourne le pseudo du z�ro.
         * 
         * @return Le pseudo du membre, sous forme d'une chaine de caract�res.
         */
        public String getPseudo() {
                return pseudo;
        }

        /**
         * Retourne le level du z�ro.
         * 
         * @return Une instance de SDZLevel, qui correspond � niveau du membre sur SDZ.
         * 
         * @see SDZLevel
         */
        public SDZLevel getLevel() {
                return level;
        }

        /**
         * Met � jour le niveau du membre.
         * 
         * @param level
         *            Le nouveau level du membre.
         * 
         * @see SDZLevel
         */
        protected void setLevel(SDZLevel level) {
                this.level = level;
        }

        /**
         * Met � jour le pseudo du membre.
         * 
         * @param pseudo
         *            Le nouveau pseudo du membre.
         * 
         * @since 3.0
         */
        public void setPseudo(String pseudo) {
                this.pseudo = pseudo;
        }
        
        /**
         * Retourne la liste des amis du z�ro.
         * 
         * @return La liste des amis du z�ro.
         * 
         * @see Zero
         */
        protected List<Zero> getListeAmis() {
                return listeAmis;
        }
        
        /**
         * Retourne la liste des amis du z�ro.
         * 
         * @return La liste des amis du z�ro, sous la forme d'un vecteur.
         * 
         * @deprecated Depuis Java 1.4, remplac� par getListeAmis()
         * 
         * @see Zero
         * @see Zero#getListeAmis
         */
        protected Vector<Zero> getVectorAmis(){
                Vector<Zero> vector = new Vector<Zero>();
                for (Zero z : listeAmis){
                        vector.add(z);
                }
                return vector;
        }
        
        /**
         * Retourne l'adresse du profil du Zero.
         * 
         * @return L'URL du profil du Zero, g�n�r�e � partir de l'id du Zero.
         * 
         * @throws MalformedURLException  Si jamais l'url est mal form�e. 
         * 
         * @see Zero#id
         */
        public URL getURLProfil() throws MalformedURLException{
                URL url = new URL("http://www.siteduzero.com/membres-294-"+id+".html");
                return url;
        }

}