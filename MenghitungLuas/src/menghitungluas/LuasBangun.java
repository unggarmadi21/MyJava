/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitungluas;

/**
 *
 * @author maddi pc
 */
public class LuasBangun extends javax.swing.JFrame {

    /**
     * Creates new form LuasBangun
     */
    public LuasBangun() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jOptionPane1 = new javax.swing.JOptionPane();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        TombolExit = new javax.swing.JToggleButton();
        jColorChooser1 = new javax.swing.JColorChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        LuasSegitiga = new javax.swing.JMenuItem();
        LuasPersegi = new javax.swing.JMenuItem();
        MenghitungNilai = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenu1.setText("jMenu1");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setSize(new java.awt.Dimension(0, 0));

        TombolExit.setText("EXIT");
        TombolExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolExitActionPerformed(evt);
            }
        });

        jMenu2.setText("Menu Hitung");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        LuasSegitiga.setText("Luas Segitiga");
        LuasSegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuasSegitigaActionPerformed(evt);
            }
        });
        jMenu2.add(LuasSegitiga);

        LuasPersegi.setText("Luas Persegi");
        LuasPersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuasPersegiActionPerformed(evt);
            }
        });
        jMenu2.add(LuasPersegi);

        MenghitungNilai.setText("Menghitung Nilai");
        MenghitungNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenghitungNilaiActionPerformed(evt);
            }
        });
        jMenu2.add(MenghitungNilai);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");

        jMenu4.setText("jMenu4");
        jMenu3.add(jMenu4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TombolExit)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TombolExit)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void MenghitungNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenghitungNilaiActionPerformed
        // TODO add your handling code here:
            MenghitungNilai AF =  new MenghitungNilai();
            add(AF);
            AF.setVisible(true);
    }//GEN-LAST:event_MenghitungNilaiActionPerformed

    private void LuasPersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuasPersegiActionPerformed
        // TODO add your handling code here:
         MenghitungLuasPersegi ST =  new MenghitungLuasPersegi();
       
        add(ST);
        ST.setVisible(true);
    }//GEN-LAST:event_LuasPersegiActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
         MenghitungLuasPersegi ST =  new MenghitungLuasPersegi();
       
        add(ST);
        ST.setVisible(true);
       
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void LuasSegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuasSegitigaActionPerformed
        // TODO add your handling code here:
          MenghitungLuasSegitiga ST =  new MenghitungLuasSegitiga();
       
        add(ST);
        ST.setVisible(true);
    }//GEN-LAST:event_LuasSegitigaActionPerformed

    private void TombolExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolExitActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_TombolExitActionPerformed

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
            java.util.logging.Logger.getLogger(LuasBangun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LuasBangun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LuasBangun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LuasBangun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LuasBangun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem LuasPersegi;
    private javax.swing.JMenuItem LuasSegitiga;
    private javax.swing.JMenuItem MenghitungNilai;
    private javax.swing.JToggleButton TombolExit;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JOptionPane jOptionPane1;
    // End of variables declaration//GEN-END:variables
}
