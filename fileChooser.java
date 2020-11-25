/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cse360finalproject;
import javax.swing.*;
import java.io.*;
import java.util.Observable;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class fileChooser extends Observable {

    public static void openFile() {
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

            try {
                fileIn = new Scanner(file);
                if (file.isFile()) {
                    while (fileIn.hasNextLine()) {
                        String line = fileIn.nextLine();
                        System.out.println(line);
                    }
                } else {
                    System.out.println("That was not a file!");
                }
                fileIn.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
