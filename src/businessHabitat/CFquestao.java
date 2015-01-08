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
}
