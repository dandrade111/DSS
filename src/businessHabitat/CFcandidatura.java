package businessHabitat;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class CFcandidatura {
    
    /* Variáveis de instância */
    
    private Integer id_candidatura;
    private String descricao;
    private GregorianCalendar data_candidatura;
    private GregorianCalendar data_decisao;
    private String decisao; // Decisão tomada pela administração: "Aprovado" ou "Reprovado"
    private Integer id_familia;
    private Integer id_funcionario;
    private HashMap<String, CFquestao> questoes;
    
    /* Construtores */
    
    public CFcandidatura() {
        this.id_candidatura = 0;
        this.descricao = "";
        this.data_candidatura = new GregorianCalendar();
        this.data_decisao = new GregorianCalendar();
        this.id_familia = 0;
        this.id_funcionario = 0;
        this.questoes = new HashMap<>();
    }
    
    public CFcandidatura(Integer id, String d, GregorianCalendar datac, GregorianCalendar dataa, Integer idf, String dec, Integer bi, HashMap<String, CFquestao> q) {
        this.id_candidatura = id;
        this.descricao = d;
        this.data_candidatura = (GregorianCalendar) datac.clone();
        this.data_decisao = (GregorianCalendar) dataa.clone();
        this.decisao = dec;
        this.id_familia = idf;
        this.id_funcionario = bi;
        this.questoes = new HashMap<>(q);
    }
}
