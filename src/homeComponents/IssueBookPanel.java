package homeComponents;
import utilities.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;

public class IssueBookPanel extends javax.swing.JPanel {
    Date date =new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    String issueDate = formatter.format(date);
    
    public IssueBookPanel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bookIDTextField = new javax.swing.JTextField();
        studentIDTextField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        dueDateChooser = new com.toedter.calendar.JDateChooser();
        btn_issue = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        topBar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(35, 46, 51));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT ID");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ISSUE DATE");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BOOK ID");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DUE DATE");

        bookIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIDTextFieldActionPerformed(evt);
            }
        });

        studentIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIDTextFieldActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText(issueDate);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btn_issue.setBackground(new java.awt.Color(255, 255, 255));
        btn_issue.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        btn_issue.setForeground(new java.awt.Color(27, 32, 40));
        btn_issue.setText("ISSUE");
        btn_issue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_issueActionPerformed(evt);
            }
        });

        btn_clear.setForeground(new java.awt.Color(27, 32, 40));
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        topBar.setBackground(new java.awt.Color(32, 38, 46));
        topBar.setPreferredSize(new java.awt.Dimension(1000, 130));
        topBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeComponents/issueLogo.png"))); // NOI18N
        topBar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_issue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bookIDTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentIDTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dueDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bookIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(studentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(dueDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_issue)
                    .addComponent(btn_clear))
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIDTextFieldActionPerformed

    private void studentIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIDTextFieldActionPerformed

    private void btn_issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_issueActionPerformed
        String bookID = bookIDTextField.getText();
        String studentID = studentIDTextField.getText();
        String dueDate = formatter.format(dueDateChooser.getDate());
        try{
            Connection con=ConnectionProvider.getcon();
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select * from book where bookID='"+bookID+"'");
            if(rs1.next()){
                ResultSet rs2=st.executeQuery("select * from student where studentID='"+studentID+"'");
                    if(rs2.next()){
                        st.executeUpdate("insert into issue values('"+bookID+"','"+studentID+"','"+issueDate+"','"+dueDate+"')");
                            JOptionPane.showMessageDialog(null,"Book successfuly issued");
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Incorrect student ID");
            }
            else
                JOptionPane.showMessageDialog(null,"Incorrect book ID");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Book is already issued");
        }
    }//GEN-LAST:event_btn_issueActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookIDTextField;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_issue;
    private com.toedter.calendar.JDateChooser dueDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField studentIDTextField;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
