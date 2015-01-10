package PresentationLayerHabitat;

import BusinessLayerHabitat.CFagregado;
import DataLayerHabitat.DAOCFagregado;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Consultar_Familia extends javax.swing.JFrame {
    
    Connection conn;
    private Integer selectedFam;
    private DAOCFagregado daocfag;
    
    public Consultar_Familia(Connection conn, Integer i) {
        initComponents();
        this.conn = conn;
        this.daocfag = new DAOCFagregado(conn);
        this.selectedFam = i;
        this.update();
        this.setVisible(true);
        this.setDefaultCloseOperation(Adicionar_tarefa.DISPOSE_ON_CLOSE);
    }
    
    public void update() {
        try {
            // Tabela Famílias
            Collection<CFagregado> cffam = new HashSet<>(this.daocfag.get(this.selectedFam));
            DefaultTableModel agTableModel = new DefaultTableModel();
            agTableModel.addColumn("BI");
            agTableModel.addColumn("NIF");
            agTableModel.addColumn("Data Nascimento");
            agTableModel.addColumn("Morada");
            agTableModel.addColumn("Nome");
            agTableModel.addColumn("Telemovel");
            agTableModel.addColumn("eMail");
            agTableModel.addColumn("Parentesco");
            agTableModel.addColumn("Estado Civil");
            agTableModel.addColumn("Ocupacao");
            agTableModel.addColumn("Escolaridade");
            for (CFagregado f : cffam)
                agTableModel.addRow(new Object[]{f.getBi(), f.getNif(), f.getData_nascimento(), f.getMorada(),
                                                 f.getNome(), f.getTelemovel(), f.getEmail(), f.getParentesco(),
                                                 f.getEstado_civil(), f.getOcupacao(), f.getEscolaridade()});
            this.jTable1.setModel(agTableModel);
        } catch (SQLException ex) {
            Logger.getLogger(Consultar_Familia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Família");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Agregado");

        jButton1.setText("Adicionar Membro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Adicionar_Membro a = new Adicionar_Membro(this.conn, this.selectedFam);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
