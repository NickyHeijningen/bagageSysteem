/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.SwingConstants;

/**
 *
 * @author Nicky
 */
public class logIn extends javax.swing.JFrame {


    public logIn() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gebruikersnaamTekstVeld = new javax.swing.JTextField();
        logInKnop = new javax.swing.JButton();
        wachtwoordVergetenKnop = new javax.swing.JButton();
        gebruikersnaamTekst = new javax.swing.JLabel();
        wachtwoordTekst = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        kiesTaalKnop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        wachtwoordTekstVeld = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gebruikersnaamTekstVeld.setToolTipText("Gebruikersnaam");
        gebruikersnaamTekstVeld.setHorizontalAlignment(SwingConstants.RIGHT);
        gebruikersnaamTekstVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gebruikersnaamTekstVeldActionPerformed(evt);
            }
        });
        getContentPane().add(gebruikersnaamTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 150, 249, 35));

        logInKnop.setText("Log in");
        logInKnop.setBackground(Color.decode("#CC0000"));
        logInKnop.setForeground(Color.WHITE);
        logInKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInKnopActionPerformed(evt);
            }
        });
        getContentPane().add(logInKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 262, 249, 35));

        wachtwoordVergetenKnop.setText("Wachtwoord vergeten");
        wachtwoordVergetenKnop.setBackground(Color.decode("#CC0000"));
        wachtwoordVergetenKnop.setForeground(Color.WHITE);
        getContentPane().add(wachtwoordVergetenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 514, 249, 35));

        gebruikersnaamTekst.setText("Gebruikersnaam");
        getContentPane().add(gebruikersnaamTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 130, -1, -1));

        wachtwoordTekst.setText("Wachtwoord");
        getContentPane().add(wachtwoordTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 189, -1, -1));

        jToolBar1.setRollover(true);

        kiesTaalKnop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nederlands", "English", "Türk" }));
        jToolBar1.add(kiesTaalKnop);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jToolBar1.add(jPanel1);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 575, 700, -1));

        wachtwoordTekstVeld.setToolTipText("Wachtwoord");
        getContentPane().add(wachtwoordTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 209, 249, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gebruikersnaamTekstVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gebruikersnaamTekstVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gebruikersnaamTekstVeldActionPerformed

    private void logInKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInKnopActionPerformed
        // TODO add your handling code here:
        
        hoofdMenu m = new hoofdMenu();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_logInKnopActionPerformed

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
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gebruikersnaamTekst;
    private javax.swing.JTextField gebruikersnaamTekstVeld;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JButton logInKnop;
    private javax.swing.JLabel wachtwoordTekst;
    private javax.swing.JPasswordField wachtwoordTekstVeld;
    private javax.swing.JButton wachtwoordVergetenKnop;
    // End of variables declaration//GEN-END:variables
}
