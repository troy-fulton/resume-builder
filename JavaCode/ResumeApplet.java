// The applet
import java.applet.Applet;
import java.awt.Graphics;

public class ResumeApplet extends Applet
{
    // Overriding paint() method
    @Override
    public void paint(Graphics g) 
    {
        ResumeBuilder rb = new ResumeBuilder();
        rb.generateResume();
        g.drawString("I just made you a file...", 20, 20);
    }

}
