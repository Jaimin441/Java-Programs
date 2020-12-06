import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="oe_start" width=500 height=200> </applet> */
public class oe_start extends Applet implements ActionListener {

	Button b;
	Label l,l1;

	public void init() {
        l = new Label("1");
        l.setBounds(30, 40, 40, 20);

        l1 = new Label("Odd");
        l1.setBounds(80, 40, 150, 20);

        b = new Button("Start");
        b.setBounds(80, 150, 60, 50);

        add(b);
        add(l);
        add(l1);
        b.addActionListener(this);

        setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
        int temp = Integer.parseInt(l.getText());
        temp++;
        l.setText(Integer.toString(temp));
        if(l1.getText() == "Even")
            l1.setText("Odd");
	else
            l1.setText("Even");
	}
}
