/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Apu_cafeteria_ordering_system;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jorda
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form ViewReport
     */
    public Report() {
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

        lblReport = new javax.swing.JLabel();
        lblIncome = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblIncome1 = new javax.swing.JLabel();
        lblIncome2 = new javax.swing.JLabel();
        cmbMonth = new javax.swing.JComboBox<>();
        txtYear = new javax.swing.JTextField();
        txtIncome = new javax.swing.JTextField();
        btnGenerate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblReport.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblReport.setText("Report");

        lblIncome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblIncome.setText("Income (RM):");

        btnBack.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblIncome1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblIncome1.setText("Year: ");

        lblIncome2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblIncome2.setText("Month: ");

        cmbMonth.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));

        txtYear.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        txtIncome.setEditable(false);
        txtIncome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        btnGenerate.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(lblIncome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIncome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerate, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIncome1)
                            .addComponent(lblIncome2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIncome1)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIncome2)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIncome)
                    .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnGenerate))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*this function has been move to APU_Cafeteria_Ordering_System.java
    void countLines(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("User.txt"));
            for(int i=0;br.readLine()!=null;i++){
                ln++;
            }
            br.close();
        }
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Countline filenotfound");
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Countline ioexp");
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    */
    
    void GenerateReport(String y,String m){
        APU_Cafeteria_Ordering_System cos = new APU_Cafeteria_Ordering_System();
        int ln = cos.getData(); //Getset method
        //Receiving data
        String year = y;
        String month = m;
        //Combind data
        String ym = year+month;
        Double money = 0.00;
        try {
            //Read file
            BufferedReader br = new BufferedReader(new FileReader("Payment.txt"));
            for(int i=0;i<ln;i++){
                //Read line
                String line = br.readLine();
                //Ignore null return from readLine
                if(line == null){

                }
                //Get data that match ym only
                else if(line.split(",")[5].startsWith(ym)){
                    money = money+Double.parseDouble(line.split(",")[2]);
                }
            }
            //close file
            br.close();
            //Set text field to money
            txtIncome.setText(money.toString());
        } 
        //Exception handeling
        catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        //CHeck if user select month
        if(cmbMonth.getSelectedIndex()!=0){
            try{
                //Check if user enter correct data type into text field
                Integer.parseInt(txtYear.getText().trim());
                //Get year and month from text field
                String year = txtYear.getText().trim();
                String month = cmbMonth.getSelectedItem().toString();
                //Send data to same class method, GenerateReport
                GenerateReport(year,month);
            }
            //Exception handeling
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please enter number for year.");
            }
        }
        //Display a message to remind user to enter year if year is not entered
        else if(txtYear.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter year.");
        }
        //Display a message to remind user to choose month if year is not choose
        else if(cmbMonth.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Please select month.");
        }
    }//GEN-LAST:event_btnGenerateActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblIncome1;
    private javax.swing.JLabel lblIncome2;
    private javax.swing.JLabel lblReport;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
