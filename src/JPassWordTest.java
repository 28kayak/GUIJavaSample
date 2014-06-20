import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
/**
 * Do not work properly
 * @author kaya
 *
 */

public class JPassWordTest
{
	public static void main(String [] args)
	{
			new Tf();
	}
}//class JpassWord
private class Tf extends JFrame implements ActionListener
{
	JPasswordField passwd = new JPasswordField(20);
	JLabel lb = new JLabel();
	public Tf()
	{
		passwd.addActionListener(this);//set an event on password field
		passwd.setEchoChar('*');//set an echo char
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();//getContentPane() is in JFrame
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("Enter your password"));
		cp.add(passwd, BorderLayout.CENTER);
		cp.add(lb);
		setSize(250,150);// in Window class
		setVisible(true);//in Window class
	}//Tf()
	@Override
	public void actionPerformed(ActionEvent e)
	{
		char pass[] = passwd.getPassword();//input password and store to char array
		
		String pw = String.valueOf(pass);//make char array be String value
		if(pw.equals("1234"))
		{
			lb.setText("Thankyou for your access");
		}
		else
		{
			lb.setText("Wrong password, Try again");
			passwd.setText(" ");
		}
		
	}
}//class tf
