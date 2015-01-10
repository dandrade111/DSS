package BusinessLayerHabitat;

import java.sql.Date;

public class CFagregado {
    
    /* Variáveis de instância */
    
    private String bi;                         // BI do membro do agregado familiar
    private String nif;                        // NIF do membro do agregado familiar
    private Date data_nascimento;              // Data de nascimento do membro do agregado familiar
    private String morada;
    private Integer familia; // Morada do membro do agregado familiar
    private String nome;                       // Nome do membro do agregado familiar
    private String telemovel;                  // Número de telemóvel do membro do agregado familiar
    private String email;                      // Endereço de e-mail do membro do agregado familiar
    private String parentesco;
    private String estado_civil;// Grau de parentesco do membro do agregado familiar em relação ao representante da família
    private String ocupacao;
    private String escolaridade;
    
    /* Construtores */
    
    public CFagregado() {
        this.bi = "";
        this.nif = "";
        this.data_nascimento = null;
        this.morada = "";
        this.nome = "";
        this.telemovel = "";
        this.email = "";
        this.parentesco = "";
        this.estado_civil="";
        this.ocupacao="";
        this.escolaridade="";
    }
    
    public CFagregado(String b, String n, Date dn, String m, String nm, String tel, String em, String par, String ec, String oc, String esc) {
        this.bi = b;
        this.nif = n;
        this.data_nascimento = (Date) dn.clone();
        this.morada = m;
        this.nome = nm;
        this.telemovel = tel;
        this.email = em;
        this.parentesco = par;
        this.estado_civil= ec;
        this.ocupacao = oc;
        this.escolaridade = esc;
    }
    
    /* Gets */

    public String getBi() {
        return this.bi;
    }

    public String getNif() {
        return this.nif;
    }

    public Date getData_nascimento() {
        return this.data_nascimento;
    }

    public String getMorada() {
        return this.morada;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelemovel() {
        return this.telemovel;
    }

    public String getEmail() {
        return this.email;
    }

    public String getParentesco() {
        return this.parentesco;
    }
    
    public String getEstado_civil() {
        return this.estado_civil;
    }
    
    public String getOcupacao() {
        return this.ocupacao;
    }
    
    public String getEscolaridade() {
        return this.escolaridade;
    }
    
    
    
    /* Sets */

    public void setBi(String b) {
        this.bi = b;
    }

    public void setNif(String n) {
        this.nif = n;
    }

    public void setData_nascimento(Date dn) {
        this.data_nascimento = dn;
    }

    public void setMorada(String m) {
        this.morada = m;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setTelemovel(String t) {
        this.telemovel = t;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public void setParentesco(String p) {
        this.parentesco = p;
    }
    
    public void setEstado_civil(String ec) {
        this.estado_civil = ec;
    }
    
    public void setOcupacao(String oc) {
        this.ocupacao = oc;
    }
    
    public void setEscolariade(String esc) {
        this.escolaridade = esc;
    }
}
