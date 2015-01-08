package businessHabitat;

import java.util.GregorianCalendar;

public class CAFvoluntario {
    
    /* Variáveis de instância */
    
    private String bi;
    private String nif;
    private String nome;
    private GregorianCalendar data_nascimento;
    private String morada;
    private String telefone;
    private String telemovel;
    private String email;
    private String nacionalidade;
    
    /* Construtores */
    
    public CAFvoluntario() {
        this.bi = "";
        this.nif = "";
        this.nome = "";
        this.data_nascimento = new GregorianCalendar();
        this.morada = "";
        this.telefone = "";
        this.telemovel = "";
        this.email = "";
        this.nacionalidade = "";
    }
    
    public CAFvoluntario(String bivol, String nifvol, String n, GregorianCalendar dn, String m, String tel, String tlm, String eml, String nac) {
        this.bi = bivol;
        this.nif = nifvol;
        this.nome = n;
        this.data_nascimento = (GregorianCalendar) dn.clone();
        this.morada = m;
        this.telefone = tel;
        this.telemovel = tlm;
        this.email = eml;
        this.nacionalidade = nac;
    }
    
//GET
    public String getBi(){
        return this.bi;
    }
    
    public String getNif(){
        return this.nif;
    }  
    
    public String getNome(){
        return this.nome;
    }    

    public GregorianCalendar getData_nascimento() {
        return this.data_nascimento;
    }

    public String getMorada() {
        return this.morada;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getTelemovel() {
        return this.telemovel;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }
    
    
//SET
    public void setId(String b){
        this.bi = b;
    }
    
    public void setNif(String n){
        this.nif = n;
    }  
    
    public void setNome(String n){
        this.nome = n;
    }

    public void setBi(String b) {
        this.bi = b;
    }

    public void setData_nascimento(GregorianCalendar d) {
        this.data_nascimento = (GregorianCalendar) d.clone();
    }

    public void setMorada(String m) {
        this.morada = m;
    }

    public void setTelefone(String t) {
        this.telefone = t;
    }

    public void setTelemovel(String t) {
        this.telemovel = t;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public void setNacionalidade(String n) {
        this.nacionalidade = n;
    }
    
    
}
