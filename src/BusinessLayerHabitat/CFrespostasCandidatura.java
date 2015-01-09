package BusinessLayerHabitat;

public class CFrespostasCandidatura {
    
    /* Variáveis de instância */
    
    private Integer candidatura;
    private Integer id_questao;
    private String questao;
    private String resposta;
    
    /* Construtores */
    
    public CFrespostasCandidatura() {
        this.candidatura = 0;
        this.id_questao = 0;
        this.questao = "";
        this.resposta = "";
    }
    
    public CFrespostasCandidatura(Integer candidatura, Integer id_questao, String questao, String resposta) {
        this.candidatura = candidatura;
        this.id_questao = id_questao;
        this.questao = questao;
        this.resposta = resposta;
    }
    
    /* Gets */

    public Integer getId_questao() {
        return id_questao;
    }
    
    public Integer getCandidatura() {
        return this.candidatura;
    }

    public String getQuestao() {
        return this.questao;
    }

    public String getResposta() {
        return this.resposta;
    }
    
    /* Sets */

    public void setId_questao(Integer id_questao) {
        this.id_questao = id_questao;
    }
    
    public void setCandidatura(Integer candidatura) {
        this.candidatura = candidatura;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
