/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cse360finalproject;

import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class theFrame extends javax.swing.JFrame {


    fileChooser filechooser = new fileChooser();
    /**
     * Creates new form theFrame
     */
    public theFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        Jfile = new javax.swing.JMenu();
        jMenuItemRosterLoad = new javax.swing.JMenuItem();
        jMenuItemAddAtendence = new javax.swing.JMenuItem();
        jMenuItemSave = new javax.swing.JMenuItem();
        jMenuItemPlot = new javax.swing.JMenuItem();
        jabout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CSE360 Final Project");
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(900, 700));

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Jfile.setText("File");
        Jfile.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        jMenuItemRosterLoad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItemRosterLoad.setText("Load a Roster");
        jMenuItemRosterLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRosterLoadActionPerformed(evt);
            }
        });
        Jfile.add(jMenuItemRosterLoad);

        jMenuItemAddAtendence.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItemAddAtendence.setText("Add Attendence");
        Jfile.add(jMenuItemAddAtendence);

        jMenuItemSave.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItemSave.setText("Save");
        Jfile.add(jMenuItemSave);

        jMenuItemPlot.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItemPlot.setText("Plot Data");
        Jfile.add(jMenuItemPlot);

        jMenuBar1.add(Jfile);

        jabout.setText("About");
        jabout.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jabout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jaboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(jabout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 652, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jaboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaboutMouseClicked
        // TODO add your handling code here:
        //AboutPopup.setVisible(true);
        javax.swing.JFrame f=new javax.swing.JFrame();
        UIManager.put("OptionPane.minimumSize",new Dimension(400,300));
        UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 27));
        UIManager.put("OptionPane.buttonFont", new Font("Times New Roman", Font.BOLD, 27));
        JOptionPane.showMessageDialog(f,"Team Members:\nLuis Gonzalez\nRoberto Marracino\nNicholas Meyer\nAlexander Vo");


    }//GEN-LAST:event_jaboutMouseClicked

    private void jMenuItemRosterLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRosterLoadActionPerformed
        // TODO add your handling code here:
        /// JFileChooser fileChooser = new JFileChooser();
        javax.swing.JFrame f = new javax.swing.JFrame();
        //switch (jFileChooser1.showOpenDialog(f)) {
            //case JFileChooser.APPROVE_OPTION:
                // Open file...
                fileChooser.openFile();
                //....
                //break;
        //}


    }//GEN-LAST:event_jMenuItemRosterLoadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(theFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(theFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(theFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(theFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new theFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Jfile;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAddAtendence;
    private javax.swing.JMenuItem jMenuItemPlot;
    private javax.swing.JMenuItem jMenuItemRosterLoad;
    private javax.swing.JMenuItem jMenuItemSave;
    private javax.swing.JMenu jabout;
    // End of variables declaration//GEN-END:variables

}
