import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JLabelTest extends JFrame
{
	JLabelTest()
	{
		Container cp = getContentPane();//take ContentPane
		cp.setLayout(new FlowLayout());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel lb1 = new JLabel("Hello!!");
		Icon img = new ImageIcon("fish.jpg");
		JLabel lbs = new JLabel(img);
		
		
	}

	
	

	
}
