import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class SalaryCalculator {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setBounds(400,400,600,400);
		frame.setLayout(null);
		
		JTextField rate = new JTextField("Hourly Rate");
		rate.setBounds(100,25,100,50);
		frame.add(rate);
	
		JTextField perweek = new JTextField("Hours/Week");
		perweek.setBounds(100,100,100,50);
		frame.add(perweek);
		
		JCheckBox box = new JCheckBox("Full Time");
		box.setBounds(100, 150, 100, 50);
		frame.add(box);
		
		JLabel annual = new JLabel("Annual Salary: ");
		annual.setBounds(100,250,400,50);
		frame.add(annual);
		
		JButton calculate = new JButton("Calculate");
		calculate.setBounds(100,200,100,50);
		frame.add(calculate);
		calculate.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						box.isSelected(); 
						if(box.isSelected())
						{
							annual.setText((Double.toString((40*Double.parseDouble(rate.getText())*Double.parseDouble(perweek.getText()))) +"$"));
						}
						else
						{
							annual.setText((Double.toString((52*Double.parseDouble(rate.getText())*Double.parseDouble(perweek.getText()))) +"$"));
						}
						
						
						frame.repaint();
					}
				});	
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
//new KeyListener(
//{
	//public void actionPerformed(KeyEvent e)
	//{
		//boolean press = true;
		//if(press) perweek.setText("");
		
//	}
//});

//
