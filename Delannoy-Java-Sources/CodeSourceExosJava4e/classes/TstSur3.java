class A
{ public void f (int n, float x)     { System.out.println ("f(int, float)") ; }
  public void f (float x1, float x2) { System.out.println ("f(float, float)") ; }
  public void f (float x, int n)     { System.out.println ("f(float, int)") ; }
}

public class TstSur3
{ public static void main (String args [])
  { A a ; short p ; int n1, n2 ; float x ;

    a=new A() ;  p=12 ; n1=125 ; n2 = 250 ; x=2.5f ;

    a.f(n1, x) ;  // f(int, float) et f(float, float) sont acceptables
                  // mais la seconde est moins bonne que la premi�re
                  // Il y a donc appel de f(int, float)
    a.f(x, n1) ;  // f(float, float) et f(float, int) sont acceptables
                  // mais la premi�re est moins bonne que la seconde
                  // Il y a donc appel de f(float, int)
    a.f(p, x) ;   // Les trois m�thodes sont acceptables
                  // La seconde et la troisi�me sont moins bonnes que la premi�re
                  // Il y a donc appel de f(int, float) apr�s conversion
                  // de p en int
    a.f(n1, n2) ; // Les trois m�thodes sont acceptables
                  // Seule la seconde est moins bonne que les autres
                  // Mais aucune des deux m�thodes f(int, float) et f(float, int)
                  // n'est meilleure que les autres ; il y a donc erreur
  }
}



