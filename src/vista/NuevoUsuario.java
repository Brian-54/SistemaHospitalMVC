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
public class NuevoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form NuevoUsuario
     */
    public NuevoUsuario() {
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
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtUserEmail = new javax.swing.JTextField();
        txtUserPhone = new javax.swing.JTextField();
        txtUserPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSaveUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnListUser = new javax.swing.JButton();
        btnCleanUser = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimiza.png"))); // NOI18N
        jPanel1.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 20, 30));

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 20, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Registro Usuario.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 200));

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TELEFONO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 40));

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CORREO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));

        jLabel6.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONTRASEÑA");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 20));

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USUARIO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 20));

        jLabel8.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NOMBRE");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 20));

        txtUserName.setBackground(new java.awt.Color(51, 255, 204));
        txtUserName.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel2.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 220, 30));

        txtUser.setBackground(new java.awt.Color(51, 255, 204));
        txtUser.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 220, 30));

        txtUserEmail.setBackground(new java.awt.Color(51, 255, 204));
        txtUserEmail.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel2.add(txtUserEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 220, 30));

        txtUserPhone.setBackground(new java.awt.Color(51, 255, 204));
        txtUserPhone.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel2.add(txtUserPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 220, 30));

        txtUserPass.setBackground(new java.awt.Color(51, 255, 204));
        jPanel2.add(txtUserPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 220, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondouser.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 360, 270));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 410, 300));

        jPanel3.setBackground(new java.awt.Color(51, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSaveUser.setBackground(new java.awt.Color(0, 204, 204));
        btnSaveUser.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        btnSaveUser.setForeground(new java.awt.Color(0, 0, 153));
        btnSaveUser.setText("GUARDAR");
        jPanel3.add(btnSaveUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, -1));

        btnUpdateUser.setBackground(new java.awt.Color(0, 204, 204));
        btnUpdateUser.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        btnUpdateUser.setForeground(new java.awt.Color(0, 0, 153));
        btnUpdateUser.setText("ACTUALIZAR");
        jPanel3.add(btnUpdateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, -1));

        btnDeleteUser.setBackground(new java.awt.Color(0, 204, 204));
        btnDeleteUser.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        btnDeleteUser.setForeground(new java.awt.Color(0, 0, 153));
        btnDeleteUser.setText("BORRAR");
        jPanel3.add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, -1));

        btnListUser.setBackground(new java.awt.Color(0, 204, 204));
        btnListUser.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        btnListUser.setForeground(new java.awt.Color(0, 0, 153));
        btnListUser.setText("OBTENER DATOS");
        jPanel3.add(btnListUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, -1));

        btnCleanUser.setBackground(new java.awt.Color(0, 204, 204));
        btnCleanUser.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        btnCleanUser.setForeground(new java.awt.Color(0, 0, 153));
        btnCleanUser.setText("LIMPIAR");
        jPanel3.add(btnCleanUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 150, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondouser.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 210, 270));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 250, 299));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCleanUser;
    public javax.swing.JButton btnDeleteUser;
    public javax.swing.JButton btnListUser;
    public javax.swing.JButton btnSaveUser;
    public javax.swing.JButton btnUpdateUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lblCerrar;
    public javax.swing.JLabel lblMinimizar;
    public javax.swing.JTextField txtUser;
    public javax.swing.JTextField txtUserEmail;
    public javax.swing.JTextField txtUserName;
    public javax.swing.JPasswordField txtUserPass;
    public javax.swing.JTextField txtUserPhone;
    // End of variables declaration//GEN-END:variables
}
