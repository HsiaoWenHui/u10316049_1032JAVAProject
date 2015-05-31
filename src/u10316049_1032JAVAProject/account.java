package u10316049_1032JAVAProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


public class account extends JFrame{

		JButton set = new JButton("設定");
		JButton clean = new JButton("清除");
	
	
	public account(){
		
		
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
		frame.setTitle("u10316049_GeoCalculate");
		frame.setSize(800,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}