/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wazaa;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import FiveCodMover.FiveCodMoverJFrame;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.LookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author mainpc
 */
public class HistorialBtn extends javax.swing.JFrame {

    /**
     * Creates new form HistorialBtn
     */
    public HistorialBtn() {
        lookaf();
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static void lookaf(){
    
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
    
    public static void lookaf(String cn){
    
        try {
            UIManager.setLookAndFeel(cn);
            
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
    
    public static void lookaf(LookAndFeel clas){
    
        try {
            UIManager.setLookAndFeel(clas);
            
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Historial");
        setUndecorated(true);
        setResizable(false);

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        txtarea.setEditable(false);
        txtarea.setColumns(20);
        txtarea.setRows(5);
        txtarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtareaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtarea);

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Historial");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(jButton1))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtareaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtareaMousePressed
        
    }//GEN-LAST:event_txtareaMousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_jPanel1MousePressed

    //Connect con = new Connect();
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        if (txtarea.getText().equals("")){
            
            ImageIcon iconi = new ImageIcon("recursos/intsing.png");
            JOptionPane.showMessageDialog(null, "Nada que limpiar", "Mensaje", JOptionPane.PLAIN_MESSAGE, iconi);
            
        } else {
            
            int resul = JOptionPane.showConfirmDialog(null, "Estás seguro que quieres borrar el historial?", 
                    "advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (resul == 0) {Connect.limpiar(); txtarea.setText(""); System.out.println("borrado");}
            if (resul == 1) System.out.println("no borrado");
            if (resul == 2) System.out.println("cancelado");
        }
//        Connect.limpiar();
//        txtarea.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
    MAcceso mac = new MAcceso();
    
    public void setLookAndFeel(int id){
        
        String cntema = "";

        if (id == 0) cntema = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        if (id == 1) cntema = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        if (id == 2) cntema = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
        if (id == 3) lookaf(new FlatLightLaf());
        if (id == 4) lookaf(new FlatDarkLaf());

        // maintema = cntema;

        if (cntema.equals("")){} else {
            try{
                lookaf(cntema);
                System.out.println("aqui" + id);
            } catch(Exception e){
                System.out.println(e);
            }
        }
        
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    public void update(String t){
        txtarea.setText(t);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialBtn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
