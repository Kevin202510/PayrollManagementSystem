/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;

/**
 *
 * @author acer
 */
public class PrintId extends javax.swing.JPanel {

    /**
     * Creates new form PrintId
     */
    public PrintId() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_Idtitle = new javax.swing.JLabel();
        jlbl_barcode = new javax.swing.JLabel();
        jlbl_name = new javax.swing.JLabel();
        jlbl_setName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jlbl_Position = new javax.swing.JLabel();
        jlbl_pic = new javax.swing.JLabel();

        setBackground(new java.awt.Color(248, 210, 160));
        setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_Idtitle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlbl_Idtitle.setForeground(new java.awt.Color(0, 106, 78));
        jlbl_Idtitle.setText("HNR SHOPPING CENTER");
        add(jlbl_Idtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jlbl_barcode.setText("BARCODE");
        add(jlbl_barcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 380, 30));

        jlbl_name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlbl_name.setText("NAME");
        add(jlbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 90, 20));

        jlbl_setName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlbl_setName.setText("get name");
        add(jlbl_setName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, -1));

        jPanel1.setBackground(new java.awt.Color(255, 10, 10));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jlbl_Position.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jlbl_Position.setText("POSITION");

        jlbl_pic.setText("2x2 pic");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbl_Position, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(jlbl_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbl_pic, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jlbl_Position))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlbl_Idtitle;
    private javax.swing.JLabel jlbl_Position;
    private javax.swing.JLabel jlbl_barcode;
    private javax.swing.JLabel jlbl_name;
    private javax.swing.JLabel jlbl_pic;
    private javax.swing.JLabel jlbl_setName;
    // End of variables declaration//GEN-END:variables
}
