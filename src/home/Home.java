package home;
import java.awt.*;
import javax.swing.*;
import homeComponents.IssueBookPanel;
import homeComponents.NewBookPanel;
import homeComponents.NewMemberPanel;
import homeComponents.ReturnBookPanel;
import homeComponents.StatisticsPanel;
import login.Login;
/**
 * @author SHIBIN VERENGAL
 */
public class Home extends javax.swing.JFrame {
    NewMemberPanel newMemberPanel = new NewMemberPanel();
    NewBookPanel newBookPanel = new NewBookPanel();
    StatisticsPanel statisticsPanel = new StatisticsPanel();
    IssueBookPanel issueBookPanel = new IssueBookPanel();
    ReturnBookPanel returnBookPanel = new ReturnBookPanel();
    public Home() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        panelArea.add(newMemberPanel);
        panelArea.add(newBookPanel);
        panelArea.add(statisticsPanel);
        panelArea.add(issueBookPanel);
        panelArea.add(returnBookPanel);
        
        newMemberPanel.setVisible(true);
        newBookPanel.setVisible(false);
        statisticsPanel.setVisible(false);
        issueBookPanel.setVisible(false);
        returnBookPanel.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroud = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        btn_newMember = new javax.swing.JPanel();
        newMemberLabel = new javax.swing.JLabel();
        btn_newMemberFlag = new javax.swing.JPanel();
        btn_newBook = new javax.swing.JPanel();
        newBookLabel = new javax.swing.JLabel();
        btn_newBookFlag = new javax.swing.JPanel();
        btn_Statistics = new javax.swing.JPanel();
        statisticsLabel = new javax.swing.JLabel();
        btn_statisticsFlag = new javax.swing.JPanel();
        btn_issueBook = new javax.swing.JPanel();
        issueBookLabel = new javax.swing.JLabel();
        btn_issueBookFlag = new javax.swing.JPanel();
        btn_returnBook = new javax.swing.JPanel();
        returnBookLabel = new javax.swing.JLabel();
        btn_returnBookFlag = new javax.swing.JPanel();
        btn_logout = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        panelArea = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroud.setBackground(new java.awt.Color(35, 46, 51));
        backgroud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(27, 32, 40));
        sidepanel.setPreferredSize(new java.awt.Dimension(280, 720));

        btn_newMember.setBackground(new java.awt.Color(108, 109, 111));
        btn_newMember.setForeground(new java.awt.Color(27, 32, 40));
        btn_newMember.setOpaque(false);
        btn_newMember.setPreferredSize(new java.awt.Dimension(280, 70));
        btn_newMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_newMemberMousePressed(evt);
            }
        });

        newMemberLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        newMemberLabel.setForeground(new java.awt.Color(0, 255, 192));
        newMemberLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newMemberLabel.setText("NEW MEMBER");

        btn_newMemberFlag.setBackground(new java.awt.Color(0, 255, 192));
        btn_newMemberFlag.setPreferredSize(new java.awt.Dimension(16, 70));
        btn_newMemberFlag.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout btn_newMemberLayout = new javax.swing.GroupLayout(btn_newMember);
        btn_newMember.setLayout(btn_newMemberLayout);
        btn_newMemberLayout.setHorizontalGroup(
            btn_newMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_newMemberLayout.createSequentialGroup()
                .addComponent(btn_newMemberFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newMemberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_newMemberLayout.setVerticalGroup(
            btn_newMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_newMemberLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(newMemberLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_newMemberLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_newMemberFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_newBook.setBackground(new java.awt.Color(27, 32, 40));
        btn_newBook.setForeground(new java.awt.Color(27, 32, 40));
        btn_newBook.setPreferredSize(new java.awt.Dimension(280, 70));
        btn_newBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_newBookMousePressed(evt);
            }
        });

        newBookLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        newBookLabel.setForeground(new java.awt.Color(255, 255, 255));
        newBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newBookLabel.setText("NEW BOOK");

        btn_newBookFlag.setBackground(new java.awt.Color(27, 32, 40));
        btn_newBookFlag.setPreferredSize(new java.awt.Dimension(16, 70));
        btn_newBookFlag.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout btn_newBookLayout = new javax.swing.GroupLayout(btn_newBook);
        btn_newBook.setLayout(btn_newBookLayout);
        btn_newBookLayout.setHorizontalGroup(
            btn_newBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_newBookLayout.createSequentialGroup()
                .addComponent(btn_newBookFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_newBookLayout.setVerticalGroup(
            btn_newBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_newBookLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(newBookLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_newBookLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_newBookFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_Statistics.setBackground(new java.awt.Color(27, 32, 40));
        btn_Statistics.setForeground(new java.awt.Color(27, 32, 40));
        btn_Statistics.setPreferredSize(new java.awt.Dimension(280, 70));
        btn_Statistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_StatisticsMousePressed(evt);
            }
        });

        statisticsLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        statisticsLabel.setForeground(new java.awt.Color(255, 255, 255));
        statisticsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statisticsLabel.setText("STATISTIC");

        btn_statisticsFlag.setBackground(new java.awt.Color(27, 32, 40));
        btn_statisticsFlag.setPreferredSize(new java.awt.Dimension(16, 70));
        btn_statisticsFlag.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout btn_StatisticsLayout = new javax.swing.GroupLayout(btn_Statistics);
        btn_Statistics.setLayout(btn_StatisticsLayout);
        btn_StatisticsLayout.setHorizontalGroup(
            btn_StatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_StatisticsLayout.createSequentialGroup()
                .addComponent(btn_statisticsFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statisticsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_StatisticsLayout.setVerticalGroup(
            btn_StatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_StatisticsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(statisticsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_StatisticsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_statisticsFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_issueBook.setBackground(new java.awt.Color(27, 32, 40));
        btn_issueBook.setForeground(new java.awt.Color(27, 32, 40));
        btn_issueBook.setPreferredSize(new java.awt.Dimension(280, 70));
        btn_issueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_issueBookMousePressed(evt);
            }
        });

        issueBookLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        issueBookLabel.setForeground(new java.awt.Color(255, 255, 255));
        issueBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        issueBookLabel.setText("ISSUE BOOK");

        btn_issueBookFlag.setBackground(new java.awt.Color(27, 32, 40));
        btn_issueBookFlag.setPreferredSize(new java.awt.Dimension(16, 70));
        btn_issueBookFlag.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout btn_issueBookLayout = new javax.swing.GroupLayout(btn_issueBook);
        btn_issueBook.setLayout(btn_issueBookLayout);
        btn_issueBookLayout.setHorizontalGroup(
            btn_issueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_issueBookLayout.createSequentialGroup()
                .addComponent(btn_issueBookFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(issueBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_issueBookLayout.setVerticalGroup(
            btn_issueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_issueBookLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(issueBookLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_issueBookLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_issueBookFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_returnBook.setBackground(new java.awt.Color(27, 32, 40));
        btn_returnBook.setForeground(new java.awt.Color(27, 32, 40));
        btn_returnBook.setPreferredSize(new java.awt.Dimension(280, 70));
        btn_returnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_returnBookMousePressed(evt);
            }
        });

        returnBookLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        returnBookLabel.setForeground(new java.awt.Color(255, 255, 255));
        returnBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        returnBookLabel.setText("RETURN BOOK");

        btn_returnBookFlag.setBackground(new java.awt.Color(27, 32, 40));
        btn_returnBookFlag.setPreferredSize(new java.awt.Dimension(16, 70));
        btn_returnBookFlag.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout btn_returnBookLayout = new javax.swing.GroupLayout(btn_returnBook);
        btn_returnBook.setLayout(btn_returnBookLayout);
        btn_returnBookLayout.setHorizontalGroup(
            btn_returnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_returnBookLayout.createSequentialGroup()
                .addComponent(btn_returnBookFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returnBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_returnBookLayout.setVerticalGroup(
            btn_returnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_returnBookLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(returnBookLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_returnBookLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_returnBookFlag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_logout.setBackground(new java.awt.Color(27, 32, 40));
        btn_logout.setForeground(new java.awt.Color(27, 32, 40));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_logoutMousePressed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("LOGOUT");

        javax.swing.GroupLayout btn_logoutLayout = new javax.swing.GroupLayout(btn_logout);
        btn_logout.setLayout(btn_logoutLayout);
        btn_logoutLayout.setHorizontalGroup(
            btn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_logoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        btn_logoutLayout.setVerticalGroup(
            btn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_logoutLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logout)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_newMember, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
            .addComponent(btn_newBook, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
            .addComponent(btn_Statistics, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
            .addComponent(btn_issueBook, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
            .addComponent(btn_returnBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
            .addComponent(btn_logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btn_newMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_newBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Statistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_issueBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        backgroud.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 772));

        panelArea.setPreferredSize(new java.awt.Dimension(1000, 720));
        panelArea.setLayout(new java.awt.CardLayout());
        backgroud.add(panelArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1040, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    void setColor(JPanel panel,JLabel label){
        panel.setBackground(new Color(0,255,192));
        label.setForeground(new Color(0,255,192));
    }
    void resetColor(JPanel panel,JLabel label){
        panel.setBackground(new Color(27,32,40));
        label.setForeground(new Color(255,255,255));
    }
    
    private void btn_newMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newMemberMousePressed
        setColor(btn_newMemberFlag,newMemberLabel);
        resetColor(btn_newBookFlag,newBookLabel);
        resetColor(btn_statisticsFlag,statisticsLabel);
        resetColor(btn_issueBookFlag,issueBookLabel);
        resetColor(btn_returnBookFlag,returnBookLabel);
        
        newMemberPanel.setVisible(true);
        newBookPanel.setVisible(false);
        statisticsPanel.setVisible(false);
        issueBookPanel.setVisible(false);
        returnBookPanel.setVisible(false);
    }//GEN-LAST:event_btn_newMemberMousePressed

    private void btn_newBookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newBookMousePressed
        setColor(btn_newBookFlag,newBookLabel);
        resetColor(btn_newMemberFlag,newMemberLabel);
        resetColor(btn_statisticsFlag,statisticsLabel);
        resetColor(btn_issueBookFlag,issueBookLabel);
        resetColor(btn_returnBookFlag,returnBookLabel);
        
        newMemberPanel.setVisible(false);
        newBookPanel.setVisible(true);
        statisticsPanel.setVisible(false);
        issueBookPanel.setVisible(false);
        returnBookPanel.setVisible(false);
    }//GEN-LAST:event_btn_newBookMousePressed

    private void btn_StatisticsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_StatisticsMousePressed
        setColor(btn_statisticsFlag,statisticsLabel);
        resetColor(btn_newBookFlag,newBookLabel);
        resetColor(btn_newMemberFlag,newMemberLabel);
        resetColor(btn_issueBookFlag,issueBookLabel);
        resetColor(btn_returnBookFlag,returnBookLabel);
        
        newMemberPanel.setVisible(false);
        newBookPanel.setVisible(false);
        statisticsPanel.setVisible(true);
        issueBookPanel.setVisible(false);
        returnBookPanel.setVisible(false);
    }//GEN-LAST:event_btn_StatisticsMousePressed

    private void btn_issueBookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_issueBookMousePressed
        setColor(btn_issueBookFlag,issueBookLabel);
        resetColor(btn_newBookFlag,newBookLabel);
        resetColor(btn_statisticsFlag,statisticsLabel);
        resetColor(btn_newMemberFlag,newMemberLabel);
        resetColor(btn_returnBookFlag,returnBookLabel);
        
        newMemberPanel.setVisible(false);
        newBookPanel.setVisible(false);
        statisticsPanel.setVisible(false);
        issueBookPanel.setVisible(true);
        returnBookPanel.setVisible(false);
    }//GEN-LAST:event_btn_issueBookMousePressed

    private void btn_returnBookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnBookMousePressed
        setColor(btn_returnBookFlag,returnBookLabel);
        resetColor(btn_newBookFlag,newBookLabel);
        resetColor(btn_statisticsFlag,statisticsLabel);
        resetColor(btn_issueBookFlag,issueBookLabel);
        resetColor(btn_newMemberFlag,newMemberLabel);
        
        newMemberPanel.setVisible(false);
        newBookPanel.setVisible(false);
        statisticsPanel.setVisible(false);
        issueBookPanel.setVisible(false);
        returnBookPanel.setVisible(true);
    }//GEN-LAST:event_btn_returnBookMousePressed

    private void btn_logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMousePressed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_logoutMousePressed
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroud;
    private javax.swing.JPanel btn_Statistics;
    private javax.swing.JPanel btn_issueBook;
    private javax.swing.JPanel btn_issueBookFlag;
    private javax.swing.JPanel btn_logout;
    private javax.swing.JPanel btn_newBook;
    private javax.swing.JPanel btn_newBookFlag;
    private javax.swing.JPanel btn_newMember;
    private javax.swing.JPanel btn_newMemberFlag;
    private javax.swing.JPanel btn_returnBook;
    private javax.swing.JPanel btn_returnBookFlag;
    private javax.swing.JPanel btn_statisticsFlag;
    private javax.swing.JLabel issueBookLabel;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel newBookLabel;
    private javax.swing.JLabel newMemberLabel;
    private javax.swing.JLayeredPane panelArea;
    private javax.swing.JLabel returnBookLabel;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel statisticsLabel;
    // End of variables declaration//GEN-END:variables
}
