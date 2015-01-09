package BusinessLayerHabitat;

public class CCmaterialProcesso {
    
    /* Variáveis de instância */
    
    private Integer processo;
    private Integer material;
    private String nome_material;
    private Integer funcionario;
    private Integer quantidade;
    
    /* Construtores */

    public CCmaterialProcesso() {
        this.processo = 0;
        this.material = 0;
        this.nome_material = "";
        this.funcionario = 0;
        this.quantidade = 0;
    }

    public CCmaterialProcesso(Integer processo, Integer material, String nome, Integer funcionario, Integer quantidade) {
        this.processo = processo;
        this.material = material;
        this.nome_material = nome;
        this.funcionario = funcionario;
        this.quantidade = quantidade;
    }
    
    /* Gets */

    public Integer getProcesso() {
        return this.processo;
    }

    public Integer getMaterial() {
        return this.material;
    }

    public Integer getFuncionario() {
        return this.funcionario;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public String getNome_material() {
        return this.nome_material;
    }
    
    /* Sets */
    
    public void setProcesso(Integer processo) {
        this.processo = processo;
    }

    public void setMaterial(Integer material) {
        this.material = material;
    }

    public void setFuncionario(Integer funcionario) {
        this.funcionario = funcionario;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setNome_material(String nome_material) {
        this.nome_material = nome_material;
    }
}
