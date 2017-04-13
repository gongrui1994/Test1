package test1;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class bochang {

	public static int aa = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame bo = new JFrame();
		bo.setSize(701, 455);
		bo.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		bo.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, "name_11622246567680");
		

		
		JTable table_1 = new JTable();
		
		scrollPane.setViewportView(table_1);
		bo.setExtendedState(JFrame.MAXIMIZED_BOTH);	
		
		Runnable sss = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					table_1.setModel(new myTableModel());
					aa++;
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
		Thread ss= new Thread(sss);
		ss.start();
		
		
		bo.setVisible(true);
	}

}

