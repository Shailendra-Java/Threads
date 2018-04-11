package com.example.hangman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout; 
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

class GameWindow extends JFrame
{
	JFrame window;
	JLabel lblWord, lblMessage;
	JPanel keypad, key1, key2, key3, screen, notify;
	JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;

	public GameWindow()
	{
		window = new JFrame();
		a = new JButton("A");
		b = new JButton("B");
		c = new JButton("C");
		d = new JButton("E");
		f = new JButton("F");
		g = new JButton("G");
		h = new JButton("H");
		i = new JButton("I");
		j = new JButton("J");
		k = new JButton("K");
		l = new JButton("L");
		m = new JButton("M");
		n = new JButton("N");
		o = new JButton("O");
		p = new JButton("P");
		q = new JButton("Q");
		r = new JButton("R");
		s = new JButton("S");
		t = new JButton("T");
		u = new JButton("U");
		v = new JButton("V");
		w = new JButton("W");
		x = new JButton("X");
		y = new JButton("Y");
		z = new JButton("Z");

		lblMessage = new JLabel("Guess a country name");
		lblMessage.setFont(new Font("Serif",Font.PLAIN,20));

		lblWord = new JLabel();
		lblMessage.setFont(new Font("Serif",Font.PLAIN,35));

		notify = new JPanel();
		notify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));

		screen = new JPanel();
		screen.setBackground(Color.WHITE);
		screen.setSize(0,200);

		keypad = new JPanel();
		keypad.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0,0,0)));
		keypad.setBackground(Color.BLACK);

		key1  = new JPanel();
		key1.setBackground(Color.BLACK);

		key2 = new JPanel();
		key2.setBackground(Color.BLACK);

		key3 = new JPanel();
		key3.setBackground(Color.BLACK);

		setTitle("Hangman Game");
		setSize(500,450);
		addComponent();
		setVisible(true);
		setDefaultCloseOperation(window.EXIT_ON_CLOSE);
	}
	public void addComponent()
	{
		GridBagConstraints gbc = new GridBagConstraints();
		notify.setLayout(new FlowLayout());
		notify.add(lblMessage);

		screen.setLayout(new GridBagLayout());
		screen.add(lblWord,gbc);

		keypad.setLayout(new GridBagLayout());
		
		key1.setLayout(new FlowLayout());
		key1.add(q);
		key1.add(w);
		key1.add(e);
		key1.add(r);
		key1.add(t);
		key1.add(y);
		key1.add(u);
		key1.add(i);
		key1.add(o);
		key1.add(p);
		gbc.gridx = 0;
		gbc.gridy = 0;
		keypad.add(key1,gbc);

		key2.setLayout(new FlowLayout());
		key2.add(a);
		key2.add(s);
		key2.add(d);
		key2.add(f);
		key2.add(g);
		key2.add(h);
		key2.add(j);
		key2.add(k);
		key2.add(l);
		gbc.gridx = 0;
		gbc.gridy = 1;
		keypad.add(key2,gbc);

		key3.setLayout(new FlowLayout());
		key3.add(z);
		key3.add(x);
		key3.add(c);
		key3.add(v);
		key3.add(b);
		key3.add(n);
		key3.add(m);
		gbc.gridx = 0;
		gbc.gridy = 2;
		keypad.add(key3,gbc);

		setLayout(new BorderLayout());
		add(notify, BorderLayout.NORTH);
		add(screen, BorderLayout.CENTER);
		add(keypad, BorderLayout.SOUTH);
	}
}