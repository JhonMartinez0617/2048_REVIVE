package NivelFacil;

import EmpezarEjecucion.AccederAlJuego.Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class JuegoFacil extends javax.swing.JFrame {

    public JLabel[][] celdas;
    public int[][] matriz;
    public static final int TAMAÑO = 4;
    public int Puntuacion=0;
    public JLabel puntuacionLabel;
    public int[][] respaldoMatriz;
    public int respaldoPuntuacion;

    
    public JuegoFacil() {
        initComponents();
        this.setLocationRelativeTo(null);
        tituloventana();
        logicaExtra();
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/FondosTotales/Fondos/image_icon.png")).getImage());
       
    }
    
        public void tituloventana() {
        setTitle("Partida Facil 2048:REVIVE");
}
        public void logicaExtra(){
         
            matriz = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
            agregarNúmero();
            agregarNúmero();
            
           celdas = new JLabel[4][4];
           Color borde= new Color(82, 47, 112);
           Color colorTexto = new Color(244, 245, 247);
          
           for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[i].length; j++) {
                celdas[i][j] = new JLabel();
                celdas[i][j].setHorizontalAlignment(JLabel.CENTER);
                celdas[i][j].setVerticalAlignment(JLabel.CENTER); 
                celdas[i][j].setOpaque(true);
                celdas[i][j].setBorder(BorderFactory.createLineBorder(borde, 4));
                celdas[i][j].setFont(new Font("Arial", Font.PLAIN,40));
                celdas[i][j].setForeground(colorTexto);
                actualizarColorCelda(i, j);
                tableropanel.add(celdas[i][j]);
                tableropanel.setBorder(BorderFactory.createLineBorder(borde, 4));
                tableropanel.setFocusable(true);
                celdas[i][j].setFocusable(true);
                celdas[i][j].requestFocusInWindow();
                celdas[i][j].addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    int keyCode = e.getKeyCode();
                    switch (keyCode) {
                        case KeyEvent.VK_UP:
                            moverArriba();
                            agregarNúmero();
                            actualizarGUI();
                       
                            if (verificarPerder()) {
                         JuegoPerdidoFacil perdio = new JuegoPerdidoFacil();
                         perdio.setVisible(true);
                         perdio.mostrarPuntuacion(Puntuacion);
                         dispose(); 
                              }
                            verificarGanar();
                            actualizarPuntuacion();
                            break;
                            
                        case KeyEvent.VK_DOWN:
                            moverAbajo();
                            agregarNúmero();
                            actualizarGUI();
                       
                            if (verificarPerder()) {
                         JuegoPerdidoFacil perdio = new JuegoPerdidoFacil();
                         perdio.setVisible(true);
                          perdio.mostrarPuntuacion(Puntuacion);
                         dispose(); 
                              }
                            verificarGanar();
                            actualizarPuntuacion();
                            break;
                        case KeyEvent.VK_LEFT:
                            moverIzquierda();
                            agregarNúmero();
                            actualizarGUI();
                          
                            if (verificarPerder()) {
                         JuegoPerdidoFacil perdio = new JuegoPerdidoFacil();
                         perdio.setVisible(true);
                          perdio.mostrarPuntuacion(Puntuacion);
                         dispose(); 
                              }
                            verificarGanar();
                            actualizarPuntuacion();
                            break;
                        case KeyEvent.VK_RIGHT:
                            moverDerecha();
                            agregarNúmero();
                            actualizarGUI();
                            
                            if (verificarPerder()) {
                         JuegoPerdidoFacil perdio = new JuegoPerdidoFacil();
                         perdio.setVisible(true);
                          perdio.mostrarPuntuacion(Puntuacion);
                         dispose(); 
                              }
                            verificarGanar();
                            actualizarPuntuacion();
                            break;
                        default:
                            break;
                    }
                }
            });
        }
        }
        puntuacionLabel = new JLabel("Puntuación: " + Puntuacion);
        puntuacionLabel.setFont(new Font("Arial", Font.PLAIN, 25));
        Color textopuntuacion = new Color(244, 245, 247);
        puntuacionLabel.setForeground(textopuntuacion);

        PuntuacionPanel.add(puntuacionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 170, 40));
        }        
        public void  actualizarColorCelda(int fila, int columna){
            int valor = matriz[fila][columna];
            Color color;
        
            switch (valor) {
            case 2:
                color = new Color (112, 164, 255);
                break;
            case 4:
                color = new Color (126, 217, 87);
                break;
            case 8:
              color = new Color (114, 125, 23);
              break;
            case 16:
                color = new Color (82, 47, 112);
                break;
            case 32: 
                color = new Color (98, 76, 0);
                break;
            case 64:
                color = new Color (255, 0, 23);
                break;
            case 128:
                color = new Color (255, 214, 0);
                break;
            case 256: 
                color = new Color (237, 170, 91);
                break;
            case 512:
                color = new Color (51, 0, 255);
                break;
            case 1024:
                color = new Color (77, 125, 56);
                break;
            case 2048:
                color = new Color (162, 138, 138);
                break;
            default:
                 Color colorFondo = new Color(244, 245, 247);
                color = colorFondo; 
        }
        celdas[fila][columna].setBackground(color);
        celdas[fila][columna].setText(Integer.toString(valor));
        }
        
        public void configurarKeyListener() {
            
        tableropanel.setFocusable(true);
        tableropanel.requestFocusInWindow();
        tableropanel.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP:
                            moverArriba();
                            agregarNúmero();
                            actualizarGUI();
                       
                            if (verificarPerder()) {
                         JuegoPerdidoFacil perdio = new JuegoPerdidoFacil();
                         perdio.setVisible(true);
                         perdio.mostrarPuntuacion(Puntuacion);
                         dispose(); 
                              }
                            
                    break;
                    
                case KeyEvent.VK_DOWN:
                            moverAbajo();
                            agregarNúmero();
                            actualizarGUI();
                       
                            if (verificarPerder()) {
                         JuegoPerdidoFacil perdio = new JuegoPerdidoFacil();
                         perdio.setVisible(true);
                         perdio.mostrarPuntuacion(Puntuacion);
                         dispose(); 
                              }
                            verificarGanar();
                            actualizarPuntuacion();
                    
                    break;
                    
                case KeyEvent.VK_LEFT:
                            moverIzquierda();
                            agregarNúmero();
                            actualizarGUI();
                          
                            if (verificarPerder()) {
                         JuegoPerdidoFacil perdio = new JuegoPerdidoFacil();
                         perdio.setVisible(true);
                         perdio.mostrarPuntuacion(Puntuacion);
                         dispose(); 
                              }
                            verificarGanar();
                            actualizarPuntuacion();
                    
                    break;
                    
                case KeyEvent.VK_RIGHT:
                            moverDerecha();
                            agregarNúmero();
                            actualizarGUI();
                            
                            if (verificarPerder()) {
                         JuegoPerdidoFacil perdio = new JuegoPerdidoFacil();
                         perdio.setVisible(true);
                         perdio.mostrarPuntuacion(Puntuacion);
                         dispose(); 
                              }
                            verificarGanar();
                            actualizarPuntuacion();
                    
                    break;
                    
                default:
                    break;
            }
        }
    });
}       
        public void moverArriba() {
        for (int columna = 0; columna < TAMAÑO; columna++) {
            for (int fila = 1; fila < TAMAÑO; fila++) {
                if (matriz[fila][columna] != 0) {
                    int filaActual = fila;
                    while (filaActual > 0 && matriz[filaActual - 1][columna] == 0) {
                        matriz[filaActual - 1][columna] = matriz[filaActual][columna];
                        matriz[filaActual][columna] = 0;
                        filaActual--;
                    }
                    if (filaActual > 0 && matriz[filaActual - 1][columna] == matriz[filaActual][columna]) {
                       matriz[filaActual - 1][columna] *= 2;
                        matriz[filaActual][columna] = 0;
                        Puntuacion += matriz[filaActual - 1][columna];
                    }
                }
            }
        }
    }//moverArriba
        public void moverAbajo(){
            for (int columna = 0; columna < TAMAÑO; columna++) {
            for (int fila = TAMAÑO - 2; fila >= 0; fila--) {
                if (matriz[fila][columna] != 0) {
                    int filaActual = fila;
                    while (filaActual < TAMAÑO - 1 && matriz[filaActual + 1][columna] == 0) {
                        matriz[filaActual + 1][columna] = matriz[filaActual][columna];
                        matriz[filaActual][columna] = 0;
                        filaActual++;
                    }
                    if (filaActual < TAMAÑO - 1 && matriz[filaActual + 1][columna] == matriz[filaActual][columna]) {
                        matriz[filaActual + 1][columna] *= 2;
                        matriz[filaActual][columna] = 0;
                        Puntuacion += matriz[filaActual - 1][columna];
                        
                    }
                }
            }
        }
        }//moverAbajo
        public void moverIzquierda(){
            for (int fila = 0; fila < TAMAÑO; fila++) {
            for (int columna = 1; columna < TAMAÑO; columna++) {
                if (matriz[fila][columna] != 0) {
                    int columnaActual = columna;
                    while (columnaActual > 0 && matriz[fila][columnaActual - 1] == 0) {
                        matriz[fila][columnaActual - 1] = matriz[fila][columnaActual];
                        matriz[fila][columnaActual] = 0;
                        columnaActual--;
                    }
                    if (columnaActual > 0 && matriz[fila][columnaActual - 1] == matriz[fila][columnaActual]) {
                       matriz[fila][columnaActual - 1] *= 2;
                       matriz[fila][columnaActual] = 0;
                      Puntuacion += matriz[columnaActual - 1][columna];
                       
                    }
                }
            }
        }
        }//moverIzquierda
        public void moverDerecha(){
            for (int fila = 0; fila < TAMAÑO; fila++) {
            for (int columna = TAMAÑO - 2; columna >= 0; columna--) {
                if (matriz[fila][columna] != 0) {
                    int columnaActual = columna;
                    while (columnaActual < TAMAÑO - 1 && matriz[fila][columnaActual + 1] == 0) {
                        matriz[fila][columnaActual + 1] = matriz[fila][columnaActual];
                        matriz[fila][columnaActual] = 0;
                        columnaActual++;
                    }
                    if (columnaActual < TAMAÑO - 1 && matriz[fila][columnaActual + 1] == matriz[fila][columnaActual]) {
                        matriz[fila][columnaActual + 1] *= 2;
                        matriz[fila][columnaActual] = 0;
                        Puntuacion += matriz[columnaActual - 1][columna];
                        
                    }
                }
            }
        }
        }//moverDerecha
        public void actualizarGUI() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                actualizarColorCelda(i, j); // Actualiza el color según el valor de la matriz
            }
        }
        puntuacionLabel.setText("Puntuación: " + Puntuacion);
    }//actualizarGUI
        public void agregarNúmero() {
        Random rand = new Random();
        int fila, columna;
        do {
            fila = rand.nextInt(TAMAÑO);
            columna = rand.nextInt(TAMAÑO);
        } while (matriz[fila][columna] != 0);
        matriz[fila][columna] = (rand.nextDouble() < 0.9) ? 2 : 4;
    }//Agregar numero 2 o 4
        
        public void verificarGanar() {
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                if (matriz[i][j] == 2048) {
                    
                    Victoriafacil gano= new Victoriafacil();
                    gano.setVisible(true);
                    gano.mostrarPuntuacion(Puntuacion);
                    dispose();
                }
            }
        }
    }
        
        public boolean verificarPerder() {
    
    for (int i = 0; i < TAMAÑO; i++) {
        for (int j = 0; j < TAMAÑO; j++) {
            if (matriz[i][j] == 0) {
                return false; 
            }
            
           
            if ((i < TAMAÑO - 1 && matriz[i][j] == matriz[i + 1][j]) ||
                (j < TAMAÑO - 1 && matriz[i][j] == matriz[i][j + 1])) {
                return false; 
            }
        }
    }
    return true;
}
        
        public int calcularPuntuacionMovimiento() {
        int puntuacionMovimiento = 0;
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                puntuacionMovimiento += matriz[i][j];
            }
        }
        return puntuacionMovimiento;
    }
        
        public void actualizarPuntuacion() {
        int puntuacionMovimiento = calcularPuntuacionMovimiento();
        Puntuacion += puntuacionMovimiento;
        puntuacionLabel.setText("Puntuación: " + Puntuacion); // Actualizar la puntuacion
        actualizarGUI();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        tableropanel = new javax.swing.JPanel();
        PuntuacionPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 17)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("| |");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 47, 112), 3));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMultiClickThreshhold(2L);
        jButton2.setName(""); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 60, 60));

        tableropanel.setLayout(new java.awt.GridLayout(4, 4));
        getContentPane().add(tableropanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 400, 400));

        PuntuacionPanel.setBackground(new java.awt.Color(255, 201, 14));
        PuntuacionPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.blue, java.awt.Color.red, java.awt.Color.blue));
        getContentPane().add(PuntuacionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosTotales/Fondos/Partidafacil.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        respaldoMatriz = matriz.clone(); // Clonar la matriz para evitar referencias directas
        respaldoPuntuacion = Puntuacion;
        MenuPausa AccederMenu = new MenuPausa(this);
        this.setVisible(false);
        AccederMenu.setVisible(true);
        configurarKeyListener();
    }//GEN-LAST:event_jButton2ActionPerformed
public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoFacil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoFacil().setVisible(true);
          
            }
        });
        
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PuntuacionPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel tableropanel;
    // End of variables declaration//GEN-END:variables
}
