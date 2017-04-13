package test1;

import java.awt.Graphics;

import javax.swing.JPanel;
		  
// 定义一个MyPanel面板，用于绘图区域  
class drawOval_1 extends JPanel{  
		    //覆盖JPanel  
		    // Graphics 是绘图的重要类，可以理解成一支画笔  
		public void paint(Graphics g){  
		        //  1. 调用父类函数完成初始化任务  
		        //  这句话不可以少  
		        super.paint(g);  
		          
		        // 先画出一个圆圈  
		        g.drawOval(100, 100, 30, 30);  
		        g.drawOval(100, 200, 30, 30);
		        
		}  
}

