/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestKode;

/**
 *
 * @author lenovo
 */
public class DialogTest extends javax.swing.JDialog {

    /**
     * Creates new form DialogTest
     */
    public DialogTest(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jlDas = new javax.swing.JLabel();
        jlBarang = new javax.swing.JLabel();
        jlDiskon = new javax.swing.JLabel();
        jlRiwayat = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlTransaksi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 600));

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/kasir.png"))); // NOI18N

        jlDas.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jlDas.setForeground(new java.awt.Color(255, 255, 255));
        jlDas.setText("Dashboard");

        jlBarang.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jlBarang.setForeground(new java.awt.Color(255, 255, 255));
        jlBarang.setText("Barang");

        jlDiskon.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jlDiskon.setForeground(new java.awt.Color(255, 255, 255));
        jlDiskon.setText("Diskon");

        jlRiwayat.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jlRiwayat.setForeground(new java.awt.Color(255, 255, 255));
        jlRiwayat.setText("Riwayat");

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Aplikasi Kasir");

        jlTransaksi.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jlTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        jlTransaksi.setText("Transaksi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlRiwayat)
                            .addComponent(jlDiskon)
                            .addComponent(jlBarang)
                            .addComponent(jlDas)
                            .addComponent(jlTransaksi))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(70, 70, 70)
                .addComponent(jlDas)
                .addGap(15, 15, 15)
                .addComponent(jlBarang)
                .addGap(15, 15, 15)
                .addComponent(jlDiskon)
                .addGap(15, 15, 15)
                .addComponent(jlRiwayat)
                .addGap(15, 15, 15)
                .addComponent(jlTransaksi)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        jLabel2.setText("Barang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DialogTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogTest dialog = new DialogTest(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlBarang;
    private javax.swing.JLabel jlDas;
    private javax.swing.JLabel jlDiskon;
    private javax.swing.JLabel jlRiwayat;
    private javax.swing.JLabel jlTransaksi;
    // End of variables declaration//GEN-END:variables
}
