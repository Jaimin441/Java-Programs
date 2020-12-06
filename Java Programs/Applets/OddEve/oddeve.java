import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code = "oddeve" width = "300" height = "200">
</applet>
*/

public class oddeve extends Applet{
	String msg = "";
	static int r1, r2;

	public void init(){
        addMouseListener(new AdapterMouseHere());
        setBackground(Color.black);
        setForeground(Color.white);
	}

	public void start(){
        r1 = 3;
        r2 = 100;
        msg = ("Lower Bound = " + r1 + "	");
        msg += ("Upper Bound = " + r2);
        repaint();
	}

    class AdapterMouseHere extends MouseAdapter{
        public void mouseClicked(MouseEvent me){
            if(r1<r2){
                if(r1%2 == 0)
                    msg = ("Even = " + r1);
                else
                    msg = ("Odd = " + r1);
                r1++;
                repaint();
            }
        }
	}

	public void paint(Graphics g){
        g.drawString(msg, 0, 20);
	}
}
