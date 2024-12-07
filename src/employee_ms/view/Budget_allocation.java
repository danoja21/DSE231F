package employee_ms.view;

public class Budget_allocation extends javax.swing.JFrame {

    public Budget_allocation(String dashboardName) {
        initComponents();
        
        if ("FM_dashboard".equals(dashboardName)) {
        btnView.setVisible(true);
        btnCreate.setVisible(true);
        btnUpdate.setVisible(true);
        btnClear.setVisible(true);
    } else {
        // Set visibility to false or handle other dashboards
        btnView.setVisible(false);
        btnCreate.setVisible(false);
        btnUpdate.setVisible(false);
        btnClear.setVisible(false);
    }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtDescription = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtItemCategory = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBudgetId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        budgetTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buget Allocation");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(0, 0, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 0));
        jButton6.setText("Update");
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 0, 204));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 0));
        btnUpdate.setText("Update");
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 130, -1));

        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 210, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Amount");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Transaction Date");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        btnCreate.setBackground(new java.awt.Color(0, 0, 204));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 0));
        btnCreate.setText("Create");
        jPanel2.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 130, -1));

        btnView.setBackground(new java.awt.Color(0, 0, 204));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 0));
        btnView.setText("View");
        jPanel2.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 130, -1));

        btnClear.setBackground(new java.awt.Color(0, 0, 204));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 0));
        btnClear.setText("Clear");
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 120, -1));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 210, 30));

        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Description");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Budget ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtItemCategory.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(txtItemCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item Category");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtBudgetId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(txtBudgetId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 200, -1));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 40, 920, 240);

        budgetTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Budget ID", "ICategory", "Description", "Amount", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(budgetTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 340, 830, 250);

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Budget Allocation");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 0, 1170, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 670));

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
            java.util.logging.Logger.getLogger(Budget_allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Budget_allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Budget_allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Budget_allocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Budget_allocation("FM_dashboard").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JTable budgetTable;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBudgetId;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtItemCategory;
    // End of variables declaration//GEN-END:variables
}
