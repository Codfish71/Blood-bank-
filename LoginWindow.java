import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginFrame extends JFrame implements ActionListener
{
	Container c;
	
	JLabel user = new JLabel("Username");
	JLabel pass = new JLabel("Password");
	
	JTextField user_tf=new JTextField();
	JPasswordField pass_pf= new JPasswordField();		
	
	JButton btn= new JButton("Submit");
	
	
	LoginFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		user.setBounds(100,50,100,40);
		pass.setBounds(100,150,100,40);
		
		user_tf.setBounds(250,50,150,40);
		pass_pf.setBounds(250,150,150,40);
		
		btn.setBounds(300,250,200,50);
		btn.addActionListener(this);	
		
		c.add(user);
		c.add(pass);
		c.add(user_tf);
		c.add(pass_pf);
		c.add(btn);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		MainWindow frame = new MainWindow();
		frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

}
class LoginWindow
{
	public static void main(String args[])
	{
		LoginFrame f = new LoginFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,50,800,600);
	}
}