package employee_ms.view;

public class Employee extends javax.swing.JFrame {
    
    public Employee(String source) {
        initComponents();
      
        switch (source) {
            case "Admin_dashboard":
                btnCreate.setVisible(true);
                btnUpdate.setVisible(true);
                btnView.setVisible(true);
                btnClear.setVisible(true);
                break;
            case "FM_dashboard":
            case "PM_dashboard":
            case "CEO_dashboard":
            case "CM_dashboard":
                btnCreate.setVisible(false);
                btnUpdate.setVisible(true);
                btnView.setVisible(true);
                btnClear.setVisible(true);
                break;
            default:
                // Handle unexpected cases or set default visibility
                btnCreate.setVisible(false);
                btnUpdate.setVisible(true);
                btnView.setVisible(true);
                btnClear.setVisible(true);
                break;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        rSPanelImage5 = new rojerusan.RSPanelImage();
        jLabel46 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 40, -1, -1));

        jLabel31.setBackground(new java.awt.Color(0, 0, 102));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Employee ");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, -1));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 1360, 40);

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(null);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("First Name");
        jPanel3.add(jLabel32);
        jLabel32.setBounds(50, 70, 91, 25);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Last Name");
        jPanel3.add(jLabel33);
        jLabel33.setBounds(49, 137, 89, 25);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Date of Birth");
        jPanel3.add(jLabel34);
        jLabel34.setBounds(49, 200, 110, 25);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Address");
        jPanel3.add(jLabel35);
        jLabel35.setBounds(49, 253, 68, 25);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Age");
        jPanel3.add(jLabel36);
        jLabel36.setBounds(49, 311, 34, 25);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Gender");
        jPanel3.add(jLabel37);
        jLabel37.setBounds(49, 367, 62, 25);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Phone");
        jPanel3.add(jLabel38);
        jLabel38.setBounds(50, 430, 54, 25);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Join Date");
        jPanel3.add(jLabel39);
        jLabel39.setBounds(520, 80, 80, 25);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Email");
        jPanel3.add(jLabel40);
        jLabel40.setBounds(520, 150, 46, 25);

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("NIC Number");
        jPanel3.add(jLabel41);
        jLabel41.setBounds(520, 200, 105, 25);

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Position");
        jPanel3.add(jLabel42);
        jLabel42.setBounds(520, 260, 69, 25);

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Add Image");
        jPanel3.add(jLabel43);
        jLabel43.setBounds(990, 240, 93, 25);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Qualification");
        jPanel3.add(jLabel44);
        jLabel44.setBounds(520, 380, 110, 25);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("More Details");
        jPanel3.add(jLabel45);
        jLabel45.setBounds(520, 440, 108, 25);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(jTextField1);
        jTextField1.setBounds(186, 72, 241, 28);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(jTextField2);
        jTextField2.setBounds(680, 140, 250, 28);

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(jTextField4);
        jTextField4.setBounds(186, 252, 241, 28);

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(jTextField5);
        jTextField5.setBounds(186, 310, 241, 28);

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(jTextField7);
        jTextField7.setBounds(181, 430, 250, 28);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female ", "Male" }));
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(186, 366, 241, 28);

        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(jDateChooser1);
        jDateChooser1.setBounds(186, 200, 241, 22);

        jDateChooser2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(jDateChooser2);
        jDateChooser2.setBounds(680, 80, 240, 22);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(jTextField3);
        jTextField3.setBounds(186, 136, 241, 28);

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(jTextField6);
        jTextField6.setBounds(680, 200, 250, 28);

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel3.add(jTextField11);
        jTextField11.setBounds(680, 430, 400, 114);

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bachelor's degree in Business Administration", "Bachelor’s degree in Computer Science", "Bachelor’s degree in Human Resources", "Bachelor’s degree in Business", "Bachelor’s degree in Finance" }));
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(680, 370, 400, 28);

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEO", "Financial Manager", "Admin", "Program Manager", "Center Manager" }));
        jPanel3.add(jComboBox3);
        jComboBox3.setBounds(680, 260, 164, 28);

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5-7 years of experience in operations management", "7-10 years in IT, with at least 3-5 years in a managerial role", "5-8 years in HR roles, with at least 3 years in a leadership role", "10-15+ years of progressive experience in leadership roles", "5-8 years of experience in financial management ", " " }));
        jPanel3.add(jComboBox4);
        jComboBox4.setBounds(680, 310, 398, 28);

        btnCreate.setBackground(new java.awt.Color(0, 0, 153));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 0));
        btnCreate.setText("Create");
        jPanel3.add(btnCreate);
        btnCreate.setBounds(210, 600, 136, 50);

        btnView.setBackground(new java.awt.Color(0, 0, 153));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 0));
        btnView.setText("View");
        jPanel3.add(btnView);
        btnView.setBounds(390, 600, 122, 50);

        btnUpdate.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 0));
        btnUpdate.setText("Update");
        jPanel3.add(btnUpdate);
        btnUpdate.setBounds(550, 600, 115, 50);

        btnClear.setBackground(new java.awt.Color(0, 0, 153));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 0));
        btnClear.setText("Clear");
        jPanel3.add(btnClear);
        btnClear.setBounds(700, 600, 117, 50);

        rSPanelImage5.setImagen(new javax.swing.ImageIcon(getClass().getResource("/UI Icons/Images/position.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage5Layout = new javax.swing.GroupLayout(rSPanelImage5);
        rSPanelImage5.setLayout(rSPanelImage5Layout);
        rSPanelImage5Layout.setHorizontalGroup(
            rSPanelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        rSPanelImage5Layout.setVerticalGroup(
            rSPanelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jPanel3.add(rSPanelImage5);
        rSPanelImage5.setBounds(960, 80, 160, 160);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Experience");
        jPanel3.add(jLabel46);
        jLabel46.setBounds(520, 320, 93, 25);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1570, 780);

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee("Admin_dashboard").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtAddress;
    private javax.swing.JTextField TxtAddress1;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private rojerusan.RSPanelImage rSPanelImage5;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtEmpId1;
    // End of variables declaration//GEN-END:variables
}