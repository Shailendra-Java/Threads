package com.example.hangman;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

class Menu extends JFrame
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
		gbc.anchor = gbc.HORIZONTAL;
		add(play,gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = gbc.HORIZONTAL;
		add(instruct,gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = gbc.HORIZONTAL;
		add(exit,gbc);
	}
}
