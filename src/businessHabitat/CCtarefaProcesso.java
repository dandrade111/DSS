package businessHabitat;

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
    
}
