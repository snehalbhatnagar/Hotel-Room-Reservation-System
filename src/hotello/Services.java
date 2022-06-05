/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotello;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.awt.Toolkit;

import java.sql.SQLException;
import javax.swing.ImageIcon;

/**
 *
 * @author Anurag
 */
public class Services extends javax.swing.JFrame {

    /**
     * Creates new form Services
     */
    public Services() {
        initComponents();
        
         {
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("service.png")));
        
        Image image1 = myImage.getImage();
        Image image2 = image1.getScaledInstance(jLabel5.getWidth(),jLabel5.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon a = new ImageIcon(image2);
        
        jLabel5.setIcon(a);
      }
    }

   public Services(String id,String gname){
       initComponents();
   bookid=id;
   name=gname;
 //  roomno=roomnum;
  // intime=in_time;
  // outtime=out_time;
   }
   
/*public Services(int roomnum){
   initComponents();
    
}*/
   
   String bookid,name,intime,outtime;
   String roomno;

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spa_CB = new javax.swing.JCheckBox();
        gym_CB = new javax.swing.JCheckBox();
        pool_CB = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Services");
        getContentPane().setLayout(null);

        spa_CB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        spa_CB.setText("Spa");
        spa_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spa_CBActionPerformed(evt);
            }
        });
        getContentPane().add(spa_CB);
        spa_CB.setBounds(37, 76, 65, 37);

        gym_CB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gym_CB.setText("Gym");
        gym_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gym_CBActionPerformed(evt);
            }
        });
        getContentPane().add(gym_CB);
        gym_CB.setBounds(37, 131, 73, 37);

        pool_CB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pool_CB.setText("Pool");
        pool_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pool_CBActionPerformed(evt);
            }
        });
        getContentPane().add(pool_CB);
        pool_CB.setBounds(37, 186, 69, 37);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 400, 280);

        jMenu1.setText("Options");

        jMenuItem3.setText("Back");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Main Menu ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spa_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spa_CBActionPerformed
//bookid= booking_IDTF.getText();
 if(spa_CB.isSelected()){
    JOptionPane.showMessageDialog(this,"You have opted to avail the spa service.","Information",1);   
 
try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection
("jdbc:mysql://localhost:3306/Hotel_TopSky",
"root", "12345");
Statement stmt = (Statement) con.createStatement();
String query="INSERT INTO Spa VALUES('"+bookid+"','"+name+"');";
stmt.executeUpdate(query);
}
catch(Exception e)

{

JOptionPane.showMessageDialog (this, e.getMessage());
}
}
else{
        
 try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection
("jdbc:mysql://localhost:3306/Hotel_TopSky",
"root", "12345");
Statement stmt = (Statement) con.createStatement();
String query="DELETE FROM Spa WHERE Booking_ID='"+bookid+"';";
stmt.executeUpdate(query);
}
catch(Exception e)

{

JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        }
    




// TODO add your handling code here:
    }//GEN-LAST:event_spa_CBActionPerformed

    private void gym_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gym_CBActionPerformed
if(gym_CB.isSelected()){
    JOptionPane.showMessageDialog(this,"You have opted to avail the gym facility.","Information",1);
try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection
("jdbc:mysql://localhost:3306/Hotel_TopSky",
"root", "12345");
Statement stmt = (Statement) con.createStatement();
String query="INSERT INTO Gym VALUES('"+bookid+"','"+name+"');";
stmt.executeUpdate(query);
}
catch(Exception e)

{

JOptionPane.showMessageDialog (this, e.getMessage());
}
}
else{
        
 try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection
("jdbc:mysql://localhost:3306/Hotel_TopSky","root", "12345");
Statement stmt = (Statement) con.createStatement();
String query="DELETE FROM Gym WHERE Booking_ID='"+bookid+"';";
stmt.executeUpdate(query);
}
catch(Exception e)

{

JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        }// TODO add your handling code here:
    }//GEN-LAST:event_gym_CBActionPerformed

    private void pool_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pool_CBActionPerformed
if(pool_CB.isSelected()){
    JOptionPane.showMessageDialog(this,"You have opted to avail the swimming pool facility.","Information",1);
try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection
("jdbc:mysql://localhost:3306/Hotel_TopSky",
"root", "12345");
Statement stmt = (Statement) con.createStatement();
String query="INSERT INTO Pool VALUES('"+bookid+"','"+name+"');";
stmt.executeUpdate(query);
}
catch(Exception e)

{

JOptionPane.showMessageDialog (this, e.getMessage());
}
}  
else{
        
 try
{
Class.forName("java.sql.DriverManager");
Connection con = (Connection)
DriverManager.getConnection
("jdbc:mysql://localhost:3306/Hotel_TopSky",
"root", "12345");
Statement stmt = (Statement) con.createStatement();
String query="DELETE FROM Pool WHERE Booking_ID='"+bookid+"';";
stmt.executeUpdate(query);
}
catch(Exception e)

{

JOptionPane.showMessageDialog (this, e.getMessage());
}
        
        }// TODO add your handling code here:
    }//GEN-LAST:event_pool_CBActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MainMenu frame1=new MainMenu();
        Services.this.setVisible(false);
        frame1.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    HotelTopskyBooking frame1=new HotelTopskyBooking();
        Services.this.setVisible(false);
        frame1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Services().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox gym_CB;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JCheckBox pool_CB;
    private javax.swing.JCheckBox spa_CB;
    // End of variables declaration//GEN-END:variables
}
