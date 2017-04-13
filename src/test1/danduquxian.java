package test1;
	
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.Timer;
	
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.data.time.*;

	
public class danduquxian extends JApplet {
	private static final long serialVersionUID = 3257566209007171634L;
	
	private double cpuValue5;
	
	private TimeSeries cpu1;

	class DataGenerator extends Timer implements ActionListener {
		private static final long serialVersionUID = 3977867288743720505L;

		public void actionPerformed(ActionEvent actionevent) {		
			
			cpuValue5 = test1.yingbian[test1.xuhao_1];
			//System.out.println(test1.xuhao_1);
			addcpu1Observation(cpuValue5); 
			
		}
	
		DataGenerator() {
			super(1, null);
			addActionListener(this);
		}
	}
	
	public danduquxian() {
		
		StandardChartTheme standardChartTheme = new StandardChartTheme("CN");	//创建主题样式
		standardChartTheme.setExtraLargeFont(new Font("隶书",Font.BOLD,20));		//创建标题字体
		standardChartTheme.setRegularFont(new Font("宋书",Font.PLAIN,15));		//设置图例字体
		standardChartTheme.setLargeFont(new Font("",Font.PLAIN,15));			//设置轴向的字体
		ChartFactory.setChartTheme(standardChartTheme);							//应用主题样式
		
		cpu1 = new TimeSeries("监测点", org.jfree.data.time.Millisecond.class);//增加一条走势曲线
	 
		TimeSeriesCollection timeseriescollection = new TimeSeriesCollection();
		
		//将所有走势曲线加入到时间条中
		timeseriescollection.addSeries(cpu1);
	 
		//创建JFreeChart对象
		JFreeChart jfreechart = ChartFactory.createTimeSeriesChart("",
				"时间", "应变(微应变)", timeseriescollection, true, true, true);
	  
		//设置图表样式
		XYPlot xyplot = jfreechart.getXYPlot();
		xyplot.setOutlinePaint(Color.CYAN);//设置数据区的边界线条颜色
		ValueAxis valueaxis = xyplot.getDomainAxis();
		valueaxis.setAutoRange(true);      //自动设置数据轴数据范围
		valueaxis.setFixedAutoRange(25000D);//设置时间轴显示的数据
		valueaxis = xyplot.getRangeAxis();
		//valueaxis.setRange(-200D, 200D);//数据轴固定数据范围（设置100的话就是显示MAXVALUE到MAXVALUE-100那段数据范围）
		//  valueaxis.setAutoRange(true);
		valueaxis.setVisible(true);//设置是否显示数据轴
	  
		//设置曲线图面版
		ChartPanel chartpanel = new ChartPanel(jfreechart);
		chartpanel.setPopupMenu(null);
		
		
	  
		getContentPane().add(chartpanel);
		(new DataGenerator()).start();
		}
	
	private void addcpu1Observation(double d) {
		cpu1.add(new Millisecond(), d);
	}
}