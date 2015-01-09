package BusinessLayerHabitat;

public class CCprocessoEquipa {
    
    /* Variáveis de instância */
    
    private Integer processo;
    private Integer equipa;
    
    /* Construtores */

    public CCprocessoEquipa() {
        this.processo = 0;
        this.equipa = 0;
    }

    public CCprocessoEquipa(Integer processo, Integer equipa) {
        this.processo = processo;
        this.equipa = equipa;
    }
    
    /* Gets */

    public Integer getProcesso() {
        return this.processo;
    }

    public Integer getEquipa() {
        return this.equipa;
    }
    
    /* Sets */

    public void setProcesso(Integer processo) {
        this.processo = processo;
    }

    public void setEquipa(Integer equipa) {
        this.equipa = equipa;
    }
}
