
package NivelFacil;

import EmpezarEjecucion.AccederAlJuego.Principal;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;


import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

public class GuardarPuntuacion extends javax.swing.JFrame {

    public static int PuntuacionJugador;
    public static int PuntuacionJugador2;
    public static String NombreFacil = "";
    
    JuegoFacil jfacil;
    
    public GuardarPuntuacion() {
        initComponents();
        this.setLocationRelativeTo(null);    
        jfacil=new JuegoFacil();
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/FondosTotales/Fondos/image_icon.png")).getImage());
       
    ((PlainDocument) NombreingresadoFacil.getDocument()).setDocumentFilter(new DocumentFilter() {
        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            int currentLength = fb.getDocument().getLength();
            int remainingCharacters = 15 - currentLength + length;

            if (remainingCharacters >= text.length()) {
                super.replace(fb, offset, length, text, attrs);
            } else {
                if (remainingCharacters > 0) {
                    super.replace(fb, offset, length, text.substring(0, remainingCharacters), attrs);
                }
            }
        }
    });
       
        NombreingresadoFacil.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    jButton1ActionPerformed(null);
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
     
public void mostrarPuntuacionguardar(int puntuacion) {
        PuntuacionJugador = puntuacion;
        if(PuntuacionJugador != 0){
            PuntuacionJugador2 = puntuacion;
        }
        JLabel puntuacionLabel = new JLabel("Puntuación: " + puntuacion);
        puntuacionLabel.setFont(new Font("Pristina", Font.PLAIN, 35));
        Color textopuntuacion = new Color(82, 47, 112);
        puntuacionLabel.setForeground(textopuntuacion);

        PuntuacionPanel.add(puntuacionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 170, 40));
        PuntuacionPanel.revalidate();
        PuntuacionPanel.repaint();
    
    }
   

public void mostrarPuntuacionguardarperdio(int puntuacion) {
        PuntuacionJugador= puntuacion;
        JLabel puntuacionLabel = new JLabel("Puntuación: " + puntuacion);
        puntuacionLabel.setFont(new Font("Pristina", Font.PLAIN, 25));
        Color textopuntuacion = new Color(82, 47, 112);
        puntuacionLabel.setForeground(textopuntuacion);

        PuntuacionPanel.add(puntuacionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 170, 40));
        PuntuacionPanel.revalidate();
        PuntuacionPanel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        NombreingresadoFacil = new javax.swing.JTextField();
        PuntuacionPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(227, 209, 156));
        jButton1.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(85, 47, 112));
        jButton1.setText("GUARDAR");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 240, 30));

        NombreingresadoFacil.setBackground(new java.awt.Color(227, 209, 156));
        NombreingresadoFacil.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        NombreingresadoFacil.setForeground(new java.awt.Color(85, 47, 112));
        NombreingresadoFacil.setText("Tu Nombre");
        NombreingresadoFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreingresadoFacilActionPerformed(evt);
            }
        });
        getContentPane().add(NombreingresadoFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 240, 40));

        PuntuacionPanel.setBackground(new java.awt.Color(227, 209, 156));
        PuntuacionPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(227, 209, 156), null, new java.awt.Color(227, 209, 156)));
        getContentPane().add(PuntuacionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 250, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosTotales/Fondos/Guardar.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NombreFacil= NombreingresadoFacil.getText();
        
        Principal salirp= new Principal();
        salirp.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NombreingresadoFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreingresadoFacilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreingresadoFacilActionPerformed

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuardarPuntuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardarPuntuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardarPuntuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardarPuntuacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuardarPuntuacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NombreingresadoFacil;
    private javax.swing.JPanel PuntuacionPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
