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
public class zoekenAanpassen2 extends javax.swing.JFrame {

    public zoekenAanpassen2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        pagina1Tekst = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        kiesTaalKnop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        ingelogdAlsTekst = new javax.swing.JLabel();
        homeKnop = new javax.swing.JButton();
        annulerenKnop = new javax.swing.JButton();
        vermistRegistrerenKnop = new javax.swing.JButton();
        pagina1Tekst1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        persoonsgegevensTekst = new javax.swing.JLabel();
        naamTekst = new javax.swing.JLabel();
        geboortedatumTekst = new javax.swing.JLabel();
        telefoonnummerTekst = new javax.swing.JLabel();
        emailTekst = new javax.swing.JLabel();
        verzendenNaarTekst = new javax.swing.JLabel();
        adresTekst = new javax.swing.JLabel();
        woonplaatsTekst = new javax.swing.JLabel();
        postcodeTekstveld = new javax.swing.JTextField();
        postcodeTekst = new javax.swing.JLabel();
        landTekst = new javax.swing.JLabel();
        locatieVermistOpgegevenTekst = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        locatieVermistOpgegevenTekst1 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();

        jButton4.setText("Log in");
        jButton4.setBackground(Color.decode("#CC0000"));

        jButton6.setText("Accounts beheren");
        jButton6.setBackground(Color.decode("#CC0000"));

        pagina1Tekst.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst.setText("Pagina 1");

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
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ingelogdAlsTekst)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel1);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 575, 674, -1));

        homeKnop.setText("Home");
        homeKnop.setBackground(Color.decode("#CC0000"));
        homeKnop.setForeground(Color.WHITE);
        homeKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeKnopActionPerformed(evt);
            }
        });
        getContentPane().add(homeKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 575, -1, 25));

        annulerenKnop.setText("Annuleren");
        annulerenKnop.setBackground(Color.decode("#CC0000"));
        annulerenKnop.setForeground(Color.WHITE);
        annulerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(annulerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 522, 249, 35));

        vermistRegistrerenKnop.setText("Opslaan");
        vermistRegistrerenKnop.setBackground(Color.decode("#CC0000"));
        vermistRegistrerenKnop.setForeground(Color.WHITE);
        vermistRegistrerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermistRegistrerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(vermistRegistrerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 522, 249, 35));

        pagina1Tekst1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst1.setText("Pagina 2");
        getContentPane().add(pagina1Tekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 34, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 125, 171, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 94, 171, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 182, 171, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 156, 171, -1));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 325, 171, -1));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 294, 171, -1));
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 263, 171, -1));

        persoonsgegevensTekst.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        persoonsgegevensTekst.setText("Persoonsgegevens");
        getContentPane().add(persoonsgegevensTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 62, -1, -1));

        naamTekst.setText("Naam");
        getContentPane().add(naamTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 97, -1, -1));

        geboortedatumTekst.setText("Geboortedatum");
        getContentPane().add(geboortedatumTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 128, -1, -1));

        telefoonnummerTekst.setText("Telefoonnummer");
        getContentPane().add(telefoonnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 156, -1, -1));

        emailTekst.setText("E-mail");
        getContentPane().add(emailTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 182, -1, -1));

        verzendenNaarTekst.setText("Verzenden naar");
        getContentPane().add(verzendenNaarTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 208, -1, -1));

        adresTekst.setText("Adres");
        getContentPane().add(adresTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 236, -1, -1));

        woonplaatsTekst.setText("Woonplaats");
        getContentPane().add(woonplaatsTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 263, -1, -1));
        getContentPane().add(postcodeTekstveld, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 233, 171, -1));

        postcodeTekst.setText("Postcode");
        getContentPane().add(postcodeTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 294, -1, -1));

        landTekst.setText("Land");
        getContentPane().add(landTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 325, -1, -1));

        locatieVermistOpgegevenTekst.setText("Locatie gevonden");
        getContentPane().add(locatieVermistOpgegevenTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 354, -1, -1));
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 351, 171, -1));

        locatieVermistOpgegevenTekst1.setText("Gevonden gemeld");
        getContentPane().add(locatieVermistOpgegevenTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 382, -1, -1));
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 382, 171, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeKnopActionPerformed

    private void annulerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnopActionPerformed
        // TODO add your handling code here:
        
        zoekenAanpassen1 m = new zoekenAanpassen1();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
        
    }//GEN-LAST:event_annulerenKnopActionPerformed

    private void vermistRegistrerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermistRegistrerenKnopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vermistRegistrerenKnopActionPerformed

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
            java.util.logging.Logger.getLogger(zoekenAanpassen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zoekenAanpassen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zoekenAanpassen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zoekenAanpassen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zoekenAanpassen2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresTekst;
    private javax.swing.JButton annulerenKnop;
    private javax.swing.JLabel emailTekst;
    private javax.swing.JLabel geboortedatumTekst;
    private javax.swing.JButton homeKnop;
    private javax.swing.JLabel ingelogdAlsTekst;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JLabel landTekst;
    private javax.swing.JLabel locatieVermistOpgegevenTekst;
    private javax.swing.JLabel locatieVermistOpgegevenTekst1;
    private javax.swing.JLabel naamTekst;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JLabel pagina1Tekst1;
    private javax.swing.JLabel persoonsgegevensTekst;
    private javax.swing.JLabel postcodeTekst;
    private javax.swing.JTextField postcodeTekstveld;
    private javax.swing.JLabel telefoonnummerTekst;
    private javax.swing.JButton vermistRegistrerenKnop;
    private javax.swing.JLabel verzendenNaarTekst;
    private javax.swing.JLabel woonplaatsTekst;
    // End of variables declaration//GEN-END:variables
}
