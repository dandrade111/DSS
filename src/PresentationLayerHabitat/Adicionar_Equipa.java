/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PresentationLayerHabitat;


/**
 *
 * @author Varzim
 */
public class Adicionar_Equipa extends javax.swing.JFrame {

//    private int utilSelected;
//    private Connect con;
//    private PropostaDAO pDAO;
//    private UtilizadorDAO uDAO;
    /**
     * Creates new form JFPropostas
     */
    public Adicionar_Equipa(int util) {
//        this.utilSelected=util;
//        initComponents();
//        this.setLocationRelativeTo(null);
//        this.setVisible(true);
//        this.con = new Connect();
//        this.pDAO = new PropostaDAO(this.con.getConnection());
//        this.uDAO = new UtilizadorDAO(this.con.getConnection());
//        Utilizador u = uDAO.get(this.utilSelected);
//        jLabel2.setText(String.valueOf(u.getContribuinte()));
//        jTextField1.setText(u.getNome());
//        jTextField2.setText(u.getEmail());
//        jTextField3.setText(u.getMorada());
//        jTextField4.setText(u.getCodigop());
//        jTextField5.setText(u.getCidade());
//        jTextArea1.setText(u.getApresentacao());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Adicionar Equipa");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Responsavel:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        try {
//            MainFrame m = new MainFrame();
//        } catch (SQLException ex) {
//            Logger.getLogger(Adicionar_Familia.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            this.con.closeConnection();
//        } catch (SQLException ex) {
//            Logger.getLogger(Adicionar_Familia.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        Utilizador u = uDAO.get(this.utilSelected);
//        if(this.jTextField1.getText()!="")
//            u.setNome(this.jTextField1.getText());
//        if(this.jTextField2.getText()!="")
//            u.setEmail(this.jTextField2.getText());
//        if(this.jTextField3.getText()!="")
//            u.setMorada(this.jTextField3.getText());
//        if(this.jTextField4.getText()!="")
//            u.setCodigop(this.jTextField4.getText());
//        if(this.jTextField5.getText()!="")
//             u.setCidade(this.jTextField5.getText());
//        if(this.jTextArea1.getText()!="")
//            u.setApresentacao(this.jTextArea1.getText());
//        int dialogResult = JOptionPane.showConfirmDialog (null, "Tem a certeza que quer editar o Utilizador?","Atenção",0);
//        if(dialogResult == JOptionPane.YES_OPTION)
//            this.uDAO.update(u);
//        try {
//            MainFrame m = new MainFrame();
//        } catch (SQLException ex) {
//            Logger.getLogger(Adicionar_Familia.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            this.con.closeConnection();
//        } catch (SQLException ex) {
//            Logger.getLogger(Adicionar_Familia.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    
   
}