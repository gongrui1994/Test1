package test1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.tree.TreeNode;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

public class qqqq {

	public static void main(String[] args) {
		ImageIcon ic = new ImageIcon("image/hit.jpg");
		JLabel label=new JLabel();
		JFrame j = new JFrame();
		JPanel jj = new JPanel(){
				public void paintComponent(Graphics g){
				 ImageIcon icon = new ImageIcon("image/hit.jpg");
				 // 图片随窗体大小而变化
				 g.drawImage(icon.getImage(), 0, 0, j.getSize().width,j.getSize().height,j);
			 }
		};
		j.getContentPane().add(jj);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setToolTipText("1112222");
		GroupLayout gl_jj = new GroupLayout(jj);
		gl_jj.setHorizontalGroup(
			gl_jj.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jj.createSequentialGroup()
					.addGap(171)
					.addComponent(btnNewButton)
					.addContainerGap(280, Short.MAX_VALUE))
		);
		gl_jj.setVerticalGroup(
			gl_jj.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_jj.createSequentialGroup()
					.addContainerGap(229, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(223))
		);
		jj.setLayout(gl_jj);
		JButton b = new JButton("aaa");
		j.setSize(500,500);	
		j.setVisible(true);
		
		
		
		
		
	}

}
