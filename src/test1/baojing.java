package test1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class baojing {
	
	public static double shang = 1000;
	public static double xia = -1000;
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public baojing(){
		//上限和下限
		
		//连接数据库获取应变的正常范围
		dao.DBBean d = new dao.DBBean();
		String sql = null;
		sql = " select * from msql.baojingpeizhi where Id ='1' ";
		ResultSet rs = d.query(sql);
		try {
			while(rs.next()){
				shang = rs.getDouble("shangxian");
				xia = rs.getDouble("xiaxian");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.close();
		
		Runnable run = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					//判断所有应变是否超出范围 如果没有超出范围 标记 = 0，超出范围标记 = 1；
					for(int i=0; i<=47; i++){
							if(test1.yingbian[i] > shang || test1.yingbian[i] < xia){
								test1.qita.biaoji = 1;
								dao.DBBean dd = new dao.DBBean();
								String s = null;
								int xh = i + 1;
								String time = df.format(new Date());
								s = "insert into msql.baojingxinxi(time, baojingcedianxuhao, cuowuzhi, biaoji) values('"+time+"', '"+xh+"', '"+test1.yingbian[i]+"', '"+test1.qita.biaoji+"')";
								dd.update(s);
								test1.qita.biaoji = 0;
								dd.close();
							}
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
		Thread thread = new Thread(run);
		thread.start();
		
	}
}
