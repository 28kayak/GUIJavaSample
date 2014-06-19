import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class TextFieldTest
{
	public static void main(String [] args)
	{
		new Tf();
	}

}
class Tf extends JFrame implements ActionListener
{
	JTextField in;
	JLabel name;
	JPanel panel;
	JLabel text;
	JLabel pref;
	
	public Tf()
	{
		panel = new JPanel();
		panel.setBackground(Color.CYAN);
		
		in = new JTextField("Type your name");
		name = new JLabel();
		name.setBackground(Color.cyan);
		name.setHorizontalAlignment(SwingConstants.RIGHT);
		pref = new JLabel("Mr. or Mis. ");
		text = new JLabel("\nThank you for your acess.");
		
		//setting layout
		Container cc = getContentPane();
		cc.setLayout(new FlowLayout());
		
		cc.add(in);
		//panel.add(pref);
		panel.add(name);
		panel.add(text);
		cc.add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		in.addActionListener(this);
		setSize(300,200);
		setVisible(true);
	}
	//EventDriven for dealing textField
	public void actionPerformed(ActionEvent e)
	{
		String str = in.getText();
		name.setText(str);
		in.setText("");//clear input field 
		in.setColumns(10);
		
	}
}
