
package p3tarea3grupo3.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import p3tarea3grupo3.controller.designpattern.decorater.Authenticate;
import p3tarea3grupo3.controller.designpattern.decorater.DecoratorAuthenticate;


public class LPanelPin1 extends javax.swing.JPanel {

    private LoginWindows windows;
    Authenticate authenticate;
    
    public LPanelPin1() {
        initComponents();
        
        authenticate = new DecoratorAuthenticate(authenticate); 
        
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

        pnlWallpaper = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPin = new javax.swing.JPasswordField();
        labelRound12 = new ComponentRoundJilmar.LabelRound();
        btnEnter = new ComponentRoundJilmar.LabelRound();
        lblPin = new javax.swing.JLabel();
        lblStar = new javax.swing.JLabel();
        lblWallpaper = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlWallpaper.setOpaque(false);
        pnlWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Banca Virtual");
        pnlWallpaper.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 230, 60));

        txtPin.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtPin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPin.setText("123456");
        txtPin.setBorder(null);
        txtPin.setOpaque(false);
        txtPin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPinMouseClicked(evt);
            }
        });
        pnlWallpaper.add(txtPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 360, 90));

        labelRound12.setBackground(new java.awt.Color(255, 255, 255));
        labelRound12.setRoundBottomLeft(60);
        labelRound12.setRoundBottomRight(60);
        labelRound12.setRoundTopLeft(60);
        labelRound12.setRoundTopRight(60);
        pnlWallpaper.add(labelRound12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 320, 60));

        btnEnter.setBackground(new java.awt.Color(0, 0, 0));
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEnter.setText("Ingresar");
        btnEnter.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEnter.setRoundBottomLeft(40);
        btnEnter.setRoundBottomRight(40);
        btnEnter.setRoundTopLeft(40);
        btnEnter.setRoundTopRight(40);
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnterMouseExited(evt);
            }
        });
        pnlWallpaper.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 130, 40));

        lblPin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPin.setText("Olvidaste tu PIN ?");
        lblPin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPinMouseExited(evt);
            }
        });
        pnlWallpaper.add(lblPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, -1, -1));

        lblStar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblStar.setForeground(new java.awt.Color(255, 255, 255));
        lblStar.setText("Ingrese su Pin");
        pnlWallpaper.add(lblStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 120, 50));

        add(pnlWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 670));

        lblWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/wallpaper.png"))); // NOI18N
        add(lblWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseEntered
        btnEnter.setBackground(Color.white);
        btnEnter.setForeground(Color.black);
    }//GEN-LAST:event_btnEnterMouseEntered

    private void btnEnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseExited
        btnEnter.setBackground(Color.black);
        btnEnter.setForeground(Color.white);
    }//GEN-LAST:event_btnEnterMouseExited

    private void lblPinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPinMouseEntered
        lblPin.setForeground(Color.red);
    }//GEN-LAST:event_lblPinMouseEntered

    private void lblPinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPinMouseExited
        lblPin.setForeground(Color.black);
    }//GEN-LAST:event_lblPinMouseExited

    private void btnEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseClicked
        String pin = String.valueOf(txtPin.getPassword());
        if(authenticate.getAuthenticate(pin, pin)) {
            System.out.println("Existe");
        }else{
            JOptionPane.showMessageDialog(this, "Pin Incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEnterMouseClicked

    private void txtPinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPinMouseClicked
        String pin = String.valueOf(txtPin.getPassword());
        if(pin.isEmpty() || pin.equals("123456")) {
            txtPin.setText("");
        }
    }//GEN-LAST:event_txtPinMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ComponentRoundJilmar.LabelRound btnEnter;
    private javax.swing.JLabel jLabel1;
    private ComponentRoundJilmar.LabelRound labelRound12;
    private javax.swing.JLabel lblPin;
    private javax.swing.JLabel lblStar;
    private javax.swing.JLabel lblWallpaper;
    private javax.swing.JPanel pnlWallpaper;
    private javax.swing.JPasswordField txtPin;
    // End of variables declaration//GEN-END:variables


    
}
