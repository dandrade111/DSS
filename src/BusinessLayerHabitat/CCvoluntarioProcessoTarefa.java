package BusinessLayerHabitat;

import java.sql.Date;

public class CCvoluntarioProcessoTarefa {
    
    /* Variáveis de instância */
    
    Integer processo;
    String id_voluntario;
    String nome_voluntario;
    Integer id_tarefa;
    String desc_tarefa;
    Date data_inicio;
    Date data_fim;
    Date total_horas;
    
    /* Construtores */
    
    public CCvoluntarioProcessoTarefa() {
        this.processo = 0;
        this.id_voluntario = "";
        this.nome_voluntario = "";
        this.id_tarefa = 0;
        this.desc_tarefa = "";
        this.data_inicio = null;
        this.data_fim = null;
        this.total_horas = null;
    }
    
    public CCvoluntarioProcessoTarefa(Integer processo, String id_voluntario, Integer id_tarefa, Date di, Date df, Date th) {
        this.processo = processo;
        this.id_voluntario = id_voluntario;
        this.nome_voluntario = "";
        this.id_tarefa = id_tarefa;
        this.desc_tarefa = "";
        this.data_inicio = (Date) di.clone();
        this.data_fim = (Date) df.clone();
        this.total_horas = (Date) th.clone();
    }

    public CCvoluntarioProcessoTarefa(Integer processo, String id_voluntario, String nome_voluntario, Integer id_tarefa, String desc_tarefa, Date di, Date df, Date th) {
        this.processo = processo;
        this.id_voluntario = id_voluntario;
        this.nome_voluntario = nome_voluntario;
        this.id_tarefa = id_tarefa;
        this.desc_tarefa = desc_tarefa;
        this.data_inicio = (Date) di.clone();
        this.data_fim = (Date) df.clone();
        this.total_horas = (Date) th.clone();
    }
    
    /* Gets */
    
    public String getId_voluntario() {
        return this.id_voluntario;
    }

    public String getNome_voluntario() {
        return this.nome_voluntario;
    }

    public Integer getId_tarefa() {
        return this.id_tarefa;
    }

    public String getDesc_tarefa() {
        return this.desc_tarefa;
    }
    
    public Integer getProcesso() {
        return this.processo;
    }

    public Date getTotal_horas() {
        return this.total_horas;
    }
    
    public Date getData_inicio() {
        return this.data_inicio;
    }

    public Date getData_fim() {
        return this.data_fim;
    }
    
    /* Sets */

    public void setId_voluntario(String id_voluntario) {
        this.id_voluntario = id_voluntario;
    }

    public void setNome_voluntario(String nome_voluntario) {
        this.nome_voluntario = nome_voluntario;
    }

    public void setId_tarefa(Integer id_tarefa) {
        this.id_tarefa = id_tarefa;
    }

    public void setDesc_tarefa(String desc_tarefa) {
        this.desc_tarefa = desc_tarefa;
    }
    
    public void setProcesso(Integer processo) {
        this.processo = processo;
    }
    
    public void setTotal_horas(Date total_horas) {
        this.total_horas = total_horas;
    }

    public void setData_inicio(Date di) {
        this.data_inicio = di;
    }

    public void setData_fim(Date df) {
        this.data_fim = df;
    }
}
