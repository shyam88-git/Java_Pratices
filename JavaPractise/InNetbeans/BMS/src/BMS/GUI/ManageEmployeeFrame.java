/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.GUI;

import BMS.DAO.EmployeesDAO;
import BMS.POJO.EmployeesPojo;
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
public class ManageEmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageEmployeeFrame
     */
    DefaultTableModel tb;
    public ManageEmployeeFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        String userDir = System.getProperty("user.dir");
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage(userDir + "\\icon\\manageemployee.png");
        super.setIconImage(img);
        loadEmployees();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new app.bolivia.swing.JCTextField();
        txtJob = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSalary = new app.bolivia.swing.JCTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtContact = new app.bolivia.swing.JCTextField();
        btnDelete = new rojerusan.RSMaterialButtonCircle();
        btnAdd = new rojerusan.RSMaterialButtonCircle();
        btnUpdate = new rojerusan.RSMaterialButtonCircle();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmployee = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Employee");
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
        jLabel3.setText("Employee ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, 20));

        txtId.setBackground(new java.awt.Color(102, 102, 255));
        txtId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtId.setPhColor(new java.awt.Color(204, 204, 204));
        txtId.setPlaceholder("Enter Employee ID");
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 280, 50));

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

        txtJob.setBackground(new java.awt.Color(102, 102, 255));
        txtJob.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtJob.setForeground(new java.awt.Color(255, 255, 255));
        txtJob.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtJob.setPhColor(new java.awt.Color(204, 204, 204));
        txtJob.setPlaceholder("Enter Job");
        jPanel1.add(txtJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 280, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_new_job_50px_1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 50));

        jLabel8.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Job");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, 20));

        txtSalary.setBackground(new java.awt.Color(102, 102, 255));
        txtSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtSalary.setForeground(new java.awt.Color(255, 255, 255));
        txtSalary.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtSalary.setPhColor(new java.awt.Color(204, 204, 204));
        txtSalary.setPlaceholder("Enter Salary");
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 280, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_salary_female_50px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, 50));

        jLabel10.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Salary");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 90, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_email_document_50px_2.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, 50));

        txtEmail.setBackground(new java.awt.Color(102, 102, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtEmail.setPhColor(new java.awt.Color(204, 204, 204));
        txtEmail.setPlaceholder("Enter Email ID");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 280, 50));

        jLabel12.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("EMAIL");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_phone_contact_50px.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, 50));

        jLabel14.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contact");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, 20));

        txtContact.setBackground(new java.awt.Color(102, 102, 255));
        txtContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtContact.setForeground(new java.awt.Color(255, 255, 255));
        txtContact.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        txtContact.setPhColor(new java.awt.Color(204, 204, 204));
        txtContact.setPlaceholder("Enter Contact No.");
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 280, 50));

        btnDelete.setBackground(new java.awt.Color(255, 102, 102));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, 150, 50));

        btnAdd.setBackground(new java.awt.Color(255, 102, 102));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 150, 50));

        btnUpdate.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, 150, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 760));

        jPanel2.setBackground(new java.awt.Color(255, 252, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Job", "Salary", "Email", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEmployee.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbEmployee.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        tbEmployee.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbEmployee.setColorSelBackgound(new java.awt.Color(255, 102, 102));
        tbEmployee.setFont(new java.awt.Font("Yu Gothic Light", 0, 25)); // NOI18N
        tbEmployee.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tbEmployee.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tbEmployee.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        tbEmployee.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbEmployee.setRowHeight(40);
        tbEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEmployee);
        if (tbEmployee.getColumnModel().getColumnCount() > 0) {
            tbEmployee.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbEmployee.getColumnModel().getColumn(1).setPreferredWidth(300);
            tbEmployee.getColumnModel().getColumn(2).setPreferredWidth(150);
            tbEmployee.getColumnModel().getColumn(3).setPreferredWidth(200);
            tbEmployee.getColumnModel().getColumn(4).setPreferredWidth(400);
            tbEmployee.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 118, 970, 610));

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/Images/icons8_management_30px_3.png"))); // NOI18N
        jLabel1.setText("  Manage Employees");
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 1010, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        ManagerFrame mf = new ManagerFrame();
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String id = txtId.getText().trim();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Select employee First", "Incomplete", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
          boolean result = EmployeesDAO.deleteEmployee(id);
          if(result){
            JOptionPane.showMessageDialog(null, "Record Deleted Sucessfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
            clearText();
            loadEmpId();
            tb.setRowCount(0);
            loadEmployees();
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
            EmployeesPojo emp = new EmployeesPojo();
            emp.setEmployeeId(txtId.getText());
            emp.setEmployeeName(txtName.getText());
            emp.setJob(txtJob.getText());
            emp.setSalary(Double.parseDouble(txtSalary.getText()));
            emp.setEmail(txtEmail.getText());
            emp.setContact(txtContact.getText());
            boolean result = EmployeesDAO.addEmployee(emp);
            if(result == true){
                JOptionPane.showMessageDialog(null, "Record Added Sucessfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
                clearText();
                loadEmpId();
                tb.setRowCount(0);
                loadEmployees();
            }else
                JOptionPane.showMessageDialog(null, "Record not Added Sucessfully","UnSucess",JOptionPane.ERROR_MESSAGE);

        }
        catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Error in database","Incomplete",JOptionPane.ERROR_MESSAGE);
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
            EmployeesPojo emp = new EmployeesPojo();
            emp.setEmployeeId(txtId.getText());
            emp.setEmployeeName(txtName.getText());
            emp.setJob(txtJob.getText());
            emp.setSalary(Double.parseDouble(txtSalary.getText()));
            emp.setEmail(txtEmail.getText());
            emp.setContact(txtContact.getText());
            boolean result = EmployeesDAO.updateEmployee(emp);
            if(result == true){
                JOptionPane.showMessageDialog(null, "Record Updated Sucessfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
                clearText();
                loadEmpId();
                tb.setRowCount(0);
                loadEmployees();
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

    private void tbEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmployeeMouseClicked
        try{
            int row = tbEmployee.getSelectedRow();
            txtId.setText(tb.getValueAt(row, 0).toString());
            txtName.setText(tb.getValueAt(row, 1).toString());
            txtJob.setText(tb.getValueAt(row, 2).toString());
            txtSalary.setText(tb.getValueAt(row, 3).toString());
            txtEmail.setText(tb.getValueAt(row, 4).toString());;
            txtContact.setText(tb.getValueAt(row, 5).toString());
        }catch(NullPointerException npe){
            System.out.println("Sorry");
            npe.printStackTrace();
        }
        
        
    }//GEN-LAST:event_tbEmployeeMouseClicked

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
            java.util.logging.Logger.getLogger(ManageEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle btnAdd;
    private rojerusan.RSMaterialButtonCircle btnDelete;
    private rojerusan.RSMaterialButtonCircle btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private rojerusan.RSTableMetro tbEmployee;
    private app.bolivia.swing.JCTextField txtContact;
    private app.bolivia.swing.JCTextField txtEmail;
    private app.bolivia.swing.JCTextField txtId;
    private app.bolivia.swing.JCTextField txtJob;
    private app.bolivia.swing.JCTextField txtName;
    private app.bolivia.swing.JCTextField txtSalary;
    // End of variables declaration//GEN-END:variables

    private void loadEmployees() {
         try{
            List<EmployeesPojo> empLists = EmployeesDAO.getAllEmployee();
            tb = (DefaultTableModel)tbEmployee.getModel();
            Object []emp = new Object[6];
            for(EmployeesPojo empList: empLists){
                emp[0] = empList.getEmployeeId();
                emp[1] = empList.getEmployeeName();
                emp[2] = empList.getJob();
                emp[3] = empList.getSalary();
                emp[4] = empList.getEmail();
                emp[5] = empList.getContact();
                tb.addRow(emp);
            }
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Unable to connect with database", "Error", JOptionPane.ERROR_MESSAGE);
            se.printStackTrace();
        }
    }
    
    private boolean isEmpty() {
        String empName = txtName.getText().trim();
        String job = txtJob.getText().trim();
        String salary = txtSalary.getText().trim();
        String email = txtEmail.getText().trim();
        String contact = txtContact.getText().trim();
        if(empName.isEmpty() || salary.isEmpty() || job.isEmpty() || email.isEmpty() || contact.isEmpty()){
            return false;
        }  
        return true;
    }

    private void loadEmpId() {
        try{
            String empId = EmployeesDAO.getEmployeeId();
            txtId.setText(empId);
        }
        catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Unable to get employee id.","Error",JOptionPane.ERROR);
            se.printStackTrace();
            return;
        }
    }

    private void clearText() {
        txtName.setText("");
        txtJob.setText("");
        txtSalary.setText("");
        txtEmail.setText("");
        txtContact.setText("");
        
    }
}
