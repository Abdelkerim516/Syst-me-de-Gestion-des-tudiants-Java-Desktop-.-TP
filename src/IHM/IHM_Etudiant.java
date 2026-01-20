


package IHM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class IHM_Etudiant extends javax.swing.JFrame {
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;

    /**
     * Creates new form IHM_Etudiant
     */
    public IHM_Etudiant() {
    initComponents();
    conn = JavaConnectDB.ConnectDB();
    System.out.println("CONNEXION = " + conn); // Pour voir les erreur depuis le terminal
    afficherEtudiants();
}
    private void afficherEtudiants() {
    try {
        String sql = "SELECT matricule, nom, prenom, sexe, niveau, domaine, date_inscription FROM etudiant";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{
            "Matricule", "Nom", "Prénom", "Sexe", "Niveau", "Domaine", "Date"
        });

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("matricule"),
                rs.getString("nom"),
                rs.getString("prenom"),
                rs.getString("sexe"),
                rs.getString("niveau"),
                rs.getString("domaine"),
                rs.getString("date_inscription")
            });
        }

        TableTitle.setModel(model);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erreur affichage : " + e.getMessage());
    }
}

    private void viderChamps() {
    txtmat.setText("");
    txtnom.setText("");
    txtprenom.setText("");
    Cmbsexe.setSelectedIndex(0);
    Cmbniveau.setSelectedIndex(0);
    Cmbdomain.setSelectedIndex(0);
    Datejour.setDate(null);
}



    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        ButtNouvea = new javax.swing.JButton();
        ButtSauve = new javax.swing.JButton();
        ButtModif = new javax.swing.JButton();
        ButtSupprimer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableTitle = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtmat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Cmbniveau = new javax.swing.JComboBox<>();
        Cmbdomain = new javax.swing.JComboBox<>();
        Cmbsexe = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtprenom = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Datejour = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 248, 240));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ButtNouvea.setBackground(new java.awt.Color(224, 224, 224));
        ButtNouvea.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ButtNouvea.setText("Nouveau");
        ButtNouvea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtNouvea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtNouveaActionPerformed(evt);
            }
        });

        ButtSauve.setBackground(new java.awt.Color(46, 125, 50));
        ButtSauve.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ButtSauve.setForeground(new java.awt.Color(255, 255, 255));
        ButtSauve.setText("Sauvegarder");
        ButtSauve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtSauve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtSauveActionPerformed(evt);
            }
        });

        ButtModif.setBackground(new java.awt.Color(251, 140, 0));
        ButtModif.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ButtModif.setForeground(new java.awt.Color(255, 255, 255));
        ButtModif.setText("Modifier");
        ButtModif.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtModifActionPerformed(evt);
            }
        });

        ButtSupprimer.setBackground(new java.awt.Color(198, 40, 40));
        ButtSupprimer.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ButtSupprimer.setForeground(new java.awt.Color(255, 255, 255));
        ButtSupprimer.setText("Supprimer");
        ButtSupprimer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtSupprimerActionPerformed(evt);
            }
        });

        TableTitle.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        TableTitle.setForeground(new java.awt.Color(230, 230, 230));
        TableTitle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTitleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableTitle);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Gestion des Inscriptions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24), new java.awt.Color(230, 81, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("Sexe :");

        txtmat.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setText("Niveau :");

        Cmbniveau.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        Cmbniveau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L1", "L2", "L3", "M1", "M2", "Doctorat", "Autres" }));

        Cmbdomain.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        Cmbdomain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informatique et Réseau", "Compta", "Gestion", "Management", "TTL", "CCA", "Droit Privée", "Droit Public", "Analyse des données", "Autres", " " }));

        Cmbsexe.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        Cmbsexe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculin", "Feminin" }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("Prénom :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel6.setText("Domaine :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setText("Matrticule :");

        txtprenom.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        txtnom.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setText("Nom :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel8.setText("Date jour :");

        Datejour.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(60, 60, 60)
                        .addComponent(Datejour, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(63, 63, 63)
                        .addComponent(Cmbdomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Cmbniveau, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Cmbsexe, 0, 216, Short.MAX_VALUE))
                                    .addComponent(txtprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtnom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtmat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cmbsexe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Cmbniveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Cmbdomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(Datejour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bannier-Projet-Java.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtNouvea, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtSauve, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtModif, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(460, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtSauve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtNouvea, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtModif, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtSauveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtSauveActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO etudiant" + "(matricule, nom, prenom, sexe, niveau, domaine, date_inscription)" + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, txtmat.getText());
            pst.setString(2, txtnom.getText());
            pst.setString(3, txtprenom.getText());
            pst.setString(4, Cmbsexe.getSelectedItem().toString());
            pst.setString(5, Cmbniveau.getSelectedItem().toString());
            pst.setString(6, Cmbdomain.getSelectedItem().toString());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            pst.setString(7, sdf.format(Datejour.getDate()));

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Étudiant enregistré avec succès");
            afficherEtudiants();
            viderChamps();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur : " + e.getMessage());

        }
    }//GEN-LAST:event_ButtSauveActionPerformed

    private void ButtNouveaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtNouveaActionPerformed
        // TODO add your handdling code here:
        viderChamps();
    }//GEN-LAST:event_ButtNouveaActionPerformed

    private void TableTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTitleMouseClicked
        // TODO add your handling code here:
        int row = TableTitle.getSelectedRow();

        if (row >= 0) {
            txtmat.setText(TableTitle.getValueAt(row, 0).toString());
            txtnom.setText(TableTitle.getValueAt(row, 1).toString());
            txtprenom.setText(TableTitle.getValueAt(row, 2).toString());
            Cmbsexe.setSelectedItem(TableTitle.getValueAt(row, 3).toString());
            Cmbniveau.setSelectedItem(TableTitle.getValueAt(row, 4).toString());
            Cmbdomain.setSelectedItem(TableTitle.getValueAt(row, 5).toString());

            try {
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd")
                .parse(TableTitle.getValueAt(row, 6).toString());
                Datejour.setDate(date);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur date : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_TableTitleMouseClicked

    private void ButtModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtModifActionPerformed
        // TODO add your handling code here:
        if (txtmat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sélectionnez un étudiant à modifier");
            return;
        }

        try {
            String sql = "UPDATE etudiant SET "
            + "nom = ?, "
            + "prenom = ?, "
            + "sexe = ?, "
            + "niveau = ?, "
            + "domaine = ?, "
            + "date_inscription = ? "
            + "WHERE matricule = ?";

            pst = conn.prepareStatement(sql);

            pst.setString(1, txtnom.getText());
            pst.setString(2, txtprenom.getText());
            pst.setString(3, Cmbsexe.getSelectedItem().toString());
            pst.setString(4, Cmbniveau.getSelectedItem().toString());
            pst.setString(5, Cmbdomain.getSelectedItem().toString());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            pst.setString(6, sdf.format(Datejour.getDate()));

            pst.setString(7, txtmat.getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Étudiant modifié avec succès");
            afficherEtudiants();
            viderChamps();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur modification : " + e.getMessage());
        }
    }//GEN-LAST:event_ButtModifActionPerformed

    private void ButtSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtSupprimerActionPerformed
        // TODO add your handling code here:
        if (txtmat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sélectionnez un étudiant à supprimer");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
            null,
            "Voulez-vous vraiment supprimer cet étudiant ?",
            "Confirmation",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM etudiant WHERE matricule = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtmat.getText());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Étudiant supprimé avec succès");
                afficherEtudiants();
                viderChamps();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur suppression : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_ButtSupprimerActionPerformed

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
            java.util.logging.Logger.getLogger(IHM_Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IHM_Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IHM_Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IHM_Etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IHM_Etudiant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtModif;
    private javax.swing.JButton ButtNouvea;
    private javax.swing.JButton ButtSauve;
    private javax.swing.JButton ButtSupprimer;
    private javax.swing.JComboBox<String> Cmbdomain;
    private javax.swing.JComboBox<String> Cmbniveau;
    private javax.swing.JComboBox<String> Cmbsexe;
    private com.toedter.calendar.JDateChooser Datejour;
    private javax.swing.JTable TableTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtmat;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtprenom;
    // End of variables declaration//GEN-END:variables
}
