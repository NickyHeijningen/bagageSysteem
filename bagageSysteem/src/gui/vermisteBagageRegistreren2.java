/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bagagesysteem.Bagage;
import bagagesysteem.BagageDatabase;
import bagagesysteem.VermisteBagageDatabase;
import bagagesysteem.Vluchten;
import bagagesysteem.klantenDatabase;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Nicky
 */
public class vermisteBagageRegistreren2 extends javax.swing.JFrame {

    int taal;
    int rechten;
    public vermisteBagageRegistreren2(int taal, int rechten) {
        this.rechten = rechten;
        this.taal = taal;
        initComponents();
        kiesTaalKnop.setSelectedIndex(taal);
        
        
//            BagageDatabase bagageDb = new BagageDatabase();
//            klantenDatabase klantDb = new klantenDatabase();
//            VermisteBagageDatabase vermistDb = new VermisteBagageDatabase();
//            
//            Bagage bagage = bagageDb.getVermisteBagage(HEIGHT)
//            Vluchten vlucht = bagageDb.getVlucht(bagage.getVluchtId());
// 
//            int klantId = bagage.getKlantId();
//            int vluchtId = bagage.getVluchtId();
//            int bagageId = bagage.getBagageId();
//  
//            //int foo = Integer.parseInt(klantId);
//            Bagage bagage2 = bagageDb.getvluchtKlantId(klantId);
//            int vluchtKlantId = bagage2.getVluchtKlantId();
           
        
        
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
        txtlabelNummer = new javax.swing.JTextField();
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
        txtbestemming = new javax.swing.JTextField();
        txtvluchtNummer = new javax.swing.JTextField();
        txtluchthavenVertrek = new javax.swing.JTextField();
        txttype = new javax.swing.JTextField();
        txtvertrekDatum = new javax.swing.JTextField();
        txtkleur = new javax.swing.JTextField();
        txtlocatieVermist = new javax.swing.JTextField();
        txtvermistGemeld = new javax.swing.JTextField();
        txtkenmerken = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtmerk1 = new javax.swing.JTextField();

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
        getContentPane().add(labelnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));
        getContentPane().add(txtlabelNummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 249, 30));

        vluchtnummerTekst.setText("Vluchtnummer");
        getContentPane().add(vluchtnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        luchthavenVanVertrekTekst.setText("Luchthaven van vertrek");
        getContentPane().add(luchthavenVanVertrekTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        bestemmingTekst.setText("Bestemming");
        getContentPane().add(bestemmingTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        vertrekDatumTekst.setText("Vertrekdatum");
        getContentPane().add(vertrekDatumTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        typeTekst.setText("Type");
        getContentPane().add(typeTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        merkTekst.setText("Merk");
        getContentPane().add(merkTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        annulerenKnop.setText("Annuleren");
        annulerenKnop.setBackground(Color.decode("#CC0000"));
        annulerenKnop.setForeground(Color.WHITE);
        annulerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(annulerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 522, 249, 35));

        vermistRegistrerenKnop.setText("Registreren als vermist");
        vermistRegistrerenKnop.setBackground(Color.decode("#CC0000"));
        vermistRegistrerenKnop.setForeground(Color.WHITE);
        vermistRegistrerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermistRegistrerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(vermistRegistrerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 522, 249, 35));

        kleurTekst.setText("Kleur");
        getContentPane().add(kleurTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        locatieVermistOpgegevenTekst.setText("Locatie vermist");
        getContentPane().add(locatieVermistOpgegevenTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        kenmerkenTekst.setText("Kenmerken");
        getContentPane().add(kenmerkenTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        vermistGemeldTekst.setText("Vermist gemeld");
        getContentPane().add(vermistGemeldTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        pagina1Tekst1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst1.setText("Pagina 1");
        getContentPane().add(pagina1Tekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));
        getContentPane().add(txtbestemming, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 249, -1));
        getContentPane().add(txtvluchtNummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 249, -1));
        getContentPane().add(txtluchthavenVertrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 249, -1));
        getContentPane().add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 249, -1));
        getContentPane().add(txtvertrekDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 249, -1));
        getContentPane().add(txtkleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 249, -1));
        getContentPane().add(txtlocatieVermist, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 249, -1));
        getContentPane().add(txtvermistGemeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 249, -1));
        getContentPane().add(txtkenmerken, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 249, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Bagagegegevens");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));
        getContentPane().add(txtmerk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 249, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnopActionPerformed
        hoofdMenu b = new hoofdMenu(taal, rechten);
        hoofdMenu.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
                b.setVisible(true);
                setVisible(false);
                dispose();
    }//GEN-LAST:event_homeKnopActionPerformed

    private void annulerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnopActionPerformed
        // TODO add your handling code here:
        vermisteBagageRegistreren1 m = new vermisteBagageRegistreren1(taal, rechten);
        vermisteBagageRegistreren1.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
        m.setVisible(true);
        
        setVisible(false);
        dispose();
        
        
    }//GEN-LAST:event_annulerenKnopActionPerformed

    private void opslaanKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opslaanKnopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opslaanKnopActionPerformed

    private void typeTekstVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeTekstVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeTekstVeldActionPerformed

    private void kenmerkenTekstVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kenmerkenTekstVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kenmerkenTekstVeldActionPerformed

    private void vermistRegistrerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermistRegistrerenKnopActionPerformed
        try {
            // TODO add your handling code here:
            
            String label = txtlabelNummer.getText();
            BagageDatabase bagageDb = new BagageDatabase();
            klantenDatabase klantDb = new klantenDatabase();
            VermisteBagageDatabase vermistDb = new VermisteBagageDatabase();
            
            Bagage bagage = bagageDb.getLabelnummer(label);
            Vluchten vlucht = bagageDb.getVlucht(bagage.getVluchtId());
 
            int klantId = bagage.getKlantId();
            int vluchtId = bagage.getVluchtId();
            int bagageId = bagage.getBagageId();
  
            //int foo = Integer.parseInt(klantId);
            Bagage bagage2 = bagageDb.getvluchtKlantId(klantId);
            int vluchtKlantId = bagage2.getVluchtKlantId();
           
//            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date date = format.parse(vlucht.getAankomstTijd());

            vermistDb.InsertVermist(klantId, vluchtKlantId, bagageId, vlucht.getAankomstTijd(), vlucht.getVluchtHavenAankomst(), txtkleur.getText(),txtkenmerken.getText(), txttype.getText(), txtmerk1.getText());
           
            
        } catch (SQLException ex) {
            Logger.getLogger(vermisteBagageRegistreren2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                hoofdMenu b = new hoofdMenu(taal, rechten);
                hoofdMenu.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
                b.setVisible(true);
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
            java.util.logging.Logger.getLogger(vermisteBagageRegistreren2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vermisteBagageRegistreren2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vermisteBagageRegistreren2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vermisteBagageRegistreren2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new vermisteBagageRegistreren2(0, 0).setVisible(true);
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
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel kenmerkenTekst;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JLabel kleurTekst;
    private javax.swing.JLabel labelnummerTekst;
    private javax.swing.JLabel locatieVermistOpgegevenTekst;
    private javax.swing.JLabel luchthavenVanVertrekTekst;
    private javax.swing.JLabel merkTekst;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JLabel pagina1Tekst1;
    public static javax.swing.JTextField txtbestemming;
    private javax.swing.JTextField txtkenmerken;
    private javax.swing.JTextField txtkleur;
    public static javax.swing.JTextField txtlabelNummer;
    private javax.swing.JTextField txtlocatieVermist;
    public static javax.swing.JTextField txtluchthavenVertrek;
    private javax.swing.JTextField txtmerk1;
    private javax.swing.JTextField txttype;
    private javax.swing.JTextField txtvermistGemeld;
    public static javax.swing.JTextField txtvertrekDatum;
    public static javax.swing.JTextField txtvluchtNummer;
    private javax.swing.JLabel typeTekst;
    private javax.swing.JLabel vermistGemeldTekst;
    private javax.swing.JButton vermistRegistrerenKnop;
    private javax.swing.JLabel vertrekDatumTekst;
    private javax.swing.JLabel vluchtnummerTekst;
    // End of variables declaration//GEN-END:variables
}
