
public class Point { //instructions de d�finition de champs et des m�thodes de la classe

		private int x;	//abscisse
		private int y; //ordonn�e

		public Point (int abs, int ord){
			x=abs;
			y=ord;
		}
		
		public void deplace(int dx, int dy){
			x+=dx;
			y+=dy;
		}
		
		public void affiche(){
			System.out.println("Je suis un point de coordonn�es : x= "+x +" et y= "+y);
		}

		//GETTERS (Accessor)
		public int getX(){
			return x;
			}
		public int getY(){
			return y;
			}	
		//SETTERS (Mutator)
		public void setX(int abs){
			x=abs;
			}
		public void setY(int ord){
			y=ord;
			}

		//ou plus recommand�
		public void setPosition(int abs, int ord){
			x=abs;
			y=ord;
		}

		public boolean coincide(Point pt){
			return ((pt.x==x)&&(pt.y==y));
		}
		
}


