package BusinessLayerHabitat;

import java.sql.Date;

public class CAFdonativo {
    
    /* Variáveis de instância */
    
    private Integer id;
    private String nif_doador;
    private String nome_doador;
    private String tipo; // Um donativo pode ser financeiro, de serviços ou de material;
    private Integer nr_recibo;
    private Date data_doacao;
    private String evento; // Se doação provém de um evento ou não ("Sim" ou "Não")
    private Integer quantia; //Caso seja monetária
    private String descricao;
    private Integer id_processo;
    
    /* Construtores */
    
    public CAFdonativo() {
        this.id = 0;
        this.tipo = "";
        this.nr_recibo = 0;
        this.data_doacao = null;
        this.evento = "";
        this.descricao = "";
        this.id_processo = 0;
        this.nif_doador = "";
        this.quantia = 0;
    }

    public CAFdonativo(Integer id, String nif_doador, String nome_doador, String tipo, Integer nr_recibo, Date data_doacao, String evento, Integer quantia, String descricao, Integer id_processo) {
        this.id = id;
        this.nif_doador = nif_doador;
        this.nome_doador = nome_doador;
        this.tipo = tipo;
        this.nr_recibo = nr_recibo;
        this.data_doacao = (Date) data_doacao.clone();
        this.evento = evento;
        this.quantia = quantia;
        this.descricao = descricao;
        this.id_processo = id_processo;
    }
    
    //GETS

    public String getNome_doador() {
        return this.nome_doador;
    }
    
    public Integer getQuantia() {
        return this.quantia;
    }
    
    public Integer getId(){
        return this.id;
    }
    
    public String getTipo(){
        return this.tipo;      
    } 
    
    public Integer getNr_recibo(){
        return this.nr_recibo;    
    }
    
    public Date getData_doacao(){
        return this.data_doacao;
    }
    
    public String getEvento(){
        return this.evento;
    }
    public String getDescricao(){
        return this.descricao;
    }
    
    public Integer getId_processo(){
        return this.id_processo;
    }
    
    public String getNif_doador(){
        return this.nif_doador;
    }

    //SET

    public void setNome_doador(String nome_doador) {
        this.nome_doador = nome_doador;
    }
    
    public void setId(Integer id){
       this.id= id;
}
    public void setTipo(String tipo){
       this.tipo= tipo;
}
    public void setNr_recibo(Integer nr_recibo){
       this.nr_recibo= nr_recibo;
}
    public void setData_doacao(Date data_doacao){
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

    public void setQuantia(Integer quantia) {
        this.quantia = quantia;
    }
  
}