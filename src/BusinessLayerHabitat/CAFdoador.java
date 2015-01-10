package BusinessLayerHabitat;

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
    public CAFdoador(String n, String nm, String fax, String m, String t, String tel, String tlm, String em) {
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
    public CAFdoador(String n, String nm, String fax, String m, String t, String tel, String tlm, String em, String bi) {
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


//Gets 

    public String getNome(){
        return this.nome;
    }

    public String getMorada() {
        return this.morada;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getTelemovel(){
        return this.telemovel;
    }

    public String getEmail(){
        return this.email;
    }
    
    public String getFax(){
        return this.fax;
    }

    public String getBi_voluntario(){
        return this.bi_voluntario;
    }

    public String getNif() {
        return this.nif;
    }

//Sets

    public void setNif(String nif){
       this.nif= nif;
}

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setMorada(String morada){
        this.morada=morada;
    }

    
    public void setTipo(String tipo){
       this.tipo=tipo;       
    }
    
    public void setTelefone (String telefone){
        this.telefone=telefone;
    }
    
    public void setTelemovel (String telemovel){
        this.telemovel=telemovel;
    }
    
    
    public void setEmail(String email){
        this.email=email;
    }
    public void setFax (String fax){
        this.fax=fax;
    }
    
    public void setBi_voluntario (String bi_voluntario){
        this.bi_voluntario = bi_voluntario;      
    }
}