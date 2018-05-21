/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bagagesysteem.Bagage;
import bagagesysteem.BagageDatabase;
import bagagesysteem.Klanten;
import bagagesysteem.Main;
import bagagesysteem.VermisteBagageDatabase;
import bagagesysteem.Vluchten;
import bagagesysteem.klantenDatabase;
import java.awt.Color;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicky
 */
public class zoekenBagage extends javax.swing.JFrame {
int taal;
int rechten;
    Main main = new Main();
    public zoekenBagage(int taal, int rechten) {
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
        labelnummerTextField = new javax.swing.JTextField();
        gevondenMeldenButton = new javax.swing.JButton();
        vluchtnummerTekst = new javax.swing.JLabel();
        luchthavenVanVertrekTekst = new javax.swing.JLabel();
        bestemmingTekst = new javax.swing.JLabel();
        vertrekDatumTekst = new javax.swing.JLabel();
        annulerenKnop = new javax.swing.JButton();
        vermistRegistrerenKnop = new javax.swing.JButton();
        pagina1Tekst1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        vertrekdatumSetTekst = new javax.swing.JLabel();
        statusSetTekst = new javax.swing.JLabel();
        txtVluchtNummer = new javax.swing.JLabel();
        vertrekLocatie = new javax.swing.JLabel();
        aankomstLocatie = new javax.swing.JLabel();
        zoekenButton = new javax.swing.JButton();
        vermistButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        aankomstDatumSetText = new javax.swing.JLabel();
        luchthavenVanVertrekTekst1 = new javax.swing.JLabel();
        klantNaamSetText1 = new javax.swing.JLabel();

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
                .addGap(112, 112, 112)
                .addComponent(ingelogdAlsTekst)
                .addContainerGap(199, Short.MAX_VALUE))
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

        labelnummerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelnummerTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(labelnummerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 249, 35));

        gevondenMeldenButton.setText("Gevonden melden");
        gevondenMeldenButton.setBackground(Color.decode("#CC0000"));
        gevondenMeldenButton.setForeground(Color.WHITE);
        getContentPane().add(gevondenMeldenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 249, 35));

        vluchtnummerTekst.setText("Klantnaam");
        getContentPane().add(vluchtnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        luchthavenVanVertrekTekst.setText("Vluchtnummer");
        getContentPane().add(luchthavenVanVertrekTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        bestemmingTekst.setText("Aankomstlocatie");
        getContentPane().add(bestemmingTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        vertrekDatumTekst.setText("Vertrekdatum");
        getContentPane().add(vertrekDatumTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

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

        pagina1Tekst1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst1.setText("Pagina 1");
        getContentPane().add(pagina1Tekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Bagagegegevens");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 570, 10));

        jLabel2.setText("Status");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        vertrekdatumSetTekst.setText(" ");
        vertrekdatumSetTekst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(vertrekdatumSetTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 250, -1));

        statusSetTekst.setText(" ");
        statusSetTekst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(statusSetTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 250, -1));

        txtVluchtNummer.setText(" ");
        txtVluchtNummer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtVluchtNummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 250, -1));

        vertrekLocatie.setText(" ");
        vertrekLocatie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(vertrekLocatie, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 250, -1));

        aankomstLocatie.setText(" ");
        aankomstLocatie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(aankomstLocatie, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 250, -1));

        zoekenButton.setText("Zoeken");
        zoekenButton.setBackground(Color.decode("#CC0000"));
        zoekenButton.setForeground(Color.WHITE);
        zoekenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoekenButtonActionPerformed(evt);
            }
        });
        getContentPane().add(zoekenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 249, 35));

        vermistButton.setText("Vermist melden");
        vermistButton.setBackground(Color.decode("#CC0000"));
        vermistButton.setForeground(Color.WHITE);
        vermistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermistButtonActionPerformed(evt);
            }
        });
        getContentPane().add(vermistButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 249, 35));

        jLabel3.setText("Aankomstdatum");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        aankomstDatumSetText.setText(" ");
        aankomstDatumSetText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(aankomstDatumSetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 250, -1));

        luchthavenVanVertrekTekst1.setText("Vertreklocatie");
        getContentPane().add(luchthavenVanVertrekTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        klantNaamSetText1.setText(" ");
        klantNaamSetText1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(klantNaamSetText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnopActionPerformed
        hoofdMenu b = new hoofdMenu(taal, rechten);
        hoofdMenu.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
        b.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_homeKnopActionPerformed

    private void labelnummerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelnummerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelnummerTextFieldActionPerformed

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
//        try {
//            
//            String label = labelnummerTextField.getText();
//            BagageDatabase bagageDb = new BagageDatabase();
//            klantenDatabase klantDb = new klantenDatabase();
//            VermisteBagageDatabase vermistDb = new VermisteBagageDatabase();
//            
//            Bagage bagage = bagageDb.getLabelnummer(label);
//            Vluchten vlucht = bagageDb.getVlucht(bagage.getVluchtId());
// 
//            int klantId = bagage.getKlantId();
//            int vluchtId = bagage.getVluchtId();
//            int bagageId = bagage.getBagageId();
//  
//            //int foo = Integer.parseInt(klantId);
//            Bagage bagage2 = bagageDb.getvluchtKlantId(klantId);
//            int vluchtKlantId = bagage2.getVluchtKlantId();
//           
////            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////            Date date = format.parse(vlucht.getAankomstTijd());
//
//            vermistDb.InsertVermist(klantId, vluchtKlantId, bagageId, vlucht.getAankomstTijd(), vlucht.getVluchtHavenAankomst());
            
                vermisteBagageRegistreren2 m = new vermisteBagageRegistreren2(taal, rechten);
                vermisteBagageRegistreren2.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
                vermisteBagageRegistreren2.txtlabelNummer.setText(this.labelnummerTextField.getText());
                vermisteBagageRegistreren2.txtluchthavenVertrek.setText(this.vertrekLocatie.getText());
                vermisteBagageRegistreren2.txtbestemming.setText(this.aankomstLocatie.getText());
                vermisteBagageRegistreren2.txtvertrekDatum.setText(this.vertrekdatumSetTekst.getText());
                vermisteBagageRegistreren2.txtvluchtNummer.setText(this.txtVluchtNummer.getText());
                
                
                
                
                m.setVisible(true);
                

                setVisible(false);
                dispose();
            
            
//
//        } catch (SQLException ex) {
//            Logger.getLogger(zoekenBagage.class.getName()).log(Level.SEVERE, null, ex);
//        }

      

    }//GEN-LAST:event_vermistRegistrerenKnopActionPerformed

    private void zoekenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoekenButtonActionPerformed

      
    try {
        String labelnummer = labelnummerTextField.getText();
        
        BagageDatabase bagageDb = new BagageDatabase();
        klantenDatabase klantDb = new klantenDatabase();
        boolean gevonden = true;
        boolean vermist = true;
        
        Bagage bagage = bagageDb.getLabelnummer(labelnummer);
        Vluchten vlucht = bagageDb.getVlucht(bagage.getVluchtId());
        
        
        if (main.nullOrEmpty(bagageDb.getVermisteBagage(bagage.getBagageId()).getDatumVermist())) {
                vermist = false;
                
            }
            if (main.nullOrEmpty(bagageDb.getGevondenBagage(bagage.getBagageId()).getDatumGevonden())) {
                gevonden = false;
               
            }
            
            if (gevonden == false && vermist == false) {
                statusSetTekst.setText("Vermist: Nee, Gevonden: Nee");
                vermistButton.setEnabled(true);
                gevondenMeldenButton.setEnabled(true);
            }
            if (gevonden == true && vermist == false) {
                statusSetTekst.setText("Vermist: Nee, Gevonden: Ja");
                vermistButton.setEnabled(true);
                gevondenMeldenButton.setEnabled(false);
            }
            if (gevonden == false && vermist == true) {
                statusSetTekst.setText("Vermist: Ja, Gevonden: Nee");
                vermistButton.setEnabled(false);
                gevondenMeldenButton.setEnabled(true);
            }
            if (gevonden == true && vermist == true) {
                statusSetTekst.setText("Vermist: Ja, Gevonden: Nee");
                vermistButton.setEnabled(false);
                gevondenMeldenButton.setEnabled(false);
            }
        
        
        
        
        
        vertrekLocatie.setText(vlucht.getVluchtHavenHerkomst());
        aankomstLocatie.setText(vlucht.getVluchtHavenAankomst());
        aankomstDatumSetText.setText(vlucht.getAankomstTijd());
        vertrekdatumSetTekst.setText(vlucht.getVertrekTijd());
        txtVluchtNummer.setText(vlucht.getVluchtNummer());
        
        int klantId = bagage.getKlantId();
 
        
        //int foo = Integer.parseInt(klantId);
        Bagage bagage2 = bagageDb.getvluchtKlantId(klantId);
        int vluchtKlantId = bagage2.getVluchtKlantId();
        
        Klanten klanten = klantDb.getKlanten(klantId);
        klantNaamSetText1.setText(klanten.getVoornaam() + " " + klanten.getAchternaam());
    } catch (SQLException ex) {
        Logger.getLogger(zoekenBagage.class.getName()).log(Level.SEVERE, null, ex);
    }
       

          
            
            

    }//GEN-LAST:event_zoekenButtonActionPerformed

    private void vermistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermistButtonActionPerformed
        // TODO add your handling code here:
        
        
          
    }//GEN-LAST:event_vermistButtonActionPerformed

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
            java.util.logging.Logger.getLogger(zoekenBagage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zoekenBagage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zoekenBagage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zoekenBagage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new zoekenBagage(0, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aankomstDatumSetText;
    private javax.swing.JLabel aankomstLocatie;
    private javax.swing.JButton annulerenKnop;
    private javax.swing.JLabel bestemmingTekst;
    private javax.swing.JButton gevondenMeldenButton;
    private javax.swing.JButton homeKnop;
    public static javax.swing.JLabel ingelogdAlsTekst;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JLabel klantNaamSetText1;
    private javax.swing.JLabel labelnummerTekst;
    private javax.swing.JTextField labelnummerTextField;
    private javax.swing.JLabel luchthavenVanVertrekTekst;
    private javax.swing.JLabel luchthavenVanVertrekTekst1;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JLabel pagina1Tekst1;
    private javax.swing.JLabel statusSetTekst;
    private javax.swing.JLabel txtVluchtNummer;
    private javax.swing.JButton vermistButton;
    private javax.swing.JButton vermistRegistrerenKnop;
    private javax.swing.JLabel vertrekDatumTekst;
    private javax.swing.JLabel vertrekLocatie;
    private javax.swing.JLabel vertrekdatumSetTekst;
    private javax.swing.JLabel vluchtnummerTekst;
    private javax.swing.JButton zoekenButton;
    // End of variables declaration//GEN-END:variables
}
