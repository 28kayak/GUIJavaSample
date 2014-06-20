import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JToggleButtontest extends JFrame implements ChangeListener
{
	/*A toggle switch is a class of electrical switches 
	 * that are manually actuated by a mechanical lever, 
	 * handle, or rocking mechanism.
	 * 
	 */
	int on;
	JToggleButton bt;
	public JToggleButtontest()
	{
		setSize(200,150);
		setBackground(new Color(0xcccccc));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		on = 0;
		bt = new JToggleButton("Circle");
		bt.addChangeListener(this);
		add(bt);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}//JToggleButtontest()
	public static void main(String argv[])
	{
		JToggleButtontest app = new JToggleButtontest();
	}//main
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		if(on == 0)
		{
			g.setColor(Color.yellow);
			g.fillOval(60, 60, 50, 50);
		}
		else
		{
			g.setColor(Color.blue);
			g.fillRect(60, 60, 50, 50);
		}
	}//paint
	public void stateChanged(ChangeEvent e)
	{
		if(bt.isSelected())
		{
			bt.setText("Ractangle");
			on = 1;
		}
		else
		{
			bt.setText("Circlce");
			on = 0;
		}
		repaint();
	}
		
}//class JToggleButtontest
	
	
