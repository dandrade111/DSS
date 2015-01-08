package businessHabitat;

public class CAFdoador {
    
    /* Variáveis de instância */
    
    private String nif;
    private String nome;
    private String morada;
    private String tipo;          // Tipo de doador: individual ou coletivo (empresas, associações, etc.)
    private String telefone;
    private String telemovel;
    private String email;
    private String fax;
    private String bi_voluntario; // Caso o doador seja também voluntário
    
    /* Construtores */
    
    public CAFdoador() {
        this.nif = "";
        this.nome = "";
        this.morada = "";
        this.tipo = "";
        this.telefone = "";
        this.telemovel = "";
        this.email = "";
        this.fax = "";
        this.bi_voluntario = "";
    }
    
    // Caso não seja voluntário
    public CAFdoador(String n, String nm, String m, String t, String tel, String tlm, String em, String fax) {
        this.nif = n;
        this.nome = nm;
        this.morada = m;
        this.tipo = t;
        this.telefone = tel;
        this.telemovel = tlm;
        this.email = em;
        this.fax = fax;
        this.bi_voluntario = "";
    }
    
    // Caso seja voluntário
    public CAFdoador(String n, String nm, String m, String t, String tel, String tlm, String em, String fax, String bi) {
        this.nif = n;
        this.nome = nm;
        this.morada = m;
        this.tipo = t;
        this.telefone = tel;
        this.telemovel = tlm;
        this.email = em;
        this.fax = fax;
        this.bi_voluntario = bi;
    }
}
