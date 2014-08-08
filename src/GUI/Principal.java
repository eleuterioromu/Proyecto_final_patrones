package GUI;
import Idiomas.*;
import JuegoTennis.*;
//import Idiomas.Espanol;
import JuegoTennis.PlayerTennis;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
private Tennis tennis = new Tennis();
private static Principal p = new Principal();
static String jugador1; 
static String jugador2; 

    public Principal() {
        initComponents();
        tennis.setIdioma(new Espanol());
        jLabel7.setText(tennis.score());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenidos");

        jLabel1.setFont(new java.awt.Font("MS PMincho", 1, 36)); // NOI18N
        jLabel1.setText("Juego de Tenis");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 153, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(153, 153, 0)));

        jLabel6.setFont(new java.awt.Font("Marker Felt", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Jugador 2");

        jLabel7.setFont(new java.awt.Font("Marker Felt", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Puntaje");

        jLabel4.setFont(new java.awt.Font("Marker Felt", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Jugador 1");

        jButton1.setText("Jugador1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione el Idioma");
        jLabel2.setPreferredSize(new java.awt.Dimension(164, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Espanol", "Ingles", "Frances", "Aleman" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Marker Felt", 0, 18)); // NOI18N
        jLabel3.setText("Marcador");

        jButton2.setText("Jugador 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N
        jLabel8.setText("Agrega nombres a los jugadores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marcador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(153, 153, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null}
            },
            new String [] {
                "marcador",getJugador1(), getJugador2(), "Tiros " + getJugador1(),"tiros2 "+ getJugador2()
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jButton3.setText("Iniciar Juego");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      ///tennis.setIdioma(crearIdioma((String) jComboBox1.getSelectedItem()));
        //jLabel7.setText((String)jComboBox1.getSelectedItem());
        String nombreIdioma =(String) jComboBox1.getSelectedItem();
         if (nombreIdioma == "Ingles"){
            tennis.setIdioma(new Ingles());
            System.out.println("Seleciono el idioma Ingles");
            jLabel7.setText(tennis.score());
            //aqui va el idioma que se inicializa y se pasa el valor tal como lo pasarias en tu main 
         }
         else if (nombreIdioma == "Espanol"){
            tennis.setIdioma(new Espanol());
            System.out.println("Seleciono el idioma Español");
            jLabel7.setText(tennis.score());
            //aqui va el idioma que se inicializa y se pasa el valor tal como lo pasarias en tu main
         }
         else if (nombreIdioma == "Frances"){
             
            //aqui va el idioma que se inicializa y se pasa el valor tal como lo pasarias en tu main
         }
         else if (nombreIdioma == "Aleman"){
             
            //aqui va el idioma que se inicializa y se pasa el valor tal como lo pasarias en tu main
         }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private Idioma crearIdioma(String nombreIdioma) {
        try {
            return (Idioma) Class.forName("tennis." + nombreIdioma).newInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jugador1 = JOptionPane.showInputDialog("Nombre de jugador 1");
        getJugador1();
        tennis.getJugador1().setAlias(jugador1);
        jLabel4.setText(jugador1);
        jButton1.setText(jugador1);
        jTable1.updateUI();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String jugador2 = JOptionPane.showInputDialog("Nombre de jugador 2");
        tennis.getJugador1().setAlias(jugador2);
        jLabel6.setText(jugador2);
        jButton2.setText(jugador2);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Object seleccion = JOptionPane.showInputDialog(
        null,
        "Seleccione opcion",
        "Selector de opciones",
        JOptionPane.QUESTION_MESSAGE,
        null,  // null para icono defecto
        new Object[] { "Estadio Oaxaca","Estadio Puebla","Estadio Mexico"}, 
        "Selecione un Estadio");
     
      if("Estadio Oaxaca"==seleccion){
            PlayerTennis player = new PlayerTennis();        
            player.iniciarEstadioOaxaca();
        }
      
      if("Estadio Puebla"==seleccion){
            PlayerTennis player = new PlayerTennis();        
            player.iniciarEstadioPuebla();
        }
      
      if("Estadio Mexico"==seleccion){
            PlayerTennis player = new PlayerTennis();        
            player.iniciarEstadioMexico();
        }
      
      System.out.println("El usuario ha elegido "+seleccion);
    }//GEN-LAST:event_jButton3ActionPerformed

    public void asignaruno(){
    tennis.getJugador1().setAlias(jugador1);
    jButton1.setText(jugador1);
    }
                   
    public void asignardos(){
    tennis.getJugador1().setAlias(jugador2);
    jButton1.setText(jugador2);
    }
    
    private String getJugador1(){
        return (tennis.getJugador1().getAlias() == null)? tennis.getJugador1().getJugadorX(): tennis.getJugador1().getAlias();
    }
    
    private String getJugador2(){
        return (tennis.getJugador2().getAlias() == null)? tennis.getJugador2().getJugadorX(): tennis.getJugador2().getAlias();
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jugador1 = JOptionPane.showInputDialog("nombre del primer Jugador");
                jugador2 = JOptionPane.showInputDialog("nombre del rival");
                new Principal().setVisible(true);
                
                 }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
