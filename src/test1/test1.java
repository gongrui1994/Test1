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
import javax.swing.JCheckBox;

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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

import duixiang.dx;
import test1.oneQuxian;

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
import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.SystemColor;

public class test1 {
	
	private JFrame frame;
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	static JPanel panel_3 = new JPanel();
	JPanel panel_7 = new JPanel(){
		public void paintComponent(Graphics g){
			 ImageIcon icon = new ImageIcon("tu.jpg");
			 // ͼƬ�洰���С���仯
			 g.drawImage(icon.getImage(), 0, 0, 1460,640,frame);
			 //g.drawOval(11, 11, 33, 33);
		 }
	};
	
	ImageIcon anniu = new ImageIcon("image/anniu.jpg");
	ImageIcon ic2 = new ImageIcon("image/fan.jpg");
	
	public static Date time = new Date();
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static int x, y;
	public static boolean exit = false;
	public static byte[] buf = new byte[1059];				//���ڽ����豸������������
	public static double[][] c = new double[17][101];		//�����ݵĵ�һ�δ���
	public static double[][] d = new double[17][17];		//�����ݵĵڶ��δ���
	public static double[] d_1 = new double[257];			//������һά�洢
	private quxian qx;
	private danduquxian ddqx;
	public static String result;
	public static double wendu = 0;
	public static double[] yingbian = new double[48];
	public static double[] wenduyingbian = new double[12];
	public static int cedianxuhao_1 = 0;
	public static int cedianxuhao_2 = 0;
	public static int cedianxuhao_3 = 0;
	public static int cedianxuhao_4 = 0;
	public static int wenducedianxuhao_1 = 0;
	public static int wenducedianxuhao_2 = 0;
	public static int wenducedianxuhao_3 = 0;
	public static int wenducedianxuhao_4 = 0;
	public static String aastr = null;
	public static int xuhao_1 = 0, xuhao_2 = 0;
	public static JTextArea textArea;
	public static int bochangcunchupinlv = 0, yingbiancunchupinlv = 0, bochangxianshipinlv = 0;
	private JTable table = new JTable(17, 17);
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_1;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	
	public static duixiang.qita qita = new duixiang.qita();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		JFrame tupianframe = new JFrame();
		JPanel tupianpanel = new JPanel();
		tupianframe.getContentPane().setLayout(new FlowLayout());
		tupianframe.getContentPane().add(tupianpanel);
		ImageIcon img = new ImageIcon("kaishi.jpg");
		JLabel label = new JLabel(img);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tupianframe.dispose();
				
				//====================================================
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							test1 window = new test1();
							window.frame.setIconImage(new ImageIcon("image/hit.jpg").getImage());
							window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
							//
							window.frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
							window.frame.addWindowListener(new WindowAdapter() {
							            public void windowClosing(WindowEvent e) {
							                int option = JOptionPane.showConfirmDialog(null, "�Ƿ��˳���ϵͳ��",
							                        "ϵͳ��ʾ", JOptionPane.YES_NO_OPTION,
							                        JOptionPane.QUESTION_MESSAGE);
							                if (option == JOptionPane.YES_OPTION)
							                    System.exit(0);
							            }
							        });
							//
							window.frame.setVisible(true);
						} catch (Exception e) {
							//System.out.println("0000");
							e.printStackTrace();
						}
					}
				});
				//=====================================================
		
			}
		});
		tupianpanel.add(label);
		tupianframe.setSize(1000,600);
		tupianframe.setLocationRelativeTo(null);	//��frame������ʾ
		//tupianpanel.setOpaque(false);			//��Panel�ؼ�͸��
		tupianframe.setUndecorated(true);			//��frame�߿�͸��
		tupianframe.setVisible(true);
		
		
	
		
	}
	
	/**
	 * Create the application.
	 */
	public test1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		duixiang.dx ddx = new duixiang.dx();
		
		frame = new JFrame();
		frame.setForeground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setTitle("\u98CE\u529B\u53F6\u7247\u76D1\u6D4B\u7CFB\u7EDF");
		frame.setBounds(100, 100, 1066, 719);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		panel.setBackground(SystemColor.textHighlight);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton button = new JButton("��ʼ���");
		button.addActionListener(new ActionListener() {
			boolean start = false;
			public void actionPerformed(ActionEvent e) {
				duixiang.qita.biaoji_jisuanbochang = true;
				button.setText(start ? "��ʼ���" : "ֹͣ���");
				if(start == false){
					
					baojing bj = new baojing();
					start = true;
					//���Ϳ�ʼ����
					byte[] kaishi = new byte[4];	//�����ַ������鱣��ָ��
					kaishi[0] = 0x10;
					kaishi[1] = 0x20;
					kaishi[2] = 0x06;
					kaishi[3] = 0x01;
			        try {  
			            InetAddress address_1 = InetAddress.getByName("192.168.0.19");  //��������ַ  
			            int port_1 = 4567;  //�������Ķ˿ں�  
			            //�������ͷ������ݱ���Ϣ  
			            DatagramPacket dataGramPacket = new DatagramPacket(kaishi, kaishi.length, address_1, port_1);  
			              
			            DatagramSocket socket_1 = new DatagramSocket();  //�����׽���  
			            socket_1.send(dataGramPacket);  //ͨ���׽��ַ�������  
			              
			            socket_1.close();  
			              
			        } catch (UnknownHostException ekaishi) { 
			        	System.out.println("00001");
			        	ekaishi.printStackTrace();
			        } catch (IOException ekaishi) {
			        	System.out.println("00002");
			        	ekaishi.printStackTrace();  
			        }
			        
			        //===============================================================================
			        dao.DBBean aaa_2 = new dao.DBBean();
					String sql = "select * from msql.pinlv where Id = '1'";
					ResultSet jg_2 = aaa_2.query(sql);
					try {
						while(jg_2.next()){
							bochangxianshipinlv = jg_2.getInt("bcxspl");
							//System.out.println(bochangxianshipinlv);
						}
					} catch (SQLException e3) {
						// TODO Auto-generated catch block
						System.out.println("00003");
						e3.printStackTrace();
					}
	
					//================================================================================
			        Runnable xiancheng1 = new Runnable(){
						@Override
						public void run() {
							// TODO Auto-generated method stub
							try{
								InetAddress address_2 = InetAddress.getLocalHost();  
								int port_2 = 8001; 
								
								DatagramSocket socket = new DatagramSocket(port_2, address_2);  			  
								DatagramPacket packet = new DatagramPacket(buf, buf.length);  //����DatagramPacket���� 
								while(!exit){
									try {  
										//InetAddress address = InetAddress.getLocalHost();  
										//int port = 8001;    			  
										//����DatagramSocket����  
										//DatagramSocket socket = new DatagramSocket(port, address);  			  
										//DatagramPacket packet = new DatagramPacket(buf, buf.length);  //����DatagramPacket����  
										
										socket.receive(packet);  //ͨ���׽��ֽ�������  
										  //�ر��׽��� 
										//socket.close();
											  
										} catch (UnknownHostException e1) {
											System.out.println("00004");
											e1.printStackTrace();  
										} catch(IOException e2) {  
											System.out.println("00005");
											e2.printStackTrace();  
										}
									
								}
								socket.close();
							}catch(Exception xiancheng1){
								System.out.println("00006");
								xiancheng1.printStackTrace();
							}
						}	
			        };
			        Thread thread1 = new Thread(xiancheng1);
					thread1.start();
			        //=================================================================================
					Runnable bianhua = new Runnable(){

						@Override
						public void run() {
							// TODO Auto-generated method stub
							int ii = 0;
							while(duixiang.qita.biaoji_jisuanbochang){
								for(int i = 0; i <= 15; i++){
									for(int j = 0; j <= 15; j++){
										d_1[ii] = d[i][j];
										ii++;
										if(ii == 256){
											ii = 0;
										}
									}
								}
							}
						}
					};
					Thread bhxiancheng = new Thread(bianhua);
					bhxiancheng.start();
					//==================================��ʾ����===============================================
					Runnable xiancheng2 = new Runnable(){
						@Override
						public void run() {
							// TODO Auto-generated method stub
							try{
								do{
									final double gs = 299792000;
									int i=2;
									//double[][] c = new double[16][16];
									int h=0;
									int k=0;

									do{
										int q = buf[i]&0xff;
										int w = buf[i+1]&0xff;
										int t = buf[i+2]&0xff;
										int r = buf[i+3]&0xff;
										double datas = 0;
										double ww = (double)w;
										double tt = (double)t;
										double rr = (double)r;
										double yy = ww*65536 + tt*256 + rr;
										
										if(w!=0&&t!=0&&r!=0){
											datas = gs / yy * 10; 
										}
										result = String .format("%.3f",datas);
										if(datas == 0){
											result = null;
										}
										if(i==62||i==124||i==186||i==248||i==310||i==372||i==434||i==496||i==558||i==620||i==682||i==744||i==806||i==868||i==930||i==992||i==1054){
											i = i+6;
										}else{
											i = i + 4;
										}
										if(i>1058){
											i = 0;
										}
										//-----------------------
										int aa=buf[1053]&0xff;
										int bb=buf[1054]&0xff;
										int cc=buf[1055]&0xff;
										if(aa!=0&&bb!=0&&cc!=0){
											double dd = gs / ( ( aa*65536 + bb*256 + cc ) / 10 ); 
											String result2 = String .format("%.3f",dd);
											//table.setValueAt(result2, 15, 15);
											d[15][15] = dd;
										}else{
											//table.setValueAt(null, 15, 15);
										}
										//____________________________________wendu
										double asd1 = buf[1056]&0xff;
										double asd2 = buf[1057]&0xff;
										double asd = asd1*256 + asd2;
										wendu = 0 - 0.000000011342*asd*asd*asd + 0.000056304871*asd*asd - 0.124444503134*asd + 123.066087843208;
										if(asd == 0){
										wendu = 0;
										}
										
										if(h<=14){
											d[k][h] = datas;
											
											h++;
											}else{
												d[k][h] = datas;
												
												h=0;
												if(k!=15){
													k++;
												}else{
													k=0;
													
												}
										}
									
										
										
									}while(i<=1053);
									
									
								}while(duixiang.qita.biaoji_jisuanbochang);
							}catch(Exception xiancheng2){
								System.out.println("���ݴ���");
								xiancheng2.printStackTrace();
							}
						}	
					};
					Thread thread2 = new Thread(xiancheng2);
					thread2.start();
					//=================================================================================
					
			        
				}else{
					duixiang.qita.biaoji_jisuanbochang = false;
					start = false;
					//����ֹͣ����
					exit = true;
					byte[] tingzhi = new byte[4];	//�����ַ������鱣��ָ��
					tingzhi[0] = 0x10;
					tingzhi[1] = 0x20;
					tingzhi[2] = 0x06;
					tingzhi[3] = 0x03;
			        try {  
			            InetAddress address_3 = InetAddress.getByName("192.168.0.19");  //��������ַ  
			            int port_3 = 4567;  //�������Ķ˿ں�  
			            //�������ͷ������ݱ���Ϣ  
			            DatagramPacket dataGramPacket = new DatagramPacket(tingzhi, tingzhi.length, address_3, port_3);  
			              
			            DatagramSocket socket_3 = new DatagramSocket();  //�����׽���  
			            socket_3.send(dataGramPacket);  //ͨ���׽��ַ�������  
			              
			            socket_3.close();  
			              
			        } catch (UnknownHostException etingzhi) {  
			        	System.out.println("106�б��쳣"); 
			        } catch (IOException etingzhi) {  
			        	System.out.println("108�б��쳣");
			        }
				}
				//======================================================================
				Runnable ybxiancheng = new Runnable(){

					@Override
					public void run() {
						// TODO Auto-generated method stub
						dao.DBBean yb = new dao.DBBean();
						 String sql = null;
						
						//����7��������ÿ��ѭ��������Ŵ����ݿ��в�ѯ7��������ֵ
						 while(duixiang.qita.biaoji_jisuanbochang){
							 for(int i = 1; i <= 48; i++){
							 int bx, by, wx, wy;
							 double bxs, wxs, lmxs;
							 
							 sql = "select * from msql.peizhi where xuhao ='"+i+"'";
							 ResultSet rs = yb.query(sql);
							 
							 try {
								while(rs.next()){
										try {
											bx = rs.getInt("bsensorx");
											by = rs.getInt("bsensory");
											wx = rs.getInt("wsensorx");
											wy = rs.getInt("wsensory");
											bxs = rs.getDouble("bxishu");
											wxs = rs.getDouble("wxishu");
											lmxs = rs.getDouble("lingmin");
											//System.out.println(bxs);
											yingbian[i-1] = (test1.d[bx-1][by-1] - bxs - test1.d[wx-1][wy-1] + wxs)*1000 / lmxs;
											
										} catch (SQLException e) {
											// TODO Auto-generated catch block
											System.out.println("00007");
											e.printStackTrace();
										}					
									}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								System.out.println("00008");
								e.printStackTrace();
							}
							 
					}	 
					}
						};
			};
			Thread threadyb = new Thread(ybxiancheng);
			threadyb.start();
			
			//======================================================================
			
			//======================================================================
			}	
		});
		panel.add(button);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		
		JButton button_4 = new JButton("\u4FDD\u5B58\u5E94\u53D8");
		button_4.addActionListener(new ActionListener() {
			boolean baocun = false;
			String sql = null;
			public void actionPerformed(ActionEvent arg0) {
				duixiang.qita.biaoji_bcyb = true;
				button_4.setText(baocun ? "����Ӧ��" : "ͣ��Ӧ��");
				if(baocun == false){
					baocun = true;
					dao.DBBean cs_1 = new dao.DBBean();
					//dao.DBBean cs_2 = new dao.DBBean();
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					//=====================================================================
					//��ȡ�洢Ƶ��
					dao.DBBean aaa_1 = new dao.DBBean();
					sql = "select * from msql.pinlv where Id ='1'";
					ResultSet jg = aaa_1.query(sql);
					try {
						while(jg.next()){
							//bochangcunchupinlv = jg.getInt("bcccpl");
							yingbiancunchupinlv = jg.getInt("ybccpl");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						System.out.println("00009");
						e1.printStackTrace();
					}
					//======================================================================
					Runnable yb = new Runnable(){

						@Override
						public void run() {
							// TODO Auto-generated method stub
							while(duixiang.qita.biaoji_bcyb){
								String ttt = df.format(new Date());
								
								for(int i=1; i<=48; i++){
									sql = "insert into msql.yingbian(xuhao, yingbian, time)values('"+i+"','"+test1.yingbian[i-1]+"', '"+ttt+"')";
									cs_1.update(sql);
									
								}
								//
								try {
									Thread.sleep(yingbiancunchupinlv);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									System.out.println("000010");
									e.printStackTrace();
								}
							}
							
						}		
					};	
					Thread threadyb = new Thread(yb);
					threadyb.start();
					//====================================================
					
					//=====================================================
				}else{
					baocun = false;	
					duixiang.qita.biaoji_bcyb = false;
				}
			}
		});
		panel.add(button_4);
		
		JButton button_9 = new JButton("\u4FDD\u5B58\u6CE2\u957F");
		button_9.addActionListener(new ActionListener() {
			boolean baocun_1 = false;
			String ss = null;
			public void actionPerformed(ActionEvent e) {
				duixiang.qita.biaoji_bcbc = true;
				button_9.setText(baocun_1 ? "���沨��" : "ͣ�沨��");
				if(baocun_1 == false){
					baocun_1 = true;
				dao.DBBean aaa_3 = new dao.DBBean();
				ss = "select * from msql.pinlv where Id ='1'";
				ResultSet jg = aaa_3.query(ss);
				try {
					while(jg.next()){
						bochangcunchupinlv = jg.getInt("bcccpl");
						//yingbiancunchupinlv = jg.getInt("ybccpl");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("00009");
					e1.printStackTrace();
				}
				/////////////////////////////////////////////////////////////////////////////////////////////////////
				Runnable bc = new Runnable(){

					@Override
					public void run() {
						// TODO Auto-generated method stub
						dao.DBBean cs_2 = new dao.DBBean();
						while(duixiang.qita.biaoji_bcbc){
							String ttt = df.format(new Date());
							for(int i=1; i<=256; i++){
								ss = "insert into msql.bochang(xuhao, bochang, time)values('"+i+"','"+d_1[i-1]+"', '"+ttt+"')";
								cs_2.update(ss);
								
							}
							//
							try {
								Thread.sleep(bochangcunchupinlv);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								System.out.println("000011");
								e.printStackTrace();
							}
						}
						
					}		
				};	
				Thread threadbc = new Thread(bc);
				threadbc.start();
			}else{
				baocun_1 = false;
				duixiang.qita.biaoji_bcbc = false;
			}
			}
		});
		panel.add(button_9);
		
		JButton button_6 = new JButton("\u7ED3\u6784\u56FE");
		
		panel.add(button_6);
		
		JButton button_3 = new JButton("\u5E94\u53D8\u66F2\u7EBF\u56FE");
		
		panel.add(button_3);
		
		JButton button_8 = new JButton(" ");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				duixiang.qita.biaoji = 0;
				button_8.setBackground(Color.GREEN);
			}
		});
		button_8.setBackground(Color.GREEN);
		
		Runnable b8 = new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					
						if(duixiang.qita.biaoji == 1){
							while(true){
								button_8.setBackground(Color.RED);
								button_8.setBackground(Color.BLACK);
							}
						}
					
				}
			}
		};
		Thread bb8 = new Thread(b8);
		bb8.start();		
		
		panel.add(button_8);
		
		JTree tree = new JTree();
		
		panel_1.setLayout(new BorderLayout(0, 0));
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("\u76D1\u6D4B\u70B9 :") {
				{
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B901"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B902"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B903"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B904"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B905"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B906"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B907"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B908"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B909"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B910"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B911"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B912"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B913"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B914"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B915"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B916"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B918"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B919"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B920"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B921"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B922"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B923"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B924"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B925"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B926"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B927"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B928"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B929"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B930"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B931"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B932"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B933"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B934"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B935"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B936"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B937"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B938"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B939"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B940"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B941"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B942"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B943"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B944"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B945"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B946"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B947"));
					add(new DefaultMutableTreeNode("\u76D1\u6D4B\u70B948"));
					add(new DefaultMutableTreeNode("\u6E29\u5EA6\u76D1\u6D4B\u70B901"));
					add(new DefaultMutableTreeNode("\u6E29\u5EA6\u76D1\u6D4B\u70B902"));
					add(new DefaultMutableTreeNode("\u6E29\u5EA6\u76D1\u6D4B\u70B903"));
					add(new DefaultMutableTreeNode("\u6E29\u5EA6\u76D1\u6D4B\u70B904"));
					add(new DefaultMutableTreeNode("\u6E29\u5EA6\u76D1\u6D4B\u70B905"));
					add(new DefaultMutableTreeNode("\u6E29\u5EA6\u76D1\u6D4B\u70B906"));
					add(new DefaultMutableTreeNode("\u6E29\u5EA6\u76D1\u6D4B\u70B907"));
					add(new DefaultMutableTreeNode("\u6E29\u5EA6\u76D1\u6D4B\u70B908"));
					add(new DefaultMutableTreeNode("\u6E29\u5EA6\u76D1\u6D4B\u70B909"));
					add(new DefaultMutableTreeNode("\u6E29\u5EA6\u76D1\u6D4B\u70B910"));
					add(new DefaultMutableTreeNode("\u6E29\u5EA6\u76D1\u6D4B\u70B911"));
					add(new DefaultMutableTreeNode("\u6E29\u5EA6\u76D1\u6D4B\u70B912"));
				}
			}
		));
		panel_1.add(tree);
		
		JScrollPane scrollPane = new JScrollPane(tree);
		panel_1.add(scrollPane);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		textArea = new JTextArea();
		
		panel_2.setLayout(new BorderLayout(0, 0));
		textArea.setRows(5);
		panel_2.add(textArea);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_3, BorderLayout.CENTER);
		CardLayout card = new CardLayout(0, 0);
		panel_3.setLayout(card);
		
		panel_3.add(panel_7, "name_15587063040640");
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_7.add(panel_9, BorderLayout.SOUTH);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_3 = new JButton("ҶƬ1");
		btnNewButton_3.setToolTipText("\u53F6\u72471");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_3, "yepian1");
			}
		});
		panel_9.add(btnNewButton_3);
		
		JButton button_2 = new JButton("ҶƬ2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_3, "yepian2");
			}
		});
		panel_9.add(button_2);
		
		JButton button_7 = new JButton("ҶƬ3");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_3, "yepian3");
			}
		});
		panel_9.add(button_7);
		
		JPanel panel_19 = new JPanel();
		panel_3.add(panel_19, "name_3723221476836");
		panel_19.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_19.add(panel_20, BorderLayout.NORTH);
		panel_20.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_6 = new JLabel("\u9009\u62E9\u8981\u8BBE\u7F6E\u7684\u76D1\u6D4B\u70B9:");
		panel_20.add(label_6);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48"}));
		panel_20.add(comboBox_5);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_19.add(panel_21, BorderLayout.SOUTH);
		panel_21.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button_11 = new JButton("\u4FDD\u5B58");
		
		panel_21.add(button_11);
		
		JButton button_12 = new JButton("\u53D6\u6D88");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_3, "name_15587063040640");
			}
		});
		panel_21.add(button_12);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_19.add(panel_22, BorderLayout.CENTER);
		panel_22.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_23 = new JPanel();
		panel_22.add(panel_23, BorderLayout.NORTH);
		panel_23.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_7 = new JLabel("\u5E94\u53D8\u4F20\u611F\u5668:");
		panel_23.add(label_7);
		
		JLabel lblCh_2 = new JLabel("CH");
		panel_23.add(lblCh_2);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		panel_23.add(comboBox_6);
		
		JLabel lblNo_1 = new JLabel("NO.");
		panel_23.add(lblNo_1);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		panel_23.add(comboBox_7);
		
		JPanel panel_24 = new JPanel();
		panel_22.add(panel_24, BorderLayout.CENTER);
		panel_24.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_25 = new JPanel();
		panel_24.add(panel_25, BorderLayout.NORTH);
		panel_25.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_8 = new JLabel("\u6E29\u5EA6\u4F20\u611F\u5668:");
		panel_25.add(label_8);
		
		JLabel lblCh_3 = new JLabel("CH");
		panel_25.add(lblCh_3);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		panel_25.add(comboBox_8);
		
		JLabel lblNo_2 = new JLabel("NO.");
		panel_25.add(lblNo_2);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		panel_25.add(comboBox_9);
		
		JPanel panel_26 = new JPanel();
		panel_24.add(panel_26, BorderLayout.CENTER);
		panel_26.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_27 = new JPanel();
		panel_26.add(panel_27, BorderLayout.NORTH);
		panel_27.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_9 = new JLabel("\u521D\u59CB\u6CE2\u957F:");
		panel_27.add(label_9);
		
		textField_2 = new JTextField();
		panel_27.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_28 = new JPanel();
		panel_26.add(panel_28, BorderLayout.CENTER);
		panel_28.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_29 = new JPanel();
		panel_28.add(panel_29, BorderLayout.NORTH);
		panel_29.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_10 = new JLabel("\u521D\u59CB\u6E29\u5EA6:");
		panel_29.add(label_10);
		
		textField_3 = new JTextField();
		panel_29.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_30 = new JPanel();
		panel_28.add(panel_30, BorderLayout.CENTER);
		panel_30.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_31 = new JPanel();
		panel_30.add(panel_31, BorderLayout.NORTH);
		
		JLabel label_11 = new JLabel("\u7075\u654F\u7CFB\u6570:");
		panel_31.add(label_11);
		
		textField_4 = new JTextField();
		panel_31.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_32 = new JPanel();
		panel_30.add(panel_32, BorderLayout.CENTER);
		panel_32.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_33 = new JPanel();
		panel_32.add(panel_33, BorderLayout.NORTH);
		
		JLabel label_12 = new JLabel("\u5907\u6CE8:");
		panel_33.add(label_12);
		
		textField_5 = new JTextField();
		panel_33.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_3.add(panel_8, "name_1470074836336");
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_8.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		
		yepian_1 yepian1 = new yepian_1(){
			public void paintComponent(Graphics g){
				ImageIcon icon = new ImageIcon("timg.jpg");
				 // ͼƬ�洰���С���仯
				 g.drawImage(icon.getImage(), 0, 0, 1460,640,frame);
			 }
		};;
		panel_3.add(yepian1, "yepian1");
		
		yepian_2 yepian2 = new yepian_2(){
			public void paintComponent(Graphics g){
				ImageIcon icon = new ImageIcon("timg.jpg");
				 // ͼƬ�洰���С���仯
				 g.drawImage(icon.getImage(), 0, 0, 1460,640,frame);
			 }
		};;
		panel_3.add(yepian2, "yepian2");
		
		yepian_3 yepian3 = new yepian_3(){
			public void paintComponent(Graphics g){
				ImageIcon icon = new ImageIcon("timg.jpg");
				 // ͼƬ�洰���С���仯
				 g.drawImage(icon.getImage(), 0, 0, 1460,640,frame);
			 }
		};;
		panel_3.add(yepian3, "yepian3");
		
		//================================================

		JPanel panel_13 = new JPanel();
		panel_3.add(panel_13, "name_6737306874436");
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_34 = new JPanel();
		panel_34.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_13.add(panel_34, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\u9009\u62E9\u8981\u8BBE\u7F6E\u7684\u6E29\u5EA6\u76D1\u6D4B\u70B9:");
		panel_34.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		panel_34.add(comboBox);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_13.add(panel_35, BorderLayout.SOUTH);
		
		JButton button_1 = new JButton("\u4FDD\u5B58");
		
		panel_35.add(button_1);
		
		JButton button_13 = new JButton("\u53D6\u6D88");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_3, "name_15587063040640");
			}
		});
		panel_35.add(button_13);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_13.add(panel_36, BorderLayout.CENTER);
		panel_36.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_37 = new JPanel();
		panel_36.add(panel_37, BorderLayout.NORTH);
		
		JLabel label_1 = new JLabel("\u6E29\u5EA6\u4F20\u611F\u5668:");
		panel_37.add(label_1);
		
		JLabel lblCh = new JLabel("CH");
		panel_37.add(lblCh);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		panel_37.add(comboBox_1);
		
		JLabel lblNo = new JLabel("NO.");
		panel_37.add(lblNo);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		panel_37.add(comboBox_2);
		
		JPanel panel_38 = new JPanel();
		panel_36.add(panel_38, BorderLayout.CENTER);
		panel_38.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_39 = new JPanel();
		panel_38.add(panel_39, BorderLayout.NORTH);
		
		JLabel label_3 = new JLabel("\u521D\u59CB\u6E29\u5EA6:");
		panel_39.add(label_3);
		
		textField_1 = new JTextField();
		panel_39.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_40 = new JPanel();
		panel_38.add(panel_40, BorderLayout.CENTER);
		panel_40.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_41 = new JPanel();
		panel_40.add(panel_41, BorderLayout.NORTH);
		
		JLabel label_4 = new JLabel("\u6E29\u5EA6\u7CFB\u6570:");
		panel_41.add(label_4);
		
		textField_6 = new JTextField();
		panel_41.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_42 = new JPanel();
		panel_40.add(panel_42, BorderLayout.CENTER);
		panel_42.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_43 = new JPanel();
		panel_42.add(panel_43, BorderLayout.NORTH);
		
		JLabel label_5 = new JLabel("\u5907\u6CE8:");
		panel_43.add(label_5);
		
		textField_7 = new JTextField();
		panel_43.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		panel_3.add(panel_14, "name_24976221782400");
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_45 = new JPanel();
		panel_45.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_14.add(panel_45, BorderLayout.NORTH);
		
		JLabel label_15 = new JLabel("\u5E94\u53D8\u5B58\u50A8\u8BBE\u7F6E");
		panel_45.add(label_15);
		
		JPanel panel_46 = new JPanel();
		panel_46.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_14.add(panel_46, BorderLayout.SOUTH);
		
		JButton button_14 = new JButton("\u4FDD\u5B58");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�洢Ӧ��Ƶ��
				int yingbianpinlv = Integer.parseInt(textField_11.getText());
				//�������������ݿ���
				dao.DBBean cc_1 = new dao.DBBean();
				String sql = null;
				sql = "update msql.pinlv set ybccpl = '"+yingbianpinlv+"'";
				cc_1.update(sql);
				cc_1.close();
				card.show(panel_3, "name_15587063040640");
			}
		});
		panel_46.add(button_14);
		
		JButton button_15 = new JButton("\u8FD4\u56DE");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_3, "name_15587063040640");
			}
		});
		panel_46.add(button_15);
		
		JPanel panel_47 = new JPanel();
		panel_47.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_14.add(panel_47, BorderLayout.CENTER);
		panel_47.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_48 = new JPanel();
		panel_47.add(panel_48, BorderLayout.NORTH);
		
		JLabel label_16 = new JLabel("\u5B58\u50A8\u9891\u7387\uFF08\u6BEB\u79D2\uFF09\uFF1A");
		panel_48.add(label_16);
		
		textField_11 = new JTextField();
		panel_48.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_15 = new JPanel();
		panel_3.add(panel_15, "name_24995352180480");
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_49 = new JPanel();
		panel_49.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_15.add(panel_49, BorderLayout.NORTH);
		
		JLabel label_17 = new JLabel("\u6CE2\u957F\u5B58\u50A8\u8BBE\u7F6E");
		panel_49.add(label_17);
		
		JPanel panel_50 = new JPanel();
		panel_50.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_15.add(panel_50, BorderLayout.SOUTH);
		
		JButton button_16 = new JButton("\u4FDD\u5B58");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�����洢Ƶ��
				int bochangpinlv = Integer.parseInt(textField_12.getText());
				//�������������ݿ���
				dao.DBBean cc_2 = new dao.DBBean();
				String sql = null;
				sql = "update msql.pinlv set bcccpl = '"+bochangpinlv+"'";
				cc_2.update(sql);
				cc_2.close();
				card.show(panel_3, "name_15587063040640");
			}
		});
		panel_50.add(button_16);
		
		JButton button_17 = new JButton("\u8FD4\u56DE");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_3, "name_15587063040640");
			}
		});
		panel_50.add(button_17);
		
		JPanel panel_51 = new JPanel();
		panel_51.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_15.add(panel_51, BorderLayout.CENTER);
		panel_51.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_52 = new JPanel();
		panel_51.add(panel_52, BorderLayout.NORTH);
		
		JLabel label_18 = new JLabel("\u5B58\u50A8\u9891\u7387\uFF08\u6BEB\u79D2\uFF09\uFF1A");
		panel_52.add(label_18);
		
		textField_12 = new JTextField();
		panel_52.add(textField_12);
		textField_12.setColumns(10);;
		
		table.setModel(new myTableModel());
		
		JPanel panel_53 = new JPanel();
		panel_3.add(panel_53, "name_51573676541440");
		panel_53.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_54 = new JPanel();
		panel_54.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_53.add(panel_54, BorderLayout.NORTH);
		
		JLabel label_19 = new JLabel("\u6CE2\u957F\u663E\u793A\u9891\u7387\u8BBE\u7F6E");
		panel_54.add(label_19);
		
		JPanel panel_55 = new JPanel();
		panel_55.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_53.add(panel_55, BorderLayout.SOUTH);
		
		JButton button_5 = new JButton("\u4FDD\u5B58");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//������ʾƵ������
				int bochangxianshipinlv = Integer.parseInt(textField_13.getText());
				//�������������ݿ���
				dao.DBBean cc_4 = new dao.DBBean();
				String sql = null;
				sql = "update msql.pinlv set bcxspl = '"+bochangxianshipinlv+"'";
				cc_4.update(sql);
				cc_4.close();
				card.show(panel_3, "name_15587063040640");
			}
		});
		panel_55.add(button_5);
		
		JButton button_18 = new JButton("\u8FD4\u56DE");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_3, "name_15587063040640");
			}
		});
		panel_55.add(button_18);
		
		JPanel panel_56 = new JPanel();
		panel_56.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_53.add(panel_56, BorderLayout.CENTER);
		panel_56.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_57 = new JPanel();
		panel_56.add(panel_57, BorderLayout.NORTH);
		
		JLabel label_20 = new JLabel("\u6CE2\u957F\u663E\u793A\u9891\u7387\uFF08\u6BEB\u79D2\uFF09\uFF1A");
		panel_57.add(label_20);
		
		textField_13 = new JTextField();
		panel_57.add(textField_13);
		textField_13.setColumns(10);
		
		Runnable sss = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					if(duixiang.qita.biaoji_jisuanbochang == true){
						table.setModel(new myTableModel());
						try {
							Thread.sleep(bochangxianshipinlv);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							System.out.println("000013");
							e.printStackTrace();
						}
					}
				}
			}
			
		};
		Thread ss= new Thread(sss);
		ss.start();

	
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		frame.setJMenuBar(menuBar);
		
		JMenu menu_5 = new JMenu("\u76D1\u6D4B\u70B9\u914D\u7F6E");
		menuBar.add(menu_5);
		
		JMenuItem menuItem = new JMenuItem("\u76D1\u6D4B\u70B9\u8BBE\u7F6E\uFF08\u666E\uFF09");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(panel_3, "name_3723221476836");
			}
		});
		menu_5.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u76D1\u6D4B\u70B9\u8BBE\u7F6E\uFF08\u6E29\uFF09");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_3, "name_6737306874436");
			}
		});
		menu_5.add(menuItem_1);
		
		JMenu menu = new JMenu("\u5B58\u50A8\u8BBE\u7F6E");
		menuBar.add(menu);
		
		JMenuItem menuItem_2 = new JMenuItem("\u5E94\u53D8\u5B58\u50A8");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(panel_3, "name_24976221782400");
			}
		});
		menu.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("\u6CE2\u957F\u5B58\u50A8");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_3, "name_24995352180480");
			}
		});
		menu.add(menuItem_3);
		
		JMenu menu_1 = new JMenu("\u6D4B\u70B9\u6CE2\u957F");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_4 = new JMenuItem("\u6CE2\u957F");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				duixiang.qita.biaoji_table = true;
				card.show(panel_3, "name_1470074836336");
			}
		});
		menu_1.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("\u6CE2\u957F\u9891\u7387");
		menuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_3, "name_51573676541440");
			}
		});
		menu_1.add(menuItem_5);
		
		JMenu menu_2 = new JMenu("\u62A5\u8B66");
		menuBar.add(menu_2);
		
		JMenuItem menuItem_6 = new JMenuItem("��������");
		menuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							baojingshezhi frame = new baojingshezhi();
							frame.setLocationRelativeTo(null);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		menu_2.add(menuItem_6);
		
		JMenuItem menuItem_7 = new JMenuItem("\u62A5\u8B66\u4FE1\u606F");
		menuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				baojingchakan frame = new baojingchakan();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
			}
		});
		menu_2.add(menuItem_7);
		
		JMenu menu_3 = new JMenu("\u5386\u53F2\u6570\u636E");
		menuBar.add(menu_3);
		
		JMenuItem menuItem_8 = new JMenuItem("\u5386\u53F2\u6CE2\u957F");
		menuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lishixinxi frame = new lishixinxi();
				frame.setVisible(true);
			}
		});
		menu_3.add(menuItem_8);
		
		JMenu menu_4 = new JMenu("\u62A5\u8868");
		menuBar.add(menu_4);
		
		JMenuItem menuItem_9 = new JMenuItem("���Ӧ�䱨��");
		menuItem_9.addActionListener(new ActionListener() {
			boolean baocun = false;
			public void actionPerformed(ActionEvent e) {
				duixiang.qita.biaoji_yb = true;
				menuItem_9.setText(baocun ? "���Ӧ�䱨��" : "ֹͣ���Ӧ�䱨��");
				if(baocun == false){
					baocun = true;
					Date time_2 = new Date();
					SimpleDateFormat dfff = new SimpleDateFormat("yyyyMMddHHmmss");
					File file = new File("F:\\Ӧ��"+dfff.format(time_2)+".txt");

					try {
						FileWriter out = new FileWriter(file);
						out.write("ʱ��" + "\0");
						for(int zz=1; zz <=48; zz++){
							out.write("NO." + zz + "\0");
						}
						out.write("\r\n");
						Runnable asd = new Runnable(){
							
							@Override
							public void run() {
								// TODO Auto-generated method stub
								while(duixiang.qita.biaoji_yb){
									try {
										Date time_1 = new Date();
										SimpleDateFormat dff = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
										out.write(dff.format(time_1) + "\0");
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									//out.write("wendu" + "\r\n");
										for(int hh=0; hh<=47; hh++){
											try {
												out.write(String .format("%.0f", yingbian[hh]) + "\0");
											} catch (IOException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										}
									
									try {
										out.write("\r\n");
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							}
							
						};
						Thread tttt = new Thread(asd);
						tttt.start();
						
						//out.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else{
					baocun = false;
					duixiang.qita.biaoji_yb = false;
				}
			}
		});
		menu_4.add(menuItem_9);
		
		JMenuItem menuItem_10 = new JMenuItem("�����������");
		menuItem_10.addActionListener(new ActionListener() {
			boolean baocun = false;
			public void actionPerformed(ActionEvent e) {
				duixiang.qita.biaoji_bc = true;
				menuItem_10.setText(baocun ? "�����������" : "ֹͣ�����������");
				if(baocun == false){
					baocun = true;
					Date time_4 = new Date();
					SimpleDateFormat df_4 = new SimpleDateFormat("yyyyMMddHHmmss");
					File file = new File("F:\\����"+df_4.format(time)+".txt");

					try {
						FileWriter out = new FileWriter(file);
						out.write("ʱ��" + "\0");
						for(int zz_1=1; zz_1 <=16; zz_1++){
							for(int zz_2=1; zz_2<=16; zz_2++){
								out.write(zz_1 + "-" + zz_2 + "\0");
							}
						}
						out.write("\r\n");
						Runnable asd = new Runnable(){
							
							@Override
							public void run() {
								// TODO Auto-generated method stub
								
								while(duixiang.qita.biaoji_bc){
									try {
										Date time_5 = new Date();
										SimpleDateFormat dff_11 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
										out.write(dff_11.format(time_5) + "\0");
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									//out.write("wendu" + "\r\n");
									for(int i=0; i<=15; i++){
										for(int j=0; j<=15; j++){
											try {
												out.write(String .format("%.3f", d[i][j]) + "\0");
											} catch (IOException e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
											
										}
									}
									try {
										out.write("\r\n");
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							}
							
						};
						Thread tttt = new Thread(asd);
						tttt.start();
						
						//out.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else{
					baocun = false;
					duixiang.qita.biaoji_bc = false;
				}
			}
		});
		menu_4.add(menuItem_10);
		
		JMenu menu_6 = new JMenu("\u5E2E\u52A9");
		menuBar.add(menu_6);
		
		button_3.addActionListener(new ActionListener() { //Ӧ������ͼ
			public void actionPerformed(ActionEvent arg0) {
				fourQuxian quququ = new fourQuxian();
				panel_3.add(quququ, "ddquxian");
				card.show(panel_3,"ddquxian");
			}
		});
		
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel_3,"name_15587063040640");
			}
		});
		
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int cedianxuhao = Integer.parseInt((String) comboBox_5.getSelectedItem());
				int bobux = Integer.parseInt((String) comboBox_6.getSelectedItem());
				int bobuy = Integer.parseInt((String) comboBox_7.getSelectedItem());
				int wenbux = Integer.parseInt((String) comboBox_8.getSelectedItem());
				int wenbuy = Integer.parseInt((String) comboBox_9.getSelectedItem());
				double bobuxishu = Double.parseDouble(textField_2.getText());
				double wenbuxishu = Double.parseDouble(textField_3.getText());
				double lingminxishu = Double.parseDouble(textField_4.getText());
				String bz = textField_5.getText();
				
				//�������������ݿ���
				dao.DBBean daodao = new dao.DBBean();
				String sql = null;
				sql = "update msql.peizhi set bsensorx = '"+bobux+"',bsensory = '"+bobuy+"',wsensorx = '"+wenbux+"', wsensory = '"+wenbuy+"', bxishu = '"+bobuxishu+"', wxishu = '"+wenbuxishu+"', lingmin = '"+lingminxishu+"', beizhu = '"+bz+"' where xuhao = '"+cedianxuhao+"'";
				daodao.update(sql);
				daodao.close();
				card.show(panel_3, "name_15587063040640");
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cdxuhao = Integer.parseInt((String) comboBox.getSelectedItem());
				int sx = Integer.parseInt((String) comboBox_1.getSelectedItem());
				int sy = Integer.parseInt((String) comboBox_2.getSelectedItem());
				double cwen = Double.parseDouble(textField_1.getText());
				double wenxs = Double.parseDouble(textField_6.getText());
				String bz = textField_7.getText();
				
				//�������������ݿ���
				dao.DBBean wdao = new dao.DBBean();
				String sql = null;
				sql = "update msql.peizhi_wendu set sensorx = '"+sx+"',sensory = '"+sy+"',chuwen = '"+cwen+"', wenxishu = '"+wenxs+"', beizhu = '"+bz+"' where xuhao = '"+cdxuhao+"'";
				wdao.update(sql);
				wdao.close();
				card.show(panel_3, "name_15587063040640");
			}
		});
		
		
		//=========================================================
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent arg0) {
				
				oneQuxian ddqx = new oneQuxian();
				panel_3.add(ddqx, "dandu");
				card.show(panel_3, "dandu");	
				
				DefaultMutableTreeNode node=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
				aastr = node.toString();
				switch(aastr){
				
				case "����01":xuhao_1 = 0;
				break;
				case "����02":xuhao_1 = 1;
				break;
				case "����03":xuhao_1 = 2;
				break;
				case "����04":xuhao_1 = 3;
				break;
				case "����05":xuhao_1 = 4;
				break;
				case "����06":xuhao_1 = 5;
				break;
				case "����07":xuhao_1 = 6;
				break;
				case "����08":xuhao_1 = 7;
				break;
				case "����09":xuhao_1 = 8;
				break;
				case "����10":xuhao_1 = 9;
				break;
				case "����11":xuhao_1 = 10;
				break;
				case "����12":xuhao_1 = 11;
				break;
				case "����13":xuhao_1 = 12;
				break;
				case "����14":xuhao_1 = 13;
				break;
				case "����15":xuhao_1 = 14;
				break;
				case "����16":xuhao_1 = 15;
				break;
				case "����17":xuhao_1 = 16;
				break;
				case "����18":xuhao_1 = 17;
				break;
				case "����19":xuhao_1 = 18;
				break;
				case "����20":xuhao_1 = 19;
				break;
				case "����21":xuhao_1 = 20;
				break;
				case "����22":xuhao_1 = 21;
				break;
				case "����23":xuhao_1 = 22;
				break;
				case "����24":xuhao_1 = 23;
				break;
				case "����25":xuhao_1 = 24;
				break;
				case "����26":xuhao_1 = 25;
				break;
				case "����27":xuhao_1 = 26;
				break;
				case "����28":xuhao_1 = 27;
				break;
				case "����29":xuhao_1 = 28;
				break;
				case "����30":xuhao_1 = 29;
				break;
				case "����31":xuhao_1 = 30;
				break;
				case "����32":xuhao_1 = 31;
				break;
				case "����33":xuhao_1 = 32;
				break;
				case "����34":xuhao_1 = 33;
				break;
				case "����35":xuhao_1 = 34;
				break;
				case "����36":xuhao_1 = 35;
				break;
				case "����37":xuhao_1 = 36;
				break;
				case "����38":xuhao_1 = 37;
				break;
				case "����39":xuhao_1 = 38;
				break;
				case "����40":xuhao_1 = 39;
				break;
				case "����41":xuhao_1 = 40;
				break;
				case "����42":xuhao_1 = 41;
				break;
				case "����43":xuhao_1 = 42;
				break;
				case "����44":xuhao_1 = 43;
				break;
				case "����45":xuhao_1 = 44;
				break;
				case "����46":xuhao_1 = 45;
				break;
				case "����47":xuhao_1 = 46;
				break;
				case "����48":xuhao_1 = 47;
				break;
				case "�¶ȼ���01":xuhao_2 = 1;
				break;
				case "�¶ȼ���02":xuhao_2 = 2;
				break;
				case "�¶ȼ���03":xuhao_2 = 3;
				break;
				case "�¶ȼ���04":xuhao_2 = 4;
				break;
				case "�¶ȼ���05":xuhao_2 = 5;
				break;
				case "�¶ȼ���06":xuhao_2 = 6;
				break;
				case "�¶ȼ���07":xuhao_2 = 7;
				break;
				case "�¶ȼ���08":xuhao_2 = 8;
				break;
				case "�¶ȼ���09":xuhao_2 = 9;
				break;
				case "�¶ȼ���10":xuhao_2 = 10;
				break;
				case "�¶ȼ���11":xuhao_2 = 11;
				break;
				case "�¶ȼ���12":xuhao_2 = 12;
				break;
				}
				
				dao.DBBean tt = new dao.DBBean();
				String sql = null;
				
				//textArea.append(""+xuhao_2+"");
				if(xuhao_2 == 1 || xuhao_2 == 2 || xuhao_2 == 3 || xuhao_2 == 4|| xuhao_2 == 5|| xuhao_2 == 6|| xuhao_2 == 7|| xuhao_2 == 8|| xuhao_2 == 9|| xuhao_2 == 10|| xuhao_2 == 11|| xuhao_2 == 12){
					sql = "select * from msql.peizhi_wendu where xuhao ='"+xuhao_2+"'";
					ResultSet jieguo = tt.query(sql);
					
					try {
						while(jieguo.next()){
							int x_1 = jieguo.getInt("sensorx");
							int y_1 = jieguo.getInt("sensory");
							double wen = jieguo.getDouble("chuwen");
							double xi = jieguo.getDouble("wenxishu");
							String bei = jieguo.getString("beizhu");
							textArea.setText("�¶ȼ���"+xuhao_2+" \r\n��������"+x_1+"-"+y_1+"	\r\n��ʼ�¶ȣ�"+wen+"	�¶�ϵ����"+xi+"	\r\n��ע��"+bei+"");
							xuhao_2 =0;
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						System.out.println("000014");
						e.printStackTrace();
					}
					
					
				}else{
					int xuhao_6 = xuhao_1 + 1;					
					card.show(panel_3,"name_96281487308160");
					sql = "select * from msql.peizhi where xuhao ='"+xuhao_6+"'";
					ResultSet jieguo = tt.query(sql);
					
					try {
						while(jieguo.next()){
							int x_1 = jieguo.getInt("bsensorx");
							int y_1 = jieguo.getInt("bsensory");
							int x_2 = jieguo.getInt("wsensorx");
							int y_2 = jieguo.getInt("wsensory");
							double bxi_1 = jieguo.getDouble("bxishu");
							double bxi_2 = jieguo.getDouble("wxishu");
							double bxi_3 = jieguo.getDouble("lingmin");
							String bei = jieguo.getString("beizhu");
							textArea.setText("����"+xuhao_6+" \r\n�������� "+x_1+"-"+y_1+"	���������£��� "+x_2+"-"+y_2+"	\r\n��ʼ������"+bxi_1+"	��ʼ�¶ȣ�"+bxi_2+"	����ϵ����"+bxi_3+"	\r\n��ע��"+bei+"");
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						System.out.println("000015");
						e.printStackTrace();
					}
				}
			}
		});
		
		//========================================================
				dx.a1.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 0;
					}
					
				});
				dx.a2.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 1;
					}
					
				});
				dx.a3.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 2;
					}
					
				});
				dx.a4.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 3;
					}
					
				});
				dx.a5.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 4;
					}
					
				});
				dx.a6.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 5;
					}
					
				});
				dx.a7.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 6;
					}
					
				});
				dx.a8.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 7;
					}
					
				});
				dx.a9.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 8;
					}
					
				});
				dx.a10.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 9;
					}
					
				});
				dx.a11.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 10;
					}
					
				});
				dx.a12.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 11;
					}
					
				});
				dx.a13.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 12;
					}
					
				});
				dx.a14.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 13;
					}
					
				});
				dx.a15.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 14;
					}
					
				});
				dx.a16.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 15;
					}
					
				});
				dx.b1.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 16;
					}
					
				});
				dx.b2.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 17;
					}
					
				});
				//=========================================================
				dx.b3.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 18;
					}	
				});
				dx.b4.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 19;
					}	
				});
				dx.b5.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 20;
					}	
				});
				dx.b6.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 21;
					}	
				});
				dx.b7.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 22;
					}	
				});
				dx.b8.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 23;
					}	
				});
				dx.b9.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 24;
					}	
				});
				dx.b10.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 25;
					}	
				});
				dx.b11.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 26;
					}	
				});
				dx.b12.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 27;
					}	
				});
				dx.b13.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 28;
					}	
				});
				dx.b14.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 29;
					}	
				});
				dx.b15.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 30;
					}	
				});
				dx.b16.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 31;
					}	
				});
				dx.c1.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 32;
					}	
				});
				dx.c2.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 33;
					}	
				});
				dx.c3.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 34;
					}	
				});
				dx.c4.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 35;
					}	
				});
				//=========================================================
				dx.c5.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 36;
					}	
				});
				dx.c6.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 37;
					}	
				});
				dx.c7.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 38;
					}	
				});
				dx.c8.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 39;
					}	
				});
				dx.c9.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 40;
					}	
				});
				dx.c10.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 41;
					}	
				});
				dx.c11.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 42;
					}	
				});
				dx.c12.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 43;
					}	
				});
				dx.c13.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 44;
					}	
				});
				dx.c14.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 45;
					}	
				});
				dx.c15.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 46;
					}	
				});
				dx.c16.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						oneQuxian ddqx = new oneQuxian();
						panel_3.add(ddqx, "dandu");
						card.show(panel_3, "dandu");
						xuhao_1 = 47;
					}	
				});	
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
	
	private static void addYingbian() {
		
	}
	
	private static void addBochang() {
		
	}
	
}
