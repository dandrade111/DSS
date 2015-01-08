package businessHabitat;

import java.util.GregorianCalendar;

public class CCvoluntarioTarefa {
    
    /* Variáveis de instância */
    
    Integer id_voluntario;
    GregorianCalendar data_inicio;
    GregorianCalendar data_fim;
    
    /* Construtores */
    
    public CCvoluntarioTarefa() {
        this.id_voluntario = 0;
        this.data_inicio = new GregorianCalendar();
        this.data_fim = new GregorianCalendar();
    }
    
    public CCvoluntarioTarefa(Integer i, GregorianCalendar di, GregorianCalendar df) {
        this.id_voluntario = i;
        this.data_inicio = (GregorianCalendar) di.clone();
        this.data_fim = (GregorianCalendar) df.clone();
    }
    
    /* Gets */

    public Integer getId_voluntario() {
        return this.id_voluntario;
    }

    public GregorianCalendar getData_inicio() {
        return this.data_inicio;
    }

    public GregorianCalendar getData_fim() {
        return this.data_fim;
    }
    
    /* Sets */

    public void setId_voluntario(Integer id) {
        this.id_voluntario = id;
    }

    public void setData_inicio(GregorianCalendar di) {
        this.data_inicio = di;
    }

    public void setData_fim(GregorianCalendar df) {
        this.data_fim = df;
    }
    
    
}
