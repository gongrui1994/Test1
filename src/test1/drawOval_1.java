package test1;

import java.awt.Graphics;

import javax.swing.JPanel;
		  
// ����һ��MyPanel��壬���ڻ�ͼ����  
class drawOval_1 extends JPanel{  
		    //����JPanel  
		    // Graphics �ǻ�ͼ����Ҫ�࣬��������һ֧����  
		public void paint(Graphics g){  
		        //  1. ���ø��ຯ����ɳ�ʼ������  
		        //  ��仰��������  
		        super.paint(g);  
		          
		        // �Ȼ���һ��ԲȦ  
		        g.drawOval(100, 100, 30, 30);  
		        g.drawOval(100, 200, 30, 30);
		        
		}  
}

