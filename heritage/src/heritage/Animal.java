package heritage;

abstract class Animal {

		protected String couleur;
		protected int poids;
	
		protected void manger(){
			System.out.println("Je mange de la viande");
		}
		protected void boire(){
			System.out.println("Je bois de l'eau");
		}
		
		abstract void deplacement(); //une m�thode abstraite
		abstract void crier(); //une autre m�thode abstraite � red�finir dans classes d�riv�es
		
		@Override
		public String toString(){
			String str="Je suis un objet de la "+this.getClass()+", je suis "+this.couleur+", je p�se "+this.poids;
			return str;
		}
		
}
