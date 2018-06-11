import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3277688436364127354L;
	private final JButton leftJButton;
	private final JButton centerJButton;
	private final JButton rightJButton;
	private final FlowLayout layout;
	private final Container container;
	
	public FlowLayoutFrame() {
		super("FlowLayout Demo");
		
		layout = new FlowLayout();
		container = this.getContentPane();
		this.setLayout(layout);
		
		leftJButton = new JButton("Left");
		add(leftJButton);
		leftJButton.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent event) {
					layout.setAlignment(FlowLayout.LEFT);
					layout.layoutContainer(container);
				}
			}
		);
		
		centerJButton = new JButton("Center");
		add(centerJButton);
		centerJButton.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent event) {
					layout.setAlignment(FlowLayout.CENTER);
					layout.layoutContainer(container);
				}
			}
		);
		
		rightJButton = new JButton("Right");
		add(rightJButton);
		rightJButton.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent event) {
					layout.setAlignment(FlowLayout.RIGHT);
					layout.layoutContainer(container);
				}
			}
		);
		
	}
	
}