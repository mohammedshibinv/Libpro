package homeComponents;
import bookPanelComponents.*;
import java.awt.Color;
import javax.swing.JLabel;

public class NewBookPanel extends javax.swing.JPanel {
    AddBookPanel addBookPanel = new AddBookPanel();
    SearchBookPanel searchPanel = new SearchBookPanel();
    DeleteBookPanel deleteBookPanel = new DeleteBookPanel();
    public NewBookPanel() {
        initComponents();
        panelArea.add(addBookPanel);
        panelArea.add(searchPanel);
        panelArea.add(deleteBookPanel);
        
        addBookPanel.setVisible(true);
        searchPanel.setVisible(false);
        deleteBookPanel.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topBar = new javax.swing.JPanel();
        memberLogo = new javax.swing.JLabel();
        btn_delete = new javax.swing.JLabel();
        btn_add = new javax.swing.JLabel();
        btn_serach = new javax.swing.JLabel();
        panelArea = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(35, 46, 51));
        setPreferredSize(new java.awt.Dimension(1000, 720));

        topBar.setBackground(new java.awt.Color(32, 38, 46));
        topBar.setMinimumSize(new java.awt.Dimension(1000, 130));
        topBar.setPreferredSize(new java.awt.Dimension(1000, 130));
        topBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        memberLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeComponents/bookLogo.png"))); // NOI18N
        topBar.add(memberLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 100, 130));

        btn_delete.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("DELETE MEMBER");
        btn_delete.setPreferredSize(new java.awt.Dimension(200, 30));
        btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_deleteMousePressed(evt);
            }
        });
        topBar.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 170, -1));

        btn_add.setBackground(new java.awt.Color(0, 255, 192));
        btn_add.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(0, 255, 192));
        btn_add.setText("ADD BOOK");
        btn_add.setPreferredSize(new java.awt.Dimension(130, 30));
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_addMousePressed(evt);
            }
        });
        topBar.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, -1));

        btn_serach.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btn_serach.setForeground(new java.awt.Color(255, 255, 255));
        btn_serach.setText("SEARCH");
        btn_serach.setPreferredSize(new java.awt.Dimension(200, 30));
        btn_serach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_serachMousePressed(evt);
            }
        });
        topBar.add(btn_serach, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 80, -1));

        panelArea.setPreferredSize(new java.awt.Dimension(1000, 590));
        panelArea.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    void setColor(JLabel label){
        label.setForeground(new Color(0,255,192));
    }
    void resetColor(JLabel label){
        label.setForeground(new Color(255,255,255));
    }
    private void btn_addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMousePressed
        setColor(btn_add);
        resetColor(btn_serach);
        resetColor(btn_delete);
        
        addBookPanel.setVisible(true);
        searchPanel.setVisible(false);
        deleteBookPanel.setVisible(false);
    }//GEN-LAST:event_btn_addMousePressed

    private void btn_serachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_serachMousePressed
        resetColor(btn_add);
        setColor(btn_serach);
        resetColor(btn_delete);
        
        addBookPanel.setVisible(false);
        searchPanel.setVisible(true);
        deleteBookPanel.setVisible(false);
    }//GEN-LAST:event_btn_serachMousePressed

    private void btn_deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMousePressed
        resetColor(btn_add);
        resetColor(btn_serach);
        setColor(btn_delete);
        
        addBookPanel.setVisible(false);
        searchPanel.setVisible(false);
        deleteBookPanel.setVisible(true);
    }//GEN-LAST:event_btn_deleteMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_add;
    private javax.swing.JLabel btn_delete;
    private javax.swing.JLabel btn_serach;
    private javax.swing.JLabel memberLogo;
    private javax.swing.JLayeredPane panelArea;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
