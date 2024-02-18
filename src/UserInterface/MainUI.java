/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

/**
 *
 * @author rolan
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        super("ToonWars");
        initComponents();
        secondQueueNick.setText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generalPanel = new javax.swing.JPanel();
        cartoonNetworkPanel = new javax.swing.JPanel();
        cartoonNetworkPanel_title = new javax.swing.JLabel();
        networkPanel_title = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        secondQueueNick_label1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        secondQueueNick1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        topQueueNick1 = new javax.swing.JTextArea();
        topQueueNick_label1 = new javax.swing.JLabel();
        supportQueueNick_label1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        thirdQueueNick1 = new javax.swing.JTextArea();
        thirdQueueNick_label1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        supportQueueNick1 = new javax.swing.JTextArea();
        nickelodeonPanel = new javax.swing.JPanel();
        secondQueueNick_label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nickelodeonPanel_title = new javax.swing.JLabel();
        topQueueNick_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        secondQueueNick = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        topQueueNick = new javax.swing.JTextArea();
        thirdQueueNick_label = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        thirdQueueNick = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        supportQueueNick = new javax.swing.JTextArea();
        supportQueueNick_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartoonNetworkPanel.setBackground(new java.awt.Color(255, 255, 255));
        cartoonNetworkPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartoonNetworkPanel_title.setBackground(new java.awt.Color(0, 0, 0));
        cartoonNetworkPanel_title.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        cartoonNetworkPanel_title.setForeground(new java.awt.Color(51, 51, 51));
        cartoonNetworkPanel_title.setText("CARTOON");
        cartoonNetworkPanel.add(cartoonNetworkPanel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 200, 60));

        networkPanel_title.setBackground(new java.awt.Color(51, 51, 51));
        networkPanel_title.setForeground(new java.awt.Color(255, 255, 255));
        networkPanel_title.setText("NETWORK");
        networkPanel_title.setFocusable(false);
        networkPanel_title.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        cartoonNetworkPanel.add(networkPanel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 210, 60));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        cartoonNetworkPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 360));

        secondQueueNick_label1.setBackground(new java.awt.Color(0, 0, 0));
        secondQueueNick_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        secondQueueNick_label1.setForeground(new java.awt.Color(51, 51, 51));
        secondQueueNick_label1.setText("Second Priority:");
        cartoonNetworkPanel.add(secondQueueNick_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 110, 30));

        secondQueueNick1.setBackground(new java.awt.Color(255, 255, 255));
        secondQueueNick1.setColumns(20);
        secondQueueNick1.setRows(5);
        secondQueueNick1.setBorder(null);
        jScrollPane6.setViewportView(secondQueueNick1);

        cartoonNetworkPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 260, 80));

        topQueueNick1.setBackground(new java.awt.Color(255, 255, 255));
        topQueueNick1.setColumns(20);
        topQueueNick1.setRows(5);
        topQueueNick1.setBorder(null);
        jScrollPane5.setViewportView(topQueueNick1);

        cartoonNetworkPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 260, 80));

        topQueueNick_label1.setBackground(new java.awt.Color(0, 0, 0));
        topQueueNick_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        topQueueNick_label1.setForeground(new java.awt.Color(51, 51, 51));
        topQueueNick_label1.setText("Top Priority:");
        cartoonNetworkPanel.add(topQueueNick_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 110, 30));

        supportQueueNick_label1.setBackground(new java.awt.Color(0, 0, 0));
        supportQueueNick_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        supportQueueNick_label1.setForeground(new java.awt.Color(51, 51, 51));
        supportQueueNick_label1.setText("Supports:");
        cartoonNetworkPanel.add(supportQueueNick_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 110, 30));

        thirdQueueNick1.setBackground(new java.awt.Color(255, 255, 255));
        thirdQueueNick1.setColumns(20);
        thirdQueueNick1.setRows(5);
        thirdQueueNick1.setBorder(null);
        jScrollPane7.setViewportView(thirdQueueNick1);

        cartoonNetworkPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 260, 80));

        thirdQueueNick_label1.setBackground(new java.awt.Color(0, 0, 0));
        thirdQueueNick_label1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        thirdQueueNick_label1.setForeground(new java.awt.Color(51, 51, 51));
        thirdQueueNick_label1.setText("Third Priority:");
        cartoonNetworkPanel.add(thirdQueueNick_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 110, 30));

        supportQueueNick1.setBackground(new java.awt.Color(255, 255, 255));
        supportQueueNick1.setColumns(20);
        supportQueueNick1.setRows(5);
        supportQueueNick1.setBorder(null);
        jScrollPane8.setViewportView(supportQueueNick1);

        cartoonNetworkPanel.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 260, 80));

        generalPanel.add(cartoonNetworkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 600, 640));

        nickelodeonPanel.setBackground(new java.awt.Color(255, 153, 0));
        nickelodeonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        secondQueueNick_label.setBackground(new java.awt.Color(0, 0, 0));
        secondQueueNick_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        secondQueueNick_label.setForeground(new java.awt.Color(255, 255, 255));
        secondQueueNick_label.setText("Second Priority:");
        nickelodeonPanel.add(secondQueueNick_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        nickelodeonPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 230, 360));

        nickelodeonPanel_title.setBackground(new java.awt.Color(0, 0, 0));
        nickelodeonPanel_title.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        nickelodeonPanel_title.setForeground(new java.awt.Color(255, 255, 255));
        nickelodeonPanel_title.setText("NICKELODEON");
        nickelodeonPanel.add(nickelodeonPanel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 280, 60));

        topQueueNick_label.setBackground(new java.awt.Color(0, 0, 0));
        topQueueNick_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        topQueueNick_label.setForeground(new java.awt.Color(255, 255, 255));
        topQueueNick_label.setText("Top Priority:");
        nickelodeonPanel.add(topQueueNick_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 30));

        secondQueueNick.setBackground(new java.awt.Color(255, 255, 255));
        secondQueueNick.setColumns(20);
        secondQueueNick.setRows(5);
        secondQueueNick.setBorder(null);
        jScrollPane1.setViewportView(secondQueueNick);

        nickelodeonPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 260, 80));

        topQueueNick.setBackground(new java.awt.Color(255, 255, 255));
        topQueueNick.setColumns(20);
        topQueueNick.setRows(5);
        topQueueNick.setBorder(null);
        jScrollPane2.setViewportView(topQueueNick);

        nickelodeonPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 260, 80));

        thirdQueueNick_label.setBackground(new java.awt.Color(0, 0, 0));
        thirdQueueNick_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        thirdQueueNick_label.setForeground(new java.awt.Color(255, 255, 255));
        thirdQueueNick_label.setText("Third Priority:");
        nickelodeonPanel.add(thirdQueueNick_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 110, 30));

        thirdQueueNick.setBackground(new java.awt.Color(255, 255, 255));
        thirdQueueNick.setColumns(20);
        thirdQueueNick.setRows(5);
        thirdQueueNick.setBorder(null);
        jScrollPane3.setViewportView(thirdQueueNick);

        nickelodeonPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 260, 80));

        supportQueueNick.setBackground(new java.awt.Color(255, 255, 255));
        supportQueueNick.setColumns(20);
        supportQueueNick.setRows(5);
        supportQueueNick.setBorder(null);
        jScrollPane4.setViewportView(supportQueueNick);

        nickelodeonPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 260, 80));

        supportQueueNick_label.setBackground(new java.awt.Color(0, 0, 0));
        supportQueueNick_label.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        supportQueueNick_label.setForeground(new java.awt.Color(255, 255, 255));
        supportQueueNick_label.setText("Supports:");
        nickelodeonPanel.add(supportQueueNick_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 110, 30));

        generalPanel.add(nickelodeonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 640));

        getContentPane().add(generalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        pack();
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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cartoonNetworkPanel;
    private javax.swing.JLabel cartoonNetworkPanel_title;
    private javax.swing.JPanel generalPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JFormattedTextField networkPanel_title;
    private javax.swing.JPanel nickelodeonPanel;
    private javax.swing.JLabel nickelodeonPanel_title;
    private javax.swing.JTextArea secondQueueNick;
    private javax.swing.JTextArea secondQueueNick1;
    private javax.swing.JLabel secondQueueNick_label;
    private javax.swing.JLabel secondQueueNick_label1;
    private javax.swing.JTextArea supportQueueNick;
    private javax.swing.JTextArea supportQueueNick1;
    private javax.swing.JLabel supportQueueNick_label;
    private javax.swing.JLabel supportQueueNick_label1;
    private javax.swing.JTextArea thirdQueueNick;
    private javax.swing.JTextArea thirdQueueNick1;
    private javax.swing.JLabel thirdQueueNick_label;
    private javax.swing.JLabel thirdQueueNick_label1;
    private javax.swing.JTextArea topQueueNick;
    private javax.swing.JTextArea topQueueNick1;
    private javax.swing.JLabel topQueueNick_label;
    private javax.swing.JLabel topQueueNick_label1;
    // End of variables declaration//GEN-END:variables
}