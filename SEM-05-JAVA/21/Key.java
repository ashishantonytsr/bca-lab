import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* 
<applet code=Key.class width=500 height=500>
</applet>
*/

public class Key extends Applet implements KeyListener{
	int x=20, y=30;
	String msg = "KeyEvents-->";

	public void init() {
		addKeyListener(this);
		requestFocus();
		
		setBackground(Color.GREEN);
		setForeground(Color.BLUE);
	}

	public void keyPressed(KeyEvent k) {
		showStatus("KeyDown");
		int key = k.getKeyCode();

		switch(key) {
			case KeyEvent.VK_UP: 
				showStatus("Move to Up");
				break;
			case KeyEvent.VK_DOWN: 
				showStatus("Move to Down");
				break;
			case KeyEvent.VK_LEFT: 
				showStatus("Move to Left");
				break;
			case KeyEvent.VK_RIGHT: 
				showStatus("Move to Right");
				break;
		}
		repaint();
	}

	public void keyReleased(KeyEvent k) {
		showStatus("Key UP");
	}

	public void keyTyped(KeyEvent k) {
		msg += k.getKeyChar();
		repaint();
	}

	public void paint(Graphics g) {
		g.drawString(msg, x, y);
	}
}
