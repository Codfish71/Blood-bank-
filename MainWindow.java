import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainFrame extends JFrame implemennts ActionListener
{
	Container c;
	
	Jbutton btn1 = new JButton("Need Blood");
	JButton btn2 = new JButton("Be a Donor");
	
	MainFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		btn1.setBound(50,100,200,50);
		btn2.setBound(250,100,200,50);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		c.add(btn1);
		c.add(btn2);
		
	}
	
	public void actionPerformed(ActionEvent e);
	{
		if(e.getSource()==btn2)
		{
			NeedBlood frame = new NeedBlood();
			frame.setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		}
		
		if(e.getSource()==btn2)
		{
			DonorWindow frame = new DonorWindow();
			frame.setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		}
		
	}
}
class MainWindow
{
	public static void main(String args[])
	{
		MainFrame f = new MainFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,50,600,800);
	}
}