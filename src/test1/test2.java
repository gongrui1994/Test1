package test1;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.BoxLayout;
import java.awt.Font;

public class test2 {
	
	private JFrame frame;
	private JTable table;
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	JPanel panel_3 = new JPanel();
	JPanel panel_4 = new JPanel();
	JPanel panel_5 = new JPanel();
	JPanel panel_6 = new JPanel();

	JScrollPane scrollPane = new JScrollPane();
	
	public static Date time = new Date();
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static int x, y;
	public static boolean exit = false;
	public static byte[] buf = new byte[1058];				//用于接收设备发送来的数据
	public static double[][] c = new double[16][100];		//对数据的第一次处理
	public static String[][] d = new String[16][16];		//对数据的第二次处理
	public static int a = 0;
	private JTextField textField;
	private quxian qx;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		///*
		JFrame tupianframe = new JFrame();
		JPanel tupianpanel = new JPanel();
		tupianframe.getContentPane().setLayout(new FlowLayout());
		tupianframe.getContentPane().add(tupianpanel);
		ImageIcon img = new ImageIcon("Image/fengche.gif");
		JLabel label = new JLabel(img);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tupianframe.dispose();
			//	*/
				//====================================================
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							test2 window = new test2();
							window.frame.setIconImage(new ImageIcon("image/hit.jpg").getImage());
							window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
							//
							window.frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
							window.frame.addWindowListener(new WindowAdapter() {
							            public void windowClosing(WindowEvent e) {
							                int option = JOptionPane.showConfirmDialog(null, "是否退出该系统？",
							                        "系统提示", JOptionPane.YES_NO_OPTION,
							                        JOptionPane.QUESTION_MESSAGE);
							                if (option == JOptionPane.YES_OPTION)
							                    System.exit(0);
							            }
							        });
							//
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				//=====================================================
		///*
			}
		});
		tupianpanel.add(label);
		tupianframe.setSize(360,240);
		tupianframe.setLocationRelativeTo(null);	//让frame居中显示
		//tupianpanel.setOpaque(false);			//让Panel控件透明
		tupianframe.setUndecorated(true);			//让frame边框透明
		tupianframe.setVisible(true);
		
		//*/
	
		
	}
	
	/**
	 * Create the application.
	 */
	public test2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setTitle("\u5149\u7EA4\u5149\u6805\u5E94\u53D8\u76D1\u6D4B\u7CFB\u7EDF");
		frame.setBounds(100, 100, 1023, 603);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton button = new JButton("开始监测");
		button.addActionListener(new ActionListener() {
			boolean start = false;
			public void actionPerformed(ActionEvent e) {
				button.setText(start ? "开始监测" : "停止监测");
				if(start == false){
					start = true;
					//发送开始命令
					byte[] kaishi = new byte[4];	//创建字符型数组保存指令
					kaishi[0] = 0x10;
					kaishi[1] = 0x20;
					kaishi[2] = 0x06;
					kaishi[3] = 0x01;
			        try {  
			            InetAddress address = InetAddress.getByName("192.168.0.19");  //服务器地址  
			            int port = 4567;  //服务器的端口号  
			            //创建发送方的数据报信息  
			            DatagramPacket dataGramPacket = new DatagramPacket(kaishi, kaishi.length, address, port);  
			              
			            DatagramSocket socket = new DatagramSocket();  //创建套接字  
			            socket.send(dataGramPacket);  //通过套接字发送数据  
			              
			            socket.close();  
			              
			        } catch (UnknownHostException ekaishi) {  
			            System.out.println("行报异常"); 
			        } catch (IOException ekaishi) {  
			        	System.out.println("行报异常");  
			        }
			        //===============================接收数据============================================
			        Runnable xiancheng1 = new Runnable(){
						@Override
						public void run() {
							// TODO Auto-generated method stub
							try{
								while(!exit){
									try {  
										InetAddress address = InetAddress.getLocalHost();  
										int port = 8001;    			  
										//创建DatagramSocket对象  
										DatagramSocket socket = new DatagramSocket(port, address);  			  
										DatagramPacket packet = new DatagramPacket(buf, buf.length);  //创建DatagramPacket对象  
										
										socket.receive(packet);  //通过套接字接收数据  
										socket.close();  //关闭套接字  
											  
										} catch (UnknownHostException e1) {  
											e1.printStackTrace();  
										} catch(IOException e2) {  
											e2.printStackTrace();  
										}
									
								}
							}catch(Exception xiancheng1){
								System.out.println("153chucuo");
							}
						}	
			        };
			        Thread thread1 = new Thread(xiancheng1);
					thread1.start();
			        //=================================================================================
					
					//==================================显示数据===============================================
					Runnable xiancheng2 = new Runnable(){
						@Override
						public void run() {
							// TODO Auto-generated method stub
							try{
								//第一次处理数据
								for(int b = 2; b < 66; b++){
									c[0][b-2] = buf[b]&0xff;
								}	
								for(int b = 66; b < 132; b++){
									c[1][b-66] = buf[b]&0xff;
								}
								for(int b = 132; b < 198; b++){
									c[2][b-132] = buf[b]&0xff;
								}
								for(int b = 198; b < 264; b++){
									c[3][b-198] = buf[b]&0xff;
								}
								for(int b = 264; b < 330; b++){
									c[4][b-264] = buf[b]&0xff;
								}
								for(int b = 330; b < 369; b++){
									c[5][b-330] = buf[b]&0xff;
								}
								for(int b = 369; b < 462; b++){
									c[6][b-369] = buf[b]&0xff;
								}
								for(int b = 462; b < 528; b++){
									c[7][b-462] = buf[b]&0xff;
								}
								for(int b = 528; b < 594; b++){
									c[8][b-528] = buf[b]&0xff;
								}
								for(int b = 594; b < 660; b++){
									c[9][b-594] = buf[b]&0xff;
								}
								for(int b = 660; b < 726; b++){
									c[10][b-660] = buf[b]&0xff;
								}
								for(int b = 726; b < 792; b++){
									c[11][b-726] = buf[b]&0xff;
								}
								for(int b = 792; b < 858; b++){
									c[12][b-792] = buf[b]&0xff;
								}
								for(int b = 858; b < 924; b++){
									c[13][b-858] = buf[b]&0xff;
								}
								for(int b = 924; b < 990; b++){
									c[14][b-924] = buf[b]&0xff;
								}
								for(int b = 990; b < 1056; b++){
									c[15][b-990] = buf[b]&0xff;
								}
								
								//第二次处理数据
								//将数组c[16][66]通过计算后得到信号波长，并赋值给d[16][16]
								int x = 1;
								for(int d1 = 0; d1 < 16; d1++){
									for(int d2 = 0; d2 < 16; d2++){
										double x1 = c[d1][x];
										double x2 = c[d1][x+1];
										double x3 = c[d1][x+2];
										double pin = ( x1*65536 + x2*256 + x3 ) / 10;
										if(pin>0){
											d[d1][d2] = Double.toString(pin);
										}else{
											d[d1][d2] = null;
										}
										x = x + 4;
										if(x == 65){
											x = 1;
										}
									}
								}
								//将数据显示到表格里
								//= String .format("%.3f",datas);
								for(int i=0; i<=15; i++){  		//16行
									for(int j=0; j<=15; j++){	//17列
										if(d[i][j] != null ){
											table.setValueAt(String .format("%.5f", d[i][j]), i, j+1);
										}
									}
								}
								
							}catch(Exception xiancheng2){
								xiancheng2.printStackTrace();
							}
						}	
					};
					Thread thread2 = new Thread(xiancheng2);
					thread2.start();
					//=================================================================================
			        
				}else{
					start = false;
					//发送停止命令
					exit = true;
					byte[] tingzhi = new byte[4];	//创建字符型数组保存指令
					tingzhi[0] = 0x10;
					tingzhi[1] = 0x20;
					tingzhi[2] = 0x06;
					tingzhi[3] = 0x03;
			        try {  
			            InetAddress address = InetAddress.getByName("192.168.0.19");  //服务器地址  
			            int port = 4567;  //服务器的端口号  
			            //创建发送方的数据报信息  
			            DatagramPacket dataGramPacket = new DatagramPacket(tingzhi, tingzhi.length, address, port);  
			              
			            DatagramSocket socket = new DatagramSocket();  //创建套接字  
			            socket.send(dataGramPacket);  //通过套接字发送数据  
			              
			            socket.close();  
			              
			        } catch (UnknownHostException etingzhi) {  
			        	System.out.println("106行报异常"); 
			        } catch (IOException etingzhi) {  
			        	System.out.println("108行报异常");
			        }
				}
			}
		});
		panel.add(button);
		JButton button_2 = new JButton("保存数据");
		button_2.addActionListener(new ActionListener() {
			boolean baocun = false;
			public void actionPerformed(ActionEvent arg0) {
				button_2.setText(baocun ? "保存数据" : "停止保存");
				if(baocun == false){
					baocun = true;
					File file = new File("d:\\date.txt");

					try {
						FileWriter out = new FileWriter(file);
						out.write(df.format(time) + "\0");
						out.write("wendu" + "\r\n");
						for(int i=0; i<=15; i++){
							for(int j=0; j<=15; j++){
								out.write(String .format("%.5f", d[j][i]) + "\0");
								if(j==15){
									out.write("\r\n");
								}
							}
						}
						out.write("\r\n");
						out.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					baocun = false;
				}
			}
			private String String(String format) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		panel.add(button_2);
		
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(34, 139, 34), new Color(34, 139, 34), new Color(34, 139, 34), new Color(34, 139, 34)));
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JTree tree = new JTree();
		tree.setFont(new Font("宋体", Font.PLAIN, 16));
		tree.setBackground(new Color(135, 206, 250));
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("\u76D1\u6D4B\u70B9:") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B901");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B902");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B903");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B904");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B905");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B906");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B907");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B908");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B909");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B910");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B911");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B912");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B913");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B914");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B915");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("\u76D1\u6D4B\u70B916");
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6570\u636E"));
						node_1.add(new DefaultMutableTreeNode("\u6D4B\u70B9\u6E29\u5EA6"));
					add(node_1);
				}
			}
		));
		panel_1.add(tree, BorderLayout.NORTH);
		
		JScrollPane scrollPane_1 = new JScrollPane(tree);
		panel_1.add(scrollPane_1);
		
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(220, 20, 60), new Color(220, 20, 60), new Color(220, 20, 60), new Color(220, 20, 60)));
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(127, 255, 212), new Color(127, 255, 212), new Color(127, 255, 212), new Color(127, 255, 212)));
		frame.getContentPane().add(panel_3, BorderLayout.CENTER);
		CardLayout card = new CardLayout(0, 0);
		panel_3.setLayout(card);
		
		JButton button_1 = new JButton("显示曲线");
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {
			boolean xianshiquxian = false;
			public void actionPerformed(ActionEvent arg0) {
				button_1.setText(xianshiquxian ? "显示曲线" : "显示列表");
				if(xianshiquxian == false){
					xianshiquxian = true;
				}else{
					xianshiquxian = false;
				}
				card.next(panel_3); //next下一张  previous指定的一张的前一张
			}
		});
		
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, new Color(186, 85, 211), new Color(186, 85, 211), new Color(186, 85, 211), new Color(186, 85, 211)));
		panel_3.add(scrollPane, "name_1937241411922452");
		
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBackground(new Color(211, 211, 211));
		
		Runnable repaintTable = new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					table.setModel(new myTableModel());
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}		
		};
		Thread rt = new Thread(repaintTable);
		rt.start();
		//table.setModel(new myTableModel());

		scrollPane.setViewportView(table);
		
		panel_3.add(panel_4, "name_1937894123940650");
		panel_4.setLayout(new BorderLayout(0, 0));
		
		panel_4.add(panel_5, BorderLayout.SOUTH);
		
		JLabel label = new JLabel("\u9009\u62E9\u901A\u9053:");
		panel_5.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String xx = (String) comboBox.getSelectedItem();
				switch(xx){
					case "CH01":x = 0;
					break;
					case "CH02":x = 1;
					break;
					case "CH03":x = 2;
					break;
					case "CH04":x = 3;
					break;
					case "CH05":x = 4;
					break;
					case "CH06":x = 5;
					break;
					case "CH07":x = 6;
					break;
					case "CH08":x = 7;
					break;
					case "CH09":x = 8;
					break;
					case "CH10":x = 9;
					break;
					case "CH11":x = 10;
					break;
					case "CH12":x = 11;
					break;
					case "CH13":x = 12;
					break;
					case "CH14":x = 13;
					break;
					case "CH15":x = 14;
					break;
					case "CH16":x = 15;
					break;
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CH01", "CH02", "CH03", "CH04", "CH05", "CH06", "CH07", "CH08", "CH09", "CH10", "CH11", "CH12", "CH13", "CH14", "CH15", "CH16"}));
		panel_5.add(comboBox);
		
		JLabel label_1 = new JLabel("\u9009\u62E9\u5E8F\u53F7:");
		panel_5.add(label_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String yy = (String) comboBox_1.getSelectedItem();
				switch(yy){
					case "No.01":y = 0;
					break;
					case "No.02":y = 1;
					break;
					case "No.03":y = 2;
					break;
					case "No.04":y = 3;
					break;
					case "No.05":y = 4;
					break;
					case "No.06":y = 5;
					break;
					case "No.07":y = 6;
					break;
					case "No.08":y = 7;
					break;
					case "No.09":y = 8;
					break;
					case "No.10":y = 9;
					break;
					case "No.11":y = 10;
					break;
					case "No.12":y = 11;
					break;
					case "No.13":y = 12;
					break;
					case "No.14":y = 13;
					break;
					case "No.15":y = 14;
					break;
					case "No.16":y = 15;
					break;
				}
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"No.01", "No.02", "No.03", "No.04", "No.05", "No.06", "No.07", "No.08", "No.09", "No.10", "No.11", "No.12", "No.13", "No.14", "No.15", "No.16"}));
		panel_5.add(comboBox_1);
		
		JLabel label_2 = new JLabel("\u5F53\u524D\u6CE2\u957F:");
		panel_5.add(label_2);
		
		textField = new JTextField();
		
		Runnable textFieldxiancheng = new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					textField.setText(String .format("%.5f", d[x][y]));
				}
			}		
		};
		Thread thr = new Thread(textFieldxiancheng);
		thr.start();

		panel_5.add(textField);
		textField.setColumns(10);
		
		panel_4.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		qx = new quxian();
		panel_6.add(qx, BorderLayout.NORTH);
	
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		frame.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u6587\u4EF6");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u5BFC\u5165\u6570\u636E");
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u5BFC\u51FA\u6570\u636E");
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u9000\u51FA");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 int option = JOptionPane.showConfirmDialog(null, "是否退出该系统？",
	                        "系统提示", JOptionPane.YES_NO_OPTION,
	                        JOptionPane.QUESTION_MESSAGE);
	                if (option == JOptionPane.YES_OPTION)
	                    System.exit(0);
			}
		});
		menu.add(menuItem_2);
		
		JMenu menu_1 = new JMenu("\u76D1\u6D4B\u70B9");
		menuBar.add(menu_1);
		
		JMenu menu_2 = new JMenu("\u4F20\u611F\u5668");
		menuBar.add(menu_2);
		
		JMenu menu_3 = new JMenu("\u62A5\u8B66");
		menuBar.add(menu_3);
		
		JMenu menu_4 = new JMenu("\u5386\u53F2\u67E5\u8BE2");
		menuBar.add(menu_4);
		
		JMenu menu_5 = new JMenu("\u7CFB\u7EDF\u914D\u7F6E");
		menuBar.add(menu_5);
		
		JMenuItem menuItem_4 = new JMenuItem("\u6570\u636E\u5B58\u50A8");
		menu_5.add(menuItem_4);
		
		JMenu menu_6 = new JMenu("\u62A5\u8868\u5B50\u7CFB\u7EDF");
		menuBar.add(menu_6);
		
		JMenu menu_7 = new JMenu("\u76D1\u6D4B\u70B9\u5E03\u7F6E\u56FE");
		menuBar.add(menu_7);
		
		JMenu menu_9 = new JMenu("\u5E2E\u52A9");
		menuBar.add(menu_9);
		
		JMenuItem menuItem_3 = new JMenuItem("\u5F00\u53D1\u4EBA\u5458");
		menu_9.add(menuItem_3);
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
/*
 class myTableModel extends DefaultTableModel {

    
    /**
     * 
     */
  /*  private static final long serialVersionUID = 1L;
    Object[][] datas = {
    		{ "01", test2.a++, test2.d[0][0], null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "02", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "03", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "04", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "05", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "06", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "07", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "08", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "09", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "10", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "11", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "12", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "13", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "14", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "15", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			{ "16", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
    };
    
    Object[] colums = { "序号", "CH01", "CH02", "CH03", "CH04", "CH05", "CH06", "CH07", "CH08", "CH09", "CH10", "CH11", "CH12", "CH13", "CH14", "CH15", "CH16" };

    public myTableModel() {
        this.setDataVector(datas, colums);
    }
}
*/