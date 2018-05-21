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
public class vermisteBagageRegistreren1 extends javax.swing.JFrame {


    public vermisteBagageRegistreren1() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        kiesTaalKnop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        ingelogdAlsTekst = new javax.swing.JLabel();
        homeKnop = new javax.swing.JButton();
        annulerenKnop = new javax.swing.JButton();
        btnDoorgaan = new javax.swing.JButton();
        persoonsgegevensTekst = new javax.swing.JLabel();
        naamTekst = new javax.swing.JLabel();
        geboortedatumTekst = new javax.swing.JLabel();
        telefoonnummerTekst = new javax.swing.JLabel();
        emailTekst = new javax.swing.JLabel();
        verzendenNaarTekst = new javax.swing.JLabel();
        adresTekst = new javax.swing.JLabel();
        woonplaatsTekst = new javax.swing.JLabel();
        postcodeTekst = new javax.swing.JLabel();
        landTekst = new javax.swing.JLabel();
        locatieVermistOpgegevenTekst = new javax.swing.JLabel();
        pagina1Tekst = new javax.swing.JLabel();
        telefoonnummerTekstVeld = new javax.swing.JTextField();
        emailTekstVeld = new javax.swing.JTextField();
        adresTekstVeld = new javax.swing.JTextField();
        woonplaatsTekstVeld = new javax.swing.JTextField();
        postcodeTekstveld = new javax.swing.JTextField();
        landTekstVeld = new javax.swing.JTextField();
        locatieVermistOpgegevenTekstveld = new javax.swing.JTextField();
        telefoonnummerTekstVeld1 = new javax.swing.JTextField();
        telefoonnummerTekstVeld2 = new javax.swing.JTextField();

        jButton4.setText("Log in");
        jButton4.setBackground(Color.decode("#CC0000"));

        jButton6.setText("Accounts beheren");
        jButton6.setBackground(Color.decode("#CC0000"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        homeKnop.setText("Home");
        homeKnop.setBackground(Color.decode("#CC0000"));
        homeKnop.setForeground(Color.WHITE);
        homeKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeKnopActionPerformed(evt);
            }
        });
        getContentPane().add(homeKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 575, 62, 25));

        annulerenKnop.setText("Annuleren");
        annulerenKnop.setBackground(Color.decode("#CC0000"));
        annulerenKnop.setForeground(Color.WHITE);
        annulerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(annulerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 522, 249, 35));

        btnDoorgaan.setText("Doorgaan");
        btnDoorgaan.setBackground(Color.decode("#CC0000"));
        btnDoorgaan.setForeground(Color.WHITE);
        btnDoorgaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoorgaanActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoorgaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 522, 249, 35));

        persoonsgegevensTekst.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        persoonsgegevensTekst.setText("Persoonsgegevens");
        getContentPane().add(persoonsgegevensTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 115, -1, -1));

        naamTekst.setText("Naam");
        getContentPane().add(naamTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 147, -1, -1));

        geboortedatumTekst.setText("Geboortedatum");
        getContentPane().add(geboortedatumTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 172, -1, -1));

        telefoonnummerTekst.setText("Telefoonnummer");
        getContentPane().add(telefoonnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 197, -1, -1));

        emailTekst.setText("E-mail");
        getContentPane().add(emailTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 222, -1, -1));

        verzendenNaarTekst.setText("Verzenden naar:");
        getContentPane().add(verzendenNaarTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 247, 90, -1));

        adresTekst.setText("Adres");
        getContentPane().add(adresTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 282, -1, -1));

        woonplaatsTekst.setText("Woonplaats");
        getContentPane().add(woonplaatsTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 309, -1, -1));

        postcodeTekst.setText("Postcode");
        getContentPane().add(postcodeTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 340, -1, -1));

        landTekst.setText("Land");
        getContentPane().add(landTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 371, -1, -1));

        locatieVermistOpgegevenTekst.setText("Locatie vermist opgegeven");
        getContentPane().add(locatieVermistOpgegevenTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        pagina1Tekst.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst.setText("Pagina 1");
        getContentPane().add(pagina1Tekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 44, -1, -1));

        telefoonnummerTekstVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoonnummerTekstVeldActionPerformed(evt);
            }
        });
        getContentPane().add(telefoonnummerTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 130, -1));
        getContentPane().add(emailTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 231, 130, -1));
        getContentPane().add(adresTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 279, 130, -1));
        getContentPane().add(woonplaatsTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 306, 130, -1));
        getContentPane().add(postcodeTekstveld, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 337, 130, -1));
        getContentPane().add(landTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 368, 130, -1));
        getContentPane().add(locatieVermistOpgegevenTekstveld, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 397, 130, -1));

        telefoonnummerTekstVeld1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoonnummerTekstVeld1ActionPerformed(evt);
            }
        });
        getContentPane().add(telefoonnummerTekstVeld1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 130, -1));

        telefoonnummerTekstVeld2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoonnummerTekstVeld2ActionPerformed(evt);
            }
        });
        getContentPane().add(telefoonnummerTekstVeld2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeKnopActionPerformed

    private void annulerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnopActionPerformed
        // TODO add your handling code here:
        hoofdMenu m = new hoofdMenu();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_annulerenKnopActionPerformed

    private void btnDoorgaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoorgaanActionPerformed
        // TODO add your handling code here:
        
        vermisteBagageRegistreren2 m = new vermisteBagageRegistreren2();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
        
        
    }//GEN-LAST:event_btnDoorgaanActionPerformed

    private void telefoonnummerTekstVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoonnummerTekstVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoonnummerTekstVeldActionPerformed

    private void telefoonnummerTekstVeld1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoonnummerTekstVeld1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoonnummerTekstVeld1ActionPerformed

    private void telefoonnummerTekstVeld2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoonnummerTekstVeld2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoonnummerTekstVeld2ActionPerformed

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
            java.util.logging.Logger.getLogger(vermisteBagageRegistreren1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vermisteBagageRegistreren1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vermisteBagageRegistreren1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vermisteBagageRegistreren1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vermisteBagageRegistreren1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresTekst;
    private javax.swing.JTextField adresTekstVeld;
    private javax.swing.JButton annulerenKnop;
    private javax.swing.JButton btnDoorgaan;
    private javax.swing.JLabel emailTekst;
    private javax.swing.JTextField emailTekstVeld;
    private javax.swing.JLabel geboortedatumTekst;
    private javax.swing.JButton homeKnop;
    private javax.swing.JLabel ingelogdAlsTekst;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JLabel landTekst;
    private javax.swing.JTextField landTekstVeld;
    private javax.swing.JLabel locatieVermistOpgegevenTekst;
    private javax.swing.JTextField locatieVermistOpgegevenTekstveld;
    private javax.swing.JLabel naamTekst;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JLabel persoonsgegevensTekst;
    private javax.swing.JLabel postcodeTekst;
    private javax.swing.JTextField postcodeTekstveld;
    private javax.swing.JLabel telefoonnummerTekst;
    private javax.swing.JTextField telefoonnummerTekstVeld;
    private javax.swing.JTextField telefoonnummerTekstVeld1;
    private javax.swing.JTextField telefoonnummerTekstVeld2;
    private javax.swing.JLabel verzendenNaarTekst;
    private javax.swing.JLabel woonplaatsTekst;
    private javax.swing.JTextField woonplaatsTekstVeld;
    // End of variables declaration//GEN-END:variables
}
