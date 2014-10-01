class Point implements Comparable <Point> 
{ private int x, y ;
  Point (int x, int y)
  { this.x = x ; this.y = y ;
  }
  public void affiche()
  { System.out.println ("coordonnees : " + x + " " + y ) ;
  }
  public int compareTo (Point p)
  { int norme1 = x * x + y * y ;
    int norme2 = p.x * p.x + p.y * p.y ;
    if (norme1 == norme2) return 0 ;
    if (norme1 > norme2)  return 1 ;
                     else return -1 ;
  }
}
