package businessHabitat;

import exceptions.VoluntarioNaoExisteException;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class CCtarefaProcesso {
    
    /* Variáveis de instância */
    
    Integer id_tarefa;
    GregorianCalendar data_inicio;
    GregorianCalendar data_fim;
    HashMap<Integer, CCvoluntarioTarefa> voluntarios;
    
    /* Construtores */
    
    public CCtarefaProcesso() {
        this.id_tarefa = 0;
        this.data_inicio = new GregorianCalendar();
        this.data_fim = new GregorianCalendar();
        this.voluntarios = new HashMap<>();
    }
    
    public CCtarefaProcesso(Integer i, GregorianCalendar di, GregorianCalendar df, HashMap<Integer, CCvoluntarioTarefa> v) {
        this.id_tarefa = 0;
        this.data_inicio = (GregorianCalendar) di.clone();
        this.data_fim = (GregorianCalendar) df.clone();
        this.voluntarios = new HashMap<>(v);
    }
    
    /* Gets */

    public Integer getId_tarefa() {
        return this.id_tarefa;
    }

    public GregorianCalendar getData_inicio() {
        return this.data_inicio;
    }

    public GregorianCalendar getData_fim() {
        return this.data_fim;
    }

    public HashMap<Integer, CCvoluntarioTarefa> getVoluntarios() {
        return this.voluntarios;
    }
    
    public CCvoluntarioTarefa getVoluntario(String id) throws VoluntarioNaoExisteException {
        if (this.voluntarios.containsKey(id))
            return this.voluntarios.get(id);
        else
            throw new VoluntarioNaoExisteException();
    }

    /* Sets */
    
    public void setId_tarefa(Integer idt) {
        this.id_tarefa = idt;
    }

    public void setData_inicio(GregorianCalendar di) {
        this.data_inicio = di;
    }

    public void setData_fim(GregorianCalendar df) {
        this.data_fim = df;
    }

    public void setVoluntarios(HashMap<Integer, CCvoluntarioTarefa> v) {
        this.voluntarios = new HashMap<>(v);
    }
    
    /* Adds */
    
    public void addVoluntario(CCvoluntarioTarefa vt) {
        this.voluntarios.put(vt.getId_voluntario(), vt);
    }
    
    public void addVoluntarios(HashMap<Integer, CCvoluntarioTarefa> vt) {
        this.voluntarios.putAll(vt);
    }
    
    /* Contains */
    
    public Boolean containsVoluntario(Integer id) {
        return this.voluntarios.containsKey(id);
    }
}
