package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import duixiang.qita;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class lishixinxi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lishixinxi frame = new lishixinxi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	/**
	 * Create the frame.
	 */
	public lishixinxi() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label_2 = new JLabel("\u76D1\u6D4B\u70B9:");
		panel.add(label_2);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("\u6570\u636E\u5F00\u59CB\u65E5\u671F:");
		panel.add(label);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel label_3 = new JLabel("\u6570\u636E\u7ED3\u675F\u65E5\u671F:");
		panel.add(label_3);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_1 = new JLabel("(\u683C\u5F0F[\u4F8B]\uFF1A2017-03-22 11:14:47)");
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton button = new JButton("\u67E5\u770B");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hao = Integer.parseInt(textField_1.getText());
				String qishiriqi = textField.getText();
				String jieshuriqi = textField_2.getText();
				
				dao.DBBean ddd = new dao.DBBean();
				String sql = null;
				sql = "select yingbian from msql.yingbian where `time` >= '"+qishiriqi+"'and`time` < '"+jieshuriqi+"'and`xuhao` = '"+hao+"'";
				ResultSet rs = ddd.query(sql);
				int i = 0;
				//将查询到的历史数据保存到数组A内
				try {
					while(rs.next()){
							qita.lishishuju[i++] = Double.parseDouble(rs.getString("yingbian"));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//将数组A内的历史数据  以50毫秒的速度 赋值给数组B
				Runnable r = new Runnable(){

					@Override
					public void run() {
						// TODO Auto-generated method stub
						for(duixiang.qita.biaoji_1 = 0;duixiang.qita.biaoji_1<=10000; duixiang.qita.biaoji_1++){
							qita.lishishuju_1[duixiang.qita.biaoji_1] = qita.lishishuju[duixiang.qita.biaoji_1];
							try {
								Thread.sleep(50);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						duixiang.qita.biaoji_1 = 0;
					}
					
				};
				Thread t = new Thread(r);
				t.start();
				
				
			}
		});
		panel_1.add(button);
		
		JButton button_1 = new JButton("\u5173\u95ED");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		panel_1.add(button_1);
		
		JPanel panel_2 = new JPanel();
		lishiquxian lsqx = new lishiquxian();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		panel_2.add(lsqx, BorderLayout.CENTER);
		
	}

}
