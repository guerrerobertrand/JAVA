import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
class FenetreDessin2 extends JFrame
{ FenetreDessin2 ()
{ setTitle ("Traces de clics") ;
setSize (300, 150) ;
pan = new JPanel() ;
getContentPane().add(pan) ;
pan.addMouseListener (new EcouteClic(pan)) ;
}
private JPanel pan ;
}
class EcouteClic extends MouseAdapter
{ public EcouteClic (JPanel pan)
{ this.pan = pan ;
}
public void mouseClicked (MouseEvent e)
{ int x = e.getX(), y = e.getY() ;
Graphics g = pan.getGraphics() ;
g.drawRect (x, y, 5, 5) ;
g.dispose();
}
private JPanel pan ;
}