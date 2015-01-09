package BusinessLayerHabitat;

import java.util.GregorianCalendar;

public class CCvoluntarioProcessoTarefa {
    
    /* Variáveis de instância */
    
    Integer processo;
    String voluntario;
    Integer tarefa;
    GregorianCalendar data_inicio;
    GregorianCalendar data_fim;
    GregorianCalendar total_horas;
    
    /* Construtores */
    
    public CCvoluntarioProcessoTarefa() {
        this.processo = 0;
        this.voluntario = "";
        this.tarefa = 0;
        this.data_inicio = new GregorianCalendar();
        this.data_fim = new GregorianCalendar();
        this.total_horas = new GregorianCalendar();
    }
    
    public CCvoluntarioProcessoTarefa(Integer p, String v, Integer t, GregorianCalendar di, GregorianCalendar df, GregorianCalendar th) {
        this.processo = p;
        this.voluntario = v;
        this.tarefa = t;
        this.data_inicio = (GregorianCalendar) di.clone();
        this.data_fim = (GregorianCalendar) df.clone();
        this.total_horas = (GregorianCalendar) th.clone();
    }
    
    /* Gets */

    public Integer getProcesso() {
        return processo;
    }

    public String getVoluntario() {
        return voluntario;
    }

    public Integer getTarefa() {
        return tarefa;
    }

    public GregorianCalendar getTotal_horas() {
        return total_horas;
    }
    
    public String getId_voluntario() {
        return this.voluntario;
    }

    public GregorianCalendar getData_inicio() {
        return this.data_inicio;
    }

    public GregorianCalendar getData_fim() {
        return this.data_fim;
    }
    
    /* Sets */

    public void setProcesso(Integer processo) {
        this.processo = processo;
    }

    public void setVoluntario(String voluntario) {
        this.voluntario = voluntario;
    }

    public void setTarefa(Integer tarefa) {
        this.tarefa = tarefa;
    }

    public void setTotal_horas(GregorianCalendar total_horas) {
        this.total_horas = total_horas;
    }
    
    public void setId_voluntario(String id) {
        this.voluntario = id;
    }

    public void setData_inicio(GregorianCalendar di) {
        this.data_inicio = di;
    }

    public void setData_fim(GregorianCalendar df) {
        this.data_fim = df;
    }
}
