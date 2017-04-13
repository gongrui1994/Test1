package test1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class shujukuceshi {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		dao.DBBean daodao = new dao.DBBean();
		String sql = "select * from msql.peizhi where xuhao ='1'";
		ResultSet rs = daodao.query(sql);
		while(rs.next()){
			double sname = rs.getDouble("bxishu");
			System.out.println(sname);
		}
		
		//sql = "insert into msql.peizhi(xuhao)values('2')";
		//daodao.update(sql);
		
		sql = "update msql.peizhi set bsensorx = '3' where xuhao = '2'";
		daodao.update(sql);
		}
}
