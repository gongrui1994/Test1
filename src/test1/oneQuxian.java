package test1;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class oneQuxian extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public oneQuxian() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.SOUTH);
		
		JLabel label = new JLabel("\u6D4B\u70B9\u5E94\u53D8:");
		panel_1.add(label);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		danduquxian ddqx = new danduquxian();
		panel_2.add(ddqx);
		
		Runnable textField_14xc = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					if(duixiang.qita.biaoji_jisuanbochang == true){
				
					textField.setText(String .format("%.0f", test1.yingbian[test1.xuhao_1]));
					}
				}
			}
			
		};
		Thread xc_14 = new Thread(textField_14xc);
		xc_14.start();
		
	}

}
