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
public class gevondenBagageRegistreren2 extends javax.swing.JFrame {


    public gevondenBagageRegistreren2() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        pagina1Tekst = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jToolBar2 = new javax.swing.JToolBar();
        kiesTaalKnop1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        ingelogdAlsTekst1 = new javax.swing.JLabel();
        homeKnop1 = new javax.swing.JButton();
        annulerenKnop1 = new javax.swing.JButton();
        pagina2Knop = new javax.swing.JButton();
        persoonsgegevensTekst = new javax.swing.JLabel();
        naamTekst = new javax.swing.JLabel();
        geboortedatumTekst = new javax.swing.JLabel();
        telefoonnummerTekst = new javax.swing.JLabel();
        emailTekst = new javax.swing.JLabel();
        verzendenNaarTekst = new javax.swing.JLabel();
        adresTekst = new javax.swing.JLabel();
        woonplaatsTekst = new javax.swing.JLabel();
        postcodeTekst = new javax.swing.JLabel();
        landTekst = new javax.swing.JLabel();
        locatieVermistOpgegevenTekst1 = new javax.swing.JLabel();
        pagina1Tekst2 = new javax.swing.JLabel();
        naamDataTekst = new javax.swing.JLabel();
        geboortedatumDataTekst = new javax.swing.JLabel();
        telefoonnummerTekstVeld = new javax.swing.JTextField();
        emailTekstVeld = new javax.swing.JTextField();
        adresTekstVeld = new javax.swing.JTextField();
        woonplaatsTekstVeld = new javax.swing.JTextField();
        postcodeTekstveld = new javax.swing.JTextField();
        landTekstVeld = new javax.swing.JTextField();
        locatieVermistOpgegevenTekstveld = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        kiesTaalKnop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        ingelogdAlsTekst = new javax.swing.JLabel();
        homeKnop = new javax.swing.JButton();
        annulerenKnop = new javax.swing.JButton();
        btnRegistreren = new javax.swing.JButton();
        locatieVermistOpgegevenTekst = new javax.swing.JLabel();
        vermistGemeldTekst = new javax.swing.JLabel();
        pagina1Tekst1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        verzendenNaarTekst1 = new javax.swing.JLabel();
        adresTekst1 = new javax.swing.JLabel();
        woonplaatsTekst1 = new javax.swing.JLabel();
        postcodeTekst1 = new javax.swing.JLabel();
        landTekst1 = new javax.swing.JLabel();
        adresTekst2 = new javax.swing.JLabel();
        woonplaatsTekst2 = new javax.swing.JLabel();
        postcodeTekst2 = new javax.swing.JLabel();
        landTekst2 = new javax.swing.JLabel();

        jButton4.setText("Log in");
        jButton4.setBackground(Color.decode("#CC0000"));

        jButton6.setText("Accounts beheren");
        jButton6.setBackground(Color.decode("#CC0000"));

        pagina1Tekst.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst.setText("Pagina 1");

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar2.setRollover(true);

        kiesTaalKnop1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nederlands", "English", "Türk" }));
        jToolBar2.add(kiesTaalKnop1);

        ingelogdAlsTekst1.setText("Lucas van Leijen, Bagagemedewerker");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(ingelogdAlsTekst1)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ingelogdAlsTekst1)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jToolBar2.add(jPanel2);

        homeKnop1.setText("Home");
        homeKnop.setBackground(Color.decode("#CC0000"));
        homeKnop.setForeground(Color.WHITE);
        homeKnop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeKnop1ActionPerformed(evt);
            }
        });

        annulerenKnop1.setText("Annuleren");
        annulerenKnop.setBackground(Color.decode("#CC0000"));
        annulerenKnop.setForeground(Color.WHITE);
        annulerenKnop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerenKnop1ActionPerformed(evt);
            }
        });

        pagina2Knop.setText("Pagina 2");
        pagina2Knop.setBackground(Color.decode("#CC0000"));
        pagina2Knop.setForeground(Color.WHITE);
        pagina2Knop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagina2KnopActionPerformed(evt);
            }
        });

        persoonsgegevensTekst.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        persoonsgegevensTekst.setText("Persoonsgegevens");

        naamTekst.setText("Naam");

        geboortedatumTekst.setText("Geboortedatum");

        telefoonnummerTekst.setText("Telefoonnummer");

        emailTekst.setText("E-mail");

        verzendenNaarTekst.setText("Verzenden naar");

        adresTekst.setText("Adres");

        woonplaatsTekst.setText("Woonplaats");

        postcodeTekst.setText("Postcode");

        landTekst.setText("Land");

        locatieVermistOpgegevenTekst1.setText("Locatie vermist opgegeven");

        pagina1Tekst2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst2.setText("Pagina 1");

        naamDataTekst.setText("Naam");

        geboortedatumDataTekst.setText("Geboortedatum");

        telefoonnummerTekstVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoonnummerTekstVeldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(annulerenKnop1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(pagina2Knop, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(naamTekst)
                            .addComponent(persoonsgegevensTekst)
                            .addComponent(geboortedatumTekst)
                            .addComponent(locatieVermistOpgegevenTekst1)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(postcodeTekst)
                                    .addComponent(woonplaatsTekst)
                                    .addComponent(landTekst)
                                    .addComponent(adresTekst)))
                            .addComponent(telefoonnummerTekst)
                            .addComponent(emailTekst)
                            .addComponent(verzendenNaarTekst)
                            .addComponent(pagina1Tekst2))
                        .addGap(150, 150, 150)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(naamDataTekst)
                            .addComponent(geboortedatumDataTekst)
                            .addComponent(telefoonnummerTekstVeld)
                            .addComponent(emailTekstVeld)
                            .addComponent(adresTekstVeld)
                            .addComponent(woonplaatsTekstVeld)
                            .addComponent(postcodeTekstveld)
                            .addComponent(landTekstVeld)
                            .addComponent(locatieVermistOpgegevenTekstveld, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeKnop1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(pagina1Tekst2)
                .addGap(49, 49, 49)
                .addComponent(persoonsgegevensTekst)
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(naamTekst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(geboortedatumTekst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefoonnummerTekst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailTekst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(verzendenNaarTekst)
                        .addGap(18, 18, 18)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adresTekst)
                            .addComponent(adresTekstVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(naamDataTekst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(geboortedatumDataTekst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefoonnummerTekstVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailTekstVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(woonplaatsTekst)
                    .addComponent(woonplaatsTekstVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postcodeTekst)
                    .addComponent(postcodeTekstveld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(landTekst)
                    .addComponent(landTekstVeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locatieVermistOpgegevenTekst1)
                    .addComponent(locatieVermistOpgegevenTekstveld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(annulerenKnop1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(pagina2Knop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeKnop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

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

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 575, 673, -1));

        homeKnop.setText("Home");
        homeKnop.setBackground(Color.decode("#CC0000"));
        homeKnop.setForeground(Color.WHITE);
        homeKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeKnopActionPerformed(evt);
            }
        });
        getContentPane().add(homeKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 575, 60, 25));

        annulerenKnop.setText("Terug");
        annulerenKnop.setBackground(Color.decode("#CC0000"));
        annulerenKnop.setForeground(Color.WHITE);
        annulerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(annulerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 522, 249, 35));

        btnRegistreren.setText("Registreren");
        btnRegistreren.setBackground(Color.decode("#CC0000"));
        btnRegistreren.setForeground(Color.WHITE);
        btnRegistreren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrerenActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistreren, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 522, 269, 35));

        locatieVermistOpgegevenTekst.setText("Locatie gevonden");
        getContentPane().add(locatieVermistOpgegevenTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        vermistGemeldTekst.setText("Gevonden gemeld");
        getContentPane().add(vermistGemeldTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 291, -1, -1));

        pagina1Tekst1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst1.setText("Pagina 2");
        getContentPane().add(pagina1Tekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 34, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 260, 150, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 291, 150, -1));

        verzendenNaarTekst1.setText("Verzenden naar");
        getContentPane().add(verzendenNaarTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 132, -1, -1));

        adresTekst1.setText("Adres");
        getContentPane().add(adresTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 164, -1, -1));

        woonplaatsTekst1.setText("Woonplaats");
        getContentPane().add(woonplaatsTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 185, -1, -1));

        postcodeTekst1.setText("Postcode");
        getContentPane().add(postcodeTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 210, -1, -1));

        landTekst1.setText("Land");
        getContentPane().add(landTekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 235, -1, -1));

        adresTekst2.setText("Adres");
        getContentPane().add(adresTekst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 164, -1, -1));

        woonplaatsTekst2.setText("Woonplaats");
        getContentPane().add(woonplaatsTekst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 185, -1, -1));

        postcodeTekst2.setText("Postcode");
        getContentPane().add(postcodeTekst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 210, -1, -1));

        landTekst2.setText("Land");
        getContentPane().add(landTekst2, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 235, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnopActionPerformed
        // TODO add your handling code here:
        
        hoofdMenu m = new hoofdMenu();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_homeKnopActionPerformed

    private void annulerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnopActionPerformed
        // TODO add your handling code here:
        
        vermisteBagageRegistreren1 m = new vermisteBagageRegistreren1();
        m.setVisible(true);
        
        setVisible(false);
        dispose();
        
        
    }//GEN-LAST:event_annulerenKnopActionPerformed

    private void btnRegistrerenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrerenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrerenActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void homeKnop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnop1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeKnop1ActionPerformed

    private void annulerenKnop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnop1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annulerenKnop1ActionPerformed

    private void pagina2KnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagina2KnopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagina2KnopActionPerformed

    private void telefoonnummerTekstVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoonnummerTekstVeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoonnummerTekstVeldActionPerformed

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
            java.util.logging.Logger.getLogger(gevondenBagageRegistreren2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gevondenBagageRegistreren2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gevondenBagageRegistreren2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gevondenBagageRegistreren2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new gevondenBagageRegistreren2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresTekst;
    private javax.swing.JLabel adresTekst1;
    private javax.swing.JLabel adresTekst2;
    private javax.swing.JTextField adresTekstVeld;
    private javax.swing.JButton annulerenKnop;
    private javax.swing.JButton annulerenKnop1;
    private javax.swing.JButton btnRegistreren;
    private javax.swing.JLabel emailTekst;
    private javax.swing.JTextField emailTekstVeld;
    private javax.swing.JLabel geboortedatumDataTekst;
    private javax.swing.JLabel geboortedatumTekst;
    private javax.swing.JButton homeKnop;
    private javax.swing.JButton homeKnop1;
    private javax.swing.JLabel ingelogdAlsTekst;
    private javax.swing.JLabel ingelogdAlsTekst1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JComboBox<String> kiesTaalKnop1;
    private javax.swing.JLabel landTekst;
    private javax.swing.JLabel landTekst1;
    private javax.swing.JLabel landTekst2;
    private javax.swing.JTextField landTekstVeld;
    private javax.swing.JLabel locatieVermistOpgegevenTekst;
    private javax.swing.JLabel locatieVermistOpgegevenTekst1;
    private javax.swing.JTextField locatieVermistOpgegevenTekstveld;
    private javax.swing.JLabel naamDataTekst;
    private javax.swing.JLabel naamTekst;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JLabel pagina1Tekst1;
    private javax.swing.JLabel pagina1Tekst2;
    private javax.swing.JButton pagina2Knop;
    private javax.swing.JLabel persoonsgegevensTekst;
    private javax.swing.JLabel postcodeTekst;
    private javax.swing.JLabel postcodeTekst1;
    private javax.swing.JLabel postcodeTekst2;
    private javax.swing.JTextField postcodeTekstveld;
    private javax.swing.JLabel telefoonnummerTekst;
    private javax.swing.JTextField telefoonnummerTekstVeld;
    private javax.swing.JLabel vermistGemeldTekst;
    private javax.swing.JLabel verzendenNaarTekst;
    private javax.swing.JLabel verzendenNaarTekst1;
    private javax.swing.JLabel woonplaatsTekst;
    private javax.swing.JLabel woonplaatsTekst1;
    private javax.swing.JLabel woonplaatsTekst2;
    private javax.swing.JTextField woonplaatsTekstVeld;
    // End of variables declaration//GEN-END:variables
}
