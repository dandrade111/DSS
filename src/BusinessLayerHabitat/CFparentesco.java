package BusinessLayerHabitat;

public class CFparentesco {
    
    /* Variáveis de instância */
    
    private Integer id;
    private String descricao;
    
    /* Construtores */
    
    public CFparentesco() {
        this.id = 0;
        this.descricao = "";
    }
    
    public CFparentesco(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    /* Gets */

    public Integer getId() {
        return this.id;
    }

    public String getDescricao() {
        return this.descricao;
    }
    
    /* Sets */
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
