
package NivelFacil;

import EmpezarEjecucion.AccederAlJuego.MejoresPuntuaciones;
import static NivelFacil.GuardarPuntuacion.PuntuacionJugador;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class PuntuacionesFaciles extends javax.swing.JFrame {

  GuardarPuntuacion puntuacionguarda;
  

    public PuntuacionesFaciles() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        puntuacionguarda= new GuardarPuntuacion();
        GuardarPuntuacion nombreguardao= new GuardarPuntuacion();
      
        FacilMejor.setText(nombreguardao.NombreFacil + ": " + PuntuacionJugador);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/FondosTotales/Fondos/image_icon.png")).getImage());
       
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        FacilMejor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 0));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 110, 30));

        FacilMejor.setFont(new java.awt.Font("Pristina", 1, 28)); // NOI18N
        FacilMejor.setForeground(new java.awt.Color(85, 47, 112));
        getContentPane().add(FacilMejor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 370, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosTotales/Fondos/MejorPuntuacion.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MejoresPuntuaciones mostrar= new MejoresPuntuaciones();
       mostrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public PuntuacionesFaciles(JButton jButton1, JLabel jLabel1, JLabel jLabelNombre, JLabel puntos, GraphicsConfiguration gc) {
        super(gc);
        this.jButton1 = jButton1;
        this.jLabel1 = jLabel1;
        
    }

    public PuntuacionesFaciles(JButton jButton1, JLabel jLabel1, JLabel jLabelNombre, JLabel puntos) throws HeadlessException {
        this.jButton1 = jButton1;
        this.jLabel1 = jLabel1;
        
       
    }

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PuntuacionesFaciles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuntuacionesFaciles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuntuacionesFaciles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuntuacionesFaciles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuntuacionesFaciles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FacilMejor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private String toString(int Puntuacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
