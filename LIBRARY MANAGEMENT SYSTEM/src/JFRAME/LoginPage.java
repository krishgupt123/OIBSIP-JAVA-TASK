/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFRAME;

import static JFRAME.DBCon.con;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author krish
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public LoginPage() {
        initComponents();
    }
public boolean validateLogin()
{
    String name = txt_use.getText();
       String pwd = txt_pass.getText();
       if(name.equals(""))
       {
           JOptionPane.showMessageDialog(this, "Please enter the username");
           return false;
       }
        if(pwd.equals(""))
       {
           JOptionPane.showMessageDialog(this, "Please enter the password");
           return false;
       }
       return true;
}
public boolean Login()
{
    String name=txt_use.getText();
    String pwd = txt_pass.getText();
    try
    {
        Class.forName("con.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
            PreparedStatement ps= con.prepareStatement("select * from lib where name=?");
            ps.setString(1, name);
            ps.setString(2, pwd);
                    ResultSet rs=ps.executeQuery();
                    if(rs.next())
                    {
                        JOptionPane.showMessageDialog(this, "login successful");
                        HomePage ho= new HomePage();
                        ho.setVisible(true);
                        this.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "incorrect username or password");                        
                    }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
        return false;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_use = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_pass = new app.bolivia.swing.JCTextField();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Welcome To");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 21, 70, -1));

        jLabel2.setText("Advance Library");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/library-3.png.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 830));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Login Page");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel5.setText("Login To Your Account");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        txt_use.setPlaceholder("Enter The Username");
        txt_use.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_useActionPerformed(evt);
            }
        });
        jPanel2.add(txt_use, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        txt_pass.setPlaceholder("Enter The Password");
        jPanel2.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        rSMaterialButtonCircle1.setText("SignUp");
        rSMaterialButtonCircle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle1MouseClicked(evt);
            }
        });
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 240, -1));

        rSMaterialButtonCircle2.setText("Login");
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 250, -1));

        jLabel14.setText("X");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 20, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 540, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
  
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
     System.exit(0);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void txt_useActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_useActionPerformed

    }//GEN-LAST:event_txt_useActionPerformed

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
  if(validateLogin())
  {
      Login();
  }
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void rSMaterialButtonCircle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1MouseClicked
 SignUpPage page = new SignUpPage();
 page.setVisible(true);
 dispose();
    }//GEN-LAST:event_rSMaterialButtonCircle1MouseClicked

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private app.bolivia.swing.JCTextField txt_pass;
    private app.bolivia.swing.JCTextField txt_use;
    // End of variables declaration//GEN-END:variables
}
