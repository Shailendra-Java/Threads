package com.example.hangman;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Menu extends JFrame implements ActionListener
{
	JButton play,instruct,exit;
	JLabel msg;
	JFrame jframe;

	public Menu()
	{
		play = new JButton("Play Game");
		instruct = new JButton("Game Instructions");
		exit = new JButton("Exit Game");
		msg = new JLabel("HANGMAN");
		msg.setFont(new Font("serif",Font.PLAIN,24));
		setTitle("Hangman Game");
		setSize(300,200);
		setResizable(false);
		addComponent();
		setVisible(true);
		setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		play.addActionListener(this);
		instruct.addActionListener(this);
		exit.addActionListener(this);
	}
	void addComponent()
	{
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weighty = 0.1;
		gbc.anchor = gbc.CENTER;
		add(msg,gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = gbc.HORIZONTAL;
		add(play,gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = gbc.HORIZONTAL;
		add(instruct,gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.fill = gbc.HORIZONTAL;
		add(exit,gbc);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == play)
		{
			GameWindow gw = new GameWindow();
			gw.startGame();
			this.dispose();
		}
		else if(ae.getSource() == instruct)
		{
			JOptionPane.showMessageDialog(this,"1. You can guess the word by clicking the character"
			+"from the virtual keypad. \n2. You can select a maximum of 5 incorrect letters."
			+"\n3. The incorrect guess will be highlighted with red color, and the correct one "
			+"will be highlighted with green color","Instructions",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(ae.getSource() == exit)
		{
			System.exit(0);
		}
	}
}
