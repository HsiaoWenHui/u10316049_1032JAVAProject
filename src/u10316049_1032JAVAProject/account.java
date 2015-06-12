package u10316049_1032JAVAProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class account extends JFrame{
		//這裡Panel 拿來Label和 TextField
		JPanel food = new JPanel(new GridLayout(4,1,0,0));
		JPanel dress = new JPanel(new GridLayout(4,1,0,0));
		JPanel live = new JPanel(new GridLayout(4,1,0,0));
		JPanel communication = new JPanel(new GridLayout(4,1,0,0));
		JPanel sport = new JPanel(new GridLayout(4,1,0,0));
		JPanel entertainment = new JPanel(new GridLayout(4,1,0,0));
		//輸入金額
		JTextField tF = new JTextField(8);
		JTextField tD = new JTextField(8);
		JTextField tL = new JTextField(8);
		JTextField tC = new JTextField(8);
		JTextField tS = new JTextField(8);
		JTextField tE = new JTextField(8);
		
		JLabel F = new JLabel("食(紅)");
		JLabel D = new JLabel("衣(橘)");
		JLabel L = new JLabel("住(黃)");
		JLabel C = new JLabel("行(綠)");
		JLabel S = new JLabel("育(藍)");
		JLabel E = new JLabel("樂(黑)");
		JLabel showF = new JLabel("請輸入金額");
		JLabel showD = new JLabel("請輸入金額");
		JLabel showL = new JLabel("請輸入金額");
		JLabel showC = new JLabel("請輸入金額");
		JLabel showS = new JLabel("請輸入金額");
		JLabel showE = new JLabel("請輸入金額");
		//P1放食衣住行的Panel
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT,5,10));
		//放設定清除鍵
		JPanel text  = new JPanel(new GridLayout(2,1,0,0));
		//放最後的 P1 text 和圓餅圖
		JPanel all = new JPanel(new BorderLayout());
		
		JButton f = new JButton("輸入");
		JButton d = new JButton("輸入");
		JButton l = new JButton("輸入");
		JButton c = new JButton("輸入");
		JButton s = new JButton("輸入");
		JButton e = new JButton("輸入");
		
		JButton set = new JButton("設定");
		JButton clean = new JButton("清除");
	
		//設初始
		double FF = 1,DD=1,LL=1,CC=1,SS=1,EE=1,total;
		int  arcF,arcD,arcL,arcC,arcS,arcE;
		circle cc = new circle();
		
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
		text.add(set);
		text.add(clean);
		all.add(p1,BorderLayout.WEST);
		all.add(text,BorderLayout.SOUTH);
		all.add(new circle(),BorderLayout.CENTER);
		add(all);
		
		f.addActionListener(new fListener());
		d.addActionListener(new dListener());
		l.addActionListener(new lListener());
		c.addActionListener(new cListener());
		s.addActionListener(new sListener());
		e.addActionListener(new eListener());
		
		set.addActionListener(new setListener());
		clean.addActionListener(new cleanListener());
		
	}
	//按輸入後顯示輸入金額
	private class fListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String money = tF.getText();
			showF.setText(money);
		}

	}
	private class dListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String money = tD.getText();
			showD.setText(money);
			
		}

	}
	private class lListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String money = tL.getText();
			showL.setText(money);
			
		}

	}
	private class cListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String money = tC.getText();
			showC.setText(money);
			
		}

	}
	private class sListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String money = tS.getText();
			showS.setText(money);
			
		}

	}
	private class eListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String money = tE.getText();
			showE.setText(money);
			
		}

	}
	
		
	//圓餅圖
	private class circle extends JPanel{
		
		private static final long serialVersionUID = 1L;
		@Override
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			total = FF+DD+LL+CC+SS+EE;
			//算角度
			arcF = (int)((FF/total)*360);
			arcD = (int)((DD/total)*360);
			arcL = (int)((LL/total)*360);
			arcC = (int)((CC/total)*360);
			arcS = (int)((SS/total)*360);
			arcE = (int)((EE/total)*360);

			//開始畫圖，並以顏色分別
			g.setColor(Color.red);
			g.fillArc(0,0,200,200,0,arcF);
			g.setColor(Color.orange);
			g.fillArc(0,0,200,200,arcF,arcD);
			g.setColor(Color.yellow);
			g.fillArc(0,0,200,200,arcF+arcD,arcL);
			g.setColor(Color.green);
			g.fillArc(0,0,200,200,arcF+arcD+arcL,arcC);
			g.setColor(Color.blue);
			g.fillArc(0,0,200,200,arcF+arcD+arcL+arcC,arcS);
			g.setColor(Color.black);
			g.fillArc(0,0,200,200,arcF+arcD+arcL+arcC+arcS,arcE);
		}
		//設定大小
		@Override
		  public Dimension getPreferredSize() {
		    return new Dimension(200, 200);
		  }
	}


	//按下設定鍵後的動作
	private class setListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//讀取輸入數值
			FF = Double.parseDouble(tF.getText());
			DD = Double.parseDouble(tD.getText());
			LL = Double.parseDouble(tL.getText());
			CC = Double.parseDouble(tC.getText());
			SS = Double.parseDouble(tS.getText());
			EE = Double.parseDouble(tE.getText());
			
			double total = FF+DD+LL+CC+SS+EE;
			//重畫圓餅圖
			cc.repaint();
			//將double轉乘String並顯示
			String f = String.valueOf((FF/total)*100);
			String d = String.valueOf((DD/total)*100);
			String l = String.valueOf((LL/total)*100);
			String c = String.valueOf((CC/total)*100);
			String s = String.valueOf((SS/total)*100);
			String E = String.valueOf((EE/total)*100);
			showF.setText(f+"%");
			showD.setText(d+"%");
			showL.setText(l+"%");
			showC.setText(c+"%");
			showS.setText(s+"%");
			showE.setText(E+"%");
		}

	}
	//講數值清除
	private class cleanListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
				tF.setText(null);
				tD.setText(null);
				tL.setText(null);
				tC.setText(null);
				tS.setText(null);
				tE.setText(null);
				showF.setText("請輸入金額");
				showD.setText("請輸入金額");
				showL.setText("請輸入金額");
				showC.setText("請輸入金額");
				showS.setText("請輸入金額");
				showE.setText("請輸入金額");
		}
	}
	//框架
	public static void main(String[] args){
		account frame =new account();
		frame.setTitle("u10316049_1032JAVAProject");
		frame.setSize(1000,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}