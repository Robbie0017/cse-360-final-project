package finalproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexaner Vo
   @author Luis Gonzalez
   @author Nicholas Meyer
   @author Roberto Marracino
   @author Ryan Pan
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
    JFreeChart chart = ChartFactory.createScatterPlot("Attendance", "Y-axis", "Count/Minutes", dataset, PlotOrientation.HORIZONTAL, true,true, true);

    
    //Changes background color
    XYPlot plot = (XYPlot)chart.getPlot();
    plot.setBackgroundPaint(new Color(200,228,200));
    
   
    // Create Panel
    ChartPanel panel = new ChartPanel(chart);
    setContentPane(panel);
  }

  private XYDataset createDataset() {
    XYSeriesCollection dataset = new XYSeriesCollection();

   //First Student Attendance series
    XYSeries series1 = new XYSeries("Student01");
    series1.add(1, 60);
    series1.add(2, 59);
    series1.add(3, 16);
    series1.add(4, 13);
   

    dataset.addSeries(series1);
    
    //Second Student Attendance series
    XYSeries series2 = new XYSeries("Student02");
    series2.add(1, 75);
    series2.add(2, 15);
    series2.add(3, 41);
    series2.add(4, 22);
    
    dataset.addSeries(series2);
    
     //Third Student Attendance series
    XYSeries series3 = new XYSeries("Student03");
    series3.add(1, 50);
    series3.add(2, 61);
    series3.add(3, 33);
    series3.add(4, 56);
  

    dataset.addSeries(series3);
    //Fourth Student Attendance series
    XYSeries series4 = new XYSeries("Student04");
    series4.add(1, 41);
    series4.add(2, 35);
    series4.add(3, 25);
    series4.add(4, 27);
    

    dataset.addSeries(series4);
    //Fifth Student Attendance series
    XYSeries series5 = new XYSeries("Student05");
    series5.add(1, 60);
    series5.add(2, 58);
    series5.add(3, 9);
    series5.add(4, 10);

    dataset.addSeries(series5);
    
    //Sixth Student Attendance Series
    XYSeries series6 = new XYSeries("Student06");
    series6.add(1, 75);
    series6.add(2, 70);
    series6.add(3, 27);
    series6.add(4, 43);

    dataset.addSeries(series6);
    
    //Seventh Student Attendance Series
    XYSeries series7 = new XYSeries("Student07");
    series7.add(1, 74);
    series7.add(2, 72);
    series7.add(3, 44);
    series7.add(4, 23);
    

    dataset.addSeries(series7);

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
