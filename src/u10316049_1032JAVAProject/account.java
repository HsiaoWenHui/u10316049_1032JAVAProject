package u10316049_1032JAVAProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class account extends JFrame{
		JPanel food = new JPanel(new GridLayout(4,1,0,0));
		JPanel dress = new JPanel(new GridLayout(4,1,0,0));
		JPanel live = new JPanel(new GridLayout(4,1,0,0));
		JPanel communication = new JPanel(new GridLayout(4,1,0,0));
		JPanel sport = new JPanel(new GridLayout(4,1,0,0));
		JPanel entertainment = new JPanel(new GridLayout(4,1,0,0));
		
		JTextField tF = new JTextField(8);
		JTextField tD = new JTextField(8);
		JTextField tL = new JTextField(8);
		JTextField tC = new JTextField(8);
		JTextField tS = new JTextField(8);
		JTextField tE = new JTextField(8);
		
		JLabel F = new JLabel("食");
		JLabel D = new JLabel("衣");
		JLabel L = new JLabel("住");
		JLabel C = new JLabel("行");
		JLabel S = new JLabel("育");
		JLabel E = new JLabel("樂");
		JTextField showF = new JTextField(8);
		JTextField showD = new JTextField(8);
		JTextField showL = new JTextField(8);
		JTextField showC = new JTextField(8);
		JTextField showS = new JTextField(8);
		JTextField showE = new JTextField(8);
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,10));
		
		JPanel p2 = new JPanel();
		JPanel graph = new JPanel();
		JPanel text  = new JPanel();
		JPanel all = new JPanel();
		
		JButton f = new JButton("輸入");
		JButton d = new JButton("輸入");
		JButton l = new JButton("輸入");
		JButton c = new JButton("輸入");
		JButton s = new JButton("輸入");
		JButton e = new JButton("輸入");
		
		JButton set = new JButton("設定");
		JButton clean = new JButton("清除");
	
	
	public account(){
		
		food.add(F);
		food.add(showF);
		food.add(tF);
		food.add(f);
		dress.add(D);
		dress.add(showD);
		dress.add(tD);
		dress.add(d);
		live.add(L);
		live.add(showL);
		live.add(tL);
		live.add(l);
		communication.add(C);
		communication.add(showC);
		communication.add(tC);
		communication.add(c);
		sport.add(S);
		sport.add(showS);
		sport.add(tS);
		sport.add(s);		
		entertainment.add(E);
		entertainment.add(showE);
		entertainment.add(tE);
		entertainment.add(e);		
		
		p1.add(food);
		p1.add(dress);
		p1.add(live);
		p1.add(communication);
		p1.add(sport);
		p1.add(entertainment);
		
		p2.add(graph,BorderLayout.NORTH);
		p2.add(text,BorderLayout.SOUTH);
		text.add(set,BorderLayout.WEST);
		text.add(clean,BorderLayout.EAST);
		all.add(p1,BorderLayout.WEST);
		all.add(p2,BorderLayout.EAST);
		add(all);
		set.addActionListener(new setListener());
		clean.addActionListener(new cleanListener());
		
	}
	private class setListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			
		}

	}

	private class cleanListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
				
		}
	}
	public static void main(String[] args){
		account frame =new account();
		frame.setTitle("u10316049_1032JAVAProject");
		frame.setSize(800,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}