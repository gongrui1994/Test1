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
		
		StandardChartTheme standardChartTheme = new StandardChartTheme("CN");	//����������ʽ
		standardChartTheme.setExtraLargeFont(new Font("����",Font.BOLD,20));		//������������
		standardChartTheme.setRegularFont(new Font("����",Font.PLAIN,15));		//����ͼ������
		standardChartTheme.setLargeFont(new Font("",Font.PLAIN,15));			//�������������
		ChartFactory.setChartTheme(standardChartTheme);							//Ӧ��������ʽ
		
		cpu1 = new TimeSeries("����", org.jfree.data.time.Millisecond.class);//����һ����������
	 
		TimeSeriesCollection timeseriescollection = new TimeSeriesCollection();
		
		//�������������߼��뵽ʱ������
		timeseriescollection.addSeries(cpu1);
	 
		//����JFreeChart����
		JFreeChart jfreechart = ChartFactory.createTimeSeriesChart("",
				"ʱ��", "Ӧ��(΢Ӧ��)", timeseriescollection, true, true, true);
	  
		//����ͼ����ʽ
		XYPlot xyplot = jfreechart.getXYPlot();
		xyplot.setOutlinePaint(Color.CYAN);//�����������ı߽�������ɫ
		ValueAxis valueaxis = xyplot.getDomainAxis();
		valueaxis.setAutoRange(true);      //�Զ��������������ݷ�Χ
		valueaxis.setFixedAutoRange(25000D);//����ʱ������ʾ������
		valueaxis = xyplot.getRangeAxis();
		//valueaxis.setRange(-200D, 200D);//������̶����ݷ�Χ������100�Ļ�������ʾMAXVALUE��MAXVALUE-100�Ƕ����ݷ�Χ��
		//  valueaxis.setAutoRange(true);
		valueaxis.setVisible(true);//�����Ƿ���ʾ������
	  
		//��������ͼ���
		ChartPanel chartpanel = new ChartPanel(jfreechart);
		chartpanel.setPopupMenu(null);
		
		
	  
		getContentPane().add(chartpanel);
		(new DataGenerator()).start();
		}
	
	private void addcpu1Observation(double d) {
		cpu1.add(new Millisecond(), d);
	}
}