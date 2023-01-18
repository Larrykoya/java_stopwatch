package app;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopWatchApp extends JFrame implements ActionListener {
	
	
	GridLayout grid = new GridLayout(4,0);
	JButton btn1= new JButton("Start timing");
	JButton btn2= new JButton("Stop timing");
	JButton btn3 = new JButton("Exit");
	JButton btn4 = new JButton("Reset");
	JLabel label1 = new JLabel("Start Time:");
	JLabel label2 = new JLabel("Stop  Time:");
	JLabel label3 = new JLabel("Elapsed Time (sec):");
	JTextField txt1 = new JTextField(15);
	JTextField txt2 = new JTextField(15);
	JTextField txt3 = new JTextField(15);
	
	//long currentTime = System.currentTimeMillis();
	long start;
	long stop;

	public StopWatchApp() {
		Frame();
	}

	private void Frame() {
		this.getContentPane().setLayout(grid);
		this.setResizable(false);
		this.setTitle("Stopwatch Application");
		this.setSize(450, 150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		btn1.setFocusable(false);
		btn1.setBackground(new Color(0x00ff00));
		btn2.setFocusable(false);
		btn2.setBackground(new Color(0x00ff00));
		btn3.setFocusable(false);
		btn3.setBackground(new Color(0xFD5C5C));
		btn4.setFocusable(false);
		btn4.setBackground(Color.yellow);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn2.setEnabled(false);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		txt1.setEditable(false);
		txt2.setEditable(false);
		txt3.setEditable(false);
		txt1.setBackground(Color.decode("#DADFF7"));
		txt2.setBackground(Color.decode("#DADFF7"));
		txt3.setBackground(Color.decode("#DADFF7"));
		this.getContentPane().add(btn1);
		this.getContentPane().add(label1);
		this.getContentPane().add(txt1);
		this.getContentPane().add(btn2);
		this.getContentPane().add(label2);
		this.getContentPane().add(txt2);
		this.getContentPane().add(btn4);
		this.getContentPane().add(label3);
		this.getContentPane().add(txt3);
		this.getContentPane().add(btn3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new StopWatchApp();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
			long time=System.currentTimeMillis()/1000;
		if(e.getSource()==btn1) {
			start = time;
			txt1.setText(String.valueOf(start));
			btn1.setEnabled(false);
			btn2.setEnabled(true);
			
		}
		if(e.getSource()==btn2) {
			stop=time;
			txt2.setText(String.valueOf(stop));
			int diff = (int) (stop - start);
			txt3.setText(String.valueOf(diff));
			btn2.setEnabled(false);
		}
		if(e.getSource()==btn3) {
			System.exit(EXIT_ON_CLOSE);
		}
		if(e.getSource()==btn4) {
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
			btn1.setEnabled(true);
			btn2.setEnabled(false);
		}
		
	}

}
