/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cse360finalproject;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Scanner;
import java.awt.*;

/**
 *
 * @author user
 */
public class fileChooser extends Observable {

    public static final String delimiter = ",";

    public static void openFile() throws IOException {
        //variables
        File file;
        Scanner fileIn;
        int response;

        //Create a file chooser
        final JFileChooser fc = new JFileChooser("");

        //selection method
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        response = fc.showOpenDialog(null);

        //if file is opened
        if (response == JFileChooser.APPROVE_OPTION) {
            //put chosen file into variable "file"
            file = fc.getSelectedFile();
            try
            {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line ="";
                List<String[]> lines = new ArrayList<String[]>();
                while ((line = br.readLine()) != null)
                {
                    lines.add(line.split(delimiter));
                }
                // convert our list to a String array.
                String[][] data = new String[lines.size()][0];
                lines.toArray(data);
                JFrame f;
                f = new JFrame();
                String column[] = {"ID", "First Name", "Last Name", "Program and Plan", "Academic Level","ASURITE"};
                JTable jt = new JTable(data, column);
                jt.setBounds(600, 400, 600, 400);
                JScrollPane sp = new JScrollPane(jt);
                f.add(sp);
                f.setSize(700, 500);
                f.setVisible(true);
                br.close();
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
        }
    }
}
