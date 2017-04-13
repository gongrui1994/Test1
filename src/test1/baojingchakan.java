package test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class baojingchakan extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baojingchakan frame = new baojingchakan();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
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
	public baojingchakan() {
		setFont(new Font("宋体", Font.PLAIN, 12));
		setTitle("\u62A5\u8B66\u4FE1\u606F\u67E5\u770B");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.NORTH);
		
		JLabel label_1 = new JLabel("\u62A5\u8B66\u4FE1\u606F\u7F16\u53F7\uFF1A");
		panel_3.add(label_1);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(5);
		
		JButton button_2 = new JButton("\u6DFB\u52A0\u5907\u6CE8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bianhao = Integer.parseInt(textField.getText());
				String bz = textField_1.getText();
				dao.DBBean d = new dao.DBBean();
				String sql_2 = null;
				sql_2 = "update msql.baojingxinxi set beizhu = '"+bz+"' where Id = '"+bianhao+"'";
				d.update(sql_2);
				d.close();
				dispose();
				baojingchakan frame = new baojingchakan();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
			}
		});
		
		JLabel label_2 = new JLabel("\u5907\u6CE8\uFF1A");
		panel_3.add(label_2);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		panel_3.add(button_2);
		
		JButton button = new JButton("关闭");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel_3.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\u62A5\u8B66\u4FE1\u606F");
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(1000);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		panel_2.add(scrollPane);
		
		dao.DBBean dao = new dao.DBBean();
		String sql = null;
		//sql = "selcet * from msql.baojingxinxi where Id > (select count(*) from msql.baojingxinxi) - 1000";
		sql = "select * from msql.baojingxinxi where biaoji = '1' order by Id DESC LIMIT 1000";
		ResultSet rs = dao.query(sql);
		try {
			while(rs.next()){
				textArea.append("编号:  "+ rs.getString("Id") + "\t" + "时间:  " + rs.getString("time") + "\t" + "测点序号:  " +rs.getString("baojingcedianxuhao") + "\t" + "异常数据:  " +rs.getString("cuowuzhi") + "\t" + "备注:" + rs.getString("beizhu") + "\n");
				textArea.setCaretPosition(0); //将光标移动到位置0处
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao.close();
		
	}

}
