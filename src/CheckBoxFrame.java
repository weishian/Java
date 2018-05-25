import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame
{
	private final JTextField textField;
	private final JCheckBox boldJCheckBox;
	private final JCheckBox italicJCheckBox;
	
	public CheckBoxFrame() {
		super("JCheckBox Test");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Watch the font style change", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);
		
		boldJCheckBox = new JCheckBox("Bold");
		italicJCheckBox = new JCheckBox("Italic");
		
	}
}