package BusinessLayerHabitat;

public class CAFdonativoMaterial {
    
    /* Variáveis de instância */
    
    Integer id_material;
    String nome;
    Integer id_doacao;
    Integer quantidade;
    
    /* Construtores */
    
    public CAFdonativoMaterial() {
        this.id_material = 0;
        this.nome = "";
        this.id_doacao = 0;
        this.quantidade = 0;
    }

    public CAFdonativoMaterial(Integer id_doacao, Integer id_material, Integer quantidade) {
        this.id_material = id_material;
        this.nome = "";
        this.id_doacao = id_doacao;
        this.quantidade = quantidade;
    }
    
    public CAFdonativoMaterial(Integer id_doacao, String nome, Integer id_material, Integer quantidade) {
        this.id_material = id_material;
        this.nome = nome;
        this.id_doacao = id_doacao;
        this.quantidade = quantidade;
    }
    
    /* Gets */
    
    public Integer getId_doacao() {
        return this.id_doacao;
    }

    public Integer getId_material() {
        return this.id_material;
    }
    
    public Integer getQuantidade() {
        return this.quantidade;
    }

    public String getNome() {
        return this.nome;
    }
    
    /* Sets */

    public void setId_doacao(Integer id_doacao) {
        this.id_doacao = id_doacao;
    }

    public void setId_material(Integer id_material) {
        this.id_material = id_material;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
