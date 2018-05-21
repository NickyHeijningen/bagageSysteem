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
public class gevondenBagageRegistreren1 extends javax.swing.JFrame {


    public gevondenBagageRegistreren1() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        pagina1Tekst = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        kiesTaalKnop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        ingelogdAlsTekst = new javax.swing.JLabel();
        homeKnop = new javax.swing.JButton();
        labelnummerTekst = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        zoekenButton = new javax.swing.JButton();
        vluchtnummerTekst = new javax.swing.JLabel();
        luchthavenVanVertrekTekst = new javax.swing.JLabel();
        bestemmingTekst = new javax.swing.JLabel();
        vertrekDatumTekst = new javax.swing.JLabel();
        typeTekst = new javax.swing.JLabel();
        merkTekst = new javax.swing.JLabel();
        annulerenKnop = new javax.swing.JButton();
        vermistRegistrerenKnop = new javax.swing.JButton();
        kleurTekst = new javax.swing.JLabel();
        locatieVermistOpgegevenTekst = new javax.swing.JLabel();
        kenmerkenTekst = new javax.swing.JLabel();
        vermistGemeldTekst = new javax.swing.JLabel();
        vluchtnummerDataTekst = new javax.swing.JLabel();
        luchthavenVanVertrekDatTekst = new javax.swing.JLabel();
        bestemmingDataTekst = new javax.swing.JLabel();
        vertrekdatumDataTekst = new javax.swing.JLabel();
        typeDataTekst = new javax.swing.JLabel();
        merkDataTekst = new javax.swing.JLabel();
        kenmerkenDataTekst = new javax.swing.JLabel();
        vermistGemeldDataTekst = new javax.swing.JLabel();
        locatieVermistOpgegevenDataTekst = new javax.swing.JLabel();
        pagina1Tekst1 = new javax.swing.JLabel();
        kiesKleurKnop = new javax.swing.JComboBox<>();

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

        labelnummerTekst.setText("Labelnummer");
        getContentPane().add(labelnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 72, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 62, 249, 35));

        zoekenButton.setText("Zoeken");
        zoekenButton.setBackground(Color.decode("#CC0000"));
        zoekenButton.setForeground(Color.WHITE);
        getContentPane().add(zoekenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 103, 249, 35));

        vluchtnummerTekst.setText("Vluchtnummer");
        getContentPane().add(vluchtnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 171, -1, -1));

        luchthavenVanVertrekTekst.setText("Luchthaven van vertrek");
        getContentPane().add(luchthavenVanVertrekTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 203, -1, -1));

        bestemmingTekst.setText("Bestemming");
        getContentPane().add(bestemmingTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 235, -1, -1));

        vertrekDatumTekst.setText("Vertrekdatum");
        getContentPane().add(vertrekDatumTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 267, -1, -1));

        typeTekst.setText("Type");
        getContentPane().add(typeTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 299, -1, -1));

        merkTekst.setText("Merk");
        getContentPane().add(merkTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 331, -1, -1));

        annulerenKnop.setText("Annuleren");
        annulerenKnop.setBackground(Color.decode("#CC0000"));
        annulerenKnop.setForeground(Color.WHITE);
        annulerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(annulerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 522, 249, 35));

        vermistRegistrerenKnop.setText("Doorgaan");
        vermistRegistrerenKnop.setBackground(Color.decode("#CC0000"));
        vermistRegistrerenKnop.setForeground(Color.WHITE);
        vermistRegistrerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermistRegistrerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(vermistRegistrerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 522, 249, 35));

        kleurTekst.setText("Kleur");
        getContentPane().add(kleurTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 363, -1, -1));

        locatieVermistOpgegevenTekst.setText("Locatie vermist opgegeven");
        getContentPane().add(locatieVermistOpgegevenTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 459, -1, -1));

        kenmerkenTekst.setText("Kenmerken");
        getContentPane().add(kenmerkenTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 395, -1, -1));

        vermistGemeldTekst.setText("Vermist gemeld");
        getContentPane().add(vermistGemeldTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 427, -1, -1));

        vluchtnummerDataTekst.setText("Vluchtnummer");
        getContentPane().add(vluchtnummerDataTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 171, -1, -1));

        luchthavenVanVertrekDatTekst.setText("Luchthaven van vertrek");
        getContentPane().add(luchthavenVanVertrekDatTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 203, -1, -1));

        bestemmingDataTekst.setText("Bestemming");
        getContentPane().add(bestemmingDataTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 235, -1, -1));

        vertrekdatumDataTekst.setText("Vertrekdatum");
        getContentPane().add(vertrekdatumDataTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 267, -1, -1));

        typeDataTekst.setText("Type");
        getContentPane().add(typeDataTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 299, -1, -1));

        merkDataTekst.setText("Merk");
        getContentPane().add(merkDataTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 331, -1, -1));

        kenmerkenDataTekst.setText("Kenmerken");
        getContentPane().add(kenmerkenDataTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 395, -1, -1));

        vermistGemeldDataTekst.setText("Vermist gemeld");
        getContentPane().add(vermistGemeldDataTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 427, -1, -1));

        locatieVermistOpgegevenDataTekst.setText("Locatie vermist opgegeven");
        getContentPane().add(locatieVermistOpgegevenDataTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 459, -1, -1));

        pagina1Tekst1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst1.setText("Pagina 1");
        getContentPane().add(pagina1Tekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 34, -1, -1));

        kiesKleurKnop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rood", "Groen", "Blauw", "Zwart", "Geel", "Paars", "Roze", "Oranje" }));
        getContentPane().add(kiesKleurKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 357, 249, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeKnopActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void annulerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnopActionPerformed
        // TODO add your handling code here:
        hoofdMenu m = new hoofdMenu();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_annulerenKnopActionPerformed

    private void vermistRegistrerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermistRegistrerenKnopActionPerformed
        // TODO add your handling code here:
        vermisteBagageRegistreren2 m = new vermisteBagageRegistreren2();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
        
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
            java.util.logging.Logger.getLogger(gevondenBagageRegistreren1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gevondenBagageRegistreren1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gevondenBagageRegistreren1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gevondenBagageRegistreren1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gevondenBagageRegistreren1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerenKnop;
    private javax.swing.JLabel bestemmingDataTekst;
    private javax.swing.JLabel bestemmingTekst;
    private javax.swing.JButton homeKnop;
    private javax.swing.JLabel ingelogdAlsTekst;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel kenmerkenDataTekst;
    private javax.swing.JLabel kenmerkenTekst;
    private javax.swing.JComboBox<String> kiesKleurKnop;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JLabel kleurTekst;
    private javax.swing.JLabel labelnummerTekst;
    private javax.swing.JLabel locatieVermistOpgegevenDataTekst;
    private javax.swing.JLabel locatieVermistOpgegevenTekst;
    private javax.swing.JLabel luchthavenVanVertrekDatTekst;
    private javax.swing.JLabel luchthavenVanVertrekTekst;
    private javax.swing.JLabel merkDataTekst;
    private javax.swing.JLabel merkTekst;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JLabel pagina1Tekst1;
    private javax.swing.JLabel typeDataTekst;
    private javax.swing.JLabel typeTekst;
    private javax.swing.JLabel vermistGemeldDataTekst;
    private javax.swing.JLabel vermistGemeldTekst;
    private javax.swing.JButton vermistRegistrerenKnop;
    private javax.swing.JLabel vertrekDatumTekst;
    private javax.swing.JLabel vertrekdatumDataTekst;
    private javax.swing.JLabel vluchtnummerDataTekst;
    private javax.swing.JLabel vluchtnummerTekst;
    private javax.swing.JButton zoekenButton;
    // End of variables declaration//GEN-END:variables
}
