/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bagagesysteem.Bagage;
import bagagesysteem.BagageDatabase;
import bagagesysteem.Klanten;
import bagagesysteem.VermisteBagageDatabase;
import bagagesysteem.Vluchten;
import bagagesysteem.klantenDatabase;
import static gui.zoekenBagage.ingelogdAlsTekst;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Nicky
 */
public class gevondenBagageRegistreren1 extends javax.swing.JFrame {
int taal;
int rechten;

    public gevondenBagageRegistreren1(int taal, int rechten) {
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
        labelnummerTekst = new javax.swing.JLabel();
        txtLabelNummerZoeken = new javax.swing.JTextField();
        vluchtnummerTekst = new javax.swing.JLabel();
        luchthavenVanVertrekTekst = new javax.swing.JLabel();
        bestemmingTekst = new javax.swing.JLabel();
        vertrekDatumTekst = new javax.swing.JLabel();
        annulerenKnop = new javax.swing.JButton();
        txtRegistreren = new javax.swing.JButton();
        pagina1Tekst1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtVertrekDatum = new javax.swing.JLabel();
        statusSetTekst = new javax.swing.JLabel();
        txtVluchtNummer = new javax.swing.JLabel();
        txtVertrekLocatie = new javax.swing.JLabel();
        txtAankomst = new javax.swing.JLabel();
        zoekenButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        luchthavenVanVertrekTekst1 = new javax.swing.JLabel();
        txtKlantNaam = new javax.swing.JLabel();
        kiesTaalKnop = new javax.swing.JComboBox<>();
        ingelogdAlsTekst = new javax.swing.JLabel();
        homeKnop = new javax.swing.JButton();
        txtAankomstDatum = new javax.swing.JLabel();

        jButton4.setText("Log in");
        jButton4.setBackground(Color.decode("#CC0000"));

        jButton6.setText("Accounts beheren");
        jButton6.setBackground(Color.decode("#CC0000"));

        pagina1Tekst.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst.setText("Pagina 1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelnummerTekst.setText("Labelnummer");
        getContentPane().add(labelnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        txtLabelNummerZoeken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabelNummerZoekenActionPerformed(evt);
            }
        });
        getContentPane().add(txtLabelNummerZoeken, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 249, 35));

        vluchtnummerTekst.setText("Klantnaam");
        getContentPane().add(vluchtnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        luchthavenVanVertrekTekst.setText("Vluchtnummer");
        getContentPane().add(luchthavenVanVertrekTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        bestemmingTekst.setText("Aankomstlocatie");
        getContentPane().add(bestemmingTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        vertrekDatumTekst.setText("Vertrekdatum");
        getContentPane().add(vertrekDatumTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        annulerenKnop.setText("Annuleren");
        annulerenKnop.setBackground(Color.decode("#CC0000"));
        annulerenKnop.setForeground(Color.WHITE);
        annulerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(annulerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 249, 35));

        txtRegistreren.setText("Doorgaan");
        txtRegistreren.setBackground(Color.decode("#CC0000"));
        txtRegistreren.setForeground(Color.WHITE);
        txtRegistreren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrerenActionPerformed(evt);
            }
        });
        getContentPane().add(txtRegistreren, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 249, 35));

        pagina1Tekst1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst1.setText("Pagina 1");
        getContentPane().add(pagina1Tekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Bagagegegevens");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 570, 10));

        jLabel2.setText("Status");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        txtVertrekDatum.setText(" ");
        txtVertrekDatum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtVertrekDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 250, -1));

        statusSetTekst.setText(" ");
        statusSetTekst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(statusSetTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 250, -1));

        txtVluchtNummer.setText(" ");
        txtVluchtNummer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtVluchtNummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 250, -1));

        txtVertrekLocatie.setText(" ");
        txtVertrekLocatie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtVertrekLocatie, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 250, -1));

        txtAankomst.setText(" ");
        txtAankomst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtAankomst, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 250, -1));

        zoekenButton.setText("Zoeken");
        zoekenButton.setBackground(Color.decode("#CC0000"));
        zoekenButton.setForeground(Color.WHITE);
        zoekenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoekenButtonActionPerformed(evt);
            }
        });
        getContentPane().add(zoekenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 249, 35));

        jLabel3.setText("Aankomstdatum");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        luchthavenVanVertrekTekst1.setText("Vertreklocatie");
        getContentPane().add(luchthavenVanVertrekTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        txtKlantNaam.setText(" ");
        txtKlantNaam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtKlantNaam, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 250, -1));

        kiesTaalKnop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nederlands", "English", "Türk" }));
        kiesTaalKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiesTaalKnopActionPerformed(evt);
            }
        });
        getContentPane().add(kiesTaalKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, -1, -1));

        ingelogdAlsTekst.setText("Lucas van Leijen, Bagagemedewerker");
        getContentPane().add(ingelogdAlsTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, -1, -1));

        homeKnop.setText("Home");
        homeKnop.setBackground(Color.decode("#CC0000"));
        homeKnop.setForeground(Color.WHITE);
        homeKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeKnopActionPerformed(evt);
            }
        });
        getContentPane().add(homeKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 570, -1, 25));

        txtAankomstDatum.setText(" ");
        txtAankomstDatum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtAankomstDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLabelNummerZoekenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabelNummerZoekenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabelNummerZoekenActionPerformed

    private void annulerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnopActionPerformed
        // TODO add your handling code here:

        hoofdMenu m = new hoofdMenu(taal, rechten);
        hoofdMenu.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
        m.setVisible(true);

        setVisible(false);
        dispose();
    }//GEN-LAST:event_annulerenKnopActionPerformed

    private void txtRegistrerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrerenActionPerformed
        // TODO add your handling code here:
        
        
                gevondenBagageRegistreren2 m = new gevondenBagageRegistreren2(taal, rechten);
                
                gevondenBagageRegistreren2.txtlabelNummer.setText(txtLabelNummerZoeken.getText());
                gevondenBagageRegistreren2.txtvluchtNummer.setText(txtVluchtNummer.getText());
                gevondenBagageRegistreren2.txtluchthavenVertrek.setText(this.txtVertrekLocatie.getText());
                gevondenBagageRegistreren2.txtbestemming.setText(this.txtAankomst.getText());
                gevondenBagageRegistreren2.txtvertrekDatum.setText(this.txtVertrekDatum.getText());
                gevondenBagageRegistreren2.txtvluchtNummer.setText(this.txtVluchtNummer.getText());
        
                m.setVisible(true);

                setVisible(false);
                dispose();

            

    }//GEN-LAST:event_txtRegistrerenActionPerformed

    private void zoekenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoekenButtonActionPerformed

         try {
            
                        String label = txtLabelNummerZoeken.getText();
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
                        Klanten klanten = klantDb.getKlanten(klantId);
                        
                   
                        txtKlantNaam.setText(klanten.getVoornaam());
                        txtVluchtNummer.setText(vlucht.getVluchtNummer());
                        txtVertrekLocatie.setText(vlucht.getVluchtHavenHerkomst());
                        txtAankomst.setText(vlucht.getVluchtHavenAankomst());
                        txtVertrekDatum.setText(vlucht.getVertrekTijd());
                        txtAankomstDatum.setText(vlucht.getAankomstTijd());
                        
                        
                       
                        
        } catch (SQLException ex) {
            Logger.getLogger(zoekenBagage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_zoekenButtonActionPerformed

    private void kiesTaalKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiesTaalKnopActionPerformed
        taal = kiesTaalKnop.getSelectedIndex();
    }//GEN-LAST:event_kiesTaalKnopActionPerformed

    private void homeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnopActionPerformed
        hoofdMenu b = new hoofdMenu(taal, rechten);
        hoofdMenu.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
        b.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_homeKnopActionPerformed

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
                new gevondenBagageRegistreren1(0, 0).setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JLabel labelnummerTekst;
    private javax.swing.JLabel luchthavenVanVertrekTekst;
    private javax.swing.JLabel luchthavenVanVertrekTekst1;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JLabel pagina1Tekst1;
    private javax.swing.JLabel statusSetTekst;
    private javax.swing.JLabel txtAankomst;
    private javax.swing.JLabel txtAankomstDatum;
    private javax.swing.JLabel txtKlantNaam;
    private javax.swing.JTextField txtLabelNummerZoeken;
    private javax.swing.JButton txtRegistreren;
    private javax.swing.JLabel txtVertrekDatum;
    private javax.swing.JLabel txtVertrekLocatie;
    private javax.swing.JLabel txtVluchtNummer;
    private javax.swing.JLabel vertrekDatumTekst;
    private javax.swing.JLabel vluchtnummerTekst;
    private javax.swing.JButton zoekenButton;
    // End of variables declaration//GEN-END:variables
}
