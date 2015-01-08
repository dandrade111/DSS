package businessHabitat;

public class CFquestao {
    
    /* Variáveis de instância */
    
    private String id_questao;
    private String questao;
    private String resposta;
    
    /* Construtores */
    
    public CFquestao() {
        this.id_questao = "";
        this.questao = "";
        this.resposta = "";
    }
    
    public CFquestao(String id, String q, String r) {
        this.id_questao = id;
        this.questao = q;
        this.resposta = r;
    }
    
    /* Gets */
    
    public String getIdQuestao() {
        return this.id_questao;
    }
    
    public String getQuestao() {
        return this.questao;
    }
    
    public String getResposta() {
        return this.resposta;
    }
    
    /* Sets */
    
    public void setIdQuestao(String new_id_questao) {
        this.id_questao = new_id_questao;
    }
    
    public void setQuestao(String new_questao) {
        this.id_questao = new_questao;
    }
    
    public void setResposta(String new_resposta) {
        this.resposta = new_resposta;
    }
}
