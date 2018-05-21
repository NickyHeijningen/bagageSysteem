/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;


/**
 *
 * @author Nicky
 */
public class hoofdMenu extends javax.swing.JFrame {


    public hoofdMenu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        accountsBeherenKnop = new javax.swing.JButton();
        gevondenBagageRegistrerenKnop = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        kiesTaalKnop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        ingelogdAlsTekst = new javax.swing.JLabel();
        vermisteBagageRegistrerenKnop = new javax.swing.JButton();
        zoekenInBagageKnop = new javax.swing.JButton();
        logUitKnop = new javax.swing.JButton();

        jButton4.setText("Log in");
        accountsBeherenKnop.setBackground(Color.decode("#CC0000"));

        jButton6.setText("Accounts beheren");
        accountsBeherenKnop.setBackground(Color.decode("#CC0000"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountsBeherenKnop.setText("Accounts beheren");
        accountsBeherenKnop.setBackground(Color.decode("#CC0000"));
        accountsBeherenKnop.setForeground(Color.WHITE);
        accountsBeherenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsBeherenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(accountsBeherenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 385, 249, 35));

        gevondenBagageRegistrerenKnop.setText("Gevonden bagage registreren");
        gevondenBagageRegistrerenKnop.setBackground(Color.decode("#CC0000"));
        gevondenBagageRegistrerenKnop.setForeground(Color.WHITE);
        gevondenBagageRegistrerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gevondenBagageRegistrerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(gevondenBagageRegistrerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 303, 249, 35));

        jToolBar1.setRollover(true);

        kiesTaalKnop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nederlands", "English", "Türk" }));
        jToolBar1.add(kiesTaalKnop);

        ingelogdAlsTekst.setText("Lucas van Leijen, Bagagemedewerker");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(ingelogdAlsTekst)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ingelogdAlsTekst)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel1);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 575, -1, -1));

        vermisteBagageRegistrerenKnop.setText("Vermiste bagage registreren");
        vermisteBagageRegistrerenKnop.setBackground(Color.decode("#CC0000"));
        vermisteBagageRegistrerenKnop.setForeground(Color.WHITE);
        vermisteBagageRegistrerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermisteBagageRegistrerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(vermisteBagageRegistrerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 262, 249, 35));

        zoekenInBagageKnop.setText("Zoeken in bagage");
        zoekenInBagageKnop.setBackground(Color.decode("#CC0000"));
        zoekenInBagageKnop.setForeground(Color.WHITE);
        zoekenInBagageKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoekenInBagageKnopActionPerformed(evt);
            }
        });
        getContentPane().add(zoekenInBagageKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 344, 249, 35));

        logUitKnop.setText("Log uit");
        logUitKnop.setBackground(Color.decode("#CC0000"));
        logUitKnop.setForeground(Color.WHITE);
        logUitKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logUitKnopActionPerformed(evt);
            }
        });
        getContentPane().add(logUitKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 575, -1, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logUitKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logUitKnopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logUitKnopActionPerformed

    private void accountsBeherenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsBeherenKnopActionPerformed
        // TODO add your handling code here:
        
        accountsBeheren m = new accountsBeheren();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_accountsBeherenKnopActionPerformed

    private void vermisteBagageRegistrerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermisteBagageRegistrerenKnopActionPerformed
        // TODO add your handling code here:
        
        vermisteBagageRegistreren1 m = new vermisteBagageRegistreren1();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
        
        
    }//GEN-LAST:event_vermisteBagageRegistrerenKnopActionPerformed

    private void gevondenBagageRegistrerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gevondenBagageRegistrerenKnopActionPerformed
        // TODO add your handling code here:
        gevondenBagageRegistreren1 m = new gevondenBagageRegistreren1();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
        
        
    }//GEN-LAST:event_gevondenBagageRegistrerenKnopActionPerformed

    private void zoekenInBagageKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoekenInBagageKnopActionPerformed
        // TODO add your handling code here:
        
        zoekenAanpassen1 m = new zoekenAanpassen1();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
        
       
    }//GEN-LAST:event_zoekenInBagageKnopActionPerformed

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
            java.util.logging.Logger.getLogger(hoofdMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hoofdMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hoofdMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hoofdMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hoofdMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountsBeherenKnop;
    private javax.swing.JButton gevondenBagageRegistrerenKnop;
    private javax.swing.JLabel ingelogdAlsTekst;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JButton logUitKnop;
    private javax.swing.JButton vermisteBagageRegistrerenKnop;
    private javax.swing.JButton zoekenInBagageKnop;
    // End of variables declaration//GEN-END:variables
}
