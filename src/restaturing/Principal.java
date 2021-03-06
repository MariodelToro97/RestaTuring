/*
* Este programa fue hecho por Mario Josue del Toro Morales
* con Número de Control 15460644
* Estudiante del sexto semestre de la carrera de Ingeniería en Sistemas Computacionales
* del Instituto Tecnológico de Colima
* Materia de Lenguajes y Autómatas I
******Descripción************
* Programa que usa la máquina de Turing para sacar la resta de dos números binarios
 */
package restaturing;

import javax.swing.JOptionPane;

/**
 *
 * @author Mario Josue Del Toro Morales
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    //Declaración de la matriz de Transición y el vector del alfabeto
    String matrizTransicion[][][] = new String[7][5][4];
    String alfabeto[] = new String[5];

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null); //Coloca la ventana al centro de la pantalla

        //Inserción de valores en el vector del alfabeto
        alfabeto[0] = "00";
        alfabeto[1] = "01";
        alfabeto[2] = "10";
        alfabeto[3] = "11";
        alfabeto[4] = "  ";
        
        //Llenado de la matriz de transición
        matrizTransicion[0][0][0] = "0"; //Estado al que se va a ir
        matrizTransicion[0][0][1] = "0"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[0][0][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[0][0][3] = "1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA

        matrizTransicion[0][1][0] = "0"; //Estado al que se va a ir
        matrizTransicion[0][1][1] = "1"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[0][1][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[0][1][3] = "1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[0][2][0] = "0"; //Estado al que se va a ir
        matrizTransicion[0][2][1] = "0"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[0][2][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[0][2][3] = "1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[0][3][0] = "0"; //Estado al que se va a ir
        matrizTransicion[0][3][1] = "1"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[0][3][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[0][3][3] = "1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[0][4][0] = "1"; //Estado al que se va a ir
        matrizTransicion[0][4][1] = " "; //Dato por el que se cambia la segunda cinta
        matrizTransicion[0][4][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[0][4][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[1][0][0] = "1"; //Estado al que se va a ir
        matrizTransicion[1][0][1] = "0"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[1][0][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[1][0][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA

        matrizTransicion[1][1][0] = "2"; //Estado al que se va a ir
        matrizTransicion[1][1][1] = "1"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[1][1][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[1][1][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[1][2][0] = "1"; //Estado al que se va a ir
        matrizTransicion[1][2][1] = "0"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[1][2][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[1][2][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[1][3][0] = "2"; //Estado al que se va a ir
        matrizTransicion[1][3][1] = "1"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[1][3][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[1][3][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[1][4][0] = "3"; //Estado al que se va a ir
        matrizTransicion[1][4][1] = " "; //Dato por el que se cambia la segunda cinta
        matrizTransicion[1][4][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[1][4][3] = "1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[2][0][0] = "2"; //Estado al que se va a ir
        matrizTransicion[2][0][1] = "1"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[2][0][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[2][0][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA

        matrizTransicion[2][1][0] = "2"; //Estado al que se va a ir
        matrizTransicion[2][1][1] = "0"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[2][1][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[2][1][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[2][2][0] = "2"; //Estado al que se va a ir
        matrizTransicion[2][2][1] = "1"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[2][2][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[2][2][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[2][3][0] = "2"; //Estado al que se va a ir
        matrizTransicion[2][3][1] = "0"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[2][3][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[2][3][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[2][4][0] = "3"; //Estado al que se va a ir
        matrizTransicion[2][4][1] = " "; //Dato por el que se cambia la segunda cinta
        matrizTransicion[2][4][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[2][4][3] = "1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[3][0][0] = "3"; //Estado al que se va a ir
        matrizTransicion[3][0][1] = "0"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[3][0][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[3][0][3] = "1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA

        matrizTransicion[3][1][0] = "3"; //Estado al que se va a ir
        matrizTransicion[3][1][1] = "1"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[3][1][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[3][1][3] = "1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[3][2][0] = "3"; //Estado al que se va a ir
        matrizTransicion[3][2][1] = "0"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[3][2][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[3][2][3] = "1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[3][3][0] = "3"; //Estado al que se va a ir
        matrizTransicion[3][3][1] = "1"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[3][3][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[3][3][3] = "1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[3][4][0] = "4"; //Estado al que se va a ir
        matrizTransicion[3][4][1] = " "; //Dato por el que se cambia la segunda cinta
        matrizTransicion[3][4][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[3][4][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[4][0][0] = "4"; //Estado al que se va a ir
        matrizTransicion[4][0][1] = "0"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[4][0][2] = "0"; //Dato que se coloca en la tercera cinta
        matrizTransicion[4][0][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA

        matrizTransicion[4][1][0] = "4"; //Estado al que se va a ir
        matrizTransicion[4][1][1] = "1"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[4][1][2] = "1"; //Dato que se coloca en la tercera cinta
        matrizTransicion[4][1][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[4][2][0] = "4"; //Estado al que se va a ir
        matrizTransicion[4][2][1] = "0"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[4][2][2] = "1"; //Dato que se coloca en la tercera cinta
        matrizTransicion[4][2][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[4][3][0] = "5"; //Estado al que se va a ir
        matrizTransicion[4][3][1] = "1"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[4][3][2] = "0"; //Dato que se coloca en la tercera cinta
        matrizTransicion[4][3][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[4][4][0] = "6"; //Estado al que se va a ir
        matrizTransicion[4][4][1] = " "; //Dato por el que se cambia la segunda cinta
        matrizTransicion[4][4][2] = " "; //Dato que se coloca en la tercera cinta
        matrizTransicion[4][4][3] = "1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[5][0][0] = "4"; //Estado al que se va a ir
        matrizTransicion[5][0][1] = "0"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[5][0][2] = "1"; //Dato que se coloca en la tercera cinta
        matrizTransicion[5][0][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA

        matrizTransicion[5][1][0] = "5"; //Estado al que se va a ir
        matrizTransicion[5][1][1] = "1"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[5][1][2] = "0"; //Dato que se coloca en la tercera cinta
        matrizTransicion[5][1][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[5][2][0] = "5"; //Estado al que se va a ir
        matrizTransicion[5][2][1] = "0"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[5][2][2] = "0"; //Dato que se coloca en la tercera cinta
        matrizTransicion[5][2][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[5][3][0] = "5"; //Estado al que se va a ir
        matrizTransicion[5][3][1] = "1"; //Dato por el que se cambia la segunda cinta
        matrizTransicion[5][3][2] = "1"; //Dato que se coloca en la tercera cinta
        matrizTransicion[5][3][3] = "-1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
       
        matrizTransicion[5][4][0] = "6"; //Estado al que se va a ir
        matrizTransicion[5][4][1] = " "; //Dato por el que se cambia la segunda cinta
        matrizTransicion[5][4][2] = "1"; //Dato que se coloca en la tercera cinta
        matrizTransicion[5][4][3] = "1"; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[6][0][0] = "99"; //Estado al que se va a ir
        matrizTransicion[6][0][1] = ""; //Dato por el que se cambia la segunda cinta
        matrizTransicion[6][0][2] = ""; //Dato que se coloca en la tercera cinta
        matrizTransicion[6][0][3] = ""; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA

        matrizTransicion[6][1][0] = "99"; //Estado al que se va a ir
        matrizTransicion[6][1][1] = ""; //Dato por el que se cambia la segunda cinta
        matrizTransicion[6][1][2] = ""; //Dato que se coloca en la tercera cinta
        matrizTransicion[6][1][3] = ""; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[6][2][0] = "99"; //Estado al que se va a ir
        matrizTransicion[6][2][1] = ""; //Dato por el que se cambia la segunda cinta
        matrizTransicion[6][2][2] = ""; //Dato que se coloca en la tercera cinta
        matrizTransicion[6][2][3] = ""; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[6][3][0] = "99"; //Estado al que se va a ir
        matrizTransicion[6][3][1] = ""; //Dato por el que se cambia la segunda cinta
        matrizTransicion[6][3][2] = ""; //Dato que se coloca en la tercera cinta
        matrizTransicion[6][3][3] = ""; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
        
        matrizTransicion[6][4][0] = "99"; //Estado al que se va a ir
        matrizTransicion[6][4][1] = ""; //Dato por el que se cambia la segunda cinta
        matrizTransicion[6][4][2] = ""; //Dato que se coloca en la tercera cinta
        matrizTransicion[6][4][3] = ""; //Movimiento que realiza el apuntador, ya sea -1 es IZQUIERDA, 0 se DETIENE, 1 es DERECHA
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Obtener = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Valor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Texto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resta Binaria con Máquina de Turing");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setText("Este programa saca la resta de dos datos binarios ingresados con la máquina de Turing");
        jLabel9.setToolTipText("Descripción de programa");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("____________________________");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Programa utilizando máquina de Turing");
        jLabel7.setToolTipText("Nombre de la práctica");

        Resultado.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Resultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Resultado.setToolTipText("Resultado en el que se muestra.");
        Resultado.setEnabled(false);
        Resultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ResultadoKeyReleased(evt);
            }
        });

        Limpiar.setBackground(new java.awt.Color(255, 255, 102));
        Limpiar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.setToolTipText("Borrará el código escrito así como la tabla de tokens");
        Limpiar.setEnabled(false);
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("-");

        Obtener.setBackground(new java.awt.Color(102, 255, 204));
        Obtener.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Obtener.setText("Realizar Resta");
        Obtener.setToolTipText("Realiza el análisis léxico del programa");
        Obtener.setEnabled(false);
        Obtener.setName("potencia"); // NOI18N
        Obtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObtenerActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel20.setText("Meter los dos dígitos de la misma longitud.");
        jLabel20.setToolTipText("Descripción de programa");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel10.setText("Instituto Tecnológico de Colima");
        jLabel10.setToolTipText("Nombre de la Escuela");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(207, 30, 67));
        jLabel11.setText("Ingeniería en Sistemas Computacionales");
        jLabel11.setToolTipText("Carrera que se está cursando");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 91, 91));
        jLabel4.setText("Lenguajes y Autómatas I");
        jLabel4.setToolTipText("Nombre de la materia");

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Salir");
        jButton3.setToolTipText("Termina la aplicación");
        jButton3.setName("salir"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Valor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Valor.setToolTipText("Inserte el primer dígito de la suma");
        Valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ValorKeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Ma. Elena Martínez Durán");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("Docente:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Semestre:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("15460644");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Mario Josué Del Toro Morales ");
        jLabel5.setToolTipText("Autor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Autor:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Número de Control:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Sexto");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Primer valor a ingresar:");

        Texto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Texto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Texto.setToolTipText("Inserte el segundo dígito de la suma, con la misma longitud que la anterior.");
        Texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoKeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Segundo valor a ingresar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Obtener, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel11)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(241, 241, 241)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(121, 121, 121)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Valor, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(Texto, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Obtener, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResultadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResultadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoKeyReleased

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        //Método que se ejecuta al dar clic en el botón de limpiar
        Texto.setText(""); //se vacia la caja de texto
        Valor.setText(""); //Se coloca en blanco la caja de texto
        Resultado.setText(""); //Se coloca en blanco el espacio del resultado
        Obtener.setEnabled(false); //se deshabilita el botón de obtener
        Limpiar.setEnabled(false); //se deshabilita el botón de habilitación

        //Pasa el foco al textfield del código
        Valor.requestFocus();
    }//GEN-LAST:event_LimpiarActionPerformed

    public void EspacioCadena() {
        //Método que agrega el espacio respectivo para la terminación de la máquina
        if (!Texto.getText().startsWith(" ")) {
            Texto.setText(" " + Texto.getText());        
        } 
        if (!Valor.getText().startsWith(" ")) {
            Valor.setText(" " + Valor.getText());
        }
        if (!Texto.getText().endsWith(" ")) {
            Texto.setText(Texto.getText() + " ");
        }
        if (!Valor.getText().endsWith(" ")) {
            Valor.setText(Valor.getText() + " ");
        }        
    }

    public int ChecarAlfabeto(String caracter, String character) {
        //Método que checa si existe el caracter en el alfabeto
        int valor = -1;
        String cadena = caracter + character;

        for (int i = 0; i < alfabeto.length; i++) {
            if (cadena.equalsIgnoreCase(alfabeto[i])) {
                valor = i;
                break;
            }
        }
        return valor;
    }

    public String ObtencionEstado(int estado, int valor) {
        //Método que obtiene el estado al cual se va a mover el apuntador
        return matrizTransicion[estado][valor][0];
    }
    
    public String ObtencionConvSegunda (int estado, int valor){
        //Método que obtiene el valor que se va a sustituir la segunda cinta
        return matrizTransicion[estado][valor][1];
    }

    public String ObtencionConversion(int estado, int valor) {
        //Método que obtiene el valor por el que se va a cambiar la casilla
        return matrizTransicion[estado][valor][2];
    }

    public String ObtencionMovimiento(int estado, int valor) {
        //Método que obtiene el movimiento que el apuntador va hacer.
        return matrizTransicion[estado][valor][3];
    }
    
    public String[] LlenarVector(String[] cadena) {
        //Método que tiene como función llenar el vector que será usado para el complemento a 2
        for (int i = 0; i < Texto.getText().length(); i++) { //Ciclo que vacía lo que hay en la caja de texto al vector
            cadena[i] = Character.toString(Texto.getText().charAt(i));
        }
        return cadena;
    }

    private void ObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObtenerActionPerformed
        // Método que se deesencadena tras pulsar el boton de Obtener de la interfaz principal
        int estado = 0, movimiento, posicion = 1, valor, state = 0;
        String caracter, Text, modificado = "", mostrar = "", cambio;
        boolean error = false;

        EspacioCadena(); // Llamado al método que agrega el espacio para la terminación de la máquina.
        String[] cadena = new String [Texto.getText().length()]; //Definición del vector que contendrá la segunda cadena        
        cadena = LlenarVector(cadena); //Llamado al método que llena el vector creado para la segunda cadena

        do {
            caracter = Character.toString(Valor.getText().charAt(posicion)); //Obtiene el valor de la primer cadena
            Text = cadena[posicion]; //Obtiene el valor de la segunda cadena.

            if (" 1".equals(caracter + Text) || " 0".equals(caracter + Text) || "1 ".equals(caracter + Text) || "0 ".equals(caracter + Text)) {
                mostrar += "\n[" + state + "] [" + caracter + Text + "] ---->";
                JOptionPane.showMessageDialog(null, mostrar + "\nUn dato tiene mayor longitud que otro", "ERROR", JOptionPane.ERROR_MESSAGE);
                error = true;

            } else {
                valor = ChecarAlfabeto(caracter, Text); // Llamado al método para checar si el caracter pertenece al alfabeto.

                if (valor == -1) { //Entra si NO encuentra el caracter en el alfabeto
                    mostrar += "\n[" + state + "] [" + caracter + Text + "] ---->";
                    JOptionPane.showMessageDialog(null, mostrar + "\nEl caracter no existe en el alfabeto binario de la máquina", "ERROR", JOptionPane.ERROR_MESSAGE);
                    error = true;

                } else {
                    state = estado; //Guarda el estado para que no se pierda y sirva de busqueda en los respectivos métodos que se necesiten.
                    estado = Integer.parseInt(ObtencionEstado(state, valor)); //Llamado al método que obtiene el estado al que se moverá el apuntador

                    if (estado == 99) { //Entra si encuentra el estado final
                        mostrar += "\n[" + state + "] [" + caracter + Text + "] ----> (99, , )";
                        JOptionPane.showMessageDialog(null, mostrar + "\nEl proceso ha terminado de forma correcta\n\n El resultado de la suma es:\n\n" + modificado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                        error = true;

                    } else { //Entra si aún sigue en el proceso sin ningún error encontrado.
                        cambio = this.ObtencionConversion(state, valor); //Llamado del método de obtención de caracter por el que se va a cambiar el valor en la cadena.
                        if (!cambio.equalsIgnoreCase("3")) {
                            modificado = cambio + modificado; //Agregado a la cadena donde se van almacenando los datos que salen de la máquina de Turing
                        } else {
                            modificado += " "; //Agregado a la cadena final del espacio terminador
                        }
                        cadena [posicion] = this.ObtencionConvSegunda(state, valor);
                        movimiento = Integer.parseInt(this.ObtencionMovimiento(state, valor));//Llamado al método de obtención del movimiento ha realizar por el apuntador en la máquina de Turing
                        mostrar += "\n[" + state + "] [" + caracter + Text + "] ----> (" + estado + ", (" + caracter + ", " + Text + ", " + cambio + "), " + movimiento + ")";

                        switch (movimiento) { //Checa el tipo de movimiento que da como resultado de la tabla de transición
                            case -1://Entra aquí si el movimiento del apuntador que se debe realizar es hacia la izquierda
                                posicion--;
                                break;

                            case 1: //Entra aquí si el movimiento del apuntador que se debe realizar es hacia la derecha
                                posicion++;
                                break;
                        }
                    }
                }
            }
        } while (!error);
        modificado = modificado.trim();
        Resultado.setText(modificado);
        //Pasa el foco al textfield del código
        Valor.requestFocus();
    }//GEN-LAST:event_ObtenerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Cierra la aplicación
        JOptionPane.showMessageDialog(null, "Gracias por usar este programa\n Lo esperamos de vuelta pronto\n Versión 1.5.32\n\n Creado por: Mario Josue del Toro Morales\nEstudiante del Instituto Tecnológico de Colima\n Carrera de Ingeniería en Sistemas Coputacionales\n No. Control: 15460647\n Sexto Semestre", "AGRADECIMIENTO", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorKeyReleased
        //Método para habilitar el botón de limpiar una vez que se escibe algo en el cuadro de texto
        if (Texto.getText().length() != 0 && Valor.getText().length() != 0) {
            Limpiar.setEnabled(true); //habilitación del botón de limpiar
            Obtener.setEnabled(true); //habilitación del botón de obtener

        } else {
            if (Valor.getText().length() != 0) {
                Limpiar.setEnabled(true); //habilitación del botón de limpiar

            } else {
                Limpiar.setEnabled(false); //deshabilitación del botón de limpiar
                Obtener.setEnabled(false); //deshabilitación del botón de obtener
            }
        }
    }//GEN-LAST:event_ValorKeyReleased

    private void TextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoKeyReleased
        //Método para habilitar el botón de limpiar una vez que se escibe algo en el cuadro de texto
        if (Texto.getText().length() != 0 && Valor.getText().length() != 0) {
            Limpiar.setEnabled(true); //habilitación del botón de limpiar
            Obtener.setEnabled(true); //habilitación del botón de obtener

        } else {
            if (Texto.getText().length() != 0) {
                Limpiar.setEnabled(true); //habilitación del botón de limpiar

            } else {
                Limpiar.setEnabled(false); //deshabilitación del botón de limpiar
                Obtener.setEnabled(false); //deshabilitación del botón de obtener
            }
        }
    }//GEN-LAST:event_TextoKeyReleased

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Obtener;
    private javax.swing.JTextField Resultado;
    private javax.swing.JTextField Texto;
    private javax.swing.JTextField Valor;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}