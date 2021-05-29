/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;

import java.awt.event.KeyEvent;
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
        disableDed_Button();
        disablePos_Button();
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
        jbtnPos_Update = new javax.swing.JButton();
        jbtnPos_Delete = new javax.swing.JButton();
        jbtnPos_Add = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbtnDeduc_Add = new javax.swing.JButton();
        jbtnDeduc_Update = new javax.swing.JButton();
        jbtnDeduc_Delete = new javax.swing.JButton();
        jtxtDeductdesc = new javax.swing.JTextField();
        jtxtDeductionRates = new javax.swing.JTextField();
        jbtnPos_Cancel = new javax.swing.JButton();
        jbtnDeduc_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 650));
        setSize(new java.awt.Dimension(1033, 650));

        jPanel1.setBackground(new java.awt.Color(248, 210, 160));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(1033, 650));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 38)); // NOI18N
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        jtxtPosition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPositionKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("RATES");

        jtxt_Rates.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jtxt_Rates.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_RatesKeyTyped(evt);
            }
        });

        jbtnPos_Update.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnPos_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-2-24.png"))); // NOI18N
        jbtnPos_Update.setText("UPDATE");
        jbtnPos_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPos_UpdateActionPerformed(evt);
            }
        });

        jbtnPos_Delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnPos_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-24.png"))); // NOI18N
        jbtnPos_Delete.setText("DELETE");
        jbtnPos_Delete.setPreferredSize(new java.awt.Dimension(120, 33));
        jbtnPos_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPos_DeleteActionPerformed(evt);
            }
        });

        jbtnPos_Add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnPos_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-24.png"))); // NOI18N
        jbtnPos_Add.setText("ADD");
        jbtnPos_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPos_AddActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 38)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("POSITION AND RATES");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("DESCRIPTION");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("DEDUCTION RATES");

        jbtnDeduc_Add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnDeduc_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-24.png"))); // NOI18N
        jbtnDeduc_Add.setText("ADD");
        jbtnDeduc_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeduc_AddActionPerformed(evt);
            }
        });

        jbtnDeduc_Update.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnDeduc_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-2-24.png"))); // NOI18N
        jbtnDeduc_Update.setText("UPDATE");
        jbtnDeduc_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeduc_UpdateActionPerformed(evt);
            }
        });

        jbtnDeduc_Delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnDeduc_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-24.png"))); // NOI18N
        jbtnDeduc_Delete.setText("DELETE");
        jbtnDeduc_Delete.setPreferredSize(new java.awt.Dimension(120, 33));
        jbtnDeduc_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeduc_DeleteActionPerformed(evt);
            }
        });

        jtxtDeductdesc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtxtDeductdesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDeductdescKeyTyped(evt);
            }
        });

        jtxtDeductionRates.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jtxtDeductionRates.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDeductionRatesKeyTyped(evt);
            }
        });

        jbtnPos_Cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnPos_Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel-24.png"))); // NOI18N
        jbtnPos_Cancel.setText("CANCEL");
        jbtnPos_Cancel.setPreferredSize(new java.awt.Dimension(120, 33));
        jbtnPos_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPos_CancelActionPerformed(evt);
            }
        });

        jbtnDeduc_Cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnDeduc_Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel-24.png"))); // NOI18N
        jbtnDeduc_Cancel.setText("CANCEL");
        jbtnDeduc_Cancel.setPreferredSize(new java.awt.Dimension(120, 33));
        jbtnDeduc_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeduc_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jtxt_Rates, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnPos_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jbtnPos_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 201, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnPos_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jbtnPos_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(532, 532, 532))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(229, 229, 229)
                        .addComponent(jbtn_x))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(345, 345, 345))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jtxtDeductdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel8)
                                        .addGap(56, 56, 56)
                                        .addComponent(jtxtDeductionRates, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jbtnDeduc_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jbtnDeduc_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jbtnDeduc_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnDeduc_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addComponent(jbtn_x))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jtxt_Rates, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnPos_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnPos_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnPos_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnPos_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDeductdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtxtDeductionRates, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDeduc_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDeduc_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDeduc_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDeduc_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
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

    private void jbtnPos_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPos_AddActionPerformed
        try {
            // TODO add your handling code here:
            addNewPosition();
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnPos_AddActionPerformed

    private void jbtnDeduc_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeduc_AddActionPerformed
        try {
            addNewDeduction();
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnDeduc_AddActionPerformed

    int id;
    
    private void jtblPos_RateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblPos_RateMouseClicked
        id = Integer.parseInt(jtblPos_Rate.getValueAt(jtblPos_Rate.getSelectedRow(),0).toString());
        jtxtPosition.setText(jtblPos_Rate.getValueAt(jtblPos_Rate.getSelectedRow(),1).toString());
        jtxt_Rates.setText(jtblPos_Rate.getValueAt(jtblPos_Rate.getSelectedRow(),2).toString());
        disablePosition_Button();
        
    }//GEN-LAST:event_jtblPos_RateMouseClicked

    private void jtbl_deductionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_deductionsMouseClicked
       id = Integer.parseInt(jtbl_deductions.getValueAt(jtbl_deductions.getSelectedRow(),0).toString());
       jtxtDeductdesc.setText(jtbl_deductions.getValueAt(jtbl_deductions.getSelectedRow(),1).toString());
       jtxtDeductionRates.setText(jtbl_deductions.getValueAt(jtbl_deductions.getSelectedRow(),2).toString());
       disabdleDeduc_Button();
    }//GEN-LAST:event_jtbl_deductionsMouseClicked

    private void jbtnPos_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPos_DeleteActionPerformed
        try {
            deletePositions(id);
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnPos_DeleteActionPerformed

    private void jbtnDeduc_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeduc_DeleteActionPerformed
        try {
            deleteDeductions(id);
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnDeduc_DeleteActionPerformed

    private void jbtnPos_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPos_UpdateActionPerformed
        try {
            updatePositions(id);
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnPos_UpdateActionPerformed

    private void jbtnDeduc_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeduc_UpdateActionPerformed
        try {
            updateDeductions(id);
        } catch (SQLException ex) {
            Logger.getLogger(PositionAndRates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnDeduc_UpdateActionPerformed

    private void jbtnPos_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPos_CancelActionPerformed
        // TODO add your handling code here:
        tanggalinAngLamanNgPosition();
        disablePos_Button();
    }//GEN-LAST:event_jbtnPos_CancelActionPerformed

    private void jtxtPositionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPositionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
          if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_jtxtPositionKeyTyped

    private void jtxtDeductdescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDeductdescKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
          if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_jtxtDeductdescKeyTyped

    private void jtxt_RatesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_RatesKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_PERIOD) ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE))) {
                   getToolkit().beep();
                 evt.consume();
              }
    }//GEN-LAST:event_jtxt_RatesKeyTyped

    private void jtxtDeductionRatesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDeductionRatesKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_PERIOD) ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE))) {
                   getToolkit().beep();
                 evt.consume();
              }
    }//GEN-LAST:event_jtxtDeductionRatesKeyTyped

    private void jbtnDeduc_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeduc_CancelActionPerformed
        // TODO add your handling code here:
        tanggalinAngLamanNgDeduction();
        disableDed_Button();
    }//GEN-LAST:event_jbtnDeduc_CancelActionPerformed
    
    private void tanggalinAngLamanNgPosition(){
        jtxtPosition.setText("");
        jtxt_Rates.setText("");
    }
    
    private void tanggalinAngLamanNgDeduction(){
        jtxtDeductdesc.setText("");
        jtxtDeductionRates.setText("");
    }
    
    public void addNewPosition() throws SQLException{
      int rows = jtblPos_Rate.getRowCount();
      int checker = 0;
      for (int rowNum=0; rowNum<rows; ++rowNum){
          String pos = String.valueOf(jtblPos_Rate.getValueAt(rowNum,1));
          if(jtxtPosition.getText().equalsIgnoreCase(pos)){
              checker = 1;
              break;
          }
      }
      if(checker==1){
          JOptionPane.showMessageDialog(this, "Position already assigned");
      }
      else if(jtxtPosition.getText().isBlank() || jtxt_Rates.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Empty");
      }
      else{        
        String addPosition = "INSERT INTO `positions`(`POS_DESCRIPTION`,`RATE_PRICE`) VALUES (?,?)";
        PreparedStatement st = conn.prepareStatement(addPosition);
            st.setString(1, jtxtPosition.getText());
            st.setInt(2, Integer.parseInt(jtxt_Rates.getText()));
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
    }

    public void addNewDeduction() throws SQLException{
         int Row = jtbl_deductions.getRowCount();
         int checker = 0;
         for (int rowNum=0; rowNum<Row; ++rowNum){
            String pos = String.valueOf(jtbl_deductions.getValueAt(rowNum,1));
            if(jtxtDeductdesc.getText().equalsIgnoreCase(pos)){
                  checker = 1;
                  break;
             }
            }
      if(checker==1){
          JOptionPane.showMessageDialog(this, "DEDUCTION NAME");
      }
      
      else if(jtxtDeductdesc.getText().isBlank() || jtxtDeductionRates.getText().isBlank()){
          JOptionPane.showMessageDialog(this,"heyyy");
      }
      else{
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
    }
    
    public void updateDeductions(int ids) throws SQLException{
        int Row = jtbl_deductions.getRowCount();
         int checker = 0;
         for (int rowNum=0; rowNum<Row; ++rowNum){
            String pos = String.valueOf(jtbl_deductions.getValueAt(rowNum,1));
            if(jtxtDeductdesc.getText().equalsIgnoreCase(pos)){
                  checker = 1;
                  break;
             }
            }
      if(checker==1){
          JOptionPane.showMessageDialog(this, "DEDUCTION NAME");
      }
       else if(jtxtDeductdesc.getText().isBlank() || jtxtDeductionRates.getText().isBlank()){
          JOptionPane.showMessageDialog(this,"heyyy");
      }
      else{
        String updateEmployee = "UPDATE `deductions` SET `DEDUCTION_DESCRIPTION`=?, `DEDUCTION_RATE`=? WHERE ID = ?";
        PreparedStatement st = conn.prepareStatement(updateEmployee);
        st.setString(1, jtxtDeductdesc.getText());
            st.setString(2, jtxtDeductionRates.getText());
        st.setInt(3, ids);

            int i = st.executeUpdate();
            if (i > 0) {
                  JOptionPane.showMessageDialog(this,"Successfully Update");
                  tanggalinAngLamanNgDeduction();
                  disableDed_Button();
                  DefaultTableModel mod = (DefaultTableModel)jtbl_deductions.getModel();
                    mod.setRowCount(0);
                    showDeductions();
            } else {
                JOptionPane.showMessageDialog(this,"Error");
            }
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
                  disablePos_Button();
                  DefaultTableModel mod = (DefaultTableModel)jtblPos_Rate.getModel();
                    mod.setRowCount(0);
                 showPositionAndRates();
            } else {
                JOptionPane.showMessageDialog(this,"Error");
            }
            
     }
     
      public void updatePositions(int ids) throws SQLException{
          
           int rows = jtblPos_Rate.getRowCount();
      int checker = 0;
      for (int rowNum=0; rowNum<rows; ++rowNum){
          String pos = String.valueOf(jtblPos_Rate.getValueAt(rowNum,1));
          if(jtxtPosition.getText().equalsIgnoreCase(pos)){
              checker = 1;
              break;
          }
      }
      if(checker==1){
          JOptionPane.showMessageDialog(this,"Position already assigned");
      }
      else if(jtxtPosition.getText().isBlank() || jtxt_Rates.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Empty");
      }
      
      else{
        String updateEmployee = "UPDATE `positions` SET `POS_DESCRIPTION`=?, `RATE_PRICE`=? WHERE ID = ?";
        PreparedStatement st = conn.prepareStatement(updateEmployee);
        st.setString(1, jtxtPosition.getText());
        st.setDouble(2, Double.parseDouble(jtxt_Rates.getText()));
        st.setInt(3, ids);

            int i = st.executeUpdate();
            if (i > 0) {
                  JOptionPane.showMessageDialog(this,"Successfully Update");
                  tanggalinAngLamanNgPosition();
                  disablePos_Button();
                  DefaultTableModel mod = (DefaultTableModel)jtblPos_Rate.getModel();
                    mod.setRowCount(0);
                 showPositionAndRates();
            } else {
                JOptionPane.showMessageDialog(this,"Error");
            }
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
                  disableDed_Button();
                  DefaultTableModel mod = (DefaultTableModel)jtbl_deductions.getModel();
                    mod.setRowCount(0);
                 showDeductions();
            } else {
                JOptionPane.showMessageDialog(this,"Error");
            }
            
     }
     
      public void disabdleDeduc_Button(){
         jbtnDeduc_Add.setEnabled(false);
         jbtnDeduc_Update.setEnabled(true);
         jbtnDeduc_Delete.setEnabled(true);
         jbtnDeduc_Cancel.setEnabled(true);
     }
     
     public void disableDed_Button(){
         jbtnDeduc_Add.setEnabled(true);
         jbtnDeduc_Update.setEnabled(false);
         jbtnDeduc_Delete.setEnabled(false);
         jbtnDeduc_Cancel.setEnabled(false);
     }
     
     public void disablePosition_Button(){
         jbtnPos_Add.setEnabled(false);
         jbtnPos_Update.setEnabled(true);
         jbtnPos_Delete.setEnabled(true);
         jbtnPos_Cancel.setEnabled(true);
     }
     
     public void disablePos_Button(){
         jbtnPos_Add.setEnabled(true);
         jbtnPos_Update.setEnabled(false);
         jbtnPos_Delete.setEnabled(false);
         jbtnPos_Cancel.setEnabled(false);
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
    private javax.swing.JButton jbtnDeduc_Add;
    private javax.swing.JButton jbtnDeduc_Cancel;
    private javax.swing.JButton jbtnDeduc_Delete;
    private javax.swing.JButton jbtnDeduc_Update;
    private javax.swing.JButton jbtnPos_Add;
    private javax.swing.JButton jbtnPos_Cancel;
    private javax.swing.JButton jbtnPos_Delete;
    private javax.swing.JButton jbtnPos_Update;
    private javax.swing.JButton jbtn_x;
    private javax.swing.JTable jtblPos_Rate;
    private javax.swing.JTable jtbl_deductions;
    private javax.swing.JTextField jtxtDeductdesc;
    private javax.swing.JTextField jtxtDeductionRates;
    private javax.swing.JTextField jtxtPosition;
    private javax.swing.JTextField jtxt_Rates;
    // End of variables declaration//GEN-END:variables
}
