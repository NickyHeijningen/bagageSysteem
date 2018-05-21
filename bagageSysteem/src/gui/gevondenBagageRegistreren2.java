/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bagagesysteem.Bagage;
import bagagesysteem.BagageDatabase;
import bagagesysteem.GevondenDatabase;
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
public class gevondenBagageRegistreren2 extends javax.swing.JFrame {
int taal;
int rechten;

    public gevondenBagageRegistreren2(int taal, int rechten) {
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
        jPanel1 = new javax.swing.JPanel();
        labelnummerTekst = new javax.swing.JLabel();
        txtlabelNummer = new javax.swing.JTextField();
        vluchtnummerTekst = new javax.swing.JLabel();
        luchthavenVanVertrekTekst = new javax.swing.JLabel();
        bestemmingTekst = new javax.swing.JLabel();
        vertrekDatumTekst = new javax.swing.JLabel();
        annulerenKnop = new javax.swing.JButton();
        vermistRegistrerenKnop = new javax.swing.JButton();
        locatieVermistOpgegevenTekst = new javax.swing.JLabel();
        vermistGemeldTekst = new javax.swing.JLabel();
        pagina1Tekst1 = new javax.swing.JLabel();
        txtbestemming = new javax.swing.JTextField();
        txtvluchtNummer = new javax.swing.JTextField();
        txtluchthavenVertrek = new javax.swing.JTextField();
        txtvertrekDatum = new javax.swing.JTextField();
        txtLocatieGevonden = new javax.swing.JTextField();
        txtDatumGevonden = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        homeKnop = new javax.swing.JButton();
        ingelogdAlsTekst = new javax.swing.JLabel();
        kiesTaalKnop = new javax.swing.JComboBox<>();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jToolBar1.add(jPanel1);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 575, 673, -1));

        labelnummerTekst.setText("Labelnummer");
        getContentPane().add(labelnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        txtlabelNummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlabelNummerActionPerformed(evt);
            }
        });
        getContentPane().add(txtlabelNummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 249, 30));

        vluchtnummerTekst.setText("Vluchtnummer");
        getContentPane().add(vluchtnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        luchthavenVanVertrekTekst.setText("Luchthaven van vertrek");
        getContentPane().add(luchthavenVanVertrekTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        bestemmingTekst.setText("Bestemming");
        getContentPane().add(bestemmingTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        vertrekDatumTekst.setText("Vertrekdatum");
        getContentPane().add(vertrekDatumTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        annulerenKnop.setText("Annuleren");
        annulerenKnop.setBackground(Color.decode("#CC0000"));
        annulerenKnop.setForeground(Color.WHITE);
        annulerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(annulerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 249, 35));

        vermistRegistrerenKnop.setText("Registreren als gevonden");
        vermistRegistrerenKnop.setBackground(Color.decode("#CC0000"));
        vermistRegistrerenKnop.setForeground(Color.WHITE);
        vermistRegistrerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermistRegistrerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(vermistRegistrerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 249, 35));

        locatieVermistOpgegevenTekst.setText("Locatie gevonden");
        getContentPane().add(locatieVermistOpgegevenTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        vermistGemeldTekst.setText("Datum gevonden");
        getContentPane().add(vermistGemeldTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        pagina1Tekst1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst1.setText("Pagina 1");
        getContentPane().add(pagina1Tekst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));
        getContentPane().add(txtbestemming, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 249, -1));
        getContentPane().add(txtvluchtNummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 249, -1));
        getContentPane().add(txtluchthavenVertrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 249, -1));
        getContentPane().add(txtvertrekDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 249, -1));
        getContentPane().add(txtLocatieGevonden, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 249, -1));
        getContentPane().add(txtDatumGevonden, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 249, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Bagagegegevens");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        homeKnop.setText("Home");
        homeKnop.setBackground(Color.decode("#CC0000"));
        homeKnop.setForeground(Color.WHITE);
        homeKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeKnopActionPerformed(evt);
            }
        });
        getContentPane().add(homeKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, -1, 25));

        ingelogdAlsTekst.setText("Lucas van Leijen, Bagagemedewerker");
        getContentPane().add(ingelogdAlsTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, -1, -1));

        kiesTaalKnop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nederlands", "English", "Türk" }));
        kiesTaalKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiesTaalKnopActionPerformed(evt);
            }
        });
        getContentPane().add(kiesTaalKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void annulerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnopActionPerformed
        // TODO add your handling code here:
        vermisteBagageRegistreren1 m = new vermisteBagageRegistreren1(taal, rechten);
        vermisteBagageRegistreren1.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
        m.setVisible(true);

        setVisible(false);
        dispose();

    }//GEN-LAST:event_annulerenKnopActionPerformed

    private void vermistRegistrerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermistRegistrerenKnopActionPerformed
        try {
            // TODO add your handling code here:

            String label = txtlabelNummer.getText();
            BagageDatabase bagageDb = new BagageDatabase();
            klantenDatabase klantDb = new klantenDatabase();
            GevondenDatabase gevondenDb = new GevondenDatabase();

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
            
            txtLocatieGevonden.getText();
            txtDatumGevonden.getText();

            gevondenDb.InsertGevonden(klantId, vluchtKlantId, bagageId, txtDatumGevonden.getText(),txtLocatieGevonden.getText());

        } catch (SQLException ex) {
            Logger.getLogger(vermisteBagageRegistreren2.class.getName()).log(Level.SEVERE, null, ex);
        }

        hoofdMenu b = new hoofdMenu(taal, rechten);
        hoofdMenu.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
        b.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_vermistRegistrerenKnopActionPerformed

    private void homeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnopActionPerformed
        hoofdMenu b = new hoofdMenu(taal, rechten);
        hoofdMenu.ingelogdAlsTekst.setText(ingelogdAlsTekst.getText());
        b.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_homeKnopActionPerformed

    private void kiesTaalKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiesTaalKnopActionPerformed
        taal = kiesTaalKnop.getSelectedIndex();
    }//GEN-LAST:event_kiesTaalKnopActionPerformed

    private void txtlabelNummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlabelNummerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlabelNummerActionPerformed

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
                new gevondenBagageRegistreren2(0, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresTekst;
    private javax.swing.JTextField adresTekstVeld;
    private javax.swing.JButton annulerenKnop;
    private javax.swing.JButton annulerenKnop1;
    private javax.swing.JLabel bestemmingTekst;
    private javax.swing.JLabel emailTekst;
    private javax.swing.JTextField emailTekstVeld;
    private javax.swing.JLabel geboortedatumDataTekst;
    private javax.swing.JLabel geboortedatumTekst;
    private javax.swing.JButton homeKnop;
    private javax.swing.JButton homeKnop1;
    public static javax.swing.JLabel ingelogdAlsTekst;
    private javax.swing.JLabel ingelogdAlsTekst1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JComboBox<String> kiesTaalKnop1;
    private javax.swing.JLabel labelnummerTekst;
    private javax.swing.JLabel landTekst;
    private javax.swing.JTextField landTekstVeld;
    private javax.swing.JLabel locatieVermistOpgegevenTekst;
    private javax.swing.JLabel locatieVermistOpgegevenTekst1;
    private javax.swing.JTextField locatieVermistOpgegevenTekstveld;
    private javax.swing.JLabel luchthavenVanVertrekTekst;
    private javax.swing.JLabel naamDataTekst;
    private javax.swing.JLabel naamTekst;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JLabel pagina1Tekst1;
    private javax.swing.JLabel pagina1Tekst2;
    private javax.swing.JButton pagina2Knop;
    private javax.swing.JLabel persoonsgegevensTekst;
    private javax.swing.JLabel postcodeTekst;
    private javax.swing.JTextField postcodeTekstveld;
    private javax.swing.JLabel telefoonnummerTekst;
    private javax.swing.JTextField telefoonnummerTekstVeld;
    private javax.swing.JTextField txtDatumGevonden;
    private javax.swing.JTextField txtLocatieGevonden;
    public static javax.swing.JTextField txtbestemming;
    public static javax.swing.JTextField txtlabelNummer;
    public static javax.swing.JTextField txtluchthavenVertrek;
    public static javax.swing.JTextField txtvertrekDatum;
    public static javax.swing.JTextField txtvluchtNummer;
    private javax.swing.JLabel vermistGemeldTekst;
    private javax.swing.JButton vermistRegistrerenKnop;
    private javax.swing.JLabel vertrekDatumTekst;
    private javax.swing.JLabel verzendenNaarTekst;
    private javax.swing.JLabel vluchtnummerTekst;
    private javax.swing.JLabel woonplaatsTekst;
    private javax.swing.JTextField woonplaatsTekstVeld;
    // End of variables declaration//GEN-END:variables
}
