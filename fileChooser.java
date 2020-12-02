/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class fileChooser extends Observable {
        public static final String delimiter = ",";
        public static final String delimiter1 = " ";
        
        public static  String path = "";
        public static String array[][];
        public static String data2[][] = new String[400][6];
        public static String data3[][] = new String[400][6];
        public static JTable jt1;
        
     

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

//            try {
//                fileIn = new Scanner(file);
//                if (file.isFile()) {
//                    while (fileIn.hasNextLine()) {
//                        String line = fileIn.nextLine();
//                        System.out.println(line);
//                    }
//                } else {
//                    System.out.println("That was not a file!");
//                }
//                fileIn.close();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }
//}

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
                String[][] data1 = new String[lines.size()][5];
                lines.toArray(data1);
                JFrame f;
                f = new JFrame();
                f.setTitle("Add Roster");
                String column[] = {"ID", "First Name", "Last Name", "Program and Plan", "Academic Level","ASURITE"};
                
                
                
                for(int i = 0; i < data1.length; i++)
                {
                	
                   
                         data2[i][0] = data1[i][2];
                         data2[i][1] = data1[i][3];
                         data2[i][2] = data1[i][4];
                         data2[i][3] = data1[i][5];
                         

   
                   // System.out.println(data2[i][2] + " " + data2[i][3] + " " + data2[i][4] + " " + data2[i][5]);

                     
                }
               
                
                
             
                JTable jt = new JTable(data1, column);
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
    
    
     public static void openAttendanceFile() throws IOException {
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
            
            path = file.getAbsolutePath();
            //System.out.print(path);
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
                f.setTitle("Add Times");
                String column[] = {"ASURITE", "time"};
                String time = ("60");
                
                for(int i = 0; i < data.length; i++)
                {
                	
                   
                         data3[i][0] = data2[i][0]; //Everything Last Name 
                         data3[i][1] = data2[i][1]; //Everything Program 
                         data3[i][2] = data2[i][2]; //Everything Level 
                         data3[i][3] = data2[i][3]; //Everything ASURITE 
                         data3[i][4] = data[i][1];
                         //data3[i][4] = time;
                        /* if((data3[i][3]).equals(data2[i][0]))
                         {
                         	System.out.print(data3[i][3]);
                         }
                         */
                          

                         

   
                   // System.out.println(data2[i][2] + " " + data2[i][3] + " " + data2[i][4] + " " + data2[i][5]);

                     
                }
                
                
                
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
            JFrame f;
            f = new JFrame();
            f.setTitle("Everything");
            String column[] = {"Last Name", "Program", "Level", "ASURITE", "NOV 10"};
            jt1 = new JTable(data3, column);
            jt1.setBounds(600, 400, 600, 400);
            JScrollPane sp1 = new JScrollPane(jt1);
            f.add(sp1);
            f.setSize(700, 500);
            f.setVisible(true);
        }
        
        
        
    }
     
     public static JTable getTable()
     {
     	return jt1;
     }
    
    
   
     
     /*public static void combineCSV()
    {
        List<String[]> lines = new ArrayList<String[]>();
    	String date = "Nov 2";
    	//variables
       // File file ;
        //int response;
//        String line ="";
//        String line1 ="";
//        File file1 = new File(path);
//
//    	String path = file1.getAbsolutePath();
//        System.out.println(file1);
//        //Create a file chooser
//        final JFileChooser fc = new JFileChooser("");
//
//        //selection method
//        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//        response = fc.showOpenDialog(null);
//
//        //if file is opened
//        if (response == JFileChooser.APPROVE_OPTION) 
//        {
//            //put chosen file into variable "file"
//        	file = fc.getSelectedFile();
//        	
//        }
//        try
//        {
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            FileReader fr2 = new FileReader(path);
//            BufferedReader br2 = new BufferedReader(fr2);
//            
//            while ((line = br.readLine()) != null)
//            {
//                lines.add(line.split(delimiter));
//              
//            }
//            while((line1 = br2.readLine()) != null)
//            {
//                lines.add(line1.split(delimiter));
//              
//
//            }
//            
//            //need to display proper table with combined roster/attendance
//            String[][] data = new String[lines.size()][0];
//            lines.toArray(data);
            JFrame f;
            f = new JFrame();
           
            String column[] = {"Last Name", "Program and Plan", "Academic Level","ASURITE", date};
            //JTable jt = new JTable(together, column);
            jt.setBounds(600, 400, 600, 400);
            JScrollPane sp = new JScrollPane(jt);
            f.add(sp);
            f.setSize(700, 500);
            f.setVisible(true);
          //  br2.close();

          //  br.close();
                
      //  }
       // catch (IOException ioe)
       // {
          //  ioe.printStackTrace();
       // }
    }
    */
     
     
     
    
    
}