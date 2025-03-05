
package NivelFacil;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class JuegoPerdidoFacil extends javax.swing.JFrame {

    
    JuegoFacil jfacil;
    public int puntuacionn;
    
    public JuegoPerdidoFacil() {
        initComponents();
        jfacil=new JuegoFacil();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/FondosTotales/Fondos/image_icon.png")).getImage());
    }

     public void mostrarPuntuacion(int puntuacion) {
         puntuacionn= puntuacion;
        JLabel puntuacionLabel = new JLabel("Puntuación: " + puntuacion);
        puntuacionLabel.setFont(new Font("Pristina", Font.PLAIN, 25));
        Color textopuntuacion = new Color(244, 245, 247);
        puntuacionLabel.setForeground(textopuntuacion);

        PuntuacionPanel.add(puntuacionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 170, 40));
        PuntuacionPanel.revalidate();
        PuntuacionPanel.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PuntuacionPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(237, 170, 91));
        jButton1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALIR");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosTotales/Fondos/Perdida.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 610, 610));
        getContentPane().add(PuntuacionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 300, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       GuardarPuntuacion perdio= new GuardarPuntuacion();
       perdio.setVisible(true);
 perdio.mostrarPuntuacionguardarperdio(puntuacionn);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegoPerdidoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoPerdidoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoPerdidoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoPerdidoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoPerdidoFacil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PuntuacionPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
