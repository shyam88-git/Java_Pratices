/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.GUI;

import BMS.DAO.PassengerDAO;
import BMS.POJO.PassengerPojo;
import BMS.POJO.UserProfile;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhuwan Pandey
 */
public class PassengerFrame extends javax.swing.JFrame {

    /**
     * Creates new form PassengerFrame
     */
    DefaultTableModel tb;
    String userId = UserProfile.getUserId();
    public PassengerFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        String userDir = System.getProperty("user.dir");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage(userDir + "\\icon\\passenger.png");
        super.setIconImage(img);
        loadPassengerId();
        loadPassengers(userId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new app.bolivia.swing.JCTextField();
        txtContact = new app.bolivia.swing.JCTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnDelete = new rojerusan.RSMaterialButtonCircle();
        btnAdd = new rojerusan.RSMaterialButtonCircle();
        btnUpdate = new rojerusan.RSMaterialButtonCircle();
        jcGender = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rbPassenger = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Passenger");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(218, 62, 82));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBack.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_back_to_32px.png"))); // NOI18N
        lblBack.setText("Back");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel3.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_badge_50px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 50));

        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Passenger ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, 20));

        txtId.setBackground(new java.awt.Color(102, 102, 255));
        txtId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtId.setPhColor(new java.awt.Color(204, 204, 204));
        txtId.setPlaceholder("Enter Passenger ID");
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 280, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_user_50px_1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 50));

        jLabel6.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Passenger Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, 20));

        txtName.setBackground(new java.awt.Color(102, 102, 255));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtName.setPhColor(new java.awt.Color(204, 204, 204));
        txtName.setPlaceholder("Enter Passenger Name");
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 280, 50));

        txtContact.setBackground(new java.awt.Color(102, 102, 255));
        txtContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtContact.setForeground(new java.awt.Color(255, 255, 255));
        txtContact.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtContact.setPhColor(new java.awt.Color(204, 204, 204));
        txtContact.setPlaceholder("Enter Contact Number");
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 280, 40));

        jLabel8.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact No");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_gender_50px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, 50));

        jLabel10.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 90, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_phone_contact_50px.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, 50));

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 150, 50));

        btnAdd.setBackground(new java.awt.Color(255, 102, 102));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 150, 50));

        btnUpdate.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 150, 50));

        jcGender.setBackground(new java.awt.Color(102, 102, 255));
        jcGender.setForeground(new java.awt.Color(102, 102, 255));
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "-", " " }));
        jPanel1.add(jcGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 270, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 630));

        jPanel2.setBackground(new java.awt.Color(255, 252, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbPassenger.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rbPassenger.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        rbPassenger.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        rbPassenger.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rbPassenger.setColorSelBackgound(new java.awt.Color(255, 102, 102));
        rbPassenger.setFont(new java.awt.Font("Yu Gothic Light", 0, 25)); // NOI18N
        rbPassenger.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        rbPassenger.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        rbPassenger.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        rbPassenger.setIntercellSpacing(new java.awt.Dimension(0, 0));
        rbPassenger.setRowHeight(40);
        rbPassenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbPassengerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rbPassenger);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 118, 970, 480));

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_management_30px_3.png"))); // NOI18N
        jLabel1.setText("  Manage Passenger");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 303, 44));

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(329, 5));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, 5));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 1010, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        EmployeeFrame ef = new EmployeeFrame();
        ef.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id = txtId.getText().trim();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Select Passenger First", "Incomplete", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try{
            boolean result = PassengerDAO.deletePassenger(id);
            if(result){
                JOptionPane.showMessageDialog(null, "Record Deleted Sucessfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
                clearText();
                loadPassengerId();
                tb.setRowCount(0);
                loadPassengers(userId);
                return;
            }else
                JOptionPane.showMessageDialog(null, "Sorry Record is not deleted","Incomplete",JOptionPane.ERROR_MESSAGE);

        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Error in Database","Incomplete",JOptionPane.ERROR_MESSAGE);
            se.printStackTrace();
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(!isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Fill all the value properly","Incomplete",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            PassengerPojo p = new PassengerPojo();
            p.setPid(txtId.getText());
            p.setName(txtName.getText());
            p.setContact(txtContact.getText());
            p.setGender(jcGender.getSelectedItem().toString().charAt(0));
            boolean result = PassengerDAO.addPassenger(p);
            if(result == true){
                JOptionPane.showMessageDialog(null, "Record Added Sucessfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
                clearText();
                loadPassengerId();
                tb.setRowCount(0);
                loadPassengers(userId);
                int response = JOptionPane.showConfirmDialog(null, "Do you want to book ticket now !","Sucess",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(response == JOptionPane.YES_OPTION){
                    TicketFrame tf = new TicketFrame();
                    tf.setVisible(true);
                    this.dispose();
                }
                return;
            }else
                JOptionPane.showMessageDialog(null, "Sorry Record is not Added","Incomplete",JOptionPane.ERROR_MESSAGE);

        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Error in Database","Incomplete",JOptionPane.ERROR_MESSAGE);
            se.printStackTrace();
            return;
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Please Enter numeric value in salary","Incomplete",JOptionPane.ERROR_MESSAGE);
            nfe.printStackTrace();
            return;
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(!isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Fill all the value properly","Incomplete",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            PassengerPojo p = new PassengerPojo();
            p.setPid(txtId.getText());
            p.setName(txtName.getText());
            p.setContact(txtContact.getText());
            p.setGender(jcGender.getSelectedItem().toString().charAt(0));
            boolean result = PassengerDAO.updatePassenger(p);
            if(result == true){
                JOptionPane.showMessageDialog(null, "Record Updated Sucessfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
                clearText();
                loadPassengerId();
                tb.setRowCount(0);
                loadPassengers(userId);
                return;
            }else
                JOptionPane.showMessageDialog(null, "Sorry Record is not updated","Incomplete",JOptionPane.ERROR_MESSAGE);

        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Error in Database","Incomplete",JOptionPane.ERROR_MESSAGE);
            se.printStackTrace();
            return;
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Please Enter numeric value in salary","Incomplete",JOptionPane.ERROR_MESSAGE);
            nfe.printStackTrace();
            return;
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void rbPassengerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbPassengerMouseClicked
        try{
            int row = rbPassenger.getSelectedRow();
            txtId.setText(tb.getValueAt(row, 0).toString());
            txtName.setText(tb.getValueAt(row, 1).toString());
            txtContact.setText(tb.getValueAt(row, 2).toString());
            jcGender.setSelectedItem(tb.getValueAt(row, 3).toString());
        }catch(NullPointerException npe){
            System.out.println("Sorry");
            npe.printStackTrace();
        }

    }//GEN-LAST:event_rbPassengerMouseClicked

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
            java.util.logging.Logger.getLogger(PassengerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassengerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassengerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassengerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassengerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle btnAdd;
    private rojerusan.RSMaterialButtonCircle btnDelete;
    private rojerusan.RSMaterialButtonCircle btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JLabel lblBack;
    private rojerusan.RSTableMetro rbPassenger;
    private app.bolivia.swing.JCTextField txtContact;
    private app.bolivia.swing.JCTextField txtId;
    private app.bolivia.swing.JCTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void clearText() {
        txtName.setText("");
        txtContact.setText("");
        jcGender.setSelectedIndex(0);
    }

    private void loadPassengerId() {
        try{
            String passengerId = PassengerDAO.getPassengerId();
            txtId.setText(passengerId);
        }
        catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Unable to get passenger id.","Error",JOptionPane.ERROR);
            se.printStackTrace();
            return;
        }
    }

    private void loadPassengers( String userId) {
        try{
            List<PassengerPojo> passengerLists = PassengerDAO.getAllPassenger(userId);
            if(passengerLists.isEmpty()){
                JOptionPane.showMessageDialog(null, "No Passenger Availabe ","Empty", JOptionPane.INFORMATION_MESSAGE);

            }
            tb = (DefaultTableModel)rbPassenger.getModel();
            Object []passenger = new Object[4];
            for(PassengerPojo passengerList: passengerLists){
                passenger[0] = passengerList.getPid();
                passenger[1] = passengerList.getName();
                passenger[2] = passengerList.getContact();
                passenger[3] = passengerList.getGender();
                tb.addRow(passenger);
            }
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Unable to connect with database", "Error", JOptionPane.ERROR_MESSAGE);
            se.printStackTrace();
        }  
    }

    private boolean isEmpty() {
        String name = txtName.getText().trim();
        String contact = txtContact.getText().trim();
        return !(name.isEmpty() || contact.isEmpty());
    }
}
