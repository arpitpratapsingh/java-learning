import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;
public class AppletBackground extends Applet{
    public void init(){
        setBackground(Color.yellow);
        resize(100,100);
    }
    public void paint(Graphics g){
        g.drawString("Applet background example", 0, 50);
    }
}
