
package NivelIntermedio;

import EmpezarEjecucion.AccederAlJuego.MejoresPuntuaciones;
import static NivelIntermedio.GuardarPuntuacionIntermedio.PuntuacionJugadorIn;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class PuntuacionesIntermedio extends javax.swing.JFrame {

    GuardarPuntuacionIntermedio puntuacionguardaIn;
    
    public PuntuacionesIntermedio() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        puntuacionguardaIn= new GuardarPuntuacionIntermedio();
        GuardarPuntuacionIntermedio nombreguardaoIn= new GuardarPuntuacionIntermedio();
    
        IntermedioMejor.setText(nombreguardaoIn.Nombre + ": " + PuntuacionJugadorIn);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/FondosTotales/Fondos/image_icon.png")).getImage());
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        IntermedioMejor = new javax.swing.JLabel();
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

        IntermedioMejor.setFont(new java.awt.Font("Pristina", 1, 28)); // NOI18N
        IntermedioMejor.setForeground(new java.awt.Color(85, 47, 112));
        IntermedioMejor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(IntermedioMejor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 370, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosTotales/Fondos/MejorPuntuacion.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MejoresPuntuaciones mostrar= new MejoresPuntuaciones();
        mostrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public PuntuacionesIntermedio(JButton jButton1, JLabel jLabel1, JLabel jLabelNombre, JLabel puntos, GraphicsConfiguration gc) {
        super(gc);
        this.jButton1 = jButton1;
        this.jLabel1 = jLabel1;
        
    }

    public PuntuacionesIntermedio(JButton jButton1, JLabel jLabel1, JLabel jLabelNombre, JLabel puntos) throws HeadlessException {
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
            java.util.logging.Logger.getLogger(PuntuacionesIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuntuacionesIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuntuacionesIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuntuacionesIntermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuntuacionesIntermedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IntermedioMejor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
