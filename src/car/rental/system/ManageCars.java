/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.rental.system;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ahmed
 */
public class ManageCars extends javax.swing.JFrame {

    /**
     * Creates new form ManageCars
     */
    public ManageCars() {
        initComponents();
        displayCar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registration = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        modelcar = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        savecar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        deletecar = new javax.swing.JButton();
        editcar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        carstable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Regestration number");

        jLabel2.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Model");

        jLabel3.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Brand");

        jLabel4.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status");

        jLabel5.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");

        registration.setBackground(new java.awt.Color(255, 255, 255));
        registration.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registration.setForeground(new java.awt.Color(0, 0, 0));
        registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationActionPerformed(evt);
            }
        });

        brand.setBackground(new java.awt.Color(255, 255, 255));
        brand.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        brand.setForeground(new java.awt.Color(0, 0, 0));
        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });

        modelcar.setBackground(new java.awt.Color(255, 255, 255));
        modelcar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        modelcar.setForeground(new java.awt.Color(0, 0, 0));
        modelcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelcarActionPerformed(evt);
            }
        });

        price.setBackground(new java.awt.Color(255, 255, 255));
        price.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        price.setForeground(new java.awt.Color(0, 0, 0));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked", "Available", " " }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        savecar.setBackground(new java.awt.Color(0, 0, 0));
        savecar.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        savecar.setForeground(new java.awt.Color(255, 255, 255));
        savecar.setText("Save");
        savecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savecarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        jLabel6.setText("Manage Cars");

        reset.setBackground(new java.awt.Color(0, 0, 0));
        reset.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");

        deletecar.setBackground(new java.awt.Color(0, 0, 0));
        deletecar.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        deletecar.setForeground(new java.awt.Color(255, 255, 255));
        deletecar.setText("Delete");
        deletecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecarActionPerformed(evt);
            }
        });

        editcar.setBackground(new java.awt.Color(0, 0, 0));
        editcar.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        editcar.setForeground(new java.awt.Color(255, 255, 255));
        editcar.setText("Edit");
        editcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editcarActionPerformed(evt);
            }
        });

        carstable.setBackground(new java.awt.Color(102, 102, 102));
        carstable.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        carstable.setForeground(new java.awt.Color(255, 255, 255));
        carstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Regestration Number", "Brand", "Model", "Status", "Price"
            }
        ));
        carstable.setRowHeight(20);
        carstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carstable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(470, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modelcar)
                            .addComponent(brand)
                            .addComponent(price)
                            .addComponent(registration)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(savecar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editcar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletecar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelcar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savecar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletecar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editcar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(135, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;

    private void displayCar() {
        try {

            con = DriverManager.getConnection("jdbc:derby://localhost:1527/buee", "bue", "bue");
            st = con.createStatement();
            rs = st.executeQuery("select * from CARTABLE");
            carstable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    }


    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrationActionPerformed

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandActionPerformed

    private void modelcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelcarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelcarActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void editcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editcarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editcarActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void savecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savecarActionPerformed

        if (registration.getText().isEmpty() || brand.getText().isEmpty() || modelcar.getText().isEmpty() || status.getSelectedIndex() == -1 || price.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "PLEASE ENTER ALL FIELDS....");
        } else {
            try {
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/buee", "bue", "bue");
                PreparedStatement add = con.prepareStatement("insert into CARTABLE values(?,?,?,?,?)");
                add.setString(1, registration.getText());
                add.setString(2, brand.getText());
                add.setString(3, modelcar.getText());
                add.setString(4, status.getSelectedItem().toString());
                add.setInt(5, Integer.valueOf(price.getText()));
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Car Saved Successfully");
                displayCar();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_savecarActionPerformed

    private void deletecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecarActionPerformed

//      
//                 if (registration.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "PLEASE ENTER ALL FIELDS....");
//        } else {
//            try {
//                con = DriverManager.getConnection("jdbc:derby://localhost:1527/buee", "bue", "bue");
//                String reg=registration.getText();
//                String query="Delete from BUE.CARTABLE where CARREGISTER= ' "+reg+" ' ";
//                Statement add = con.createStatement();
//                add.executeUpdate(query);
//            
//                JOptionPane.showMessageDialog(this, "Car deleted Successfully");
//                displayCar();
//                
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//              

    }//GEN-LAST:event_deletecarActionPerformed

    private void carstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carstableMouseClicked

//DefaultTableModel model=(DefaultTableModel)carstable.getModel();
//int index=carstable.getSelectedRow();
//registration.setText(model.getValueAt(index, 0).toString());
//brand.setText(model.getValueAt(index, 1).toString());
//modelcar.setText(model.getValueAt(index, 2).toString());
//status.setSelectedItem(model.getValueAt(index, 3).toString());
//price.setText(model.getValueAt(index, 4).toString());
//



    }//GEN-LAST:event_carstableMouseClicked

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
            java.util.logging.Logger.getLogger(ManageCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brand;
    private javax.swing.JTable carstable;
    private javax.swing.JButton deletecar;
    private javax.swing.JButton editcar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modelcar;
    private javax.swing.JTextField price;
    private javax.swing.JTextField registration;
    private javax.swing.JButton reset;
    private javax.swing.JButton savecar;
    private javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
