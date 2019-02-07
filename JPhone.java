import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JPhone {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setBounds(400,400,600,300);
		frame.setLayout(null);
		
		JTextField name = new JTextField("NAME");
		name.setBounds(100, 25, 100, 50);
		frame.add(name);
		
		JTextField num = new JTextField("PHONE NUMBER");
		num.setBounds(100, 80, 100, 50);
		frame.add(num);
		
		JButton enter = new JButton("enter");
		enter.setBounds(200,200, 50,50);
		JLabel username = new JLabel("");
		JLabel phone = new JLabel("");
		enter.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
						username.setText("NAME: " + name.getText());
						username.setBounds(300,25,150,50);
						frame.add(username);
						
						phone.setText("NUMBER: " + num.getText());
						phone.setBounds(300, 80, 150, 50);
						frame.add(phone);
						
					frame.repaint();
					
					}
				});
		frame.add(enter);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
