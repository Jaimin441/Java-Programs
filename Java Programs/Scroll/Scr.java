import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="Scr" height=400 width=300>

</applet>*/

public class Scr extends Applet implements AdjustmentListener
{
    Scrollbar s1, s2, s3;
    Panel p1;
    public void init()
    {
        setLayout(new BorderLayout());
        p1=new Panel();
        p1.setLayout(new GridLayout(1,3));
        s1 = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
        s2 = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
        s3 = new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);

        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);

        p1.add(s1);
        p1.add(s2);
        p1.add(s3);

        add(p1,BorderLayout.EAST);

     }
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
       repaint();
     }
     public void paint(Graphics g)
     {
         int x, y, z;

         x = s1.getValue();
         y = s2.getValue();
         z = s3.getValue();

         showStatus("Red : " + x + "  Green : " + y + "  Blue : " + z);
         Color c = new Color(x,y,z);

         setBackground(c);
     }
}
