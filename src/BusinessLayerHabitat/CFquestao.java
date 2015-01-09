package BusinessLayerHabitat;

public class CFquestao {
    
    /* Variáveis de instância */
    
    private String id_questao;
    private String questao;
    private String ativa;
    
    /* Construtores */
    
    public CFquestao() {
        this.id_questao = "";
        this.questao = "";
        this.ativa = "";
    }
    
    public CFquestao(String id, String q, String a) {
        this.id_questao = id;
        this.questao = q;
        this.ativa = a;
    }
    
    /* Gets */
    
    public String getIdQuestao() {
        return this.id_questao;
    }
    
    public String getQuestao() {
        return this.questao;
    }
    
    public String getResposta() {
        return this.ativa;
    }
    
    /* Sets */
    
    public void setIdQuestao(String new_id_questao) {
        this.id_questao = new_id_questao;
    }
    
    public void setQuestao(String new_questao) {
        this.id_questao = new_questao;
    }
    
    public void setResposta(String new_resposta) {
        this.ativa = new_resposta;
    }
}
