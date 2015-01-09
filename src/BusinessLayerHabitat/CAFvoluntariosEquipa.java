package BusinessLayerHabitat;

public class CAFvoluntariosEquipa {
    
    /* Variáveis de instância */
    
    private Integer equipa; // id da equipa
    private String voluntario; //bi do voluntario
    
    /* Construtores */
    
    public CAFvoluntariosEquipa() {
        this.equipa = 0;
        this.voluntario = "";
    }
    
    public CAFvoluntariosEquipa(Integer equipa, String voluntario) {
        this.equipa = equipa;
        this.voluntario = voluntario;
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
