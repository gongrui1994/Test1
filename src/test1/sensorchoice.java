package test1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class sensorchoice {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ssss = new JFrame();
		ssss.setSize(488, 200);
		ssss.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		ssss.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button = new JButton("\u4FDD\u5B58");
		
		panel.add(button);
		
		JButton button_1 = new JButton("\u53D6\u6D88");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ssss.dispose();
			}
		});
		panel.add(button_1);
		
		JPanel panel_1 = new JPanel();
		ssss.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("\u9009\u62E9\u8981\u8BBE\u7F6E\u7684\u76D1\u6D4B\u70B9");
		panel_1.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		panel_1.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		ssss.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_1 = new JLabel("\u6CE2\u8865\u4F20\u611F\u5668\uFF1A");
		panel_2.add(label_1);
		
		JLabel lblCh = new JLabel("CH");
		panel_2.add(lblCh);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		panel_2.add(comboBox_1);
		
		JLabel lblNo = new JLabel("NO.");
		panel_2.add(lblNo);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		panel_2.add(comboBox_2);
		
		JLabel label_2 = new JLabel("      \u6E29\u8865\u4F20\u611F\u5668\uFF1A");
		panel_2.add(label_2);
		
		JLabel lblCh_1 = new JLabel("CH");
		panel_2.add(lblCh_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		panel_2.add(comboBox_3);
		
		JLabel label_3 = new JLabel("NO.");
		panel_2.add(label_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		panel_2.add(comboBox_4);
		
		JLabel label_4 = new JLabel("\u6CE2\u8865\u7CFB\u6570\uFF1A");
		panel_2.add(label_4);
		
		JTextField textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel label_5 = new JLabel("\u6E29\u8865\u7CFB\u6570\uFF1A");
		panel_2.add(label_5);
		
		JTextField textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cedianxuhao = Integer.parseInt((String) comboBox.getSelectedItem());
				int bobux = Integer.parseInt((String) comboBox_1.getSelectedItem());
				int bobuy = Integer.parseInt((String) comboBox_2.getSelectedItem());
				int wenbux = Integer.parseInt((String) comboBox_3.getSelectedItem());
				int wenbuy = Integer.parseInt((String) comboBox_4.getSelectedItem());
				double bobuxishu = Double.parseDouble(textField.getText());
				double wenbuxishu = (double)Integer.parseInt(textField_1.getText());
				
				//将参数存入数据库中
				dao.DBBean daodao = new dao.DBBean();
				String sql = null;
				sql = "update msql.peizhi set bsensorx = '"+bobux+"',bsensory = '"+bobuy+"',wsensorx = '"+wenbux+"', wsensory = '"+wenbuy+"', bxishu = '"+bobuxishu+"', wxishu = '"+wenbuxishu+"' where xuhao = '"+cedianxuhao+"'";
				daodao.update(sql);
				ssss.dispose();
				
			}
		});
		ssss.setVisible(true);
	}
}
