import java.awt.*;
import java.applet.Applet;

public class weeka extends Applet {
	public void paint(Graphics g) {
		setForeground(Color.blue);
		Font font = new Font("Arial", Font.BOLD, 16);
		g.setFont(font);
		g.drawString("HELLO WORLD ", 80, 90);

	}
}
