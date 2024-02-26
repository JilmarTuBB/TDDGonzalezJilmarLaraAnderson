
package p3tarea3grupo3.view;

import java.awt.Color;


/**
 *
 * @author EFRAIN
 */
public class MPanelDeposit extends javax.swing.JPanel {

    /**
     * Creates new form Transfers
     */
    public MPanelDeposit() {
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

        pnlOne = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelRound1 = new ComponentRoundJilmar.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRound2 = new ComponentRoundJilmar.PanelRound();
        jTextField2 = new javax.swing.JTextField();
        panelRound4 = new ComponentRoundJilmar.PanelRound();
        jTextField3 = new javax.swing.JTextField();
        panelRound5 = new ComponentRoundJilmar.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnConfirmTransfer = new ComponentRoundJilmar.PanelRound();
        jLabel12 = new javax.swing.JLabel();
        lbFound = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlOne.setBackground(new java.awt.Color(255, 255, 255));
        pnlOne.setOpaque(false);
        pnlOne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese el monto a depositar");
        pnlOne.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese una Descripción");
        pnlOne.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        panelRound1.setBackground(new Color(255, 255, 255, 123));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Depósitos");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 281, 54));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/return.png"))); // NOI18N
        panelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 0, -1, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/nextOne.png"))); // NOI18N
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -2, 40, 60));

        pnlOne.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 620, 60));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setPreferredSize(new java.awt.Dimension(320, 54));
        panelRound2.setRoundBottomLeft(30);
        panelRound2.setRoundBottomRight(30);
        panelRound2.setRoundTopLeft(30);
        panelRound2.setRoundTopRight(30);

        jTextField2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jTextField2.setText("$");
        jTextField2.setBorder(null);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlOne.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 390, 70));

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setPreferredSize(new java.awt.Dimension(320, 54));
        panelRound4.setRoundBottomLeft(30);
        panelRound4.setRoundBottomRight(30);
        panelRound4.setRoundTopLeft(30);
        panelRound4.setRoundTopRight(30);

        jTextField3.setBorder(null);

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3)
                .addContainerGap())
        );

        pnlOne.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 380, 40));

        panelRound5.setBackground(new Color(255, 255, 255, 123));
        panelRound5.setRoundBottomLeft(30);
        panelRound5.setRoundBottomRight(30);
        panelRound5.setRoundTopLeft(30);
        panelRound5.setRoundTopRight(30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nro. 2200440110 ");

        jLabel7.setBackground(new java.awt.Color(51, 0, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 153));
        jLabel7.setText("CAMILA MAYTE PERRAZO GUERRA");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Para");

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlOne.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 380, -1));

        btnConfirmTransfer.setBackground(new java.awt.Color(51, 0, 102));
        btnConfirmTransfer.setPreferredSize(new java.awt.Dimension(100, 54));
        btnConfirmTransfer.setRoundBottomLeft(30);
        btnConfirmTransfer.setRoundBottomRight(30);
        btnConfirmTransfer.setRoundTopLeft(30);
        btnConfirmTransfer.setRoundTopRight(30);
        btnConfirmTransfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfirmTransferMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfirmTransferMouseExited(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Confirmar Depósito");

        javax.swing.GroupLayout btnConfirmTransferLayout = new javax.swing.GroupLayout(btnConfirmTransfer);
        btnConfirmTransfer.setLayout(btnConfirmTransferLayout);
        btnConfirmTransferLayout.setHorizontalGroup(
            btnConfirmTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfirmTransferLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        btnConfirmTransferLayout.setVerticalGroup(
            btnConfirmTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlOne.add(btnConfirmTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 190, 40));

        lbFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/found.png"))); // NOI18N
        pnlOne.add(lbFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 500));

        add(pnlOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 670));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/wallpaper.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmTransferMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmTransferMouseEntered
        // TODO add your handling code here:
       btnConfirmTransfer.setBackground(new Color(105,0,64));
       btnConfirmTransfer.repaint();
        
    }//GEN-LAST:event_btnConfirmTransferMouseEntered

    private void btnConfirmTransferMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmTransferMouseExited
        // TODO add your handling code here:
       btnConfirmTransfer.setBackground(new Color(51,0,102));
       btnConfirmTransfer.repaint();
    }//GEN-LAST:event_btnConfirmTransferMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ComponentRoundJilmar.PanelRound btnConfirmTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbFound;
    private ComponentRoundJilmar.PanelRound panelRound1;
    private ComponentRoundJilmar.PanelRound panelRound2;
    private ComponentRoundJilmar.PanelRound panelRound4;
    private ComponentRoundJilmar.PanelRound panelRound5;
    private javax.swing.JPanel pnlOne;
    // End of variables declaration//GEN-END:variables
}