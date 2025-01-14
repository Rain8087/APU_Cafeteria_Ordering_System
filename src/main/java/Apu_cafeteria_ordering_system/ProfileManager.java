/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Apu_cafeteria_ordering_system;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jorda
 */
public class ProfileManager extends javax.swing.JFrame {

    /**
     * Creates new form ProfileManager
     */
    public ProfileManager() {
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

        lblProfile = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContNum = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtRePass = new javax.swing.JTextField();
        lblContNum = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRePass = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblProfile.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblProfile.setText("Profile");

        lblName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblName.setText("Name: ");

        txtName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtContNum.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtPass.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtRePass.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        lblContNum.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblContNum.setText("Contact Number: ");

        lblEmail.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEmail.setText("Email: ");

        lblPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblPassword.setText("Password: ");

        lblRePass.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblRePass.setText("Reenter Password: ");

        btnBack.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContNum)
                            .addComponent(lblName)
                            .addComponent(lblEmail)
                            .addComponent(lblPassword)
                            .addComponent(lblRePass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRePass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtName)
                            .addComponent(txtContNum))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRePass))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String userinfo;
    String Name;
    String ContNum;
    String Email;
    //Receive data from Manager
    public ProfileManager(String line){
        initComponents();
        userinfo = line;
        //Disect data
        Name = userinfo.split(",")[3];
        ContNum = userinfo.split(",")[4];
        Email = userinfo.split(",")[0];
        //Set data into text field
        txtName.setText(Name);
        txtContNum.setText(ContNum);
        txtEmail.setText(Email);
    }
    
    void UpdateProfile(String name, String ContN, String Em, String Pa) throws IOException{
        String N = name;
        String C = ContN;
        String E = Em;
        String P = Pa;
        String NUserinfo = "";
        //Create sanner to scan file
        Scanner sc = new Scanner(new File("User.txt"));
        //Create buffer
        StringBuffer buffer = new StringBuffer();
        //Store data in file into buffer
        while(sc.hasNextLine()){
            buffer.append(sc.nextLine()+System.lineSeparator());
        }
        //Convert data in buffer into string
        String fileContents = buffer.toString();
        //Set data in text field into variable NUserinfo
        NUserinfo = E+","+P+",Manager,"+N+","+C;
        //Replace old data with new data using replaceAll
        fileContents = fileContents.replaceAll(userinfo, NUserinfo);
        //Write data into file
        FileWriter writer = new FileWriter("User.txt");
        writer.append(fileContents);
        //Close file
        writer.close();
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
            //Check if data type entered by user is correct and get data from text field
            Integer.parseInt(txtContNum.getText());
            String Opass = txtPass.getText();
            String Npass = txtRePass.getText();
            //Check if text field is empty
            if(txtPass.getText().length()==0 & txtRePass.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please enter password");
            }
            else if(txtContNum.getText().length()==0){
                JOptionPane.showMessageDialog(null, "Please enter contact number.");
            }
            //Check if password and reentered password is same
            else if(Npass.equals(Opass)){
                //Get data from text field
                String n = txtName.getText();
                String cn = txtContNum.getText();
                String em = txtEmail.getText();
                String pass = txtPass.getText();
                //Send data to same class method, UpdateProfile
                UpdateProfile(n, cn, em, pass);
                //Display a dialog showing that profile has been update
                JOptionPane.showMessageDialog(null, "Profile update success.");
                this.setVisible(false);
            }
            //Display if user password and reentered password is not same
            else{
                JOptionPane.showMessageDialog(null, "New password do not match old password.");
            }
        }
        //Exception handeling
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter number for contact number.");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblContNum;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblRePass;
    private javax.swing.JTextField txtContNum;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtRePass;
    // End of variables declaration//GEN-END:variables
}
