
package login;

import java.sql.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
public class login extends javax.swing.JFrame {
    int xMouse, yMouse;
    
    public login() {
        initComponents();
    }
    //conexión a base de datos
    public Connection Conectar(){
        Connection con = null;
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/technotes","root","");
        }catch(SQLException e){
            System.err.print(e.toString());
            JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos, contacta al creador.");
        }
        return con;
    }
    //validación en la base
    public void ingresar(){
        Connection con1 = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String user= usertxt.getText();
        String pass = String.valueOf(passtxt.getPassword());
        
        if (user.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(this, "Uno de los campos se encuentra vacio.");
        }else{
            try{
                con1= Conectar();//selección de usuario y contraseña
                pst = con1.prepareStatement("select user, password from users where user='"+user+"' and password ='"+pass+"'");
                rs = pst.executeQuery();
                if (rs.next()) {
                    this.dispose();
                    new home().setVisible(true);//abre la ventana
                }else{
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
                }
            }catch(SQLException e){
                System.err.print(e.toString());
                JOptionPane.showMessageDialog(this, "Error inesperado, contacta al creador.");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelizq = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        contra = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        usertxt = new javax.swing.JTextField();
        user = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        seplog = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        boton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelizq1 = new javax.swing.JPanel();
        barra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(500, 520));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelizq.setBackground(new java.awt.Color(51, 153, 255));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.png"))); // NOI18N
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelizqLayout = new javax.swing.GroupLayout(panelizq);
        panelizq.setLayout(panelizqLayout);
        panelizqLayout.setHorizontalGroup(
            panelizqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelizqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelizqLayout.setVerticalGroup(
            panelizqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelizqLayout.createSequentialGroup()
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 360, Short.MAX_VALUE))
        );

        background.add(panelizq, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 40, 390));

        contra.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        contra.setText("CONTRASEÑA");
        background.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 130, 30));

        passtxt.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        passtxt.setText("*********************");
        passtxt.setToolTipText("");
        passtxt.setBorder(null);
        passtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passtxtMousePressed(evt);
            }
        });
        background.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 170, -1));

        usertxt.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        usertxt.setForeground(new java.awt.Color(204, 204, 204));
        usertxt.setText("Ingrese su usuario");
        usertxt.setBorder(null);
        usertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usertxtMousePressed(evt);
            }
        });
        background.add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 170, -1));

        user.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        user.setText("USUARIO");
        background.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, 30));

        login.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        login.setText("INICIAR SESIÓN");
        background.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 160, 30));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 170, 20));

        seplog.setText("_______________________");
        background.add(seplog, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 170, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 170, 20));

        boton.setBackground(new java.awt.Color(51, 153, 255));
        boton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonMouseExited(evt);
            }
        });
        boton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTRAR");
        boton.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        background.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 110, 40));

        panelizq1.setBackground(new java.awt.Color(51, 153, 255));
        panelizq1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background.add(panelizq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 390));

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        background.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Elaborado por: Camilo Sanchez Rojas");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 280, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
       
        xMouse=evt.getX();
        yMouse=evt.getY();//movimiento y arrastre superior de la ventana con el mouse
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
         int x, y;
        x=evt.getXOnScreen();//movimiento y arrastre superior de la ventana con el mouse
        y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_barraMouseDragged

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setBackground(Color.black);
    }//GEN-LAST:event_salirMouseEntered

    private void botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseEntered
        boton.setBackground(Color.black);
    }//GEN-LAST:event_botonMouseEntered

    private void botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseExited
         boton.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_botonMouseExited

    private void botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseClicked
        if (MouseEvent.BUTTON1 == evt.getButton()) {
            ingresar();
        }
    }//GEN-LAST:event_botonMouseClicked

    private void usertxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertxtMousePressed
        if (usertxt.getText().equals("Ingrese su usuario")) {
           usertxt.setText(""); 
           usertxt.setForeground(Color.black);
        }
        if (String.valueOf(passtxt.getPassword()).isEmpty()) {
            passtxt.setText("*********************");
            passtxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usertxtMousePressed

    private void passtxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtxtMousePressed
        if (String.valueOf(passtxt.getPassword()).equals("*********************")) {
            passtxt.setText("");
        passtxt.setForeground(Color.black);
        }
        if (usertxt.getText().isEmpty()) {
            usertxt.setText("Ingrese su usuario");
        usertxt.setForeground(Color.gray);
        }
        
        
    }//GEN-LAST:event_passtxtMousePressed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel boton;
    private javax.swing.JLabel contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel login;
    private javax.swing.JPanel panelizq;
    private javax.swing.JPanel panelizq1;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel seplog;
    private javax.swing.JLabel user;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
