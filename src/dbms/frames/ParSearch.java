/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms.frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ParSearch extends javax.swing.JFrame {

    /**
     * Creates new form ParSearch
     */
    public ParSearch() {
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

        search = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchRes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        IDchk = new javax.swing.JCheckBox();
        nameChk = new javax.swing.JCheckBox();
        cityChk = new javax.swing.JCheckBox();
        Pid = new javax.swing.JTextField();
        Pname = new javax.swing.JTextField();
        City = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        searchRes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pid", "Pname", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(searchRes);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SEARCH FOR PARTS");

        IDchk.setText("ID");
        IDchk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDchkActionPerformed(evt);
            }
        });

        nameChk.setText("NAME");
        nameChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameChkActionPerformed(evt);
            }
        });

        cityChk.setText("CITY");
        cityChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityChkActionPerformed(evt);
            }
        });

        Pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PidActionPerformed(evt);
            }
        });

        City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDchk, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameChk))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cityChk)))
                            .addComponent(jLabel2))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDchk)
                    .addComponent(nameChk)
                    .addComponent(cityChk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(City, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        String par_id = Pid.getText();
        String par_name = Pname.getText();
        String par_city = City.getText();

        boolean idCHK = IDchk.isSelected();
        boolean nameCHK = nameChk.isSelected();
        boolean cityCHK = cityChk.isSelected();

        Connection conn = null;
        Statement stmt = null;

        String querySt = " SELECT * FROM parts WHERE ";
        String query = null;

        if (idCHK && nameCHK && cityCHK) {
            query = querySt + "Pid = \"" + par_id + "\" AND " + "Pname = \""
            + par_name + "\" AND " + "City = \"" + par_city + "\"";
        } else if ((idCHK && nameCHK) || (nameCHK && cityCHK) || (idCHK && cityCHK)) {
            if (idCHK) {
                if (nameCHK) {
                    query = querySt + "Pid = \"" + par_id + "\" AND " + "Pname = \""
                    + par_name + "\"";
                } else {
                    query = querySt + "Pid = \"" + par_id + "\" AND " + "City = \"" + par_city + "\"";
                }
            } else {
                query = querySt + "Pname = \"" + par_name + "\" AND " + "City = \"" + par_city + "\"";
            }
        } else if (idCHK || nameCHK || cityCHK) {
            if (idCHK) {
                query = querySt + "Pid = \"" + par_id + "\"";
            } else if (nameCHK) {
                query = querySt + "Pname = \"" + par_name + "\"";
            } else {
                query = querySt + "City = \"" + par_city + "\"";
            }
        } else {
            showMessageDialog(null, "Please select at least one of the check boxes and try again");
        }

        try {

            conn = getDBConnection();

            //System.out.println(query);
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (searchRes.getRowCount() > 0) {
                ((DefaultTableModel) searchRes.getModel()).removeRow(0);
            }

            int columns = rs.getMetaData().getColumnCount();

            boolean found = false;

            while (rs.next()) {
                found = true;
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i); // 1
                }
                ((DefaultTableModel) searchRes.getModel()).insertRow(rs.getRow() - 1, row);
            }

            if(found == false)
            showMessageDialog(null,"The result set is empty.");

            IDchk.setSelected(false);
            nameChk.setSelected(false);
            cityChk.setSelected(false);

            Pid.setText("");
            Pname.setText("");
            City.setText("");
        }

        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());

            showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        MainFrame start = new MainFrame();
        start.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IDchkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDchkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDchkActionPerformed

    private void nameChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameChkActionPerformed

    private void cityChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityChkActionPerformed

    private void PidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PidActionPerformed

    private void CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityActionPerformed

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
            java.util.logging.Logger.getLogger(ParSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField City;
    private javax.swing.JCheckBox IDchk;
    private javax.swing.JTextField Pid;
    private javax.swing.JTextField Pname;
    private javax.swing.JCheckBox cityChk;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox nameChk;
    private javax.swing.JButton search;
    private javax.swing.JTable searchRes;
    // End of variables declaration//GEN-END:variables
    
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://localhost/mydb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "surbhi";

    private static Connection getDBConnection() {

        Connection conn = null;

        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }

        try {
            conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return conn;

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return conn;

    }


}