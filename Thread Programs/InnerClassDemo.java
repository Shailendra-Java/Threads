package com.example.innerclass;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class InnerClassDemo extends JFrame
{
	JFrame jframe;
	JButton click;
	
	InnerClassDemo()
	{
		jframe = new JFrame();
		click = new JButton("Show");
		setSize(300,200);
		setTitle("Inner Class Example");
		add(click);
		setVisible(true);
		click.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				JOptionPane.showMessageDialog(InnerClassDemo.this,"Example of anonymous class","Information",JOptionPane.INFORMATION_MESSAGE);
				System.out.println("Hello students");
			}
		}
		);
	} 
	
	public static void main(String ar[])
	{
		InnerClassDemo icd = new InnerClassDemo();
	}
}