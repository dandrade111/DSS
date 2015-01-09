package BusinessLayerHabitat;

public class CFrespostasCandidatura {
    
    /* Variáveis de instância */
    
    private Integer candidatura;
    private Integer questao;
    private String resposta;
    
    /* Construtores */
    
    public CFrespostasCandidatura() {
        this.candidatura = 0;
        this.questao = 0;
        this.resposta = "";
    }
    
    public CFrespostasCandidatura(Integer candidatura, Integer questao, String resposta) {
        this.candidatura = candidatura;
        this.questao = questao;
        this.resposta = resposta;
    }
    
    /* Gets */

    public Integer getCandidatura() {
        return this.candidatura;
    }

    public Integer getQuestao() {
        return this.questao;
    }

    public String getResposta() {
        return this.resposta;
    }
    
    /* Sets */

    public void setCandidatura(Integer candidatura) {
        this.candidatura = candidatura;
    }

    public void setQuestao(Integer questao) {
        this.questao = questao;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
