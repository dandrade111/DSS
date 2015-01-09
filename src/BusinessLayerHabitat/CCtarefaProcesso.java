package BusinessLayerHabitat;

import java.util.GregorianCalendar;

public class CCtarefaProcesso {
    
    /* Variáveis de instância */
    
    Integer id_processo;
    Integer id_tarefa;
    GregorianCalendar data_inicio;
    GregorianCalendar data_fim;
    
    /* Construtores */
    
    public CCtarefaProcesso() {
        this.id_processo = 0;
        this.id_tarefa = 0;
        this.data_inicio = new GregorianCalendar();
        this.data_fim = new GregorianCalendar();
    }
    
    public CCtarefaProcesso(Integer p, Integer i, GregorianCalendar di, GregorianCalendar df) {
        this.id_processo = p;
        this.id_tarefa = i;
        this.data_inicio = (GregorianCalendar) di.clone();
        this.data_fim = (GregorianCalendar) df.clone();
    }
    
    /* Gets */

    public Integer getId_processo() {
        return this.id_processo;
    }
    
    public Integer getId_tarefa() {
        return this.id_tarefa;
    }

    public GregorianCalendar getData_inicio() {
        return this.data_inicio;
    }

    public GregorianCalendar getData_fim() {
        return this.data_fim;
    }

    /* Sets */

    public void setId_processo(Integer id_processo) {
        this.id_processo = id_processo;
    }
    
    public void setId_tarefa(Integer idt) {
        this.id_tarefa = idt;
    }

    public void setData_inicio(GregorianCalendar di) {
        this.data_inicio = di;
    }

    public void setData_fim(GregorianCalendar df) {
        this.data_fim = df;
    }
}
