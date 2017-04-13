package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

public class DBBean {
	Connection con = null;
	Statement stat = null;
	PreparedStatement pstat = null;
	ResultSet rs = null;
	
	private static final String Driver = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/msql?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	private static final String USER = "root";
	private static final String PASSWORD = "123456";
	
	public DBBean(){}
	//ȡ�����ݿ�����
	public Connection getCon(){
		try{
			Class.forName(Driver);
			this.con = DriverManager.getConnection(URL,USER,PASSWORD);
				}catch(Exception ex){
					ex.printStackTrace();
				}
		return con;
	}
	
	public ResultSet query(String sql){
		try{
			con = getCon();
			stat = con.createStatement();
			rs = stat.executeQuery(sql);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return rs;
	}
	
	public void update(String sql){
		try{
			con = getCon();
			stat = con.createStatement();
			stat.executeUpdate(sql);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	//�ر����ݿ�����
	public void close(){
		try{
			if(rs!=null)
				rs.close();
			if(stat!=null)
				stat.close();
			if(pstat!=null)
				pstat.close();
			if(con!=null)
				con.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
