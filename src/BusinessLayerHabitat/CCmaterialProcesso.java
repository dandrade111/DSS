package BusinessLayerHabitat;

public class CCmaterialProcesso {
    
    /* Variáveis de instância */
    
    private Integer processo;
    private Integer material;
    private Integer funcionario;
    private Integer quantidade;
    
    /* Construtores */

    public CCmaterialProcesso() {
        this.processo = 0;
        this.material = 0;
        this.funcionario = 0;
        this.quantidade = 0;
    }

    public CCmaterialProcesso(Integer processo, Integer material, Integer funcionario, Integer quantidade) {
        this.processo = processo;
        this.material = material;
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
}
