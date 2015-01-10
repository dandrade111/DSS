package BusinessLayerHabitat;

public class CCprocessoEquipa {
    
    /* Variáveis de instância */
    
    private Integer processo;
    private Integer id_equipa;
    private String nome_equipa;
    
    /* Construtores */

    public CCprocessoEquipa() {
        this.processo = 0;
        this.id_equipa = 0;
        this.nome_equipa = "";
    }

    public CCprocessoEquipa(Integer processo, Integer equipa) {
        this.processo = processo;
        this.id_equipa = equipa;
        this.nome_equipa = "";
    }
    public CCprocessoEquipa(Integer processo, Integer equipa, String n) {
        this.processo = processo;
        this.id_equipa = equipa;
        this.nome_equipa = n;
    }
    
    /* Gets */

    public String getNome_equipa() {
        return nome_equipa;
    }
    
    public Integer getProcesso() {
        return this.processo;
    }

    public Integer getId_equipa() {
        return this.id_equipa;
    }
    
    /* Sets */

    public void setNome_equipa(String nome_equipa) {
        this.nome_equipa = nome_equipa;
    }
    
    public void setProcesso(Integer processo) {
        this.processo = processo;
    }

    public void setId_equipa(Integer equipa) {
        this.id_equipa = equipa;
    }
}
