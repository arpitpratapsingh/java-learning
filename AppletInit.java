import java.applet.Applet;
import java.awt.Graphics;
public class AppletInit extends Applet{
    public void init(){

        resize(500,500);
    }
    public void paint (Graphics g){
        g.drawString("Window has been resized to 300,300", 50, 50);
    }
    
}
