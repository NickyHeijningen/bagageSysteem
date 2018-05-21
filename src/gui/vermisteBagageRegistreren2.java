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
public class vermisteBagageRegistreren2 extends javax.swing.JFrame {

    
    public vermisteBagageRegistreren2() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        kiesTaalKnop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        ingelogdAlsTekst = new javax.swing.JLabel();
        homeKnop = new javax.swing.JButton();
        annulerenKnop = new javax.swing.JButton();
        opslaanKnop = new javax.swing.JButton();
        persoonsgegevensTekst = new javax.swing.JLabel();
        labelnummerTekst = new javax.swing.JLabel();
        typeTekst = new javax.swing.JLabel();
        merkTekst = new javax.swing.JLabel();
        kleurTekst = new javax.swing.JLabel();
        kenmerkenTekst = new javax.swing.JLabel();
        pagina1Tekst = new javax.swing.JLabel();
        labelnummerData = new javax.swing.JLabel();
        typeTekstVeld = new javax.swing.JTextField();
        merkTekstVeld = new javax.swing.JTextField();
        kenmerkenTekstVeld = new javax.swing.JTextField();
        kiesKleurKnop = new javax.swing.JComboBox<>();

        jButton4.setText("Log in");
        jButton4.setBackground(Color.decode("#CC0000"));

        jButton6.setText("Accounts beheren");
        jButton6.setBackground(Color.decode("#CC0000"));

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
                .addContainerGap(161, Short.MAX_VALUE))
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
        getContentPane().add(homeKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 575, 62, 25));

        annulerenKnop.setText("Annuleren");
        annulerenKnop.setBackground(Color.decode("#CC0000"));
        annulerenKnop.setForeground(Color.WHITE);
        annulerenKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerenKnopActionPerformed(evt);
            }
        });
        getContentPane().add(annulerenKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 522, 249, 35));

        opslaanKnop.setText("Opslaan");
        opslaanKnop.setBackground(Color.decode("#CC0000"));
        opslaanKnop.setForeground(Color.WHITE);
        opslaanKnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opslaanKnopActionPerformed(evt);
            }
        });
        getContentPane().add(opslaanKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 522, 249, 35));

        persoonsgegevensTekst.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        persoonsgegevensTekst.setText("Bagagekenmerken");
        getContentPane().add(persoonsgegevensTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 115, -1, -1));

        labelnummerTekst.setText("Labelnummer");
        getContentPane().add(labelnummerTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 147, -1, -1));

        typeTekst.setText("Type");
        getContentPane().add(typeTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 179, -1, -1));

        merkTekst.setText("Merk");
        getContentPane().add(merkTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 204, -1, -1));

        kleurTekst.setText("Kleur");
        getContentPane().add(kleurTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 229, -1, -1));

        kenmerkenTekst.setText("Kenmerken");
        getContentPane().add(kenmerkenTekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 254, -1, -1));

        pagina1Tekst.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pagina1Tekst.setText("Pagina 2");
        getContentPane().add(pagina1Tekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 44, -1, -1));

        labelnummerData.setText("Labelnummer");
        getContentPane().add(labelnummerData, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 147, -1, -1));

        typeTekstVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeTekstVeldActionPerformed(evt);
            }
        });
        getContentPane().add(typeTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 177, 130, -1));
        getContentPane().add(merkTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 203, 130, -1));

        kenmerkenTekstVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kenmerkenTekstVeldActionPerformed(evt);
            }
        });
        getContentPane().add(kenmerkenTekstVeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 255, 130, -1));

        kiesKleurKnop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rood", "Groen", "Blauw", "Zwart", "Geel", "Paars", "Roze", "Oranje" }));
        getContentPane().add(kiesKleurKnop, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 229, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeKnopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeKnopActionPerformed

    private void annulerenKnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerenKnopActionPerformed
        // TODO add your handling code here:
        vermisteBagageRegistreren1 m = new vermisteBagageRegistreren1();
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
                new vermisteBagageRegistreren2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerenKnop;
    private javax.swing.JButton homeKnop;
    private javax.swing.JLabel ingelogdAlsTekst;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel kenmerkenTekst;
    private javax.swing.JTextField kenmerkenTekstVeld;
    private javax.swing.JComboBox<String> kiesKleurKnop;
    private javax.swing.JComboBox<String> kiesTaalKnop;
    private javax.swing.JLabel kleurTekst;
    private javax.swing.JLabel labelnummerData;
    private javax.swing.JLabel labelnummerTekst;
    private javax.swing.JLabel merkTekst;
    private javax.swing.JTextField merkTekstVeld;
    private javax.swing.JButton opslaanKnop;
    private javax.swing.JLabel pagina1Tekst;
    private javax.swing.JLabel persoonsgegevensTekst;
    private javax.swing.JLabel typeTekst;
    private javax.swing.JTextField typeTekstVeld;
    // End of variables declaration//GEN-END:variables
}
