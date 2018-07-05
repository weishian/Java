import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayoutFrame extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8702954652086382695L;
	
	private final JButton[] buttons;
	private static final String[] names = {"one", "two", "three", "four", "five", "six"};
	private boolean toggle = true;
	private final Container container;
	private final GridLayout gridLayout1;
	private final GridLayout gridLayout2;
	
	public GridLayoutFrame() {
		super("GridLayout Demo");
		gridLayout1 = new GridLayout(2, 3, 5, 5);
		gridLayout2 = new GridLayout(3, 2);
		container = getContentPane();
		setLayout(gridLayout1);
		buttons = new JButton[names.length];
		
		for (int count = 0; count < names.length; count++) {
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
			add(buttons[count]);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (toggle) {
			container.setLayout(gridLayout1);
		}
		else {
			container.setLayout(gridLayout2);
		}
		toggle = !toggle;
		container.validate(); //re-lay out container
	}
	
}
