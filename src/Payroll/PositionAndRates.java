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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DEDUCTIONS");

        jbtn_x.setBackground(new java.awt.Color(255, 102, 0));
        jbtn_x.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jbtn_x.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_x.setText("X");
        jbtn_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_xActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("POSITIONS");

        jtxtPosition.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("RATES");

        jtxt_Rates.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-2-24.png"))); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-24.png"))); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-24.png"))); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("POSITION AND RATES");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("DESCRIPTION");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("DEDUCTION RATES");

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-24.png"))); // NOI18N
        jButton7.setText("ADD");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-2-24.png"))); // NOI18N
        jButton8.setText("UPDATE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-24.png"))); // NOI18N
        jButton9.setText("DELETE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jtxtDeductdesc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jtxtDeductionRates.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtn_x)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(53, 53, 53)
                                .addComponent(jtxtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jtxt_Rates, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(244, 244, 244))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(333, 333, 333)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(jLabel7)
                                        .addGap(63, 63, 63)
                                        .addComponent(jtxtDeductdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel8)
                                        .addGap(72, 72, 72)
                                        .addComponent(jtxtDeductionRates, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(224, 224, 224)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(125, 125, 125)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(259, 259, 259)
                    .addComponent(jLabel4)
                    .addContainerGap(372, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtn_x)
                .addGap(32, 32, 32)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jtxt_Rates, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDeductdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtxtDeductionRates, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel4)
                    .addContainerGap(915, Short.MAX_VALUE)))
        );

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
