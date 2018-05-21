/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bagagesysteem.BagageDatabase;
import bagagesysteem.Gebruikers;
import bagagesysteem.klantenDatabase;
import java.awt.Color;
import bagagesysteem.Main;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicky
 */
public class accountsAanmaken extends javax.swing.JFrame {

int taal;
int rechten;
    Main main = new Main();

    public accountsAanmaken(int taal, int rechten) {
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
        jToolBar1 = new javax.swing.JToolBar();
        kiesTaalKnop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        ingelogdAlsTekst = new javax.swing.JLabel();
        homeKnop = new javax.swing.JButton();
        annulerenKnop = new javax.swing.JButton();
        vermistRegistrerenKnop = new javax.swing.JButton();
        luchthavenVanVertrekTekst1 = new javax.swing.JLabel();
        bestemmingTekst1 = new javax.swing.JLabel();
        typeTekst1 = new javax.swing.JLabel();
        merkTekst1 = new javax.swing.JLabel();
        voornaamTekstVeld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        achternaamTekstVeld = new javax.swing.JTextField();
        wachtwoordTekstVeld = new javax.swing.JPasswordField();
        emailTekst = new javax.swing.JLabel();
        telefoonnummerTekst = new javax.swing.JLabel();
        telefoonNummerTekstVeld = new javax.swing.JTextField();
        emailTekstVeld = new javax.swing.JTextField();
        werklocatieTekstVeld = new javax.swing.JTextField();
        fuctieDropDown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        errorTekst = new javax.swing.JLabel();

        jButton4.setText("Log in");
        jButton4.setBackground(Color.decode("#CC0000"));

        jButton6.setText("Accounts beheren");
        jButton6.setBackground(Color.decode("#CC0000"));

        pagina1Tekst.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst.setText("Pagina 1");

        annulerenKnop1.setText("Annuleren");
        annulerenKnop.setBackground(Color.decode("#CC0000"));
        annulerenKnop.setForeground(Color.WHITE);
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

        luchthavenVanVertrekTekst1.setText("Voornaam");
        getContentPane().add(luchthavenVanVertrekTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        bestemmingTekst1.setText("Achternaam");
        getContentPane().add(bestemmingTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        typeTekst1.setText("Werklocatie");
        getContentPane().add(typeTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        merkTekst1.setText("Wachtwoord");
        getContentPane().add(merkTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        voornaamTekstVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voornaamTekstVeldActionPerformed(evt);
            }
        });
        getContentPane().add(voornaamTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 250, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Account aanmaken");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));
        getContentPane().add(achternaamTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 250, -1));

        wachtwoordTekstVeld.setToolTipText("");
        getContentPane().add(wachtwoordTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 250, -1));

        emailTekst.setText("E-mail");
        getContentPane().add(emailTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        telefoonnummerTekst.setText("Telefoonnummer");
        getContentPane().add(telefoonnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));
        getContentPane().add(telefoonNummerTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 250, -1));
        getContentPane().add(emailTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 250, -1));
        getContentPane().add(werklocatieTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 250, -1));

        fuctieDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bagagebalie medewerker", "Bagage medewerker", "Leidinggevende" }));
        getContentPane().add(fuctieDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 250, -1));

        jLabel2.setText("Functie");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        errorTekst.setForeground(new java.awt.Color(255, 0, 0));
        errorTekst.setText(" ");
        errorTekst.setToolTipText("");
        getContentPane().add(errorTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 250, -1));

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

        accountsBeheren m = new accountsBeheren(taal, rechten);
        accountsBeheren.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
        m.setVisible(true);

        setVisible(false);
        dispose();

    }//GEN-LAST:event_annulerenKnopActionPerformed

    private void vermistRegistrerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermistRegistrerenKnopActionPerformed
        try {
            // TODO add your handling code here:

            String voornaam = voornaamTekstVeld.getText();
            String achternaam = achternaamTekstVeld.getText();
            String telefoonnummer = telefoonNummerTekstVeld.getText();

            String email = emailTekstVeld.getText();

            String werklocatie = werklocatieTekstVeld.getText();


            String wachtwoord = wachtwoordTekstVeld.getText();
            int functie = fuctieDropDown.getSelectedIndex();

            //Functie 0 = bagagebalie, 1 = bagage, 2 = leidinggevende
            if (main.nullOrEmpty(voornaam) || main.nullOrEmpty(achternaam) || main.nullOrEmpty(telefoonnummer) || main.nullOrEmpty(email) || main.nullOrEmpty(werklocatie) || main.nullOrEmpty(wachtwoord)) {
                errorTekst.setText("Niet alle tekstvelden zijn ingevuld.");
            } else {
                klantenDatabase comp = new klantenDatabase();

                //comp.InsertKlant(voornaam, achternaam, telefoonnummer, geboortedatum, email, adres, woonplaats, postcode, land);
                comp.InsertGebruiker(voornaam, achternaam, telefoonnummer, email, werklocatie, wachtwoord, functie);

                accountsBeheren b = new accountsBeheren(taal, rechten);
                accountsBeheren.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
                b.setVisible(true);
                setVisible(false);
                dispose();

            }
        } catch (SQLException ex) {
            Logger.getLogger(accountsAanmaken.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_vermistRegistrerenKnopActionPerformed

    private void annulerenKnop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnop1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annulerenKnop1ActionPerformed

    private void voornaamTekstVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voornaamTekstVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voornaamTekstVeldActionPerformed

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
            java.util.logging.Logger.getLogger(accountsAanmaken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountsAanmaken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountsAanmaken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountsAanmaken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new accountsAanmaken(0, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField achternaamTekstVeld;
    private javax.swing.JButton annulerenKnop;
    private javax.swing.JButton annulerenKnop1;
    private javax.swing.JLabel bestemmingTekst;
    private javax.swing.JLabel bestemmingTekst1;
    private javax.swing.JLabel emailTekst;
    private javax.swing.JTextField emailTekstVeld;
    private javax.swing.JLabel errorTekst;
    private javax.swing.JComboBox<String> fuctieDropDown;
    private javax.swing.JButton homeKnop;
    public static javax.swing.JLabel ingelogdAlsTekst;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel merkTekst1;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JTextField telefoonNummerTekstVeld;
    private javax.swing.JLabel telefoonnummerTekst;
    private javax.swing.JLabel typeTekst;
    private javax.swing.JLabel typeTekst1;
    private javax.swing.JButton vermistRegistrerenKnop;
    private javax.swing.JLabel vertrekDatumTekst;
    private javax.swing.JLabel vluchtnummerTekst;
    private javax.swing.JTextField voornaamTekstVeld;
    private javax.swing.JPasswordField wachtwoordTekstVeld;
    private javax.swing.JTextField werklocatieTekstVeld;
    // End of variables declaration//GEN-END:variables
}
