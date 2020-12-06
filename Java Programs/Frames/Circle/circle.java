import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class circle extends Frame{

	public circle() {
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
	}

	public void paint(Graphics g) {
        g.drawOval(50, 100, 100,100);

	}

	public static void main(String args[]) {
        circle myfrm = new circle();
        myfrm.setSize(new Dimension(400, 400));
        myfrm.setTitle("Lab 11 Program 4 Draw circle");
        myfrm.setVisible(true);
	}
}
