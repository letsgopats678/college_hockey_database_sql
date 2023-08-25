/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import entity.*;
import java.util.Optional;

/**
 *
 * @author Gokhan
 */
public class Main extends javax.swing.JFrame {
    private static DAO prospectsDAO;

    public Main() {
        initComponents();
        refreshProspectsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProspects = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        txtCollege = new javax.swing.JTextField();
        jLabelCollege = new javax.swing.JLabel();
        jLabelNHLTeam = new javax.swing.JLabel();
        txtNHLTeam = new javax.swing.JTextField();
        jLabelPosition = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        jLabelDraftSelection = new javax.swing.JLabel();
        txtDraftSelection = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Addressbook CRUD");
        setResizable(false);

        jLabelID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelID.setText("ID");

        jLabelFirstName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelFirstName.setText("First Name");

        jLabelLastName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelLastName.setText("Last Name");
        jLabelLastName.setToolTipText("");

        tblProspects.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "College", "NHL Team", "Age", "Position", "Draft Selection"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProspects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProspectsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProspects);
        if (tblProspects.getColumnModel().getColumnCount() > 0) {
            tblProspects.getColumnModel().getColumn(2).setResizable(false);
        }

        btnInsert.setText("Save");
        btnInsert.setActionCommand("Insert");
        btnInsert.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInsert.setIconTextGap(0);
        btnInsert.setInheritsPopupMenu(true);
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete1.setText("Delete");
        btnDelete1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        jLabelCollege.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCollege.setText("College");
        jLabelCollege.setToolTipText("");

        jLabelNHLTeam.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelNHLTeam.setText("NHL Team");
        jLabelNHLTeam.setToolTipText("");

        jLabelPosition.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelPosition.setText("Position");
        jLabelPosition.setToolTipText("");

        jLabelAge.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelAge.setText("Age");
        jLabelAge.setToolTipText("");

        jLabelDraftSelection.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelDraftSelection.setText("Draft Selection");
        jLabelDraftSelection.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPosition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNHLTeam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCollege, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelLastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDraftSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNHLTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDraftSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCollege, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNHLTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNHLTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDraftSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDraftSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );

        jLabelLastName.getAccessibleContext().setAccessibleName("ID");
        btnInsert.getAccessibleContext().setAccessibleName("Insert");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
        if (!txtID.getText().isEmpty()) {
            int ID = Integer.parseInt(txtID.getText().trim());
            String fName = txtFName.getText().trim();
            String lName = txtLName.getText().trim();
            String college = txtCollege.getText().trim();
            String nhlTeam = txtNHLTeam.getText().trim();
            String age = txtAge.getText().trim();
            String position = txtPosition.getText().trim();
            String draftSelection = txtDraftSelection.getText().trim();
            //String position = txtDraftSelection.getText().trim();
            addProspect(ID, fName, lName, college, nhlTeam, age, position, draftSelection);
            refreshProspectsTable();
            clearTextFields();
        }
        else
        {
            alert("ID cannot be empty", "Insert error");
        }
    }                                         

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if (!txtID.getText().isEmpty()) {
            int ID = Integer.parseInt(txtID.getText().trim());
            String fName = txtFName.getText().trim();
            String lName = txtLName.getText().trim();
            String college = txtCollege.getText().trim();
            String nhlTeam = txtNHLTeam.getText().trim();
            String age = txtAge.getText().trim();
            String position = txtPosition.getText().trim();
            String draftSelection = txtDraftSelection.getText().trim();
            //String position = txtDraftSelection.getText().trim();
            Prospects prospect = getProspect(ID);
            if(prospect.getID() != -1) {
                updateProspect(ID, fName, lName, college, nhlTeam, age, position, draftSelection);
                refreshProspectsTable();
            }
            else
            {
                alert("Prospect does not exist", "Update error");
            }
        }
        else
        {
            alert("ID cannot be empty", "Update error");
        }
    }                                         

    //set the values of a row to the textfields
    private void tblProspectsMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        int i = tblProspects.getSelectedRow();
        TableModel model = tblProspects.getModel();
        txtID.setText(model.getValueAt(i, 0).toString());
        txtFName.setText(model.getValueAt(i, 1).toString());
        txtLName.setText(model.getValueAt(i, 2).toString());
        txtCollege.setText(model.getValueAt(i, 3).toString());
        txtNHLTeam.setText(model.getValueAt(i,4).toString());
        txtAge.setText(model.getValueAt(i, 5).toString());
        txtPosition.setText(model.getValueAt(i, 6).toString());
        txtDraftSelection.setText(model.getValueAt(i, 7).toString());
        //txtPosition.setText(model.getValueAt(i, 8).toString());
    }                                         

    //handles delete button action
    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if (!txtID.getText().isEmpty()) {
            int ID = Integer.parseInt(txtID.getText().trim());
            String fName = txtFName.getText().trim();
            String lName = txtLName.getText().trim();
            String college = txtCollege.getText().trim();
            String nhlTeam = txtNHLTeam.getText().trim();
            String age = txtAge.getText().trim();
            String position = txtPosition.getText().trim();
            String draftSelection = txtDraftSelection.getText().trim();
            //String position = txtDraftSelection.getText().trim();
            Prospects prospect = getProspect(ID);
            if(prospect.getID() != -1) {
                int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to Delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION);
                if(option == 0) {
                    deleteProspect(ID, fName, lName, college, nhlTeam, age, position, draftSelection);
                    refreshProspectsTable();
                    clearTextFields();
                }
            }
            else
            {
                alert("Prospect does not exist", "Delete error");
            }
        }
        else
        {
            alert("ID cannot be empty", "Delete error");
        }
    }                                          

    //method to show an info alert
    public void alert(String msg) {
        JOptionPane.showMessageDialog(rootPane, msg);
    }

    //method to show an error alert
    public void alert(String msg, String title) {
        JOptionPane.showMessageDialog(rootPane, msg, title, JOptionPane.ERROR_MESSAGE);
    }

    private static void addProspect(int id, String firstName, String lastName, String college, String nhlTeam, String age, String position, String draftSelection) {
        Prospects prospect;
        prospect = new Prospects(id, firstName, lastName, college, nhlTeam, age, position, draftSelection);
        prospectsDAO.insert(prospect);
    }
    
    private static void updateProspect(int id, String firstName, String lastName, String college, String nhlTeam, String age, String position, String draftSelection) {
        Prospects prospect;
        prospect = new Prospects(id, firstName, lastName, college, nhlTeam, age, position, draftSelection);
        prospectsDAO.update(prospect);
    }
    
    private static void deleteProspect(int id, String firstName, String lastName, String college, String nhlTeam, String age, String position, String draftSelection) {
        Prospects prospect;
        prospect = new Prospects(id, firstName, lastName, college, nhlTeam, age, position, draftSelection);
        prospectsDAO.delete(prospect);
    }
    
    static Prospects getProspect(int id) {
        Optional<Prospects> prospect = prospectsDAO.get(id);
        return prospect.orElseGet(() -> new Prospects(-1, "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist", "Non-exist"));
    }
    
    //method to clear the txt fields
    private void clearTextFields() {
        txtID.setText("");
        txtFName.setText("");
        txtLName.setText("");
        txtCollege.setText("");
    }

    //fetch 
    private void refreshProspectsTable() {
        List<Prospects> prospects = prospectsDAO.getAll();
        DefaultTableModel model = (DefaultTableModel) tblProspects.getModel();
        //Clear all items in tblContacts
        for(int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }
        for (Prospects prospect : prospects) {
                Object[] row = new Object[8];
                row[0] = prospect.getID();
                row[1] = prospect.getFirstName();
                row[2] = prospect.getLastName();
                row[3] = prospect.getCollege();
                row[4] = prospect.getNHLTeam();
                row[5] = prospect.getAge();
                row[6] = prospect.getPosition();
                row[7] = prospect.getDraftSelection();
                model.addRow(row);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        prospectsDAO = new ProspectsDAO();
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelCollege;
    private javax.swing.JLabel jLabelDraftSelection;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelNHLTeam;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProspects;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCollege;
    private javax.swing.JTextField txtDraftSelection;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtNHLTeam;
    private javax.swing.JTextField txtPosition;
    // End of variables declaration                   
}