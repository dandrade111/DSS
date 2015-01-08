package businessHabitat;

import java.util.GregorianCalendar;

public class CAFdonativo {
    
    /* Variáveis de instância */
    
    private Integer id;
    private String tipo; // Um donativo pode ser financeiro, de serviços ou de material;
    private Integer nr_recibo;
    private GregorianCalendar data_doacao;
    private String evento; // Se doação provém de um evento ou não ("Sim" ou "Não")
    private String descricao;
    private Integer id_processo;
    private String nif_doador;
    
    /* Construtores */
    
    public CAFdonativo() {
        this.id = 0;
        this.tipo = "";
        this.nr_recibo = 0;
        this.data_doacao = new GregorianCalendar();
        this.evento = "";
        this.descricao = "";
        this.id_processo = 0;
        this.nif_doador = "";
    }
    
    public CAFdonativo(Integer i, String t, Integer nr, GregorianCalendar dd, String e, String d, Integer ip, String nif) {
        this.id = i;
        this.tipo = t;
        this.nr_recibo = nr;
        this.data_doacao = (GregorianCalendar) dd.clone();
        this.evento = e;
        this.descricao = d;
        this.id_processo = ip;
        this.nif_doador = nif;
    }
}
