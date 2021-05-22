/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Midoriya Izuku
 */
public class PositionAndRates extends javax.swing.JFrame {
    
    sqlConnection getDB = new sqlConnection();
    Connection conn = getDB.DbconnectP();
    /**
     * Creates new form PositionAndRates
     */
    public PositionAndRates() {
        initComponents();
        showDeductions();
        showPositionAndRates();
    }

   public void showPositionAndRates(){
        try {
            sqlConnection getDB = new sqlConnection();
            Connection conn = getDB.DbconnectP();
            
            DefaultTableModel model = (DefaultTableModel)jtblPos_Rate.getModel();
            Object[] posTable = new Object[9];
            String getAllPositions = "SELECT * FROM positions";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(getAllPositions);
            
            while(rs.next()){
//                JOptionPane.showMessageDialog(this, rs.getInt("ID"));
                posTable[0] = rs.getInt("ID");
                posTable[1] = rs.getString("POS_DESCRIPTION");
                posTable[2] = rs.getInt("RATE_PRICE");
                model.addRow(posTable);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   public void showDeductions(){
        try {
            sqlConnection getDB = new sqlConnection();
            Connection conn = getDB.DbconnectP();
            
            DefaultTableModel model = (DefaultTableModel)jtbl_deductions.getModel();
            Object[] posTable = new Object[9];
            String getAllPositions = "SELECT * FROM deductions";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(getAllPositions);
            
            while(rs.next()){
//                JOptionPane.showMessageDialog(this, rs.getInt("ID"));
                posTable[0] = rs.getInt("ID");
                posTable[1] = rs.getString("DEDUCTION_DESCRIPTION");
                posTable[2] = rs.getDouble("DEDUCTION_RATE");
                model.addRow(posTable);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtn_x = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_deductions = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblPos_Rate = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtxtPosition = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxt_Rates = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jtxtDeductdesc = new javax.swing.JTextField();
        jtxtDeductionRates = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 650));
        setSize(new java.awt.Dimension(1033, 650));

        jPanel1.setBackground(new java.awt.Color(248, 210, 160));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(1033, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DEDUCTIONS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 451, -1, -1));

        jbtn_x.setBackground(new java.awt.Color(255, 102, 0));
        jbtn_x.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jbtn_x.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_x.setText("X");
        jbtn_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_xActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(969, 16, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 506, 500, 18));

        jtbl_deductions.setBackground(new java.awt.Color(204, 204, 204));
        jtbl_deductions.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jtbl_deductions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Description", "Rate"
            }
        ));
        jtbl_deductions.setRowHeight(30);
        jtbl_deductions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_deductionsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbl_deductions);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 644, 976, 197));

        jtblPos_Rate.setBackground(new java.awt.Color(204, 204, 204));
        jtblPos_Rate.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jtblPos_Rate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "POSITION", "RATES"
            }
        ));
        jtblPos_Rate.setRowHeight(30);
        jtblPos_Rate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblPos_RateMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblPos_Rate);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 208, 980, 237));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("POSITIONS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 102, -1, -1));

        jtxtPosition.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jtxtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 95, 143, 31));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("RATES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 102, 76, -1));

        jtxt_Rates.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(jtxt_Rates, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 96, 143, 31));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-2-24.png"))); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 158, 130, 39));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-24.png"))); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 158, 130, 39));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-24.png"))); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 158, 130, 39));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("POSITION AND RATES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 26, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 71, 500, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("DESCRIPTION");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 530, -1, 32));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("DEDUCTION RATES");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 538, -1, -1));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-24.png"))); // NOI18N
        jButton7.setText("ADD");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 577, 130, 39));

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-2-24.png"))); // NOI18N
        jButton8.setText("UPDATE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 577, 130, 39));

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-24.png"))); // NOI18N
        jButton9.setText("DELETE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 577, 130, 39));

        jtxtDeductdesc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jtxtDeductdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 531, 143, 31));

        jtxtDeductionRates.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(jtxtDeductionRates, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 532, 143, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_xActionPerformed
       this.dispose();
       new Dashboard().setVisible(true);
    }//GEN-LAST:event_jbtn_xActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            addNewPosition();
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            addNewDeduction();
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    int id;
    
    private void jtblPos_RateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblPos_RateMouseClicked
        id = Integer.parseInt(jtblPos_Rate.getValueAt(jtblPos_Rate.getSelectedRow(),0).toString());
        jtxtPosition.setText(jtblPos_Rate.getValueAt(jtblPos_Rate.getSelectedRow(),1).toString());
        jtxt_Rates.setText(jtblPos_Rate.getValueAt(jtblPos_Rate.getSelectedRow(),2).toString());
    }//GEN-LAST:event_jtblPos_RateMouseClicked

    private void jtbl_deductionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_deductionsMouseClicked
       id = Integer.parseInt(jtbl_deductions.getValueAt(jtbl_deductions.getSelectedRow(),0).toString());
       jtxtDeductdesc.setText(jtbl_deductions.getValueAt(jtbl_deductions.getSelectedRow(),1).toString());
       jtxtDeductionRates.setText(jtbl_deductions.getValueAt(jtbl_deductions.getSelectedRow(),2).toString());
    }//GEN-LAST:event_jtbl_deductionsMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            deletePositions(id);
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            deleteDeductions(id);
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            updatePositions(id);
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            updateDeductions(id);
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed
    
    private void tanggalinAngLamanNgPosition(){
        jtxtPosition.setText("");
        jtxt_Rates.setText("");
    }
    
    private void tanggalinAngLamanNgDeduction(){
        jtxtDeductdesc.setText("");
        jtxtDeductionRates.setText("");
    }
    
    public void addNewPosition() throws SQLException{
        String addPosition = "INSERT INTO `positions`(`POS_DESCRIPTION`,`RATE_PRICE`) VALUES (?,?)";
        PreparedStatement st = conn.prepareStatement(addPosition);
            st.setString(1, jtxtPosition.getText());
            st.setString(2, jtxt_Rates.getText());
            int i = st.executeUpdate();
           if (i > 0) {
                JOptionPane.showMessageDialog(this,"Successfully Added");
                tanggalinAngLamanNgPosition();
                DefaultTableModel mod = (DefaultTableModel)jtblPos_Rate.getModel();
                mod.setRowCount(0);
                showPositionAndRates();
                 
          } else {
                JOptionPane.showMessageDialog(this,"Error");
            }
    }

    public void addNewDeduction() throws SQLException{
        String addPosition = "INSERT INTO `deductions`(`DEDUCTION_DESCRIPTION`,`DEDUCTION_RATE`) VALUES (?,?)";
        PreparedStatement st = conn.prepareStatement(addPosition);
            st.setString(1, jtxtDeductdesc.getText());
            st.setString(2, jtxtDeductionRates.getText());
            int i = st.executeUpdate();
           if (i > 0) {
                JOptionPane.showMessageDialog(this,"Successfully Added");
                tanggalinAngLamanNgDeduction();
                DefaultTableModel mod = (DefaultTableModel)jtbl_deductions.getModel();
                mod.setRowCount(0);
                showDeductions();
                 
          } else {
                JOptionPane.showMessageDialog(this,"Error");
            }
    }
    
    public void updateDeductions(int ids) throws SQLException{
        String updateEmployee = "UPDATE `deductions` SET `DEDUCTION_DESCRIPTION`=?, `DEDUCTION_RATE`=? WHERE ID = ?";
        PreparedStatement st = conn.prepareStatement(updateEmployee);
        st.setString(1, jtxtDeductdesc.getText());
            st.setString(2, jtxtDeductionRates.getText());
        st.setInt(3, ids);

            int i = st.executeUpdate();
            if (i > 0) {
                  JOptionPane.showMessageDialog(this,"Successfully Update");
                  tanggalinAngLamanNgDeduction();
                  DefaultTableModel mod = (DefaultTableModel)jtblPos_Rate.getModel();
                    mod.setRowCount(0);
                 showPositionAndRates();
            } else {
                JOptionPane.showMessageDialog(this,"Error");
            }
    }
    
     public void deletePositions(int id) throws SQLException{
        String deleteEmployee = "DELETE FROM positions WHERE ID = ?";
        PreparedStatement st = conn.prepareStatement(deleteEmployee);
        st.setInt(1,id);

            int i = st.executeUpdate();
            if (i > 0) {
                  JOptionPane.showMessageDialog(this,"Successfully Deleted");
                  tanggalinAngLamanNgPosition();
                  DefaultTableModel mod = (DefaultTableModel)jtblPos_Rate.getModel();
                    mod.setRowCount(0);
                 showPositionAndRates();
            } else {
                JOptionPane.showMessageDialog(this,"Error");
            }
            
     }
     
      public void updatePositions(int ids) throws SQLException{
        String updateEmployee = "UPDATE `positions` SET `POS_DESCRIPTION`=?, `RATE_PRICE`=? WHERE ID = ?";
        PreparedStatement st = conn.prepareStatement(updateEmployee);
        st.setString(1, jtxtPosition.getText());
        st.setDouble(2, Double.parseDouble(jtxt_Rates.getText()));
        st.setInt(3, ids);

            int i = st.executeUpdate();
            if (i > 0) {
                  JOptionPane.showMessageDialog(this,"Successfully Update");
                  tanggalinAngLamanNgPosition();
                  DefaultTableModel mod = (DefaultTableModel)jtblPos_Rate.getModel();
                    mod.setRowCount(0);
                 showPositionAndRates();
            } else {
                JOptionPane.showMessageDialog(this,"Error");
            }
    }
     
     public void deleteDeductions(int id) throws SQLException{
        String deleteEmployee = "DELETE FROM deductions WHERE ID = ?";
        PreparedStatement st = conn.prepareStatement(deleteEmployee);
        st.setInt(1,id);

            int i = st.executeUpdate();
            if (i > 0) {
                  JOptionPane.showMessageDialog(this,"Successfully Deleted");
                  tanggalinAngLamanNgDeduction();
                  DefaultTableModel mod = (DefaultTableModel)jtbl_deductions.getModel();
                    mod.setRowCount(0);
                 showDeductions();
            } else {
                JOptionPane.showMessageDialog(this,"Error");
            }
            
     }

    
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
            java.util.logging.Logger.getLogger(PositionAndRates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PositionAndRates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PositionAndRates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PositionAndRates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PositionAndRates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtn_x;
    private javax.swing.JTable jtblPos_Rate;
    private javax.swing.JTable jtbl_deductions;
    private javax.swing.JTextField jtxtDeductdesc;
    private javax.swing.JTextField jtxtDeductionRates;
    private javax.swing.JTextField jtxtPosition;
    private javax.swing.JTextField jtxt_Rates;
    // End of variables declaration//GEN-END:variables
}
