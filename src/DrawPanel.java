import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3149682756958913074L;
	
	private SecureRandom randomNumbers = new SecureRandom();
	private MyLine[] lines;
	
	public DrawPanel() {
		this.setBackground(Color.WHITE);
		
		lines = new MyLine[5000 + randomNumbers.nextInt(5)];
		
		for (int count = 0; count < lines.length; count++) {
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);
			
			Color color = new Color(randomNumbers.nextInt(256), 
					randomNumbers.nextInt(256), randomNumbers.nextInt(256));
			
			lines[count] = new MyLine(x1, y1, x2, y2, color);
			
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
//		int width = getWidth();
//		int height = getHeight();
//		
//		g.drawLine(0, 0, width, height);
//		g.drawLine(0, height, width, 0);
		
		for (MyLine line : lines) {
			line.draw(g);
		}
	}
}