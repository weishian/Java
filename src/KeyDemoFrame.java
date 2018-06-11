import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6620887253596635726L;
	
	private String line1 = "";
	private String line2 = "";
	private String line3 = "";
	private final JTextArea textArea;
	
	public KeyDemoFrame() {
		super("Demonstrating Keystroke Events");
		
		textArea = new JTextArea(10, 15);
		textArea.setText("Press and key on the keyboard...");
		textArea.setEnabled(false);
		textArea.setDisabledTextColor(Color.BLACK);
		add(textArea);
		
		addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent event) {
		line1 = String.format("Key pressed: %s", KeyEvent.getKeyText(event.getKeyCode()));
		setLine2and3(event);
	}
	@Override
	public void keyReleased(KeyEvent event) {
		line1 = String.format("Key released: %s", KeyEvent.getKeyText(event.getKeyCode()));
		setLine2and3(event);
	}
	@Override
	public void keyTyped(KeyEvent event) {
		line1 = String.format("Key typed: %s", KeyEvent.getKeyText(event.getKeyCode()));
		setLine2and3(event);
	}
	
	private void setLine2and3(KeyEvent event) {
		line2 = String.format("This key is %san action key", (event.isActionKey() ? "" : "not "));
		String temp = KeyEvent.getModifiersExText(event.getModifiersEx());
		
		line3 = String.format("Modifier keys pressed: %s", (temp.equals("") ? "none" : temp));
		
		textArea.setText(String.format("%s\n%s\n%s\n", line1, line2, line3));
	}
}