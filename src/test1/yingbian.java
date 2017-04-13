package test1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class yingbian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dao.DBBean yb = new dao.DBBean();
		 
		
		//定义7个参数，每次循环根据序号从数据库中查询7个参数的值
		 Runnable xxx = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
				for(int i = 1; i <= 10; i++){
					 int bx, by, wx, wy;
					 double bxs, wxs;
					 
					 String sql = null;
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
									
									test1.yingbian[i-1] = ((test1.d[bx-1][by-1] - bxs) - (test1.d[wx-1][wy-1] - wxs)) * 1000/1.2;
									
									
									//sql = "insert into msql.yingbian(xuhao, yingbian)values('"+i+"','"+test1.yingbian[i-1]+"')";
									//yb.update(sql);
									
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}					
							}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
				System.out.println(test1.yingbian[0]);
			}
			}
		 };
		 Thread xxxx= new Thread(xxx);
		 xxxx.start();
		 
		
			 //=================================================================

			 
		}
	}


