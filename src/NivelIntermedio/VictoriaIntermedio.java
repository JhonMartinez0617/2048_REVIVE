
package NivelIntermedio;

import NivelIntermedio.GuardarPuntuacionIntermedio;
import NivelIntermedio.JuegoIntermedio;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author hp
 */
public class VictoriaIntermedio extends javax.swing.JFrame {

    JuegoIntermedio jintermedio;
    public int puntuacionnIn;
    
    public VictoriaIntermedio() {
        initComponents();
        this.setLocationRelativeTo(null);
        jintermedio= new JuegoIntermedio();
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/FondosTotales/Fondos/image_icon.png")).getImage());
    }
    
public void mostrarPuntuacion(int puntuacion) {
         puntuacionnIn= puntuacion;
        JLabel puntuacionLabel = new JLabel("Puntuación: " + puntuacion);
        puntuacionLabel.setFont(new Font("Pristina", Font.PLAIN, 35));
        Color textopuntuacion = new Color(244, 245, 247);
        puntuacionLabel.setForeground(textopuntuacion);

        PuntuacionPanel.add(puntuacionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 170, 40));
        PuntuacionPanel.revalidate();
        PuntuacionPanel.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PuntuacionPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PuntuacionPanel.setBackground(new java.awt.Color(102, 204, 0));
        getContentPane().add(PuntuacionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 240, 50));

        jButton2.setBackground(new java.awt.Color(237, 170, 91));
        jButton2.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 533, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosTotales/Fondos/victoria (2).gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GuardarPuntuacionIntermedio redirigir= new GuardarPuntuacionIntermedio();
        redirigir.setVisible(true);
        redirigir.mostrarPuntuacionguardar(puntuacionnIn);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VictoriaIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VictoriaIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VictoriaIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VictoriaIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VictoriaIntermedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PuntuacionPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
