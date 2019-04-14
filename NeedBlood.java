import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NeedBloodFrame extends JFrame implements ActionListener
{
	Container c;
	
	JLabel area = new JLabel("Select Area");
	JLabel group = new JLabel("Enter Blood Group");
	JLabel text = new JLabel();
	
	String[] arr1={"Kalyan","Bandra","Chembur","Thane","Dadar"};
	String[] arr2={"A+","A-","B+","B-","O+","O-","AB+"};

	JComboBox cb1 = new JComboBox(arr1);
	JComboBox cb2 = new JComboBox(arr2);
	
	JButton btn= new JButton("Submit");
	
	NeedBloodFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		area.setBounds(50,50,100,40);
		group.setBounds(50,150,100,40);
		text.setBounds(100,500,500,300);
		
		cb1.setBounds(200,50,150,40);
		cb1.addActionListener(this);
		cb2.setBounds(200,150,150,40);
		
		btn.setBounds(300,250,200,50);
		btn.addActionListener(this);
		
		c.add(area);
		c.add(group);
		c.add(text);
		c.add(cb1);	
		c.add(cb2);
		c.revalidate();
		c.add(btn);
	}

	public void actionPerformed(ActionEvent e)
	{
		String selectedItem = (String)cb1.getSelectedItem();
        switch (selectedItem) {
            case "Kalyan": 
                text.setText("Nearest Blood Bank at .......");
                break;
            case "Bandra": 
                c.setBackground(Color.YELLOW);
                break;
            case "Thane": 
                c.setBackground(Color.GREEN);
                break;
            case "Chembur": 
                c.setBackground(Color.BLUE);
                break;
            case "Dadar": 
                c.setBackground(Color.ORANGE);
                break;
        }		
	}
	

}
class NeedBlood
{
	public static void main(String args[])
	{
		NeedBloodFrame f = new NeedBloodFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,50,600,800);
	}
}