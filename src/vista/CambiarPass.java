/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Brian54
 */
public class CambiarPass extends javax.swing.JFrame {

    /**
     * Creates new form CambiarPass
     */
    public CambiarPass() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtPassConfirmar = new javax.swing.JPasswordField();
        txtPassAnterior = new javax.swing.JPasswordField();
        txtPassNuevo = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        lblCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setText("Cambiar Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 300, 50));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA ANTERIOR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 40));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel3.setText("CONTRASEÑA NUEVA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setText("CONFIRMAR CONTRASEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 40));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel5.setText("USUARIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtUser.setBackground(java.awt.Color.gray);
        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser.setBorder(null);
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 150, 30));

        btnAceptar.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 150, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 150, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 150, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 150, -1));

        txtPassConfirmar.setBackground(java.awt.Color.gray);
        txtPassConfirmar.setBorder(null);
        jPanel1.add(txtPassConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 150, 30));

        txtPassAnterior.setBackground(java.awt.Color.gray);
        txtPassAnterior.setBorder(null);
        jPanel1.add(txtPassAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 150, 30));

        txtPassNuevo.setBackground(java.awt.Color.gray);
        txtPassNuevo.setBorder(null);
        jPanel1.add(txtPassNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 150, 30));

        jPasswordField4.setText("jPasswordField1");
        jPanel1.add(jPasswordField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 150, 30));

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 20, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JLabel lblCerrar;
    public javax.swing.JPasswordField txtPassAnterior;
    public javax.swing.JPasswordField txtPassConfirmar;
    public javax.swing.JPasswordField txtPassNuevo;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
