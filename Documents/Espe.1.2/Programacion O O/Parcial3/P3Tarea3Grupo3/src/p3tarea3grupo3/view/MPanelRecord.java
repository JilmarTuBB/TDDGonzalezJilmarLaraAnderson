
package p3tarea3grupo3.view;

import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableCellRenderer;

public class MPanelRecord extends javax.swing.JPanel {
    DefaultTableModel tableModel;

    /**
     * Creates new form PanelRecord
     */
    public MPanelRecord() {
        initComponents();
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Fecha");
        tableModel.addColumn("Tipo de Transaccion");
        tableModel.addColumn("Monto");
        tableModel.addColumn("Descripcion");
        tableRecordMovements.setModel(tableModel);
        customizeTableHeader();
        tableRecordMovements.setShowVerticalLines(false);
        tableRecordMovements.setShowHorizontalLines(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlRecordMovements = new ComponentRoundJilmar.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRecordMovements = new javax.swing.JTable();
        labelRound1 = new ComponentRoundJilmar.LabelRound();
        lblWallpaper = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setOpaque(false);
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("HISTORIAL DE MOVIMIENTOS");
        pnlContent.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        pnlRecordMovements.setBackground(new java.awt.Color(204, 204, 255));
        pnlRecordMovements.setRoundBottomLeft(20);
        pnlRecordMovements.setRoundBottomRight(20);
        pnlRecordMovements.setRoundTopLeft(20);
        pnlRecordMovements.setRoundTopRight(20);
        pnlRecordMovements.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de Transacción:");
        pnlRecordMovements.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Todas", "Retiros", "Depositos", "Transferencia", " " }));
        pnlRecordMovements.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 230, 30));

        tableRecordMovements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableRecordMovements);

        pnlRecordMovements.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 600, 380));

        labelRound1.setBackground(new java.awt.Color(204, 0, 255));
        labelRound1.setForeground(new java.awt.Color(255, 255, 255));
        labelRound1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRound1.setText("Buscar");
        labelRound1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelRound1.setRoundBottomLeft(25);
        labelRound1.setRoundBottomRight(25);
        labelRound1.setRoundTopLeft(25);
        labelRound1.setRoundTopRight(25);
        pnlRecordMovements.add(labelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 90, 30));

        pnlContent.add(pnlRecordMovements, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 620, 510));

        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 670));

        lblWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3tarea3grupo3/image/wallpaper.png"))); // NOI18N
        add(lblWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void customizeTableHeader() {
        tableRecordMovements.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                java.awt.Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(javax.swing.JLabel.CENTER);
                setFont(getFont().deriveFont(Font.BOLD));
                component.setBackground(new Color(204, 51, 255)); // Cambia el color de fondo de la fila de títulos
                component.setForeground(Color.WHITE); // Cambia el color del texto en la fila de títulos
                return component;
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private ComponentRoundJilmar.LabelRound labelRound1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWallpaper;
    private javax.swing.JPanel pnlContent;
    private ComponentRoundJilmar.PanelRound pnlRecordMovements;
    private javax.swing.JTable tableRecordMovements;
    // End of variables declaration//GEN-END:variables
}
