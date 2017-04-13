package test1;

import java.io.File;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.general.DefaultKeyedValues2DDataset;

public class MyJFreeChart {

    public static void main(String[] args) {
              MyJFreeChart nn = new MyJFreeChart();
		try {
			nn.create();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void create() throws Exception {

		DefaultKeyedValues2DDataset data = new DefaultKeyedValues2DDataset();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				data.addValue(Math.random(), "r" + i, "c" + j);
			}
		}
		// 渲染 曲线上有点的效果
		LineAndShapeRenderer lsr = new LineAndShapeRenderer();

		JFreeChart chart = ChartFactory.createLineChart(
				"java.lang.String title", "java.lang.String categoryAxisLabel",
				"java.lang.String valueAxisLabel", data,
				PlotOrientation.VERTICAL, true, false, false);
		CategoryPlot plot = chart.getCategoryPlot();
		// x轴转向45度

		plot.getDomainAxis().setCategoryLabelPositions(
				CategoryLabelPositions.DOWN_45);
		plot.setRenderer(lsr);
		ChartUtilities.saveChartAsJPEG(new File(
				"C:\\Users\\不明真相的吃瓜群众\\Desktop\\timg.jpg"), chart, 400,
				400);
	    	 
	    }
}