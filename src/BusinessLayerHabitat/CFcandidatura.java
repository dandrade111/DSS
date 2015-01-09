package BusinessLayerHabitat;

import java.sql.Date;
import java.util.HashMap;

public class CFcandidatura {
    
    /* Variáveis de instância */
    
    private Integer id_candidatura;
    private String descricao;
    private Date data_candidatura;
    private Integer id_familia;
    private String nome_representante;
    private Integer id_funcionario;
    private Date data_decisao;
    private String decisao; // Decisão tomada pela administração: "Aprovado" ou "Reprovado"
    
    /* Construtores */
    
    public CFcandidatura() {
        this.id_candidatura = 0;
        this.descricao = "";
        this.data_candidatura = null;
        this.id_familia = 0;
        this.nome_representante = "";
        this.id_funcionario = 0;
        this.data_decisao = null;
        this.decisao = "";
    }

    public CFcandidatura(Integer id_candidatura, String descricao, Date data_candidatura, Integer id_familia, String nome_representante, Integer id_funcionario, Date data_decisao, String decisao) {
        this.id_candidatura = id_candidatura;
        this.descricao = descricao;
        this.data_candidatura = data_candidatura;
        this.id_familia = id_familia;
        this.nome_representante = nome_representante;
        this.id_funcionario = id_funcionario;
        this.data_decisao = data_decisao;
        this.decisao = decisao;
    }
    
    /* Gets */

    public String getNome_representante() {
        return nome_representante;
    }
    
    public Integer getId_candidatura() {
        return this.id_candidatura;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Date getData_candidatura() {
        return this.data_candidatura;
    }

    public Date getData_decisao() {
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

    public void setNome_representante(String nome_representante) {
        this.nome_representante = nome_representante;
    }
    
    public void setId_candidatura(Integer idc) {
        this.id_candidatura = idc;
    }

    public void setDescricao(String d) {
        this.descricao = d;
    }

    public void setData_candidatura(Date dc) {
        this.data_candidatura = dc;
    }

    public void setData_decisao(Date dd) {
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
