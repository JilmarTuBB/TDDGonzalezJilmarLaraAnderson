
package p3tarea3grupo3.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JPanel;


public class LPanelPin extends javax.swing.JPanel {

     private LoginWindows windows;
    
    public LPanelPin() {
        initComponents();
        this.setVisible(true);
        ActionMouse(pnlNumbers);
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
        jPasswordField1 = new javax.swing.JPasswordField();
        pnlNumbers = new javax.swing.JPanel();
        num5 = new ComponentRoundJilmar.LabelRound();
        num1 = new ComponentRoundJilmar.LabelRound();
        num2 = new ComponentRoundJilmar.LabelRound();
        num4 = new ComponentRoundJilmar.LabelRound();
        num3 = new ComponentRoundJilmar.LabelRound();
        num6 = new ComponentRoundJilmar.LabelRound();
        num8 = new ComponentRoundJilmar.LabelRound();
        num7 = new ComponentRoundJilmar.LabelRound();
        num0 = new ComponentRoundJilmar.LabelRound();
        num9 = new ComponentRoundJilmar.LabelRound();
        labelRound12 = new ComponentRoundJilmar.LabelRound();
        btnEnter = new ComponentRoundJilmar.LabelRound();
        lblPin = new javax.swing.JLabel();
        lblWallpaper = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlWallpaper.setOpaque(false);
        pnlWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Banca Virtual");
        pnlWallpaper.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 240, 60));

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setText("175259");
        jPasswordField1.setBorder(null);
        jPasswordField1.setOpaque(false);
        pnlWallpaper.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 250, 90));

        pnlNumbers.setOpaque(false);
        pnlNumbers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        num5.setBackground(new java.awt.Color(255, 255, 255));
        num5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num5.setText("5");
        num5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num5.setRoundBottomLeft(70);
        num5.setRoundBottomRight(70);
        num5.setRoundTopLeft(70);
        num5.setRoundTopRight(70);
        pnlNumbers.add(num5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 70, 70));

        num1.setBackground(new java.awt.Color(255, 255, 255));
        num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num1.setText("1");
        num1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num1.setRoundBottomLeft(70);
        num1.setRoundBottomRight(70);
        num1.setRoundTopLeft(70);
        num1.setRoundTopRight(70);
        pnlNumbers.add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 70, 70));

        num2.setBackground(new java.awt.Color(255, 255, 255));
        num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num2.setText("2");
        num2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num2.setRoundBottomLeft(70);
        num2.setRoundBottomRight(70);
        num2.setRoundTopLeft(70);
        num2.setRoundTopRight(70);
        pnlNumbers.add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 70, 70));

        num4.setBackground(new java.awt.Color(255, 255, 255));
        num4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num4.setText("4");
        num4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num4.setRoundBottomLeft(70);
        num4.setRoundBottomRight(70);
        num4.setRoundTopLeft(70);
        num4.setRoundTopRight(70);
        pnlNumbers.add(num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 70, 70));

        num3.setBackground(new java.awt.Color(255, 255, 255));
        num3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num3.setText("3");
        num3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num3.setRoundBottomLeft(70);
        num3.setRoundBottomRight(70);
        num3.setRoundTopLeft(70);
        num3.setRoundTopRight(70);
        pnlNumbers.add(num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 70, 70));

        num6.setBackground(new java.awt.Color(255, 255, 255));
        num6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num6.setText("6");
        num6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num6.setRoundBottomLeft(70);
        num6.setRoundBottomRight(70);
        num6.setRoundTopLeft(70);
        num6.setRoundTopRight(70);
        pnlNumbers.add(num6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 70, 70));

        num8.setBackground(new java.awt.Color(255, 255, 255));
        num8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num8.setText("8");
        num8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num8.setRoundBottomLeft(70);
        num8.setRoundBottomRight(70);
        num8.setRoundTopLeft(70);
        num8.setRoundTopRight(70);
        pnlNumbers.add(num8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 70, 70));

        num7.setBackground(new java.awt.Color(255, 255, 255));
        num7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num7.setText("7");
        num7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num7.setRoundBottomLeft(70);
        num7.setRoundBottomRight(70);
        num7.setRoundTopLeft(70);
        num7.setRoundTopRight(70);
        pnlNumbers.add(num7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 70, 70));

        num0.setBackground(new java.awt.Color(255, 255, 255));
        num0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num0.setText("0");
        num0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num0.setRoundBottomLeft(70);
        num0.setRoundBottomRight(70);
        num0.setRoundTopLeft(70);
        num0.setRoundTopRight(70);
        pnlNumbers.add(num0, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 70, 70));

        num9.setBackground(new java.awt.Color(255, 255, 255));
        num9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num9.setText("9");
        num9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num9.setRoundBottomLeft(70);
        num9.setRoundBottomRight(70);
        num9.setRoundTopLeft(70);
        num9.setRoundTopRight(70);
        pnlNumbers.add(num9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 70, 70));

        pnlWallpaper.add(pnlNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 470, 380));

        labelRound12.setBackground(new java.awt.Color(255, 255, 255));
        labelRound12.setRoundBottomLeft(60);
        labelRound12.setRoundBottomRight(60);
        labelRound12.setRoundTopLeft(60);
        labelRound12.setRoundTopRight(60);
        pnlWallpaper.add(labelRound12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 210, 60));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnterMouseExited(evt);
            }
        });
        pnlWallpaper.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 130, 40));

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
        pnlWallpaper.add(lblPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, -1, -1));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ComponentRoundJilmar.LabelRound btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private ComponentRoundJilmar.LabelRound labelRound12;
    private javax.swing.JLabel lblPin;
    private javax.swing.JLabel lblWallpaper;
    private ComponentRoundJilmar.LabelRound num0;
    private ComponentRoundJilmar.LabelRound num1;
    private ComponentRoundJilmar.LabelRound num2;
    private ComponentRoundJilmar.LabelRound num3;
    private ComponentRoundJilmar.LabelRound num4;
    private ComponentRoundJilmar.LabelRound num5;
    private ComponentRoundJilmar.LabelRound num6;
    private ComponentRoundJilmar.LabelRound num7;
    private ComponentRoundJilmar.LabelRound num8;
    private ComponentRoundJilmar.LabelRound num9;
    private javax.swing.JPanel pnlNumbers;
    private javax.swing.JPanel pnlWallpaper;
    // End of variables declaration//GEN-END:variables

    
    
    private static void ActionMouse(JPanel panel) {
        Component[] components = panel.getComponents();
        for (Component component : components) {
            if (component instanceof JComponent) {
                JComponent jComponent = (JComponent) component;
                jComponent.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        jComponent.setBackground(Color.black);
                        jComponent.setForeground(Color.white);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        jComponent.setBackground(Color.white);
                        jComponent.setForeground(Color.black);
                    }
                });
            }
        }
    }

    
}