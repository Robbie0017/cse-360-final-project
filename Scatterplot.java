package finalproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Scatterplot extends JFrame {
  private static final long serialVersionUID = 6294689542092367723L;

  public Scatterplot(String title) {
    super(title);

    // Create dataset
    XYDataset dataset = createDataset();

    // Create chart
    JFreeChart chart = ChartFactory.createScatterPlot("Attendance", "Count/Minutes", "X-Axis", dataset, PlotOrientation.HORIZONTAL, true,true, true);

    
    //Changes background color
    XYPlot plot = (XYPlot)chart.getPlot();
    plot.setBackgroundPaint(new Color(200,228,200));
    
   
    // Create Panel
    ChartPanel panel = new ChartPanel(chart);
    setContentPane(panel);
  }

  private XYDataset createDataset() {
    XYSeriesCollection dataset = new XYSeriesCollection();

   //First Date Attendance series
    XYSeries series1 = new XYSeries("NOV 03");
    series1.add(1, 20);
    series1.add(2, 27);
    series1.add(3, 30);
    series1.add(4, 45);
    series1.add(5, 57);
    series1.add(6, 60);
    series1.add(7, 65);
    series1.add(8, 70);
    series1.add(9, 75);
    series1.add(10, 75);

    dataset.addSeries(series1);
    
    //Second Date Attendance series
    XYSeries series2 = new XYSeries("NOV 10");
    series2.add(1, 10);
    series2.add(2, 15);
    series2.add(3, 23);
    series2.add(4, 33);
    series2.add(5, 41);
    series2.add(6, 55);
    series2.add(7, 59);
    series2.add(8, 64);
    series2.add(9, 70);
    series2.add(10, 75);

    dataset.addSeries(series2);

    return dataset;
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      Scatterplot example = new Scatterplot("Example");
      example.setSize(800, 400);
      example.setLocationRelativeTo(null);
      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      example.setVisible(true);
    });
  }
}
