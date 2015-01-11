package PresentationLayerHabitat;

import BusinessLayerHabitat.CCmaterial;
import DataLayerHabitat.DAOCCmaterialProcesso;
import DataLayerHabitat.DAOCCtarefaProcesso;
import BusinessLayerHabitat.CCmaterialProcesso;
import BusinessLayerHabitat.CCtarefaProcesso;
import BusinessLayerHabitat.CCvoluntarioProcessoTarefa;
import DataLayerHabitat.DAOCCvoluntarioProcessoTarefa;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Daniel
 */
public class Apresentar_projectos extends javax.swing.JFrame {
    
    private DAOCCmaterialProcesso DAOCCmatPro;
    private DAOCCtarefaProcesso DAOCCtarPro;
    private DAOCCvoluntarioProcessoTarefa DAOCCvolTarPro;
    private Integer selectedProc;
    private Integer selectedTar;
    Connection conn;

    public Apresentar_projectos(Integer proj_id, Connection conn) {
        initComponents();
        this.conn = conn;
        this.DAOCCvolTarPro = new DAOCCvoluntarioProcessoTarefa(conn);
        this.DAOCCtarPro = new DAOCCtarefaProcesso(conn);
        this.DAOCCmatPro = new DAOCCmaterialProcesso(conn);
        this.selectedProc = proj_id;
        this.selectedTar = -1;
        this.update();
        this.setVisible(true);
        this.setDefaultCloseOperation(Apresentar_projectos.DISPOSE_ON_CLOSE);
    }
        
    public void updateTarefas() {
        
    }
    
    public void updateVoluntarios() {
        
    }
    
    public void update() {
        try {
            // Tabela Material
            Collection<CCmaterialProcesso> ccmat = new HashSet<>(this.DAOCCmatPro.get(this.selectedProc));
            DefaultTableModel matpTableModel = new DefaultTableModel();
            matpTableModel.addColumn("ID Processo");
            matpTableModel.addColumn("ID Material");
            matpTableModel.addColumn("Material");
            matpTableModel.addColumn("Funcionario");
            matpTableModel.addColumn("Quantidade");
            for (CCmaterialProcesso m : ccmat)
                matpTableModel.addRow(new Object[]{
                                                m.getProcesso(),
                                                m.getMaterial(),
                                                m.getNome_material(),
                                                m.getFuncionario(),
                                                m.getQuantidade()});
            this.jTableMaterialProj.setModel(matpTableModel);
            
            //Tabela Tarefas
            Collection<CCtarefaProcesso> cctar = new HashSet<>(this.DAOCCtarPro.get(this.selectedProc));
            DefaultTableModel tarpTableModel = new DefaultTableModel();
            tarpTableModel.addColumn("ID Processo");
            tarpTableModel.addColumn("ID Tarefa");
            tarpTableModel.addColumn("Tarefa");
            tarpTableModel.addColumn("Data Inicio");
            tarpTableModel.addColumn("Data Fim");
            for (CCtarefaProcesso t : cctar)
                tarpTableModel.addRow(new Object[]{
                                                t.getId_processo(),
                                                t.getId_tarefa(),
                                                t.getTarefa(),
                                                t.getData_inicio(),
                                                t.getData_fim()});
            this.jTabletarefasProj.setModel(tarpTableModel);
            
            //Tabela Voluntarios
            Collection<CCvoluntarioProcessoTarefa> ccvolpt = new HashSet<>(this.DAOCCvolTarPro.get(this.selectedProc));
            DefaultTableModel volptTableModel = new DefaultTableModel();
            volptTableModel.addColumn("ID Processo");
            volptTableModel.addColumn("ID Voluntario");
            volptTableModel.addColumn("Nome Voluntario");
            volptTableModel.addColumn("ID Tarefa");
            volptTableModel.addColumn("Descricao");
            volptTableModel.addColumn("Data Inicio");
            volptTableModel.addColumn("Data Fim");
            volptTableModel.addColumn("Total Horas");
            for (CCvoluntarioProcessoTarefa v : ccvolpt)
                volptTableModel.addRow(new Object[]{
                                                v.getProcesso(),
                                                v.getId_voluntario(),
                                                v.getNome_voluntario(),
                                                v.getId_tarefa(),
                                                v.getDesc_tarefa(),
                                                v.getData_inicio(),
                                                v.getData_fim(),
                                                v.getTotal_horas()});
            this.jTableVoluntariosTarefa.setModel(volptTableModel);
            
        } catch (SQLException ex) {
            Logger.getLogger(Apresentar_projectos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMaterialProj = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabletarefasProj = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableVoluntariosTarefa = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Material Usado no Projeto"));

        jTableMaterialProj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Quantidade"
            }
        ));
        jTableMaterialProj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMaterialProjMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMaterialProj);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarefas do Projeto"));

        jTabletarefasProj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Tarefa", "Descrição", "Inicio", "Fim"
            }
        ));
        jTabletarefasProj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabletarefasProjMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabletarefasProj);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Voluntários que participaram na Tarefa"));

        jTableVoluntariosTarefa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Voluntário", "Tarefa", "Início", "Fim"
            }
        ));
        jScrollPane3.setViewportView(jTableVoluntariosTarefa);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Voltar");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableMaterialProjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMaterialProjMouseClicked
     Integer selectedValue = (Integer) jTableMaterialProj.getModel().getValueAt(jTableMaterialProj.getSelectedRow(), 0);
        System.out.println(selectedValue);
        try {
            Collection<CCtarefaProcesso> cctar = new HashSet<>(this.DAOCCtarPro.get(selectedValue));
            DefaultTableModel procTableModel = new DefaultTableModel();
            for (CCtarefaProcesso m : cctar)
                procTableModel.addRow(new Object[]{
                                                m.getId_tarefa(),
                                                m.getTarefa(),
                                                m.getData_inicio(),
                                                m.getData_fim()});
            this.jTabletarefasProj.setModel(procTableModel);
            
        } catch (SQLException ex) {
            Logger.getLogger(Apresentar_projectos.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jTableMaterialProjMouseClicked

    private void jTabletarefasProjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabletarefasProjMouseClicked
    Integer selectedValue = (Integer) jTabletarefasProj.getModel().getValueAt(jTabletarefasProj.getSelectedRow(), 0);
        System.out.println(selectedValue);
        try {
            Collection<CCvoluntarioProcessoTarefa> ccvoltar = new HashSet<>(this.DAOCCvolTarPro.get(selectedValue));
            DefaultTableModel procTableModel = new DefaultTableModel();
            for (CCvoluntarioProcessoTarefa m : ccvoltar)
                procTableModel.addRow(new Object[]{
                                                m.getNome_voluntario(),
                                                m.getDesc_tarefa(),
                                                m.getData_inicio(),
                                                m.getData_fim()});
            this.jTableVoluntariosTarefa.setModel(procTableModel);
            
        } catch (SQLException ex) {
            Logger.getLogger(Apresentar_projectos.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_jTabletarefasProjMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable jTableMaterialProj;
    private javax.swing.JTable jTableVoluntariosTarefa;
    private javax.swing.JTable jTabletarefasProj;
    // End of variables declaration//GEN-END:variables
}
