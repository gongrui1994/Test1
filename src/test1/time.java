package test1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");			//设置日期格式
		System.out.println(df.format(new Date()));									// new Date()为获取当前系统时间
		Runnable aaa= new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					System.out.println(df.format(new Date()));
				}
			}
			
		};
		Thread a = new Thread(aaa);
		a.start();
	}

}
