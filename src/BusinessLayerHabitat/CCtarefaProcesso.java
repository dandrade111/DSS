package BusinessLayerHabitat;

import java.sql.Date;

public class CCtarefaProcesso {
    
    /* Variáveis de instância */
    
    Integer id_processo;
    Integer id_tarefa;
    String tarefa;
    Date data_inicio;
    Date data_fim;
    
    /* Construtores */
    
    public CCtarefaProcesso() {
        this.id_processo = 0;
        this.id_tarefa = 0;
        this.tarefa = "";
        this.data_inicio = null;
        this.data_fim = null;
    }
    
    public CCtarefaProcesso(Integer p, Integer i, String t, Date di, Date df) {
        this.id_processo = p;
        this.id_tarefa = i;
        this.tarefa = t;
        this.data_inicio = (Date) di.clone();
        this.data_fim = (Date) df.clone();
    }
    
    /* Gets */

    public Integer getId_processo() {
        return this.id_processo;
    }
    
    public Integer getId_tarefa() {
        return this.id_tarefa;
    }

    public String getTarefa() {
        return tarefa;
    }
    
    public Date getData_inicio() {
        return this.data_inicio;
    }

    public Date getData_fim() {
        return this.data_fim;
    }

    /* Sets */

    public void setId_processo(Integer id_processo) {
        this.id_processo = id_processo;
    }
    
    public void setId_tarefa(Integer idt) {
        this.id_tarefa = idt;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public void setData_inicio(Date di) {
        this.data_inicio = di;
    }

    public void setData_fim(Date df) {
        this.data_fim = df;
    }
}
