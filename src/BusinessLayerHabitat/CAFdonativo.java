package BusinessLayerHabitat;

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
    
    
    //GETS
    
    public Integer getId(){
        return id;
    }
    
    public String getTipo(){
        return tipo;      
    } 
    
    public Integer getNr_recibo(){
        return nr_recibo;    
    };
    
    public GregorianCalendar getData_doacao(){
        return data_doacao;
}
    
    public String getEvento(){
        return evento;
    }
    public String getDescricao(){
        return descricao;
    };
    
    public Integer getId_processo(){
        return id_processo;
    };
    public String getNif_doador(){
        return nif_doador;
    };

    //SET
    
    public void setId(Integer id){
       this.id= id;
}
    public void setTipo(String tipo){
       this.tipo= tipo;
}
    public void setNr_recibo(Integer nr_recibo){
       this.nr_recibo= nr_recibo;
}
    public void setData_doacao(GregorianCalendar data_doacao){
       this.data_doacao = data_doacao;
}
    public void setEvento(String evento){
       this.evento= evento;
}
    public void setDescricao(String descricao){
       this.descricao= descricao;
}
    public void setId_processo(Integer id_processo){
       this.id_processo= id_processo;
}
    
    public void setNif_doador(String nif_doador){
       this.nif_doador= nif_doador;
}
  
}