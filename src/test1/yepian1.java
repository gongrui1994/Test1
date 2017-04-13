package test1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class yepian1 {
	public static void main(String[] args){

		JFrame frameYP1 = new JFrame();
		JPanel panelYP1 = new JPanel(){
			public void paintComponent(Graphics g){
				 ImageIcon icon = new ImageIcon("image/yepian1.jpg");
				 // 图片随窗体大小而变化
				 g.drawImage(icon.getImage(), 0, 0, frameYP1.getSize().width,frameYP1.getSize().height,frameYP1);
			 }
		};
		frameYP1.getContentPane().add(panelYP1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("\u6D4B\u70B902");
		btnNewButton.setBackground(new Color(0, 100, 0));
		
		JButton button = new JButton("");
		button.setToolTipText("\u6D4B\u70B903");
		button.setBackground(new Color(0, 100, 0));
		
		JButton button_1 = new JButton("");
		button_1.setToolTipText("\u6D4B\u70B901");
		button_1.setBackground(new Color(0, 100, 0));
		
		JButton button_2 = new JButton("");
		button_2.setToolTipText("\u6D4B\u70B904");
		button_2.setBackground(new Color(0, 100, 0));
		GroupLayout gl_panelYP1 = new GroupLayout(panelYP1);
		gl_panelYP1.setHorizontalGroup(
			gl_panelYP1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelYP1.createSequentialGroup()
					.addContainerGap(499, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addGap(376))
				.addGroup(gl_panelYP1.createSequentialGroup()
					.addGap(271)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(604, Short.MAX_VALUE))
				.addGroup(gl_panelYP1.createSequentialGroup()
					.addGap(397)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(478, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panelYP1.createSequentialGroup()
					.addContainerGap(608, Short.MAX_VALUE)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addGap(267))
		);
		gl_panelYP1.setVerticalGroup(
			gl_panelYP1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelYP1.createSequentialGroup()
					.addGap(192)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addGap(97)
					.addComponent(btnNewButton)
					.addGap(78)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(207, Short.MAX_VALUE))
		);
		panelYP1.setLayout(gl_panelYP1);
		frameYP1.setSize(900, 700);
		frameYP1.setLocationRelativeTo(null); 
		frameYP1.setVisible(true);
	}
}
