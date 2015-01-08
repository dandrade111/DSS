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
//SET
    public void setId(String bi){
        this.bi=bi;
    }
    
    public void setNif(String nif){
        this.nif=nif;
    }  
    
    public void setNome(String nome){
        this.nome=nome;
    }
}
