package BusinessLayerHabitat;

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
    
    /* Construtores */
    
    public CFcandidatura() {
        this.id_candidatura = 0;
        this.descricao = "";
        this.data_candidatura = new GregorianCalendar();
        this.data_decisao = new GregorianCalendar();
        this.id_familia = 0;
        this.id_funcionario = 0;
    }
    
    public CFcandidatura(Integer id, String d, GregorianCalendar datac, GregorianCalendar dataa, Integer idf, String dec, Integer bi, HashMap<String, CFquestao> q) {
        this.id_candidatura = id;
        this.descricao = d;
        this.data_candidatura = (GregorianCalendar) datac.clone();
        this.data_decisao = (GregorianCalendar) dataa.clone();
        this.decisao = dec;
        this.id_familia = idf;
        this.id_funcionario = bi;
    }
    
    /* Gets */

    public Integer getId_candidatura() {
        return this.id_candidatura;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public GregorianCalendar getData_candidatura() {
        return this.data_candidatura;
    }

    public GregorianCalendar getData_decisao() {
        return this.data_decisao;
    }

    public String getDecisao() {
        return this.decisao;
    }

    public Integer getId_familia() {
        return this.id_familia;
    }

    public Integer getId_funcionario() {
        return this.id_funcionario;
    }
    
    /* Sets */

    public void setId_candidatura(Integer idc) {
        this.id_candidatura = idc;
    }

    public void setDescricao(String d) {
        this.descricao = d;
    }

    public void setData_candidatura(GregorianCalendar dc) {
        this.data_candidatura = dc;
    }

    public void setData_decisao(GregorianCalendar dd) {
        this.data_decisao = dd;
    }

    public void setDecisao(String d) {
        this.decisao = d;
    }

    public void setId_familia(Integer idf) {
        this.id_familia = idf;
    }

    public void setId_funcionario(Integer idf) {
        this.id_funcionario = idf;
    }
}
