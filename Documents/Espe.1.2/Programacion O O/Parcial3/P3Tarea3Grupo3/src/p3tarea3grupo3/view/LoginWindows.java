
package p3tarea3grupo3.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class LoginWindows extends javax.swing.JFrame {

    private LPanelWelcome pnlWelcome;
    private int initX, initY;
    
    public LoginWindows() {
        initComponents();
        
        pnlWelcome = new LPanelWelcome(this);
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        PnlLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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

        PnlLogo.setBackground(new java.awt.Color(255, 255, 255));
        PnlLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/LogoBlack.png"))); // NOI18N
        PnlLogo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 90, 480, 480));

        getContentPane().add(PnlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 560, 670));

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       //showPanel(pnlWelcome);
       showPanel(new LPanelUser());
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
            java.util.logging.Logger.getLogger(LoginWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new LoginWindows().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlActions;
    private javax.swing.JPanel PnlContainer;
    private javax.swing.JPanel PnlLogo;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMinimeze;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblIcon;
    // End of variables declaration//GEN-END:variables

    //Metodo para establecer los paneles que estan por fuera de JFrame
    
    public void showPanel(JPanel p){
        p.setSize(660, 670);
        p.setLocation(0, 0);       
        PnlContainer.removeAll();
        PnlContainer.add(p,BorderLayout.CENTER);
        PnlContainer.revalidate();
        PnlContainer.repaint();
    }
}
