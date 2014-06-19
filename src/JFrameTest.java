import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class JFrameTest extends JFrame
{
	JFrameTest()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel lb = new JLabel("paset JLabel on Jframe");
		cp.add(lb);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("JFrameTest");
		setBounds(50,50,200,100);
		cp.setBackground(Color.yellow);
		setVisible(true);
	}
	public static void main(String [] args)
	{
		new JFrameTest();
	}

}
