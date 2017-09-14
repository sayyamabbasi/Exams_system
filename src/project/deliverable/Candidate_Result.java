/*c
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.deliverable;

import java.sql.SQLException;

/**
 *
 * @author Muhammad Junaid Tari
 */
public class Candidate_Result extends javax.swing.JFrame {

    CandidateView candview;
    public Candidate_Result(CandidateView cand) throws SQLException {
        this.candview = new CandidateView();
        initComponents();
        candview=cand;
        this.candname.setText(candview.cand_name);
        this.rno.setText(Integer.toString(candview.rollno));
        this.degpro.setText(candview.dept);
        this.attempquest.setText(Integer.toString(candview.size));
        this.corrquest.setText(Integer.toString(candview.tr));
        this.wrongans.setText(Integer.toString(candview.fl));
        this.totalmarks.setText(Double.toString(candview.total));
        this.totalquest.setText(Integer.toString(candview.returncat()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        corrquest = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        wrongans = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        rno = new javax.swing.JLabel();
        candname = new javax.swing.JLabel();
        degpro = new javax.swing.JLabel();
        totalquest = new javax.swing.JLabel();
        attempquest = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        totalmarks = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        exit_um = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Candidate Roll no");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 210, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel2.setText("Candidate Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, 204, -1));

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel3.setText("Degree Program");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 168, 204, -1));

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel4.setText("Total Questions Were");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, -1, -1));

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setText("Attempted Question");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 276, 204, -1));

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel6.setText("Correct Answers");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 180, -1));

        corrquest.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        corrquest.setText("jLabel7");
        getContentPane().add(corrquest, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 80, -1));

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel7.setText("Wrong Answers");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        wrongans.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        wrongans.setText("jLabel8");
        getContentPane().add(wrongans, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 90, -1));

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel8.setText("Total Marks are :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 362, 200, -1));

        OK.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        OK.setText("Ok");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        getContentPane().add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 418, 75, -1));

        rno.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        rno.setText("jLabel10");
        getContentPane().add(rno, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        candname.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        candname.setText("jLabel12");
        getContentPane().add(candname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        degpro.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        degpro.setText("jLabel13");
        getContentPane().add(degpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        totalquest.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        totalquest.setText("jLabel14");
        getContentPane().add(totalquest, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        attempquest.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        attempquest.setText("jLabel15");
        getContentPane().add(attempquest, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalmarks.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        totalmarks.setText("jLabel10");
        jPanel1.add(totalmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 189, 21));

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel9.setText("Candidate Result");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 260, -1));

        exit_um.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        exit_um.setText("Logout");
        exit_um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_umActionPerformed(evt);
            }
        });
        jPanel1.add(exit_um, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 140, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/deliverable/banner-bg-home.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 730, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        this.dispose();
    }//GEN-LAST:event_OKActionPerformed

    private void exit_umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_umActionPerformed
        this.setVisible(false);
        StartProject sp=new StartProject();
        sp.setVisible(true);
    }//GEN-LAST:event_exit_umActionPerformed

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
            java.util.logging.Logger.getLogger(Candidate_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Candidate_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Candidate_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Candidate_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            //  new Candidate_Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JLabel attempquest;
    private javax.swing.JLabel candname;
    private javax.swing.JLabel corrquest;
    private javax.swing.JLabel degpro;
    private javax.swing.JButton exit_um;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel rno;
    private javax.swing.JLabel totalmarks;
    private javax.swing.JLabel totalquest;
    private javax.swing.JLabel wrongans;
    // End of variables declaration//GEN-END:variables
}
