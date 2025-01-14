/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Apu_cafeteria_ordering_system;

import java.io.*;
import java.io.FileReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jorda
 */
public class Order extends javax.swing.JFrame {

    /**
     * Creates new form OrderStatus
     */
    
    String name, role, password, account, email;
    int number;
        
    public Order() {
        initComponents();
    }
    
    public Order(String n, int cn, String r, String p, String a, String em)
    {
        initComponents();
        name = n;
        number = cn;
        role = r;
        password = p;
        account = a;
        email = em;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrder = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblOrderErr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblOrder.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lblOrder.setText("Order Status");

        btnBack.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact No.", "Total", "Status", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblOrderErr.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOrderErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnView)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrder)
                .addGap(287, 287, 287)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnView)
                    .addComponent(lblOrderErr))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        System.out.println(name);
        System.out.println(number);

        try
        {
            File f = new File("Status.txt");
            int count = 0;
            try
            {
                Scanner sc = new Scanner(f);
                while(sc.hasNextLine())
                {
                    sc.nextLine();
                    count++;
                }
                //System.out.println(count);
            }
            catch(Exception e)
            {
                e.getStackTrace();
            }

            BufferedReader in = new BufferedReader(new FileReader("Status.txt"));//buffered is to speed up read,refer to slides ro smth
            String str;
            //String [] allrec = {};
            ArrayList<String> ar = new ArrayList<String>();
            //System.out.println(allrec.getClass().getSimpleName());
            while ((str = in.readLine()) != null)//it will show error if the text file have empty lines
            {
                ar.add(str);//ar will have all the account details, such as allrec in python
                //System.out.println(str);
            }
            in.close();

            int flg = 0, k = 0;
            ArrayList<Integer> kari = new ArrayList<Integer>();

            for (int i = 0; i < count; i++)//to check for repetitive email
            {
                String mcn, mn;
                String fullstatus = (ar.get(i));
                String[] status = fullstatus.split(",");
                mn = status[0];
                mcn = status[1];
                //System.out.println(mn);
                //System.out.println(mcn);

                if (name.equals(mn) && number == (Integer.parseInt(mcn)))
                {
                    kari.add(i);
                    //kari[k] = i;
                    k += 1;
                    //System.out.println("Test");
                }
                else
                {
                    
                }

            }
            int l = kari.size();
            int[] ari = new int[l];
            flg = 1;
            System.out.println(ari[1]);
            System.out.println(ari.length);
            int i = 0;

            if (flg == 1)
            {
                try
                {
                    BufferedReader br = new BufferedReader(new FileReader("Status.txt"));//if need, add "Id,Name,Type,Price" to the 1st line in Menu.txt
                    DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                    model.setRowCount(0);
                    Object[] tableLines = br.lines().toArray();

                    for(int p = 0; p < ari.length; p++)
                    {
                        i = kari.get(p);
                        String line = tableLines[i].toString().trim();
                        String[] dataRow = line.split(",");
                        model.addRow(dataRow);

                    }

                }
                catch(Exception e)
                {

                }
            }
            else
            {
                lblOrderErr.setText("Error happened, please exit");
            }

        }
        catch (Exception ex)
        {
            Logger.getLogger(ViewMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        Customer cm = new Customer(name,number,role,password,account,email);
        cm.setVisible(true);
        return;
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblOrderErr;
    // End of variables declaration//GEN-END:variables
}
