/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bagagesysteem.BagageDatabase;
import bagagesysteem.Gebruikers;
import bagagesysteem.Main;
import bagagesysteem.klantenDatabase;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicky
 */
public class accountsBeheren extends javax.swing.JFrame {
int taal;
int rechten;
    Main main = new Main();

    public accountsBeheren(int taal, int rechten) {
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
        jSeparator2 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        kiesTaalKnop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        ingelogdAlsTekst = new javax.swing.JLabel();
        homeKnop = new javax.swing.JButton();
        btnAnnuleren = new javax.swing.JButton();
        btnOpslaan = new javax.swing.JButton();
        naamTekst = new javax.swing.JLabel();
        btnNieuwAccountMaken = new javax.swing.JButton();
        luchthavenVanVertrekTekst1 = new javax.swing.JLabel();
        bestemmingTekst1 = new javax.swing.JLabel();
        typeTekst1 = new javax.swing.JLabel();
        TxtVoornaam = new javax.swing.JTextField();
        txtAchternaam = new javax.swing.JTextField();
        txtWerkLocatie = new javax.swing.JTextField();
        btnAccountVerwijderen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        telefoonNummerTextVeld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailTextVeld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        functieDropDown = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nieuwWachtwoordTextVeld = new javax.swing.JPasswordField();
        txtZoekGebruikersNaam = new javax.swing.JTextField();
        btnZoeken = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        errorTekst = new javax.swing.JLabel();

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
                .addContainerGap(111, Short.MAX_VALUE))
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

        naamTekst.setText("Gebruikersnaam");
        getContentPane().add(naamTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        btnNieuwAccountMaken.setText("Nieuw account maken");
        btnNieuwAccountMaken.setBackground(Color.decode("#CC0000"));
        btnNieuwAccountMaken.setForeground(Color.WHITE);
        btnNieuwAccountMaken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNieuwAccountMakenActionPerformed(evt);
            }
        });
        getContentPane().add(btnNieuwAccountMaken, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 570, 35));

        luchthavenVanVertrekTekst1.setText("Voornaam");
        getContentPane().add(luchthavenVanVertrekTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        bestemmingTekst1.setText("Achternaam");
        getContentPane().add(bestemmingTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        typeTekst1.setText("Werklocatie");
        getContentPane().add(typeTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));
        getContentPane().add(TxtVoornaam, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 250, -1));
        getContentPane().add(txtAchternaam, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 250, -1));
        getContentPane().add(txtWerkLocatie, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 250, -1));

        btnAccountVerwijderen.setForeground(new java.awt.Color(255, 0, 0));
        btnAccountVerwijderen.setText("Account verwijderen");
        btnOpslaan.setBackground(Color.decode("#CC0000"));
        btnOpslaan.setForeground(Color.WHITE);
        btnAccountVerwijderen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountVerwijderenActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccountVerwijderen, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 250, 40));

        jLabel1.setText("Telefoonnummer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));
        getContentPane().add(telefoonNummerTextVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 250, -1));

        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        emailTextVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextVeldActionPerformed(evt);
            }
        });
        getContentPane().add(emailTextVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 250, -1));

        jLabel3.setText("Nieuw wachtwoord");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        functieDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bagagebalie medewerker", "Bagage medewerker", "Leidinggevende" }));
        getContentPane().add(functieDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 250, -1));

        jLabel4.setText("Functie");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));
        getContentPane().add(nieuwWachtwoordTextVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 250, -1));

        txtZoekGebruikersNaam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZoekGebruikersNaamActionPerformed(evt);
            }
        });
        getContentPane().add(txtZoekGebruikersNaam, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 249, 35));

        btnZoeken.setText("Zoeken");
        btnZoeken.setBackground(Color.decode("#CC0000"));
        btnZoeken.setForeground(Color.WHITE);
        btnZoeken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoekenActionPerformed(evt);
            }
        });
        getContentPane().add(btnZoeken, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 249, 35));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 570, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 570, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Accounts beheren");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        errorTekst.setForeground(new java.awt.Color(255, 0, 0));
        errorTekst.setText(" ");
        errorTekst.setToolTipText("");
        getContentPane().add(errorTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 250, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnopActionPerformed
        hoofdMenu b = new hoofdMenu(taal, rechten);
        hoofdMenu.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
                b.setVisible(true);
                setVisible(false);
                dispose();
    }//GEN-LAST:event_homeKnopActionPerformed

    private void btnAnnulerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerenActionPerformed
        // TODO add your handling code here:

        hoofdMenu m = new hoofdMenu(taal, rechten);
        hoofdMenu.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
        m.setVisible(true);

        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnAnnulerenActionPerformed

    private void btnOpslaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpslaanActionPerformed
        try {
            String gebruikersnaamzoekveld = txtZoekGebruikersNaam.getText();
            BagageDatabase klantdb = new BagageDatabase();
            Gebruikers users = klantdb.getUsers(gebruikersnaamzoekveld);

            String voornaam = TxtVoornaam.getText();
            String achternaam = txtAchternaam.getText();
            String telefoonnummer = telefoonNummerTextVeld.getText();
            String email = emailTextVeld.getText();
            String werklocatie = txtWerkLocatie.getText();
            String wachtwoord = nieuwWachtwoordTextVeld.getText();
            int rechten = functieDropDown.getSelectedIndex();
            int gebruikersId = users.getGebruikersid();
            boolean hashed = false;

            if (main.nullOrEmpty(voornaam) || main.nullOrEmpty(achternaam) || main.nullOrEmpty(telefoonnummer) || main.nullOrEmpty(email) || main.nullOrEmpty(werklocatie)) {
                errorTekst.setText("Niet alle velden zijn ingevuld.");
            } else {
                if (main.nullOrEmpty(wachtwoord)) {
                    wachtwoord = users.getWachtwoord();
                    hashed = true;

                }
                klantenDatabase db = new klantenDatabase();
                db.UpdateGebruiker(voornaam, achternaam, telefoonnummer, email, werklocatie, wachtwoord, rechten, gebruikersId, hashed);
                errorTekst.setText("Account aangepast.");
            }
        } catch (SQLException ex) {
            errorTekst.setText("Geen verbinding met de database.");
            Logger.getLogger(accountsBeheren.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnOpslaanActionPerformed

    private void annulerenKnop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnop1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annulerenKnop1ActionPerformed

    private void btnNieuwAccountMakenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNieuwAccountMakenActionPerformed
        // TODO add your handling code here:

        accountsAanmaken m = new accountsAanmaken(taal, rechten);
        accountsAanmaken.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
        m.setVisible(true);

        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnNieuwAccountMakenActionPerformed

    private void btnAccountVerwijderenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountVerwijderenActionPerformed
        String gebruikersnaam = txtZoekGebruikersNaam.getText();
        BagageDatabase db = new BagageDatabase();
        klantenDatabase klantdb = new klantenDatabase();
        try {
            Gebruikers users = db.getUsers(gebruikersnaam);
            klantdb.VerwijderGebruiker(users.getGebruikersid());

        } catch (SQLException ex) {
            Logger.getLogger(accountsBeheren.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAccountVerwijderenActionPerformed

    private void emailTextVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextVeldActionPerformed

    private void txtZoekGebruikersNaamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZoekGebruikersNaamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZoekGebruikersNaamActionPerformed

    private void btnZoekenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoekenActionPerformed
        try {

            String gebruikersnaam = txtZoekGebruikersNaam.getText();
            BagageDatabase db = new BagageDatabase();
            Gebruikers users = db.getUsers(gebruikersnaam);

            System.out.println(users.getVoornaam());

            TxtVoornaam.setText(users.getVoornaam());
            txtAchternaam.setText(users.getAchternaam());
            //txtGeboorteDatum.setText(users.getGeboordedatum());
            txtWerkLocatie.setText(users.getWerklocatie());
            telefoonNummerTextVeld.setText(users.getTelefoonnummer());
            emailTextVeld.setText(users.getEmail());
            functieDropDown.setSelectedIndex(users.getRechten());
//            System.out.println(gebruikersnaam2);
        } catch (SQLException ex) {
            Logger.getLogger(accountsBeheren.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnZoekenActionPerformed

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
                new accountsBeheren(0, 0).setVisible(true);
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
    private javax.swing.JButton btnZoeken;
    private javax.swing.JTextField emailTextVeld;
    private javax.swing.JLabel errorTekst;
    private javax.swing.JComboBox<String> functieDropDown;
    private javax.swing.JButton homeKnop;
    public static javax.swing.JLabel ingelogdAlsTekst;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
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
    private javax.swing.JPasswordField nieuwWachtwoordTextVeld;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JTextField telefoonNummerTextVeld;
    private javax.swing.JTextField txtAchternaam;
    private javax.swing.JTextField txtWerkLocatie;
    private javax.swing.JTextField txtZoekGebruikersNaam;
    private javax.swing.JLabel typeTekst;
    private javax.swing.JLabel typeTekst1;
    private javax.swing.JLabel vertrekDatumTekst;
    private javax.swing.JLabel vluchtnummerTekst;
    // End of variables declaration//GEN-END:variables
}
