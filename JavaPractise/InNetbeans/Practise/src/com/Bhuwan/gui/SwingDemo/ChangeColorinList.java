/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bhuwan.gui.SwingDemo;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.awt.*;
import java.util.HashMap;
/**
 *
 * @author Bhuwan Pandey
 */
public class ChangeColorinList extends javax.swing.JFrame {

    /**
     * Creates new form ChangeColorinList
     */
    DefaultListModel defaultListModel; 
    private String []colors;
    HashMap<String,Color> color;
    public ChangeColorinList() {
        initComponents();
        defaultListModel = new DefaultListModel();
        color = new HashMap<>();
        color.put("Red", Color.red);
        color.put("Green", Color.GREEN);
        color.put("Blue", Color.BLUE);
        color.put("Orange", Color.GREEN);
        color.put("Black", Color.BLACK);
        color.put("Yellow", Color.YELLOW);
        color.put("White", Color.WHITE);
        color.put("Purple", new Color(255,0,255));
        color.put("SkyBlue", new Color(0,255,255));
        
        lstColor.setModel(defaultListModel);
        colors =new String[]{"Red", "Green", "Blue", "Orange", "Black", "Yellow", "White", "Purple", "SkyBlue"};
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstColor = new javax.swing.JList<>();
        lblColor = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnApply = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        lblColorCode = new javax.swing.JLabel();
        chkColorCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myPanel.setBackground(new java.awt.Color(153, 153, 255));

        lstColor.setBackground(new java.awt.Color(51, 51, 0));
        lstColor.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        lstColor.setForeground(new java.awt.Color(255, 255, 255));
        lstColor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstColor);

        lblColor.setBackground(new java.awt.Color(51, 51, 0));
        lblColor.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        lblColor.setForeground(new java.awt.Color(255, 255, 255));
        lblColor.setText("Select A Color");

        btnSelect.setBackground(new java.awt.Color(51, 51, 0));
        btnSelect.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(255, 255, 255));
        btnSelect.setText("Select Color");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(51, 51, 0));
        btnAdd.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Color");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnApply.setBackground(new java.awt.Color(51, 51, 0));
        btnApply.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        btnApply.setForeground(new java.awt.Color(255, 255, 255));
        btnApply.setText("Apply Color");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(51, 51, 0));
        btnRemove.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove Color");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        lblColorCode.setBackground(new java.awt.Color(51, 51, 0));
        lblColorCode.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        lblColorCode.setForeground(new java.awt.Color(255, 255, 255));
        lblColorCode.setText("Color Code/Value");

        chkColorCode.setBackground(new java.awt.Color(51, 51, 0));
        chkColorCode.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        chkColorCode.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout myPanelLayout = new javax.swing.GroupLayout(myPanel);
        myPanel.setLayout(myPanelLayout);
        myPanelLayout.setHorizontalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelLayout.createSequentialGroup()
                        .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(btnApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelLayout.createSequentialGroup()
                        .addComponent(lblColorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkColorCode)
                        .addContainerGap())))
        );
        myPanelLayout.setVerticalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkColorCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       defaultListModel.removeAllElements();
        for(String color: colors){
            defaultListModel.addElement(color);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        String string = (String)lstColor.getSelectedValue();
        if(string == null){
            JOptionPane.showMessageDialog(this, "Please Select A Color from List", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        chkColorCode.setText(string);
        
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try{
            //It directly takes value where no exception will generate
//        Object color = lstColor.getSelectedValue();
//        defaultListModel.removeElement(color);
        int index = lstColor.getSelectedIndex();
        defaultListModel.removeElementAt(index);
        JOptionPane.showMessageDialog(this, "Color Removed","Info",JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please Select a Color First","Info",JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed

        Color c = color.get(lstColor.getSelectedValue());
        myPanel.setBackground(c);
    }//GEN-LAST:event_btnApplyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ChangeColorinList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeColorinList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeColorinList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeColorinList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeColorinList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSelect;
    private javax.swing.JTextField chkColorCode;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblColorCode;
    private javax.swing.JList<String> lstColor;
    private javax.swing.JPanel myPanel;
    // End of variables declaration//GEN-END:variables
}
