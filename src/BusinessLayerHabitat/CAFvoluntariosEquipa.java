package BusinessLayerHabitat;

public class CAFvoluntariosEquipa {
    
    /* Variáveis de instância */
    
    private Integer equipa; // id da equipa
    private String nome_equipa;
    private String bi_vol; //bi do voluntario
    private String voluntario; // nome do voluntario
    private String nacionalidade; //nacionalidade do voluntario
    
    /* Construtores */
    
    public CAFvoluntariosEquipa() {
        this.equipa = 0;
        this.nome_equipa = "";
        this.bi_vol = "";
        this.voluntario = "";
        this.nacionalidade = "";
    }
    
    public CAFvoluntariosEquipa(Integer equipa, String bi_vol) {
        this.equipa = equipa;
        this.nome_equipa = "";
        this.bi_vol = bi_vol;
        this.voluntario = "";
        this.nacionalidade = "";
    }

    public CAFvoluntariosEquipa(Integer equipa, String nome_equipa, String bi_vol, String voluntario, String nacionalidade) {
        this.equipa = equipa;
        this.nome_equipa = nome_equipa;
        this.bi_vol = bi_vol;
        this.voluntario = voluntario;
        this.nacionalidade = nacionalidade;
    }
    
    // Gets 

    public Integer getEquipa() {
        return this.equipa;
    }

    public String getVoluntario() {
        return this.voluntario;
    }
    
    // Sets

    public void setEquipa(Integer equipa) {
        this.equipa = equipa;
    }

    public void setVoluntario(String voluntario) {
        this.voluntario = voluntario;
    }
}
