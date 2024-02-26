/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package p3tarea3grupo3.view;

import java.awt.Color;

public class MPanelOptions extends javax.swing.JPanel {

    MainWindows windows;
    
    public MPanelOptions(MainWindows windows) {
        initComponents();
        this.windows = windows;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUpdataData = new ComponentRoundJilmar.PanelRound();
        lblIconUpdataData = new javax.swing.JLabel();
        lblTitleUpdataData = new javax.swing.JLabel();
        btnDeposit = new ComponentRoundJilmar.PanelRound();
        lblIconDeposit = new javax.swing.JLabel();
        lblTitleDeposit = new javax.swing.JLabel();
        btnWithDrawal = new ComponentRoundJilmar.PanelRound();
        lblIconWithDrawal = new javax.swing.JLabel();
        lblTitleWithDrawal = new javax.swing.JLabel();
        btnQueryMovements = new ComponentRoundJilmar.PanelRound();
        lblIconQueryMovements = new javax.swing.JLabel();
        lblTitleQueryMovements = new javax.swing.JLabel();
        btnTransfer = new ComponentRoundJilmar.PanelRound();
        lblIconTransfer = new javax.swing.JLabel();
        lblTitleTransfer = new javax.swing.JLabel();
        lblWallpaper = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdataData.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdataData.setMinimumSize(new java.awt.Dimension(109, 109));
        btnUpdataData.setRoundBottomLeft(50);
        btnUpdataData.setRoundBottomRight(50);
        btnUpdataData.setRoundTopLeft(50);
        btnUpdataData.setRoundTopRight(50);
        btnUpdataData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdataDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdataDataMouseExited(evt);
            }
        });
        btnUpdataData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconUpdataData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconUpdataData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/UpdateData.png"))); // NOI18N
        lblIconUpdataData.setToolTipText("");
        btnUpdataData.add(lblIconUpdataData, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lblTitleUpdataData.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblTitleUpdataData.setForeground(new java.awt.Color(204, 153, 255));
        lblTitleUpdataData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleUpdataData.setText("Actualizar Datos");
        btnUpdataData.add(lblTitleUpdataData, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 90, 170, -1));

        jPanel1.add(btnUpdataData, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 170, 130));

        btnDeposit.setBackground(new java.awt.Color(102, 102, 102));
        btnDeposit.setRoundBottomLeft(50);
        btnDeposit.setRoundBottomRight(50);
        btnDeposit.setRoundTopLeft(50);
        btnDeposit.setRoundTopRight(50);
        btnDeposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepositMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepositMouseExited(evt);
            }
        });
        btnDeposit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconDeposit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconDeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/Deposit.png"))); // NOI18N
        btnDeposit.add(lblIconDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lblTitleDeposit.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblTitleDeposit.setForeground(new java.awt.Color(204, 153, 255));
        lblTitleDeposit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleDeposit.setText("Depósito");
        btnDeposit.add(lblTitleDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 170, -1));

        jPanel1.add(btnDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 170, 130));

        btnWithDrawal.setBackground(new java.awt.Color(102, 102, 102));
        btnWithDrawal.setRoundBottomLeft(50);
        btnWithDrawal.setRoundBottomRight(50);
        btnWithDrawal.setRoundTopLeft(50);
        btnWithDrawal.setRoundTopRight(50);
        btnWithDrawal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWithDrawalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnWithDrawalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnWithDrawalMouseExited(evt);
            }
        });
        btnWithDrawal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconWithDrawal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconWithDrawal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/WithDrawal.png"))); // NOI18N
        btnWithDrawal.add(lblIconWithDrawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lblTitleWithDrawal.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblTitleWithDrawal.setForeground(new java.awt.Color(204, 153, 255));
        lblTitleWithDrawal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleWithDrawal.setText("Retiro");
        btnWithDrawal.add(lblTitleWithDrawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 170, -1));

        jPanel1.add(btnWithDrawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 170, 130));

        btnQueryMovements.setBackground(new java.awt.Color(102, 102, 102));
        btnQueryMovements.setMinimumSize(new java.awt.Dimension(109, 109));
        btnQueryMovements.setRoundBottomLeft(50);
        btnQueryMovements.setRoundBottomRight(50);
        btnQueryMovements.setRoundTopLeft(50);
        btnQueryMovements.setRoundTopRight(50);
        btnQueryMovements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQueryMovementsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQueryMovementsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQueryMovementsMouseExited(evt);
            }
        });
        btnQueryMovements.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconQueryMovements.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconQueryMovements.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/QueryMovements.png"))); // NOI18N
        btnQueryMovements.add(lblIconQueryMovements, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lblTitleQueryMovements.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblTitleQueryMovements.setForeground(new java.awt.Color(204, 153, 255));
        lblTitleQueryMovements.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleQueryMovements.setText("Consultar Movimientos");
        btnQueryMovements.add(lblTitleQueryMovements, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, -1));

        jPanel1.add(btnQueryMovements, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 180, 130));

        btnTransfer.setBackground(new java.awt.Color(102, 102, 102));
        btnTransfer.setRoundBottomLeft(50);
        btnTransfer.setRoundBottomRight(50);
        btnTransfer.setRoundTopLeft(50);
        btnTransfer.setRoundTopRight(50);
        btnTransfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransferMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTransferMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTransferMouseExited(evt);
            }
        });
        btnTransfer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconTransfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/Transfer.png"))); // NOI18N
        btnTransfer.add(lblIconTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lblTitleTransfer.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lblTitleTransfer.setForeground(new java.awt.Color(204, 153, 255));
        lblTitleTransfer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleTransfer.setText("Transferencia");
        btnTransfer.add(lblTitleTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 170, -1));

        jPanel1.add(btnTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, 130));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 670));

        lblWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/wallpaper.png"))); // NOI18N
        add(lblWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransferMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferMouseEntered
        btnTransfer.setBackground(new Color(0,0,0));
        lblTitleTransfer.setForeground(new Color(204, 153, 255));
    }//GEN-LAST:event_btnTransferMouseEntered

    private void btnTransferMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferMouseExited
        btnTransfer.setBackground(new Color(102, 102, 120));
        lblTitleTransfer.setForeground(new Color(204,153,255));
    }//GEN-LAST:event_btnTransferMouseExited

    private void btnWithDrawalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithDrawalMouseEntered
        btnWithDrawal.setBackground(new Color(0,0,0));
        lblTitleWithDrawal.setForeground(new Color(204, 153, 255));
    }//GEN-LAST:event_btnWithDrawalMouseEntered

    private void btnWithDrawalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithDrawalMouseExited
        btnWithDrawal.setBackground(new Color(102, 102, 120));
        lblTitleWithDrawal.setForeground(new Color(204,153,255));
    }//GEN-LAST:event_btnWithDrawalMouseExited

    private void btnDepositMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositMouseEntered
        btnDeposit.setBackground(new Color(0,0,0));
        lblTitleDeposit.setForeground(new Color(204, 153, 255));
    }//GEN-LAST:event_btnDepositMouseEntered

    private void btnDepositMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositMouseExited
        btnDeposit.setBackground(new Color(102, 102, 120));
        lblTitleTransfer.setForeground(new Color(204,153,255));
    }//GEN-LAST:event_btnDepositMouseExited

    private void btnUpdataDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdataDataMouseEntered
        btnUpdataData.setBackground(new Color(0,0,0));
        lblTitleUpdataData.setForeground(new Color(204, 153, 255));
    }//GEN-LAST:event_btnUpdataDataMouseEntered

    private void btnUpdataDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdataDataMouseExited
        btnUpdataData.setBackground(new Color(102, 102, 120));
        lblTitleUpdataData.setForeground(new Color(204,153,255));
    }//GEN-LAST:event_btnUpdataDataMouseExited

    private void btnQueryMovementsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQueryMovementsMouseEntered
        btnQueryMovements.setBackground(new Color(0,0,0));
        lblTitleQueryMovements.setForeground(new Color(204, 153, 255));
    }//GEN-LAST:event_btnQueryMovementsMouseEntered

    private void btnQueryMovementsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQueryMovementsMouseExited
        btnQueryMovements.setBackground(new Color(102, 102, 120));
        lblTitleQueryMovements.setForeground(new Color(204,153,255));
    }//GEN-LAST:event_btnQueryMovementsMouseExited

    private void btnTransferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferMouseClicked
        windows.showPanel(new MPanelTransfer());
    }//GEN-LAST:event_btnTransferMouseClicked

    private void btnWithDrawalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithDrawalMouseClicked
    }//GEN-LAST:event_btnWithDrawalMouseClicked

    private void btnQueryMovementsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQueryMovementsMouseClicked
        windows.showPanel(new MPanelRecord());
    }//GEN-LAST:event_btnQueryMovementsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ComponentRoundJilmar.PanelRound btnDeposit;
    private ComponentRoundJilmar.PanelRound btnQueryMovements;
    private ComponentRoundJilmar.PanelRound btnTransfer;
    private ComponentRoundJilmar.PanelRound btnUpdataData;
    private ComponentRoundJilmar.PanelRound btnWithDrawal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIconDeposit;
    private javax.swing.JLabel lblIconQueryMovements;
    private javax.swing.JLabel lblIconTransfer;
    private javax.swing.JLabel lblIconUpdataData;
    private javax.swing.JLabel lblIconWithDrawal;
    private javax.swing.JLabel lblTitleDeposit;
    private javax.swing.JLabel lblTitleQueryMovements;
    private javax.swing.JLabel lblTitleTransfer;
    private javax.swing.JLabel lblTitleUpdataData;
    private javax.swing.JLabel lblTitleWithDrawal;
    private javax.swing.JLabel lblWallpaper;
    // End of variables declaration//GEN-END:variables


    /*private static void ActionMouse(JPanel panel) {
        
        Component[] components = panel.getComponents();
        for (Component component : components) {
            if (component instanceof JComponent) {
                JComponent jComponent = (JComponent) component;
                jComponent.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        jComponent.setBackground(Color.black);
                        jComponent.setForeground(new Color(204,153,255));
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        jComponent.setBackground(new Color(102, 102, 120));
                        jComponent.setForeground(new Color(204,153,255));
                    }
                });
            }
        }
    }*/
    
}