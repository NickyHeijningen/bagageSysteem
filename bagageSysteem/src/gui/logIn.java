/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bagagesysteem.BagageDatabase;
import bagagesysteem.Main;
import bagagesysteem.Gebruikers;
import bagagesysteem.bcrypt.BCrypt;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Nicky
 */
public class logIn extends javax.swing.JFrame {

    Main main = new Main();
    ImageIcon corendon = new ImageIcon(getClass().getResource("corendon.png"));
    
    int rechten;
    int taal;

    public logIn(int taal) {
        this.taal = taal;
        initComponents();
        kiesTaalKnop.setSelectedIndex(taal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gebruikersnaamTekstVeld = new javax.swing.JTextField();
        logInKnop = new javax.swing.JButton();
        gebruikersnaamTekst = new javax.swing.JLabel();
        wachtwoordTekst = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        kiesTaalKnop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        wachtwoordTekstVeld = new javax.swing.JPasswordField();
        errorTekst = new javax.swing.JLabel();
        jLabel1 = new JLabel(corendon);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gebruikersnaamTekstVeld.setToolTipText("Gebruikersnaam");
        gebruikersnaamTekstVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gebruikersnaamTekstVeldActionPerformed(evt);
            }
        });
        gebruikersnaamTekstVeld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gebruikersnaamTekstVeldKeyPressed(evt);
            }
        });
        getContentPane().add(gebruikersnaamTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 150, 249, 35));

        logInKnop.setText("Log in");
        logInKnop.setBackground(Color.decode("#CC0000"));
        logInKnop.setForeground(Color.WHITE);
        logInKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInKnopActionPerformed(evt);
            }
        });
        logInKnop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logInKnopKeyPressed(evt);
            }
        });
        getContentPane().add(logInKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 262, 249, 35));

        gebruikersnaamTekst.setText("Gebruikersnaam");
        getContentPane().add(gebruikersnaamTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 130, -1, -1));

        wachtwoordTekst.setText("Wachtwoord");
        getContentPane().add(wachtwoordTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 189, -1, -1));

        jToolBar1.setRollover(true);

        kiesTaalKnop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nederlands", "English", "Türk" }));
        kiesTaalKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiesTaalKnopActionPerformed(evt);
            }
        });
        jToolBar1.add(kiesTaalKnop);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jToolBar1.add(jPanel1);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 575, 700, -1));

        wachtwoordTekstVeld.setToolTipText("Wachtwoord");
        wachtwoordTekstVeld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wachtwoordTekstVeldKeyPressed(evt);
            }
        });
        getContentPane().add(wachtwoordTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 209, 249, 35));

        errorTekst.setForeground(Color.RED);
        getContentPane().add(errorTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 240, 40));

        jLabel1.setText(null);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 360, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gebruikersnaamTekstVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gebruikersnaamTekstVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gebruikersnaamTekstVeldActionPerformed

    private void logInKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInKnopActionPerformed

        try {

            String gebruikersnaam = gebruikersnaamTekstVeld.getText();
            String wachtwoord = wachtwoordTekstVeld.getText();
            String rechtenNaam = null;
            if (main.nullOrEmpty(gebruikersnaam) || main.nullOrEmpty(wachtwoord)) {
                errorTekst.setText("Niet alle tekstvelden zijn ingevuld.");
            } else {

                BagageDatabase db = new BagageDatabase();
                Gebruikers users = db.getUsers(gebruikersnaam);

                if (main.nullOrEmpty(users.getEmail())) {
                    errorTekst.setText("Incorrecte gebruikersnaam");
                } else if (BCrypt.checkpw(wachtwoord, users.getWachtwoord())) {
                     switch (users.getRechten()) {
                        case 0: rechtenNaam = "Bagagebalie medewerker";
                        rechten = 0;
                        break;
                        case 1: rechtenNaam = "Bagage medewerker";
                        rechten = 1;
                        break;
                        case 2: rechtenNaam = "Leidinggevende";
                        rechten = 2;
                        break; 
                        }
                    
                    String huidigeGebruiker = users.getVoornaam() + " " + users.getAchternaam() + ", " + rechtenNaam;
                    hoofdMenu m = new hoofdMenu(taal, rechten);
                    hoofdMenu.ingelogdAlsTekst.setText(huidigeGebruiker);
                    m.setVisible(true);
                    setVisible(false);
                    dispose();
                } else {
                    errorTekst.setText("Incorrect wachtwoord");
                }
            }
        } catch (Exception e) {
            errorTekst.setText("Geen verbinding met de database.");
        }


    }//GEN-LAST:event_logInKnopActionPerformed

    private void wachtwoordTekstVeldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wachtwoordTekstVeldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            logInKnop.doClick();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            gebruikersnaamTekstVeld.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            logInKnop.requestFocus();
        }
    }//GEN-LAST:event_wachtwoordTekstVeldKeyPressed

    private void gebruikersnaamTekstVeldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gebruikersnaamTekstVeldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            wachtwoordTekstVeld.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            wachtwoordTekstVeld.requestFocus();
        }
    }//GEN-LAST:event_gebruikersnaamTekstVeldKeyPressed

    private void logInKnopKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logInKnopKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            logInKnop.doClick();
        }
        
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            wachtwoordTekstVeld.requestFocus();
        }
    }//GEN-LAST:event_logInKnopKeyPressed

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
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logIn(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorTekst;
    private javax.swing.JLabel gebruikersnaamTekst;
    private javax.swing.JTextField gebruikersnaamTekstVeld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JButton logInKnop;
    private javax.swing.JLabel wachtwoordTekst;
    private javax.swing.JPasswordField wachtwoordTekstVeld;
    // End of variables declaration//GEN-END:variables
}
