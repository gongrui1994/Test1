package test1;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class kaishitupian {
	public static void main(String[] args){
		JFrame tupianframe = new JFrame();
		JPanel tupianpanel = new JPanel();
		tupianframe.getContentPane().setLayout(new FlowLayout());
		tupianframe.getContentPane().add(tupianpanel);
		ImageIcon img = new ImageIcon("Image/fengche.gif");
		JLabel label = new JLabel(img);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("hello");
			}
		});
		tupianpanel.add(label);
		tupianframe.setSize(360,240);
		tupianframe.setLocationRelativeTo(null);	//��frame������ʾ
		//tupianpanel.setOpaque(false);			//��Panel�ؼ�͸��
		tupianframe.setUndecorated(true);			//��frame�߿�͸��
		tupianframe.setVisible(true);
	}
}
