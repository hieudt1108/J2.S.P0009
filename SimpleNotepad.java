
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huynh Lam - SE62917
 */
public class SimpleNotepad extends javax.swing.JFrame {

    /**
     * Creates new form SimpleNotepad
     */
    public SimpleNotepad() {
        initComponents();

        // Set mnemonic
        mnNew.setMnemonic(KeyEvent.VK_N);
        mnSave.setMnemonic(KeyEvent.VK_S);
        mnCopy.setMnemonic(KeyEvent.VK_C);
        mnCut.setMnemonic(KeyEvent.VK_X);
        mnDelete.setMnemonic(KeyEvent.VK_DELETE);
        mnEdit.setMnemonic(KeyEvent.VK_E);
        mnFile.setMnemonic(KeyEvent.VK_F);
        mnPaste.setMnemonic(KeyEvent.VK_V);
        mnSelectAll.setMnemonic(KeyEvent.VK_A);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mnNew = new javax.swing.JMenuItem();
        mnSave = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnExit = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        mnCopy = new javax.swing.JMenuItem();
        mnCut = new javax.swing.JMenuItem();
        mnPaste = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnDelete = new javax.swing.JMenuItem();
        mnSelectAll = new javax.swing.JMenuItem();
        mnView = new javax.swing.JMenu();
        mnLight = new javax.swing.JMenuItem();
        mnDark = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Notepad");

        txt.setColumns(20);
        txt.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        mnFile.setText("File");
        mnFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        mnNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnNew.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mnNew.setText("New");
        mnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewActionPerformed(evt);
            }
        });
        mnFile.add(mnNew);

        mnSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnSave.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mnSave.setText("Save");
        mnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveActionPerformed(evt);
            }
        });
        mnFile.add(mnSave);
        mnFile.add(jSeparator2);

        mnExit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        mnFile.add(mnExit);

        jMenuBar1.add(mnFile);

        mnEdit.setText("Edit");
        mnEdit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        mnCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnCopy.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mnCopy.setText("Copy");
        mnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCopyActionPerformed(evt);
            }
        });
        mnEdit.add(mnCopy);

        mnCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnCut.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mnCut.setText("Cut");
        mnCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCutActionPerformed(evt);
            }
        });
        mnEdit.add(mnCut);

        mnPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        mnPaste.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mnPaste.setText("Paste");
        mnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPasteActionPerformed(evt);
            }
        });
        mnEdit.add(mnPaste);
        mnEdit.add(jSeparator1);

        mnDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        mnDelete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mnDelete.setText("Delete");
        mnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDeleteActionPerformed(evt);
            }
        });
        mnEdit.add(mnDelete);

        mnSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnSelectAll.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mnSelectAll.setText("Select All");
        mnSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSelectAllActionPerformed(evt);
            }
        });
        mnEdit.add(mnSelectAll);

        jMenuBar1.add(mnEdit);

        mnView.setText("View Mode");
        mnView.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        mnLight.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mnLight.setText("Light");
        mnLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLightActionPerformed(evt);
            }
        });
        mnView.add(mnLight);

        mnDark.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mnDark.setText("Dark");
        mnDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDarkActionPerformed(evt);
            }
        });
        mnView.add(mnDark);

        jMenuBar1.add(mnView);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCopyActionPerformed
        txt.copy();
    }//GEN-LAST:event_mnCopyActionPerformed

    private void mnCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCutActionPerformed
        txt.cut();
    }//GEN-LAST:event_mnCutActionPerformed

    private void mnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPasteActionPerformed
        txt.paste();
    }//GEN-LAST:event_mnPasteActionPerformed

    private void mnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDeleteActionPerformed
        txt.replaceSelection("");
    }//GEN-LAST:event_mnDeleteActionPerformed

    private void mnSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSelectAllActionPerformed
        txt.selectAll();
    }//GEN-LAST:event_mnSelectAllActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        if (!txt.getText().equals("")) {
            int ans = JOptionPane.showConfirmDialog(null, "Do you want to save File?", "Warning", JOptionPane.YES_NO_OPTION);
            if (ans == JOptionPane.YES_OPTION) {
                JFileChooser fc = new JFileChooser();
                int choice = fc.showSaveDialog(null);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    File f = fc.getSelectedFile();
                    saveFile(f);
                    this.dispose();
                }
            } else {
                System.exit(0);
            }
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_mnExitActionPerformed

    // Save File Function
    public void saveFile(File f) {
        PrintWriter w = null;
        try {
            w = new PrintWriter(f);
            w.print(txt.getText());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (w != null) {
                    w.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void mnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveActionPerformed
        if (!txt.getText().equals("")) {
            int ans = JOptionPane.showConfirmDialog(null, "Do you want to save File?", "Warning", JOptionPane.YES_NO_OPTION);
            if (ans == JOptionPane.YES_OPTION) {
                JFileChooser fc = new JFileChooser();
                int choice = fc.showSaveDialog(null);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    File f = fc.getSelectedFile();
                    saveFile(f);
                }
            }
        } else {
            JFileChooser fc = new JFileChooser();
            int choice = fc.showSaveDialog(null);
            if (choice == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                saveFile(f);
            }
        }
    }//GEN-LAST:event_mnSaveActionPerformed

    private void mnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewActionPerformed
        if (!txt.getText().equals("")) {
            int ans = JOptionPane.showConfirmDialog(null, "Do you want to save File?", "Warning", JOptionPane.YES_NO_OPTION);
            if (ans == JOptionPane.YES_OPTION) {
                JFileChooser fc = new JFileChooser();
                int choice = fc.showSaveDialog(null);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    File f = fc.getSelectedFile();
                    saveFile(f);
                    txt.setText("");
                }
            } else {
                txt.setText("");
            }
        }
    }//GEN-LAST:event_mnNewActionPerformed

    private void mnLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLightActionPerformed
        txt.setBackground(Color.WHITE);
        txt.setForeground(Color.BLACK);
    }//GEN-LAST:event_mnLightActionPerformed

    private void mnDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDarkActionPerformed
        txt.setBackground(Color.BLACK);
        txt.setForeground(Color.WHITE);
    }//GEN-LAST:event_mnDarkActionPerformed

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
            java.util.logging.Logger.getLogger(SimpleNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleNotepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem mnCopy;
    private javax.swing.JMenuItem mnCut;
    private javax.swing.JMenuItem mnDark;
    private javax.swing.JMenuItem mnDelete;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenuItem mnLight;
    private javax.swing.JMenuItem mnNew;
    private javax.swing.JMenuItem mnPaste;
    private javax.swing.JMenuItem mnSave;
    private javax.swing.JMenuItem mnSelectAll;
    private javax.swing.JMenu mnView;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}
