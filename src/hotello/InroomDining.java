package hotello;


import hotello.MainMenu;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class InroomDining extends javax.swing.JFrame {

    /**
     * Creates new form InroomDining
     */
    public InroomDining() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        itemList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        TotAmt_TF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("In-Room Dining");
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        getContentPane().setLayout(null);

        itemList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Shakkar Para", "Dal Makhani", "Espresso", "Caramel Custard", "Apple Crisp", "Sarson Ka Saag", "Cappuccino", "Chholar Dal", "Sandesh" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        itemList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                itemListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(itemList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(185, 27, 143, 196);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Total Amount To Be Paid is:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 254, 181, 39);

        TotAmt_TF.setEditable(false);
        getContentPane().add(TotAmt_TF);
        TotAmt_TF.setBounds(284, 256, 155, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotello/dessert.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 390);

        jMenu1.setText("Options");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_itemListValueChanged
        // TODO add your handling code here:
        Object [] selected=itemList.getSelectedValues();
int i=0;
int total=0;
int length= selected.length;
for (i=0;i<length;i++)
{
String item=(String) selected[i];
if (item.equals("Shakkar Para") || item.equals("Dal Makhani") || item.equals("Espresso") || item.equals("Caramel Custard") ||
item.equals("Apple Crisp"))
        {
            total=total+150;
        }
else if (item.equals("Sarson Ka Saag") || item.equals("Cappuccino"))
        {         
           total=total+250;
        }
else if (item.equals("Chholar Dal"))
        {
           total=total+200;
        }
else if (item.equals("Sandesh"))
        {
            total=total+100;
        }
}
//JOptionPane.showMessageDialog(this,"The amount to be paid is Rs."+total,"Hotel Top Sky",1);

TotAmt_TF.setText(" " + total);
    }//GEN-LAST:event_itemListValueChanged

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     MainMenu frame2= new MainMenu();
InroomDining.this.setVisible(false);
frame2.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(InroomDining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InroomDining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InroomDining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InroomDining.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InroomDining().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TotAmt_TF;
    private javax.swing.JList<String> itemList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
