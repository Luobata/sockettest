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

		   dataSet.setValue("������Ա", 25);
		   dataSet.setValue("�г���Ա", 25);
		   dataSet.setValue("������Ա", 45);
		   dataSet.setValue("������Ա", 10);

		   JFreeChart chart = ChartFactory.createPieChart("��˾��Ա�ṹͼ", dataSet,
		     true, true, true);

		   Font ftt = new Font("����", Font.BOLD, 20);
		   Font ft = new Font("SimSun", 10, 10);//����

		   LegendTitle legend = null;
		   TextTitle txtTitle = null;
		   PiePlot categoryplot = null;

		   legend = chart.getLegend();
		   txtTitle = chart.getTitle();
		   categoryplot = (PiePlot) chart.getPlot();

		   txtTitle.setFont(ftt); // ���ñ�������
		   categoryplot.setLabelFont(ft);// ����ͼƬ�Ϲ̶�ָʾ��������
		   legend.setItemFont(ft);// ����ͼ������

		   ChartFrame chartFrame = new ChartFrame("ĳ��˾��Ա�ṹͼ", chart);
		   chartFrame.pack();
		   chartFrame.setVisible(true);
	}
}
