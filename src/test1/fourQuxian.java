package test1;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class fourQuxian extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public fourQuxian() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		
		JLabel lbll_4 = new JLabel("\u6D4B\u70B9L1");
		panel_2.add(lbll_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"}));
		panel_2.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String c_1 = (String) comboBox.getSelectedItem();
				switch(c_1){
				case "1": test1.cedianxuhao_1 = 0;
				break;
				case "2": test1.cedianxuhao_1 = 1;
				break;
				case "3": test1.cedianxuhao_1 = 2;
				break;
				case "4": test1.cedianxuhao_1 = 3;
				break;
				case "5": test1.cedianxuhao_1 = 4;
				break;
				case "6": test1.cedianxuhao_1 = 5;
				break;
				case "7": test1.cedianxuhao_1 = 6;
				break;
				case "8": test1.cedianxuhao_1 = 7;
				break;
				case "9": test1.cedianxuhao_1 = 8;
				break;
				case "10": test1.cedianxuhao_1 = 9;
				break;
				case "11": test1.cedianxuhao_1 = 10;
				break;
				case "12": test1.cedianxuhao_1 = 11;
				break;
				case "13": test1.cedianxuhao_1 = 12;
				break;
				case "14": test1.cedianxuhao_1 = 13;
				break;
				case "15": test1.cedianxuhao_1 = 14;
				break;
				case "16": test1.cedianxuhao_1 = 15;
				break;
				case "17": test1.cedianxuhao_1 = 16;
				break;
				case "18": test1.cedianxuhao_1 = 17;
				break;
				case "19": test1.cedianxuhao_1 = 18;
				break;
				case "20": test1.cedianxuhao_1 = 19;
				break;
				case "21": test1.cedianxuhao_1 = 20;
				break;
				case "22": test1.cedianxuhao_1 = 21;
				break;
				case "23": test1.cedianxuhao_1 = 22;
				break;
				case "24": test1.cedianxuhao_1 = 23;
				break;
				case "25": test1.cedianxuhao_1 = 24;
				break;
				case "26": test1.cedianxuhao_1 = 25;
				break;
				case "27": test1.cedianxuhao_1 = 26;
				break;
				case "28": test1.cedianxuhao_1 = 27;
				break;
				case "29": test1.cedianxuhao_1 = 28;
				break;
				case "30": test1.cedianxuhao_1 = 29;
				break;
				case "31": test1.cedianxuhao_1 = 30;
				break;
				case "32": test1.cedianxuhao_1 = 31;
				break;
				case "33": test1.cedianxuhao_1 = 32;
				break;
				case "34": test1.cedianxuhao_1 = 33;
				break;
				case "35": test1.cedianxuhao_1 = 34;
				break;
				case "36": test1.cedianxuhao_1 = 35;
				break;
				case "37": test1.cedianxuhao_1 = 36;
				break;
				case "38": test1.cedianxuhao_1 = 37;
				break;
				case "39": test1.cedianxuhao_1 = 38;
				break;
				case "40": test1.cedianxuhao_1 = 39;
				break;
				case "41": test1.cedianxuhao_1 = 40;
				break;
				case "42": test1.cedianxuhao_1 = 41;
				break;
				case "43": test1.cedianxuhao_1 = 42;
				break;
				case "44": test1.cedianxuhao_1 = 43;
				break;
				case "45": test1.cedianxuhao_1 = 44;
				break;
				case "46": test1.cedianxuhao_1 = 45;
				break;
				case "47": test1.cedianxuhao_1 = 46;
				break;
				case "48": test1.cedianxuhao_1 = 47;
				break;
				}
			}
		});
		
		JLabel lbll_5 = new JLabel("\u6D4B\u70B9L2");
		panel_2.add(lbll_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"}));
		panel_2.add(comboBox_1);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c_2 = (String) comboBox_1.getSelectedItem();
				switch(c_2){
				case "1": test1.cedianxuhao_2 = 0;
				break;
				case "2": test1.cedianxuhao_2 = 1;
				break;
				case "3": test1.cedianxuhao_2 = 2;
				break;
				case "4": test1.cedianxuhao_2 = 3;
				break;
				case "5": test1.cedianxuhao_2 = 4;
				break;
				case "6": test1.cedianxuhao_2 = 5;
				break;
				case "7": test1.cedianxuhao_2 = 6;
				break;
				case "8": test1.cedianxuhao_2 = 7;
				break;
				case "9": test1.cedianxuhao_2 = 8;
				break;
				case "10": test1.cedianxuhao_2 = 9;
				break;
				case "11": test1.cedianxuhao_2 = 10;
				break;
				case "12": test1.cedianxuhao_2 = 11;
				break;
				case "13": test1.cedianxuhao_2 = 12;
				break;
				case "14": test1.cedianxuhao_2 = 13;
				break;
				case "15": test1.cedianxuhao_2 = 14;
				break;
				case "16": test1.cedianxuhao_2 = 15;
				break;
				case "17": test1.cedianxuhao_2 = 16;
				break;
				case "18": test1.cedianxuhao_2 = 17;
				break;
				case "19": test1.cedianxuhao_2 = 18;
				break;
				case "20": test1.cedianxuhao_2 = 19;
				break;
				case "21": test1.cedianxuhao_2 = 20;
				break;
				case "22": test1.cedianxuhao_2 = 21;
				break;
				case "23": test1.cedianxuhao_2 = 22;
				break;
				case "24": test1.cedianxuhao_2 = 23;
				break;
				case "25": test1.cedianxuhao_2 = 24;
				break;
				case "26": test1.cedianxuhao_2 = 25;
				break;
				case "27": test1.cedianxuhao_2 = 26;
				break;
				case "28": test1.cedianxuhao_2 = 27;
				break;
				case "29": test1.cedianxuhao_2 = 28;
				break;
				case "30": test1.cedianxuhao_2 = 29;
				break;
				case "31": test1.cedianxuhao_2 = 30;
				break;
				case "32": test1.cedianxuhao_2 = 31;
				break;
				case "33": test1.cedianxuhao_2 = 32;
				break;
				case "34": test1.cedianxuhao_2 = 33;
				break;
				case "35": test1.cedianxuhao_2 = 34;
				break;
				case "36": test1.cedianxuhao_2 = 35;
				break;
				case "37": test1.cedianxuhao_2 = 36;
				break;
				case "38": test1.cedianxuhao_2 = 37;
				break;
				case "39": test1.cedianxuhao_2 = 38;
				break;
				case "40": test1.cedianxuhao_2 = 39;
				break;
				case "41": test1.cedianxuhao_2 = 40;
				break;
				case "42": test1.cedianxuhao_2 = 41;
				break;
				case "43": test1.cedianxuhao_2 = 42;
				break;
				case "44": test1.cedianxuhao_2 = 43;
				break;
				case "45": test1.cedianxuhao_2 = 44;
				break;
				case "46": test1.cedianxuhao_2 = 45;
				break;
				case "47": test1.cedianxuhao_2 = 46;
				break;
				case "48": test1.cedianxuhao_2 = 47;
				break;
				
				}
			}
		});
		
		JLabel lbll_6 = new JLabel("\u6D4B\u70B9L3");
		panel_2.add(lbll_6);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"}));
		panel_2.add(comboBox_2);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c_3 = (String) comboBox_2.getSelectedItem();
				switch(c_3){
				case "1": test1.cedianxuhao_3 = 0;
				break;
				case "2": test1.cedianxuhao_3 = 1;
				break;
				case "3": test1.cedianxuhao_3 = 2;
				break;
				case "4": test1.cedianxuhao_3 = 3;
				break;
				case "5": test1.cedianxuhao_3 = 4;
				break;
				case "6": test1.cedianxuhao_3 = 5;
				break;
				case "7": test1.cedianxuhao_3 = 6;
				break;
				case "8": test1.cedianxuhao_3 = 7;
				break;
				case "9": test1.cedianxuhao_3 = 8;
				break;
				case "10": test1.cedianxuhao_3 = 9;
				break;
				case "11": test1.cedianxuhao_3 = 10;
				break;
				case "12": test1.cedianxuhao_3 = 11;
				break;
				case "13": test1.cedianxuhao_3 = 12;
				break;
				case "14": test1.cedianxuhao_3 = 13;
				break;
				case "15": test1.cedianxuhao_3 = 14;
				break;
				case "16": test1.cedianxuhao_3 = 15;
				break;
				case "17": test1.cedianxuhao_3 = 16;
				break;
				case "18": test1.cedianxuhao_3 = 17;
				break;
				case "19": test1.cedianxuhao_3 = 18;
				break;
				case "20": test1.cedianxuhao_3 = 19;
				break;
				case "21": test1.cedianxuhao_3 = 20;
				break;
				case "22": test1.cedianxuhao_3 = 21;
				break;
				case "23": test1.cedianxuhao_3 = 22;
				break;
				case "24": test1.cedianxuhao_3 = 23;
				break;
				case "25": test1.cedianxuhao_3 = 24;
				break;
				case "26": test1.cedianxuhao_3 = 25;
				break;
				case "27": test1.cedianxuhao_3 = 26;
				break;
				case "28": test1.cedianxuhao_3 = 27;
				break;
				case "29": test1.cedianxuhao_3 = 28;
				break;
				case "30": test1.cedianxuhao_3 = 29;
				break;
				case "31": test1.cedianxuhao_3 = 30;
				break;
				case "32": test1.cedianxuhao_3 = 31;
				break;
				case "33": test1.cedianxuhao_3 = 32;
				break;
				case "34": test1.cedianxuhao_3 = 33;
				break;
				case "35": test1.cedianxuhao_3 = 34;
				break;
				case "36": test1.cedianxuhao_3 = 35;
				break;
				case "37": test1.cedianxuhao_3 = 36;
				break;
				case "38": test1.cedianxuhao_3 = 37;
				break;
				case "39": test1.cedianxuhao_3 = 38;
				break;
				case "40": test1.cedianxuhao_3 = 39;
				break;
				case "41": test1.cedianxuhao_3 = 40;
				break;
				case "42": test1.cedianxuhao_3 = 41;
				break;
				case "43": test1.cedianxuhao_3 = 42;
				break;
				case "44": test1.cedianxuhao_3 = 43;
				break;
				case "45": test1.cedianxuhao_3 = 44;
				break;
				case "46": test1.cedianxuhao_3 = 45;
				break;
				case "47": test1.cedianxuhao_3 = 46;
				break;
				case "48": test1.cedianxuhao_3 = 47;
				break;
			
				}
			}
		});
		
		JLabel lbll_7 = new JLabel("\u6D4B\u70B9L4");
		panel_2.add(lbll_7);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"}));
		panel_2.add(comboBox_3);
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c_4 = (String) comboBox_3.getSelectedItem();
				switch(c_4){
				case "1": test1.cedianxuhao_4 = 0;
				break;
				case "2": test1.cedianxuhao_4 = 1;
				break;
				case "3": test1.cedianxuhao_4 = 2;
				break;
				case "4": test1.cedianxuhao_4 = 3;
				break;
				case "5": test1.cedianxuhao_4 = 4;
				break;
				case "6": test1.cedianxuhao_4 = 5;
				break;
				case "7": test1.cedianxuhao_4 = 6;
				break;
				case "8": test1.cedianxuhao_4 = 7;
				break;
				case "9": test1.cedianxuhao_4 = 8;
				break;
				case "10": test1.cedianxuhao_4 = 9;
				break;
				case "11": test1.cedianxuhao_4 = 10;
				break;
				case "12": test1.cedianxuhao_4 = 11;
				break;
				case "13": test1.cedianxuhao_4 = 12;
				break;
				case "14": test1.cedianxuhao_4 = 13;
				break;
				case "15": test1.cedianxuhao_4 = 14;
				break;
				case "16": test1.cedianxuhao_4 = 15;
				break;
				case "17": test1.cedianxuhao_4 = 16;
				break;
				case "18": test1.cedianxuhao_4 = 17;
				break;
				case "19": test1.cedianxuhao_4 = 18;
				break;
				case "20": test1.cedianxuhao_4 = 19;
				break;
				case "21": test1.cedianxuhao_4 = 20;
				break;
				case "22": test1.cedianxuhao_4 = 21;
				break;
				case "23": test1.cedianxuhao_4 = 22;
				break;
				case "24": test1.cedianxuhao_4 = 23;
				break;
				case "25": test1.cedianxuhao_4 = 24;
				break;
				case "26": test1.cedianxuhao_4 = 25;
				break;
				case "27": test1.cedianxuhao_4 = 26;
				break;
				case "28": test1.cedianxuhao_4 = 27;
				break;
				case "29": test1.cedianxuhao_4 = 28;
				break;
				case "30": test1.cedianxuhao_4 = 29;
				break;
				case "31": test1.cedianxuhao_4 = 30;
				break;
				case "32": test1.cedianxuhao_4 = 31;
				break;
				case "33": test1.cedianxuhao_4 = 32;
				break;
				case "34": test1.cedianxuhao_4 = 33;
				break;
				case "35": test1.cedianxuhao_4 = 34;
				break;
				case "36": test1.cedianxuhao_4 = 35;
				break;
				case "37": test1.cedianxuhao_4 = 36;
				break;
				case "38": test1.cedianxuhao_4 = 37;
				break;
				case "39": test1.cedianxuhao_4 = 38;
				break;
				case "40": test1.cedianxuhao_4 = 39;
				break;
				case "41": test1.cedianxuhao_4 = 40;
				break;
				case "42": test1.cedianxuhao_4 = 41;
				break;
				case "43": test1.cedianxuhao_4 = 42;
				break;
				case "44": test1.cedianxuhao_4 = 43;
				break;
				case "45": test1.cedianxuhao_4 = 44;
				break;
				case "46": test1.cedianxuhao_4 = 45;
				break;
				case "47": test1.cedianxuhao_4 = 46;
				break;
				case "48": test1.cedianxuhao_4 = 47;
				break;
				
				}
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.SOUTH);
		
		JLabel lbll = new JLabel("\u6D4B\u70B9L1\u5E94\u53D8\uFF1A");
		panel_3.add(lbll);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lbll_1 = new JLabel("\u6D4B\u70B9L2\u5E94\u53D8\uFF1A");
		panel_3.add(lbll_1);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lbll_2 = new JLabel("\u6D4B\u70B9L3\u5E94\u53D8\uFF1A");
		panel_3.add(lbll_2);
		
		textField_2 = new JTextField();
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lbll_3 = new JLabel("\u6D4B\u70B9L4\u5E94\u53D8\uFF1A");
		panel_3.add(lbll_3);
		
		textField_3 = new JTextField();
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		quxian quxian_1 = new quxian();
		panel.add(quxian_1);
		
		Runnable textFieldxiancheng_4 = new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					if(duixiang.qita.biaoji_jisuanbochang == true){
						textField.setText(String .format("%.0f", test1.yingbian[test1.cedianxuhao_1]));
						textField_1.setText(String .format("%.0f", test1.yingbian[test1.cedianxuhao_2]));
						textField_2.setText(String .format("%.0f",test1. yingbian[test1.cedianxuhao_3]));
						textField_3.setText(String .format("%.0f", test1.yingbian[test1.cedianxuhao_4]));
					}
				}
			}		
		};
		Thread thr_4 = new Thread(textFieldxiancheng_4);
		thr_4.start();
		
		
		
		
		
		
		
		
		
	}

}
