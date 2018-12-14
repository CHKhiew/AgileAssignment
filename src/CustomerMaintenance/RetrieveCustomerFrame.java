/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerMaintenance;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author: Khiew Choon Hong
 */
public class RetrieveCustomerFrame extends javax.swing.JFrame {

    private List<RegisterC> customerList = new ArrayList<RegisterC>();
    /**
     * Creates new form RetrieveCustomerFrame
     */
    public RetrieveCustomerFrame() {
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

        jLabel8 = new javax.swing.JLabel();
        jtfContactNo = new javax.swing.JTextField();
        jtfCompanyName = new javax.swing.JTextField();
        jtfEmailAddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMailingAddress = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnDisplayInfo = new javax.swing.JButton();
        jtfID = new javax.swing.JTextField();
        jtfName = new javax.swing.JTextField();
        jtfIC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfGender = new javax.swing.JTextField();
        jtfStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Mailing Address:");

        jtfContactNo.setEditable(false);
        jtfContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfContactNoActionPerformed(evt);
            }
        });
        jtfContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfContactNoKeyReleased(evt);
            }
        });

        jtfCompanyName.setEditable(false);
        jtfCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCompanyNameActionPerformed(evt);
            }
        });
        jtfCompanyName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCompanyNameKeyReleased(evt);
            }
        });

        jtfEmailAddress.setEditable(false);
        jtfEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailAddressActionPerformed(evt);
            }
        });
        jtfEmailAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfEmailAddressKeyReleased(evt);
            }
        });

        txtAreaMailingAddress.setEditable(false);
        txtAreaMailingAddress.setColumns(20);
        txtAreaMailingAddress.setRows(5);
        txtAreaMailingAddress.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtAreaMailingAddressAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(txtAreaMailingAddress);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Customer Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("IC:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Contact Number:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Gender:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Status:");

        btnDisplayInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDisplayInfo.setText("Display");
        btnDisplayInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayInfoActionPerformed(evt);
            }
        });

        jtfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIDActionPerformed(evt);
            }
        });
        jtfID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfIDKeyReleased(evt);
            }
        });

        jtfName.setEditable(false);
        jtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameActionPerformed(evt);
            }
        });
        jtfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNameKeyReleased(evt);
            }
        });

        jtfIC.setEditable(false);
        jtfIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfICActionPerformed(evt);
            }
        });
        jtfIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfICKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Company Name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Email Address:");

        jtfGender.setEditable(false);

        jtfStatus.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDisplayInfo)
                            .addComponent(jtfGender, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addGap(52, 52, 52)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfIC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jtfEmailAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCompanyName, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addContainerGap(39, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addComponent(jtfGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnDisplayInfo)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jtfIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jtfContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jtfCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jtfEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jLabel8)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel10)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfContactNoActionPerformed

    private void jtfContactNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfContactNoKeyReleased
        // TODO add your handling code here
    }//GEN-LAST:event_jtfContactNoKeyReleased

    private void jtfCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCompanyNameActionPerformed

    private void jtfCompanyNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCompanyNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCompanyNameKeyReleased

    private void jtfEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailAddressActionPerformed

    private void jtfEmailAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEmailAddressKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailAddressKeyReleased

    private void txtAreaMailingAddressAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtAreaMailingAddressAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaMailingAddressAncestorAdded

    private void btnDisplayInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayInfoActionPerformed
        // TODO add your handling code here:
        formatList();
    }//GEN-LAST:event_btnDisplayInfoActionPerformed

    private void jtfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDActionPerformed

    private void jtfIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDKeyReleased

    private void jtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameActionPerformed

    private void jtfNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameKeyReleased

    private void jtfICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfICActionPerformed

    private void jtfICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfICKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfICKeyReleased
//
    //
    public void getRegisterNewCustomerRecord(List<RegisterC> customerList)
    {
        this.customerList = customerList;
        RegisterC cust = new RegisterC();
        
        for (int i = 0; i < customerList.size(); ++i) {
            cust = customerList.get(i);
        }
    }
    
    public void formatList() {
        RegisterC cust = new RegisterC();
        for (int i = 0; i < customerList.size(); ++i) {
            cust = customerList.get(i);
            
            jtfName.setText(cust.getName());
            jtfIC.setText(String.valueOf(cust.getIc()));
            jtfContactNo.setText(String.valueOf(cust.getContactNumber()));
            jtfCompanyName.setText(cust.getCompanyName());
            jtfEmailAddress.setText(cust.getEmailAddress());
            txtAreaMailingAddress.setText(cust.getMailingAddress());
            jtfGender.setText(cust.getGender());
            jtfStatus.setText(cust.getStatus());
        }
    }
    
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
            java.util.logging.Logger.getLogger(RetrieveCustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetrieveCustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetrieveCustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetrieveCustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetrieveCustomerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplayInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfCompanyName;
    private javax.swing.JTextField jtfContactNo;
    private javax.swing.JTextField jtfEmailAddress;
    private javax.swing.JTextField jtfGender;
    private javax.swing.JTextField jtfIC;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfStatus;
    private javax.swing.JTextArea txtAreaMailingAddress;
    // End of variables declaration//GEN-END:variables
}