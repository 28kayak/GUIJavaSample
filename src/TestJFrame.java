import java.awt.*;
import javax.swing.*;
public class TestJFrame extends JFrame
{
	TestJFrame()
	{
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		//Equals to getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//close Frame
		setTitle("JFrameTest");//title of frame
		setSize(200,100);
		setVisible(true);
	}
	public static void main(String [] args)
	{
		new TestJFrame();
	}

}
