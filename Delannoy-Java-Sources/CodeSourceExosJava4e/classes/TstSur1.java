class A
{ public void f (int n)           {}
  public void f (int n, int q)    {}
  public void f (int n, double y) {}
}
public class TstSur1
{ public static void main (String args [])
  { A a ; byte b ; short p ; int n ; long q ; float x ; double y ;

    a=new A() ; b=2; p=12 ; n=125 ; q=1000 ; x=2.5f ; y=12.5 ;

    a.f(n);        // appel f(int)
    a.f(n, q) ;    // appel f(int, double) apr�s conversion de q en double
    a.f(q) ;       // erreur : aucune m�thode acceptable
    a.f(p, n) ;    // appel f(int, int) apr�s conversion de p en int
    a.f(b, x) ;    // appel de f(int, double) apr�s conversion de b en int
                   //   et de x en double
    a.f(q, x) ;    // erreur : aucune m�thode acceptable
  }
}
