import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code = "paEvent" width = "300" height = "200">
</applet>
*/

public class paEvent extends Applet{
	String msg = "";
	int r1, r2, cnt1, cnt2;

	public void init(){
        addMouseListener(new AdapterHere());
        r1 = 10;
        r2 = 1000;
        cnt1 = cnt2 = r1;
	}

	public void start(){
        msg = "Lower-bound = " + r1 + "   Upper-bound = " + r2;
        repaint();
	}

	class AdapterHere extends MouseAdapter{
        public void mouseEntered(MouseEvent me){
            if(cnt1 < r2){
                while(!prime(cnt1))
                    cnt1++;
                msg = "Prime = " + cnt1;
                cnt1++;
                repaint();
            }else{
                msg = "Upper-bound reached!";
                repaint();
            }
        }

        public void mouseExited(MouseEvent me){
            if(cnt2 < r2){
                while(!armstrong(cnt2))
                    cnt2++;
                msg = "Armstrong = " + cnt2;
                cnt2++;
                repaint();
            }else{
                msg = "Upper-bound reached!";
                repaint();
            }
        }

        public boolean prime(int n){
            int flag = 0;
            if(n == 1 || n == 0)
                return false;
            if(n == 2)
                return true;
            if(n>2){
                for(int i=2; i<n; i++)
                    if(n%i == 0)
                        flag = 1;
                return (flag == 0 ? true:false);
            }
            return false;
        }

        public boolean armstrong(int n){
            int remain, sum = 0, temp = n;
            while(n > 0){
                remain = n%10;
                sum += (remain*remain*remain);
                n /= 10;
            }

            return (temp == sum ? true:false);
        }
	}

	public void paint(Graphics g){
        g.drawString(msg, 0, 20);
	}
}
