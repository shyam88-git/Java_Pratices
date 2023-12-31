/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.GUI;

import BMS.DAO.EmployeesDAO;
import BMS.DAO.ReceptionistDAO;
import BMS.POJO.EmployeesPojo;
import BMS.POJO.ReceptionistPojo;
import BMS.POJO.UserPojo;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhuwan Pandey
 */
public class WorkingEmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form WorkingEmployeeFrame
     */
    DefaultTableModel tb;
    Map<String,String> receptionist;
    Map<String,String> userDetails;
    String pass;
    public WorkingEmployeeFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        String userDir = System.getProperty("user.dir");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage(userDir + "\\icon\\manageemployee.png");
        super.setIconImage(img);
        loadReceptionistDetails();
        loadEmpId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbWorkingEmployee = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new app.bolivia.swing.JCTextField();
        txtUserId = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnDelete = new rojerusan.RSMaterialButtonCircle();
        btnAdd = new rojerusan.RSMaterialButtonCircle();
        btnUpdate = new rojerusan.RSMaterialButtonCircle();
        txtPassword = new rojerusan.RSPasswordTextPlaceHolder();
        txtRepassword = new rojerusan.RSPasswordTextPlaceHolder();
        cbEmpId = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 252, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbWorkingEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "User ID", "Job", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbWorkingEmployee.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbWorkingEmployee.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        tbWorkingEmployee.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbWorkingEmployee.setColorSelBackgound(new java.awt.Color(255, 102, 102));
        tbWorkingEmployee.setFont(new java.awt.Font("Yu Gothic Light", 0, 25)); // NOI18N
        tbWorkingEmployee.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tbWorkingEmployee.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tbWorkingEmployee.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        tbWorkingEmployee.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbWorkingEmployee.setRowHeight(40);
        tbWorkingEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbWorkingEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbWorkingEmployee);
        if (tbWorkingEmployee.getColumnModel().getColumnCount() > 0) {
            tbWorkingEmployee.getColumnModel().getColumn(0).setPreferredWidth(200);
            tbWorkingEmployee.getColumnModel().getColumn(1).setPreferredWidth(500);
            tbWorkingEmployee.getColumnModel().getColumn(2).setPreferredWidth(700);
            tbWorkingEmployee.getColumnModel().getColumn(3).setPreferredWidth(300);
            tbWorkingEmployee.getColumnModel().getColumn(4).setPreferredWidth(450);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 970, 610));

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_management_30px_3.png"))); // NOI18N
        jLabel1.setText("  Manage Receptionist");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 410, 44));

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(329, 5));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 410, 5));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 1010, 760));

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
        jLabel3.setText("Employee ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_user_50px_1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 50));

        jLabel6.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Employee Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, 20));

        txtName.setBackground(new java.awt.Color(102, 102, 255));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtName.setPhColor(new java.awt.Color(204, 204, 204));
        txtName.setPlaceholder("Enter Username");
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 280, 50));

        txtUserId.setBackground(new java.awt.Color(102, 102, 255));
        txtUserId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtUserId.setForeground(new java.awt.Color(255, 255, 255));
        txtUserId.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtUserId.setPhColor(new java.awt.Color(204, 204, 204));
        txtUserId.setPlaceholder("Enter Job");
        jPanel1.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 280, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_new_job_50px_1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 50));

        jLabel8.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_password_50px_3.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, 50));

        jLabel10.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 90, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_password_50px_3.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, 50));

        jLabel12.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Re-Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, 20));

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 150, 50));

        btnAdd.setBackground(new java.awt.Color(255, 102, 102));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 150, 50));

        btnUpdate.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 150, 50));

        txtPassword.setBackground(new java.awt.Color(102, 102, 255));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtPassword.setPhColor(new java.awt.Color(255, 255, 255));
        txtPassword.setPlaceholder("Enter Password");
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 280, -1));

        txtRepassword.setBackground(new java.awt.Color(102, 102, 255));
        txtRepassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtRepassword.setForeground(new java.awt.Color(255, 255, 255));
        txtRepassword.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtRepassword.setPhColor(new java.awt.Color(255, 255, 255));
        txtRepassword.setPlaceholder("Enter Password Again");
        jPanel1.add(txtRepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 280, -1));

        cbEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmpIdActionPerformed(evt);
            }
        });
        jPanel1.add(cbEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 290, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        ManagerFrame mf = new ManagerFrame();
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            int row = tbWorkingEmployee.getSelectedRow();
            String id = tb.getValueAt(row, 0).toString();
            boolean status = ReceptionistDAO.deleteReceptionists(id);
            if(status){
                JOptionPane.showMessageDialog(null, "Receptionist Deleted sucessfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
                clearText();
                tb.setRowCount(0);
                loadEmpId();
                loadReceptionistDetails();
                
            }
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Unable to fetch data as Receptionist ID","Incomplete",JOptionPane.ERROR_MESSAGE);
            se.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int result = validateInput();
       if(result == 1){
           JOptionPane.showMessageDialog(null, "Please enter atleast 4 character");
           return;
       }
       
       if(result == -1){
            JOptionPane.showMessageDialog(null, "Please enter user ID");
            return;
       }
       char[] pwFirst = txtPassword.getPassword();
       char[] pwSecond = txtRepassword.getPassword();
       String pwFirstStr = String.valueOf(pwFirst);
       String pwSecondStr = String.valueOf(pwSecond);
       if(isPasswordSame(pwFirstStr,pwSecondStr) == false){
           JOptionPane.showMessageDialog(null, "Please enter same password");
           return;
       }
       
       try{
           String empId = cbEmpId.getSelectedItem().toString();
           String userName = txtName.getText().trim();
           String userId = txtUserId.getText().trim();
           UserPojo user = new UserPojo();
           user.setUserId(userId);
           user.setEmpId(empId);
           user.setPassword(pwFirstStr);
           user.setUserType("Receptionist");
           user.setUserName(userName);
           boolean status = ReceptionistDAO.addReceptionist(user);
           if(!status){
                JOptionPane.showMessageDialog(null, "Receptionst not added.");
                return;
           }
           JOptionPane.showMessageDialog(null, "Receptionst added sucessfully.");
           clearText();
           loadEmpId();
           tb.setRowCount(0);
           loadReceptionistDetails();
           
           
       }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Unable to Add Receptionst User.");
            se.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row = tbWorkingEmployee.getSelectedRow();
        String id = tb.getValueAt(row, 0).toString();
        if(!validateInputUpdate()){
            return;
        }
        try{
            String userId = txtUserId.getText();
            boolean result = ReceptionistDAO.updateReceptionists(userId, pass);
            if(!result){
                JOptionPane.showMessageDialog(null, "Pasword not changed","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(null, "Password Changed Sucessfully!!!","Sucess",JOptionPane.INFORMATION_MESSAGE);
            clearText();
            cbEmpId.setSelectedItem(id);
            clearText();
            tb.setRowCount(0);
            loadReceptionistDetails();
            
        }
        catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Sorry Record is not updated","Incomplete",JOptionPane.ERROR_MESSAGE);
            se.printStackTrace();
            return;
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Please Enter numeric value in salary","Incomplete",JOptionPane.ERROR_MESSAGE);
            nfe.printStackTrace();
            return;
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tbWorkingEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbWorkingEmployeeMouseClicked
        try{
            int row = tbWorkingEmployee.getSelectedRow();
            String id = tb.getValueAt(row, 0).toString();
            cbEmpId.setSelectedItem(id);
            txtName.setText(tb.getValueAt(row, 1).toString());
            txtUserId.setText(tb.getValueAt(row, 2).toString());
        }catch(NullPointerException npe){
            System.out.println("Sorry");
            npe.printStackTrace();
        }
    }//GEN-LAST:event_tbWorkingEmployeeMouseClicked

    private void cbEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmpIdActionPerformed
        if(cbEmpId.getItemCount() == 0)
            return;
        txtName.setText(receptionist.get(cbEmpId.getSelectedItem()));
    }//GEN-LAST:event_cbEmpIdActionPerformed

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
            java.util.logging.Logger.getLogger(WorkingEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkingEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkingEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkingEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkingEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle btnAdd;
    private rojerusan.RSMaterialButtonCircle btnDelete;
    private rojerusan.RSMaterialButtonCircle btnUpdate;
    private javax.swing.JComboBox<String> cbEmpId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private rojerusan.RSTableMetro tbWorkingEmployee;
    private app.bolivia.swing.JCTextField txtName;
    private rojerusan.RSPasswordTextPlaceHolder txtPassword;
    private rojerusan.RSPasswordTextPlaceHolder txtRepassword;
    private app.bolivia.swing.JCTextField txtUserId;
    // End of variables declaration//GEN-END:variables
    
    private void loadReceptionistDetails() {
        try{
            List<ReceptionistPojo> receptionistLists = ReceptionistDAO.findAllReceptionist();
            tb = (DefaultTableModel)tbWorkingEmployee.getModel();
            Object []emp = new Object[5];
            for(ReceptionistPojo receptionistList: receptionistLists){
                emp[0] = receptionistList.getEmpId();
                emp[1] = receptionistList.getEmpName();
                emp[2] = receptionistList.getUserId();
                emp[3] = receptionistList.getJob();
                emp[4]  = receptionistList.getSalary();
                tb.addRow(emp);   
            }
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Unable to connect with database", "Error", JOptionPane.ERROR_MESSAGE);
            se.printStackTrace();
        }
    }
    
    private void loadEmpId() {
        try{
            receptionist = ReceptionistDAO.getNonRegisteredReceptionist();
            if(receptionist.isEmpty()){
                JOptionPane.showMessageDialog(null, "No Non-Registerd Receptionist Present ");
                btnAdd.setEnabled(false);
                return;
            }   
            btnAdd.setEnabled(true);
            Set <String> empId = receptionist.keySet();
            Iterator<String> it = empId.iterator();
            cbEmpId.removeAllItems();
            while(it.hasNext()){
                cbEmpId.addItem(it.next());
            }
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Unable to load employee id");
            se.printStackTrace();
        }
    }
    
    private boolean isEmpty() {
        String empName = txtName.getText().trim();
        String userID = txtUserId.getText().trim();
        String password = txtPassword.getSelectedText();
        String rePassword = txtRepassword.getSelectedText();
        
        if(empName.isEmpty() || userID.isEmpty() || password.isEmpty() || rePassword.isEmpty()){
            return false;
        }  
        return true;
    }

    

    private void clearText() {
        txtName.setText("");
        txtUserId.setText("");
        txtPassword.setText("");
        txtRepassword.setText("");
        
    }
    private int validateInput(){
        if(txtPassword.getPassword().length < 4 || txtRepassword.getPassword().length < 4){
            return 1;
        }
        
        else if(txtUserId.getText().isEmpty()){
           
            return -1;
        }
        return 0;
    }
    private boolean isPasswordSame(String first,String second){
        return first.equals(second);
        
    }

    private boolean validateInputUpdate(){
        char[] password = txtPassword.getPassword();
        char[] rePassword = txtRepassword.getPassword();
        if(password.length <4 || rePassword.length<4){
            JOptionPane.showMessageDialog(null, "Please Enter at least 4 character","Incomplete",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        pass = String.valueOf(password);
        String rePass = String.valueOf(rePassword);
        if(!pass.equals(rePass)){
            JOptionPane.showMessageDialog(null, "Please Enter same password","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
}
