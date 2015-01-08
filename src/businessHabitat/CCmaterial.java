package businessHabitat;

public class CCmaterial {
    
    /* Variáveis de instância */
    
    private Integer id;
    private String descricao;
    private Integer quantidade;
    
    /* Construtores */
    
    public CCmaterial() {
        this.id = 0;
        this.descricao = "";
        this.quantidade = 0;
    }
    
    public CCmaterial(Integer i, String d, Integer q) {
        this.id = i;
        this.descricao = d;
        this.quantidade = q;
    }
//GET
    public Integer getId(){
        return this.id;
    }
    
    public String getDescricao(){
        return this.descricao;
    }  
    
    public Integer getQuantidade(){
        return this.quantidade;
    }    
//SET
    public void setId(Integer id){
        this.id=id;
    }
    
    public void setDescricao(String tipo){
        this.descricao=descricao;
    }  
    
    public void setQuantidade(Integer quantidade){
        this.quantidade=quantidade;
    }   
}

