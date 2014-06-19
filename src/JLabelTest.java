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
		Icon img = new ImageIcon("/Users/kaya/Desktop/Screen Shot 2014-06-04 at 1.46.00 AM.png");
		JLabel lbs = new JLabel(img);
		
		cp.add(lb1);
		cp.add(lbs);
		setTitle("JLabelTest");
		setSize(500,700);
		setVisible(true);
	}
	public static void main(String [] args)
	{
		new JLabelTest();
	}

	
	

	
}
