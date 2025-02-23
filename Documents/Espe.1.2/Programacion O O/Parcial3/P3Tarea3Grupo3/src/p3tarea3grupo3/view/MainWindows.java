
package p3tarea3grupo3.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import p3tarea3grupo3.controller.Account;

public class MainWindows extends javax.swing.JFrame {

    private int initX, initY;
    private MPanelOptions options;
    Account userBank;
    
    /*public MainWindows() {
        initComponents();
        
        options = new MPanelOptions(this);
        
        this.setLocationRelativeTo(null);
    }*/
    
    public MainWindows(Account account) {
        initComponents();
        
        this.userBank = account;
        System.out.println("Entro a main " + account.getTitular());
        options = new MPanelOptions(this, userBank);
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlActions = new javax.swing.JPanel();
        btnMinimeze = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PnlMain = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        panelRound1 = new ComponentRoundJilmar.PanelRound();
        lblTitlleTypeAccount = new javax.swing.JLabel();
        lblTitleAvailableBalance = new javax.swing.JLabel();
        lblNotVisible = new javax.swing.JLabel();
        lblAvailableBalance = new javax.swing.JLabel();
        lblTypeAccount = new javax.swing.JLabel();
        lblTitleNumberAccount = new javax.swing.JLabel();
        lblNumberAccount = new javax.swing.JLabel();
        lblVisible = new javax.swing.JLabel();
        lblDolar = new javax.swing.JLabel();
        PnlContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlActions.setBackground(new java.awt.Color(0, 0, 0));
        PnlActions.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PnlActionsMouseDragged(evt);
            }
        });
        PnlActions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PnlActionsMouseEntered(evt);
            }
        });
        PnlActions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimeze.setBackground(new java.awt.Color(0, 0, 0));
        btnMinimeze.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMinimeze.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimeze.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimeze.setText("-");
        btnMinimeze.setOpaque(true);
        btnMinimeze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimezeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimezeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimezeMouseExited(evt);
            }
        });
        PnlActions.add(btnMinimeze, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 50, 30));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setOpaque(true);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        PnlActions.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 50, 30));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/Icon.png"))); // NOI18N
        lblIcon.setText("jLabel2");
        PnlActions.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MayLiJi");
        PnlActions.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 60, 30));

        getContentPane().add(PnlActions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 30));

        PnlMain.setBackground(new java.awt.Color(255, 255, 255));
        PnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/Iconlogo.png"))); // NOI18N
        PnlMain.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 480, 170));

        lblUser.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("BIENVENIDO/A CAMILA MAYTE PERRAZO GUERRA");
        PnlMain.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 560, 60));

        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitlleTypeAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitlleTypeAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitlleTypeAccount.setText("TIPO DE CUENTA ");
        panelRound1.add(lblTitlleTypeAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblTitleAvailableBalance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitleAvailableBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleAvailableBalance.setText("SALDO DISPONIBLE");
        panelRound1.add(lblTitleAvailableBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        lblNotVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/notVisible1.png"))); // NOI18N
        lblNotVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotVisibleMouseClicked(evt);
            }
        });
        panelRound1.add(lblNotVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, 30));

        lblAvailableBalance.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblAvailableBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvailableBalance.setText("1000.00");
        panelRound1.add(lblAvailableBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        lblTypeAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTypeAccount.setText("CTA. AHORROS");
        panelRound1.add(lblTypeAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 20));

        lblTitleNumberAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitleNumberAccount.setText("Nro. CUENTA");
        panelRound1.add(lblTitleNumberAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lblNumberAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumberAccount.setText("222222XXXX");
        panelRound1.add(lblNumberAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        lblVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/visible1.png"))); // NOI18N
        lblVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVisibleMouseClicked(evt);
            }
        });
        panelRound1.add(lblVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, 30));

        lblDolar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblDolar.setText("$");
        panelRound1.add(lblDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 40));

        PnlMain.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 490, 120));

        getContentPane().add(PnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 560, 670));

        PnlContainer.setPreferredSize(new java.awt.Dimension(660, 670));

        javax.swing.GroupLayout PnlContainerLayout = new javax.swing.GroupLayout(PnlContainer);
        PnlContainer.setLayout(PnlContainerLayout);
        PnlContainerLayout.setHorizontalGroup(
            PnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        PnlContainerLayout.setVerticalGroup(
            PnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        getContentPane().add(PnlContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(Color.red);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(Color.black);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnMinimezeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimezeMouseClicked
         this.setExtendedState(1);
    }//GEN-LAST:event_btnMinimezeMouseClicked

    private void btnMinimezeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimezeMouseEntered
        btnMinimeze.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_btnMinimezeMouseEntered

    private void btnMinimezeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimezeMouseExited
        btnMinimeze.setBackground(Color.black);
    }//GEN-LAST:event_btnMinimezeMouseExited

    private void PnlActionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlActionsMouseEntered
        initX = evt.getX();
        initY = evt.getY();
    }//GEN-LAST:event_PnlActionsMouseEntered

    private void PnlActionsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlActionsMouseDragged
        int newX  = getLocation().x + evt.getX() - initX;
        int newY = getLocation().y + evt.getY() - initY;

        this.setLocation(newX, newY);
    }//GEN-LAST:event_PnlActionsMouseDragged

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void lblVisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVisibleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVisibleMouseClicked

    private void lblNotVisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotVisibleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNotVisibleMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showPanel(options);
        setDates();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindows(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlActions;
    private javax.swing.JPanel PnlContainer;
    private javax.swing.JPanel PnlMain;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMinimeze;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAvailableBalance;
    private javax.swing.JLabel lblDolar;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNotVisible;
    private javax.swing.JLabel lblNumberAccount;
    private javax.swing.JLabel lblTitleAvailableBalance;
    private javax.swing.JLabel lblTitleNumberAccount;
    private javax.swing.JLabel lblTitlleTypeAccount;
    private javax.swing.JLabel lblTypeAccount;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblVisible;
    private ComponentRoundJilmar.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables

    public void showPanel(JPanel p){
        p.setSize(660, 670);
        p.setLocation(0, 0);       
        PnlContainer.removeAll();
        PnlContainer.add(p,BorderLayout.CENTER);
        PnlContainer.revalidate();
        PnlContainer.repaint();
    }
    
    public void setDates() {
        lblUser.setText("BIENVENIDO/A " + userBank.getTitular().toUpperCase());
        lblNumberAccount.setText(userBank.getAccountNumber());
        if(userBank.getBalance() > 1000) {
            lblAvailableBalance.setFont(new Font("Segoe",1,18));
            lblAvailableBalance.setText(String.valueOf(userBank.getBalance()));
        }else{
            lblAvailableBalance.setText(String.valueOf(userBank.getBalance()));      
        }
    }
    
}
