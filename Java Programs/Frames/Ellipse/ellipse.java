import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ellipse extends Frame{
	public ellipse() {
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
	}
	public void paint(Graphics g) {
        g.fillOval(150, 200, 100,50);
	}
	public static void main(String args[]) {
        ellipse myfrm = new ellipse();
        myfrm.setSize(new Dimension(300, 300));
        myfrm.setTitle("Lab 11 Program 5 Draw ellipse");
        myfrm.setVisible(true);
	}
}
