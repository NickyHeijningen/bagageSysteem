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
public class zoekenAanpassen1 extends javax.swing.JFrame {
int taal;
int rechten;

    public zoekenAanpassen1(int taal, int rechten) {
        this.rechten = rechten;
        this.taal = taal;
        initComponents();
        kiesTaalKnop.setSelectedIndex(taal);
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
        jSeparator5 = new javax.swing.JSeparator();
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
        pagina1Tekst1 = new javax.swing.JLabel();
        kiesKleurKnop = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

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
        kiesTaalKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiesTaalKnopActionPerformed(evt);
            }
        });
        jToolBar1.add(kiesTaalKnop);

        ingelogdAlsTekst.setText("Lucas van Leijen, Bagagemedewerker");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(ingelogdAlsTekst)
                .addContainerGap(200, Short.MAX_VALUE))
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
        getContentPane().add(labelnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 249, 35));

        zoekenButton.setText("Zoeken");
        zoekenButton.setBackground(Color.decode("#CC0000"));
        zoekenButton.setForeground(Color.WHITE);
        getContentPane().add(zoekenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 249, 35));

        vluchtnummerTekst.setText("Vluchtnummer");
        getContentPane().add(vluchtnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        luchthavenVanVertrekTekst.setText("Luchthaven van vertrek");
        getContentPane().add(luchthavenVanVertrekTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        bestemmingTekst.setText("Bestemming");
        getContentPane().add(bestemmingTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        vertrekDatumTekst.setText("Vertrekdatum");
        getContentPane().add(vertrekDatumTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        typeTekst.setText("Type");
        getContentPane().add(typeTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        merkTekst.setText("Merk");
        getContentPane().add(merkTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

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
        getContentPane().add(kleurTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        locatieVermistOpgegevenTekst.setText("Locatie vermist opgegeven");
        getContentPane().add(locatieVermistOpgegevenTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        kenmerkenTekst.setText("Kenmerken");
        getContentPane().add(kenmerkenTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        vermistGemeldTekst.setText("Vermist gemeld");
        getContentPane().add(vermistGemeldTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        pagina1Tekst1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst1.setText("Pagina 1");
        getContentPane().add(pagina1Tekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        kiesKleurKnop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rood", "Groen", "Blauw", "Zwart", "Geel", "Paars", "Roze", "Oranje" }));
        getContentPane().add(kiesKleurKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 249, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 249, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 249, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 249, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 249, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 249, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 249, -1));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 249, -1));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 249, -1));
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 249, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Bagagegegevens");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 570, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnopActionPerformed
        hoofdMenu b = new hoofdMenu(taal, rechten);
        hoofdMenu.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
                b.setVisible(true);
                setVisible(false);
                dispose();
    }//GEN-LAST:event_homeKnopActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void annulerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnopActionPerformed
        // TODO add your handling code here:

        hoofdMenu m = new hoofdMenu(taal, rechten);
        hoofdMenu.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
        m.setVisible(true);
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_annulerenKnopActionPerformed

    private void vermistRegistrerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermistRegistrerenKnopActionPerformed
        // TODO add your handling code here:
        
        zoekenAanpassen2 m = new zoekenAanpassen2(taal, rechten);
        zoekenAanpassen2.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
        m.setVisible(true);
        
        setVisible(false);
        dispose();
        
    }//GEN-LAST:event_vermistRegistrerenKnopActionPerformed

    private void kiesTaalKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiesTaalKnopActionPerformed
        taal = kiesTaalKnop.getSelectedIndex();
    }//GEN-LAST:event_kiesTaalKnopActionPerformed

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
            java.util.logging.Logger.getLogger(zoekenAanpassen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zoekenAanpassen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zoekenAanpassen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zoekenAanpassen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new zoekenAanpassen1(0, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerenKnop;
    private javax.swing.JLabel bestemmingTekst;
    private javax.swing.JButton homeKnop;
    public static javax.swing.JLabel ingelogdAlsTekst;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel kenmerkenTekst;
    private javax.swing.JComboBox<String> kiesKleurKnop;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JLabel kleurTekst;
    private javax.swing.JLabel labelnummerTekst;
    private javax.swing.JLabel locatieVermistOpgegevenTekst;
    private javax.swing.JLabel luchthavenVanVertrekTekst;
    private javax.swing.JLabel merkTekst;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JLabel pagina1Tekst1;
    private javax.swing.JLabel typeTekst;
    private javax.swing.JLabel vermistGemeldTekst;
    private javax.swing.JButton vermistRegistrerenKnop;
    private javax.swing.JLabel vertrekDatumTekst;
    private javax.swing.JLabel vluchtnummerTekst;
    private javax.swing.JButton zoekenButton;
    // End of variables declaration//GEN-END:variables
}
