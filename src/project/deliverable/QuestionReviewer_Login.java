/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.deliverable;

import connection.database.ConnectDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Muhammad Junaid Tari
 */
public class QuestionReviewer_Login extends javax.swing.JFrame {

    ConnectDatabase cb=new ConnectDatabase();
    public QuestionReviewer_Login() {
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

        loginquestrev = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginquestrev_name = new javax.swing.JTextField();
        loginquestrev_pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocation(new java.awt.Point(350, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginquestrev.setBackground(new java.awt.Color(255, 255, 255));
        loginquestrev.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                loginquestrevAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        loginquestrev.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        loginquestrev.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        ok.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        loginquestrev.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 67, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel2.setText("Enter Password");
        loginquestrev.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 229, -1, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Enter Login Name");
        loginquestrev.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 171, -1, -1));
        loginquestrev.add(loginquestrev_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 240, 40));
        loginquestrev.add(loginquestrev_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 240, 40));

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel4.setText("Question Reviewer   Login");
        loginquestrev.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 330, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/deliverable/banner-bg-home.png"))); // NOI18N
        loginquestrev.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 730, 560));

        getContentPane().add(loginquestrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        StartProject proj=new StartProject();
        this.setVisible(false);
        proj.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        String na=null;
        String pa=null;
        String nam=loginquestrev_name.getText();
        String pas=new String(loginquestrev_pass.getPassword());
        try
        {
            String query="Select memname,Password from Member where memname='"+nam+" 'and Password='"+pas+"'";
            ResultSet rset=cb.getData(query);
            while(rset.next())
            {
                na=rset.getString("memname");
                pa=rset.getString("Password");
            }
            if(na == null&&pa == null)
            {
                JOptionPane.showMessageDialog(null, "User name or password is invalid!");
            }
            else
            {
                QuestionReviewer questreview=new QuestionReviewer();
                questreview.setVisible(true);
                this.setVisible(false);
            }            
        }
        catch(NullPointerException err)
        {
            JOptionPane.showMessageDialog(null,"User name or password cannot be null ");
        } catch (SQLException ex) {
            Logger.getLogger(QuestionReviewer_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_okActionPerformed

    private void loginquestrevAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_loginquestrevAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_loginquestrevAncestorAdded
public JPanel getpanel()
{
    return loginquestrev;
}
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
            java.util.logging.Logger.getLogger(QuestionReviewer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionReviewer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionReviewer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionReviewer_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionReviewer_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel loginquestrev;
    private javax.swing.JTextField loginquestrev_name;
    private javax.swing.JPasswordField loginquestrev_pass;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
