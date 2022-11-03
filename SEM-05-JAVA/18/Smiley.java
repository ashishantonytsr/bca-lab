import java.applet.*;
import java.awt.*;

/* 
<applet code=Smiley.class width=500 height=500>
</applet>
*/

public class Smiley extends Applet{
	public void paint (Graphics g) {
		g.drawOval(80, 70, 150, 150);
		g.setColor(Color.BLACK);
		g.fillOval(120, 120, 15, 15);
		g.fillOval(170, 120, 15, 15);
		g.drawArc(130, 180, 50, 20, 180, 180);
	}
}




/* 
To compile with Java Version 8.0
	javac --release 8 Smiley.java
*/ 
