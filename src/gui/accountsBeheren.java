/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bagagesysteem.BagageDatabase;
import bagagesysteem.Users;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Nicky
 */
public class accountsBeheren extends javax.swing.JFrame {


    public accountsBeheren() {
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
        annulerenKnop1 = new javax.swing.JButton();
        vluchtnummerTekst = new javax.swing.JLabel();
        luchthavenVanVertrekTekst = new javax.swing.JLabel();
        bestemmingTekst = new javax.swing.JLabel();
        vertrekDatumTekst = new javax.swing.JLabel();
        typeTekst = new javax.swing.JLabel();
        merkTekst = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        kiesTaalKnop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        ingelogdAlsTekst = new javax.swing.JLabel();
        homeKnop = new javax.swing.JButton();
        btnAnnuleren = new javax.swing.JButton();
        btnOpslaan = new javax.swing.JButton();
        txtZoekGebruikersNaam = new javax.swing.JTextField();
        persoonsgegevensTekst = new javax.swing.JLabel();
        naamTekst = new javax.swing.JLabel();
        btnNieuwAccountMaken = new javax.swing.JButton();
        btnZoeken = new javax.swing.JButton();
        vluchtnummerTekst1 = new javax.swing.JLabel();
        luchthavenVanVertrekTekst1 = new javax.swing.JLabel();
        bestemmingTekst1 = new javax.swing.JLabel();
        vertrekDatumTekst1 = new javax.swing.JLabel();
        typeTekst1 = new javax.swing.JLabel();
        txtGebruikersnaam = new javax.swing.JTextField();
        TxtVoornaam = new javax.swing.JTextField();
        txtAchternaam = new javax.swing.JTextField();
        txtGeboorteDatum = new javax.swing.JTextField();
        txtWerkLocatie = new javax.swing.JTextField();
        btnAccountVerwijderen = new javax.swing.JButton();
        btnWachtwoordReset = new javax.swing.JButton();

        jButton4.setText("Log in");
        jButton4.setBackground(Color.decode("#CC0000"));

        jButton6.setText("Accounts beheren");
        jButton6.setBackground(Color.decode("#CC0000"));

        pagina1Tekst.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst.setText("Pagina 1");

        annulerenKnop1.setText("Annuleren");
        btnAnnuleren.setBackground(Color.decode("#CC0000"));
        btnAnnuleren.setForeground(Color.WHITE);
        annulerenKnop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerenKnop1ActionPerformed(evt);
            }
        });

        vluchtnummerTekst.setText("Vluchtnummer");

        luchthavenVanVertrekTekst.setText("Luchthaven van vertrek");

        bestemmingTekst.setText("Bestemming");

        vertrekDatumTekst.setText("Vertrekdatum");

        typeTekst.setText("Type");

        merkTekst.setText("Merk");

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
                .addContainerGap(238, Short.MAX_VALUE))
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
        getContentPane().add(homeKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 575, -1, 25));

        btnAnnuleren.setText("Annuleren");
        btnAnnuleren.setBackground(Color.decode("#CC0000"));
        btnAnnuleren.setForeground(Color.WHITE);
        btnAnnuleren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerenActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnnuleren, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 522, 249, 35));

        btnOpslaan.setText("Opslaan");
        btnOpslaan.setBackground(Color.decode("#CC0000"));
        btnOpslaan.setForeground(Color.WHITE);
        btnOpslaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpslaanActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpslaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 522, 249, 35));
        getContentPane().add(txtZoekGebruikersNaam, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 117, 150, -1));

        persoonsgegevensTekst.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        persoonsgegevensTekst.setText("Persoonsgegevens");
        getContentPane().add(persoonsgegevensTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 85, -1, -1));

        naamTekst.setText("Gebruikersnaam");
        getContentPane().add(naamTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 120, -1, -1));

        btnNieuwAccountMaken.setText("Nieuw account maken");
        btnAnnuleren.setBackground(Color.decode("#CC0000"));
        btnAnnuleren.setForeground(Color.WHITE);
        btnNieuwAccountMaken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNieuwAccountMakenActionPerformed(evt);
            }
        });
        getContentPane().add(btnNieuwAccountMaken, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 44, 528, 35));

        btnZoeken.setText("Zoeken");
        btnOpslaan.setBackground(Color.decode("#CC0000"));
        btnOpslaan.setForeground(Color.WHITE);
        btnZoeken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoekenActionPerformed(evt);
            }
        });
        getContentPane().add(btnZoeken, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 143, 150, 24));

        vluchtnummerTekst1.setText("Gebruikersnaam");
        getContentPane().add(vluchtnummerTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 213, -1, -1));

        luchthavenVanVertrekTekst1.setText("Voornaam");
        getContentPane().add(luchthavenVanVertrekTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 245, -1, -1));

        bestemmingTekst1.setText("Achternaam");
        getContentPane().add(bestemmingTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 277, -1, -1));

        vertrekDatumTekst1.setText("Geboortedatum");
        getContentPane().add(vertrekDatumTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 309, -1, -1));

        typeTekst1.setText("Werklocatie");
        getContentPane().add(typeTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 341, -1, -1));
        getContentPane().add(txtGebruikersnaam, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 213, 200, -1));
        getContentPane().add(TxtVoornaam, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 200, -1));
        getContentPane().add(txtAchternaam, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 200, -1));
        getContentPane().add(txtGeboorteDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 200, -1));
        getContentPane().add(txtWerkLocatie, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 200, -1));

        btnAccountVerwijderen.setText("Account verwijderen");
        btnOpslaan.setBackground(Color.decode("#CC0000"));
        btnOpslaan.setForeground(Color.WHITE);
        btnAccountVerwijderen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountVerwijderenActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccountVerwijderen, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 458, 150, 24));

        btnWachtwoordReset.setText("Wachtwoord resetten");
        btnOpslaan.setBackground(Color.decode("#CC0000"));
        btnOpslaan.setForeground(Color.WHITE);
        btnWachtwoordReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWachtwoordResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnWachtwoordReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 458, 148, 24));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeKnopActionPerformed

    private void btnAnnulerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerenActionPerformed
        // TODO add your handling code here:
        
        hoofdMenu m = new hoofdMenu();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnAnnulerenActionPerformed

    private void btnOpslaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpslaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOpslaanActionPerformed

    private void annulerenKnop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnop1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annulerenKnop1ActionPerformed

    private void btnNieuwAccountMakenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNieuwAccountMakenActionPerformed
        // TODO add your handling code here:
        
        accountsAanmaken m = new accountsAanmaken();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnNieuwAccountMakenActionPerformed

    private void btnZoekenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoekenActionPerformed
        try {
            // TODO add your handling code here:
            
            
            String gebruikersnaam = txtZoekGebruikersNaam.getText();
            BagageDatabase db = new BagageDatabase();
            Users user = new Users();
            Users users = db.getUsers(gebruikersnaam);
            
            System.out.println(users.getVoornaam());
            txtGebruikersnaam.setText(users.getGebruikersnaam());
            TxtVoornaam.setText(users.getVoornaam());
            txtAchternaam.setText(users.getAchternaam());
            txtGeboorteDatum.setText(users.getGeboordedatum());
            txtWerkLocatie.setText(users.getWerklocatie());
//            System.out.println(gebruikersnaam2);
        } catch (SQLException ex) {
            Logger.getLogger(accountsBeheren.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       
       
      
        
        
    }//GEN-LAST:event_btnZoekenActionPerformed

    private void btnAccountVerwijderenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountVerwijderenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccountVerwijderenActionPerformed

    private void btnWachtwoordResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWachtwoordResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWachtwoordResetActionPerformed

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
            java.util.logging.Logger.getLogger(accountsBeheren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountsBeheren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountsBeheren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountsBeheren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new accountsBeheren().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtVoornaam;
    private javax.swing.JButton annulerenKnop1;
    private javax.swing.JLabel bestemmingTekst;
    private javax.swing.JLabel bestemmingTekst1;
    private javax.swing.JButton btnAccountVerwijderen;
    private javax.swing.JButton btnAnnuleren;
    private javax.swing.JButton btnNieuwAccountMaken;
    private javax.swing.JButton btnOpslaan;
    private javax.swing.JButton btnWachtwoordReset;
    private javax.swing.JButton btnZoeken;
    private javax.swing.JButton homeKnop;
    private javax.swing.JLabel ingelogdAlsTekst;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JLabel luchthavenVanVertrekTekst;
    private javax.swing.JLabel luchthavenVanVertrekTekst1;
    private javax.swing.JLabel merkTekst;
    private javax.swing.JLabel naamTekst;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JLabel persoonsgegevensTekst;
    private javax.swing.JTextField txtAchternaam;
    private javax.swing.JTextField txtGeboorteDatum;
    private javax.swing.JTextField txtGebruikersnaam;
    private javax.swing.JTextField txtWerkLocatie;
    private javax.swing.JTextField txtZoekGebruikersNaam;
    private javax.swing.JLabel typeTekst;
    private javax.swing.JLabel typeTekst1;
    private javax.swing.JLabel vertrekDatumTekst;
    private javax.swing.JLabel vertrekDatumTekst1;
    private javax.swing.JLabel vluchtnummerTekst;
    private javax.swing.JLabel vluchtnummerTekst1;
    // End of variables declaration//GEN-END:variables
}
