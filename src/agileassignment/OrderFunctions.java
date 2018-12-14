/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author EZAF
 */
public class OrderFunctions extends javax.swing.JFrame {

    public static ArrayList<Flowerorder> flowerList = new ArrayList<>();
    public static ArrayList<Customerorder> customerList = new ArrayList<>();
    JFrame jframe;
    String FrameTitle = "Catalog Order Functions";

    public OrderFunctions() {
        initComponents();
        Flowerorder f = new Flowerorder("Roses", 100, 20.00, 18.00);
        Flowerorder f2 = new Flowerorder("Sun", 80, 10.00, 5.00);
        Flowerorder f3 = new Flowerorder("Moon", 90, 15.00, 10.00);
        Flowerorder f4 = new Flowerorder("Mars",90,16.00,10.00);
        flowerList.add(f);
        flowerList.add(f2);
        flowerList.add(f3);
        flowerList.add(f4);
        Customerorder c1 = new Customerorder("Desmond",981202,0172646,"desmondwch@yahoo.com","Sungai Way",'M',"Corporate",800);
        Customerorder c2 = new Customerorder("ZhiJun",919119,0172645,"zhijun@yahoo.com","Sunway",'M',"Consumer",99999);
        Customerorder c3 = new Customerorder("Wong",91919,9000,"wong@yahoo.com","Kepong",'F',"Corporate",900);
        customerList.add(c1);
        customerList.add(c2);
    }

    public void getFrame() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 100, 330, 220);
        setTitle(FrameTitle);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButton_AddOrder = new javax.swing.JButton();
        JButton_ViewOrder = new javax.swing.JButton();
        JButton_GenerateSO = new javax.swing.JButton();
        JButton_DeleteOrder = new javax.swing.JButton();
        JButton_BackMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JButton_AddOrder.setText("Add Order");
        JButton_AddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_AddOrderActionPerformed(evt);
            }
        });

        JButton_ViewOrder.setText("View Orders");
        JButton_ViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_ViewOrderActionPerformed(evt);
            }
        });

        JButton_GenerateSO.setText("Generate Sales Order");
        JButton_GenerateSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_GenerateSOActionPerformed(evt);
            }
        });

        JButton_DeleteOrder.setText("Delete Order");
        JButton_DeleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_DeleteOrderActionPerformed(evt);
            }
        });

        JButton_BackMenu.setText("Back to Menu");
        JButton_BackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_BackMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JButton_ViewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButton_AddOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButton_GenerateSO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButton_DeleteOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButton_BackMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JButton_AddOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButton_ViewOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButton_GenerateSO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButton_DeleteOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JButton_BackMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_AddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_AddOrderActionPerformed
        new AddOrder1().setVisible(true);
    }//GEN-LAST:event_JButton_AddOrderActionPerformed

    private void JButton_ViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_ViewOrderActionPerformed

        new ViewOrder().setVisible(true);
    }//GEN-LAST:event_JButton_ViewOrderActionPerformed

    private void JButton_GenerateSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_GenerateSOActionPerformed

        new GenerateSalesOrder().setVisible(true);
    }//GEN-LAST:event_JButton_GenerateSOActionPerformed

    private void JButton_DeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_DeleteOrderActionPerformed

        new DeleteOrder().setVisible(true);
    }//GEN-LAST:event_JButton_DeleteOrderActionPerformed

    private void JButton_BackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_BackMenuActionPerformed
        this.setVisible(false);
        //MainMenu().setVisible(true);
    }//GEN-LAST:event_JButton_BackMenuActionPerformed

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
            java.util.logging.Logger.getLogger(OrderFunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new OrderFunctions().getFrame();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_AddOrder;
    private javax.swing.JButton JButton_BackMenu;
    private javax.swing.JButton JButton_DeleteOrder;
    private javax.swing.JButton JButton_GenerateSO;
    private javax.swing.JButton JButton_ViewOrder;
    // End of variables declaration//GEN-END:variables
}
