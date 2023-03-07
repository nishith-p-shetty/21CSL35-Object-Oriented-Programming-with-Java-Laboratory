/*
    Aim :
        Introduce java Applet, awt, swings.
    Program :
        Develop an applet that displays a simple message in center of the screen.
    
    OUTPUT :
        a
*/

import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="AppletP.class" width="300" height="300">
</applet>
*/

public class Applet_12A extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Welcome to applet",100,150);
    }
}