
/**
 * @author Luis Gonzalez Soto
 * CLASS ID - 70606
 * assignment 3
 * This file contains the main and it displays the whole graphical
 * frame with the run button and graphs
 * use hw 2 pdf as a reference for setting up each class file
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class World extends JFrame implements ActionListener {

    Source source = new Source();

    /**
     * This constructor creates a gridlayout of 4 by 1, It also creates the
     * three different graphs that are inserted into panels with observers, the
     * run button is linked to the action listener
     *
     */
    public World() {

        setLayout(new GridLayout(4, 1));

        SimplePlot simplePlot = new SimplePlot();
        MarkedPlot markedPlot = new MarkedPlot();
        BarPlot barPlot = new BarPlot();

        markedPlot.add(simplePlot);
        barPlot.add(markedPlot);

        PlotPanel simplePanelDisplay = new PlotPanel(simplePlot);
        source.addObserver(simplePanelDisplay);

        PlotPanel markedPanelDisplay = new PlotPanel(markedPlot);
        source.addObserver(markedPanelDisplay);

        PlotPanel barPanelDisplay = new PlotPanel(barPlot);
        source.addObserver(barPanelDisplay);

        JButton runButton = new JButton("Run");
        runButton.setFont(new Font("Dialog", Font.PLAIN, 45));
        runButton.setBackground(Color.CYAN);
        runButton.setOpaque(true);
        runButton.setBorderPainted(true);
        runButton.setFocusPainted(true);
        runButton.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        add(barPanelDisplay);
        add(markedPanelDisplay);
        add(simplePanelDisplay);
        add(runButton);

    }

    /**
     * Main method that makes a new instance of the world object, sets the pop
     * up frame to the center of the screen and the size
     *
     * @param args
     */
    public static void main(String[] args) {
        World world = new World();
        world.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        world.setSize(640, 1000);
        world.setTitle("THE 3 GRAPHS");
        world.setLocationRelativeTo(null);
        world.setVisible(true);

    }

    /**
     * When run button is pushed it generates random number and notifies the
     * observers
     *
     * @param pushedButton
     */
    public void actionPerformed(ActionEvent pushedButton) {
        source.create();
        repaint();
    }

}
