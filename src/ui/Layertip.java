package ui;

import java.awt.Font;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;

public class Layertip {
	public static void tip(){
		DefaultPieDataset dataSet = new DefaultPieDataset();

		   dataSet.setValue("管理人员", 25);
		   dataSet.setValue("市场人员", 25);
		   dataSet.setValue("开发人员", 45);
		   dataSet.setValue("其它人员", 10);

		   JFreeChart chart = ChartFactory.createPieChart("公司人员结构图", dataSet,
		     true, true, true);

		   Font ftt = new Font("黑体", Font.BOLD, 20);
		   Font ft = new Font("SimSun", 10, 10);//宋体

		   LegendTitle legend = null;
		   TextTitle txtTitle = null;
		   PiePlot categoryplot = null;

		   legend = chart.getLegend();
		   txtTitle = chart.getTitle();
		   categoryplot = (PiePlot) chart.getPlot();

		   txtTitle.setFont(ftt); // 设置标题字体
		   categoryplot.setLabelFont(ft);// 设置图片上固定指示文字字体
		   legend.setItemFont(ft);// 设置图例字体

		   ChartFrame chartFrame = new ChartFrame("某公司人员结构图", chart);
		   chartFrame.pack();
		   chartFrame.setVisible(true);
	}
}
