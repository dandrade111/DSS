package BusinessLayerHabitat;

import java.sql.Date;
import java.util.GregorianCalendar;

public class CAFvoluntario {
    
    /* Variáveis de instância */
    
    private String bi;
    private String nif;
    private String nome;
    private Date data_nascimento;
    private String morada;
    private String telefone;
    private String telemovel;
    private String email;
    private String nacionalidade;
    private String profissao;
    private String habilitacoes;
    private String conhecimentos_linguisticos;
    private String formacao_complementar;
    private String experiencia_voluntariado;
    private String conhecimentos_construcao;
    private String obra;
    private String como_conheceu;
    private String receber_informacoes;
    private String disponibilidade;
    
    /* Construtores */
    
    public CAFvoluntario() {
        this.bi = "";
        this.nif = "";
        this.nome = "";
        this.data_nascimento = null;
        this.morada = "";
        this.telefone = "";
        this.telemovel = "";
        this.email = "";
        this.nacionalidade = "";
        this.profissao = "";
        this.habilitacoes = "";
        this.conhecimentos_linguisticos = "";
        this.formacao_complementar = "";
        this.experiencia_voluntariado = "";
        this.conhecimentos_construcao = "";
        this.obra = "";
        this.como_conheceu = "";
        this.receber_informacoes = "";
        this.disponibilidade = "";
    }
    
    public CAFvoluntario(String bi, String nome, Date data_nascimento, String morada, String telemovel, String email, String nacionalidade, String profissao) {
        this.bi = bi;
        this.nome = nome;
        this.data_nascimento = (Date) data_nascimento.clone();
        this.morada = morada;
        this.telemovel = telemovel;
        this.email = email;
        this.nacionalidade = nacionalidade;
        this.profissao = profissao;
        this.nif = "";
        this.telefone = "";
        this.habilitacoes = "";
        this.conhecimentos_linguisticos = "";
        this.formacao_complementar = "";
        this.experiencia_voluntariado = "";
        this.conhecimentos_construcao = "";
        this.obra = "";
        this.como_conheceu = "";
        this.receber_informacoes = "";
        this.disponibilidade = "";
    }

    public CAFvoluntario(String bi, 
                         String nif, 
                         String nome, 
                         Date data_nascimento, 
                         String morada, 
                         String telefone, 
                         String telemovel, 
                         String email, 
                         String nacionalidade, 
                         String profissao, 
                         String habilitacoes, 
                         String conhecimentos_linguisticos, 
                         String formacao_complementar, 
                         String experiencia_voluntariado, 
                         String conhecimentos_construcao, 
                         String obra, 
                         String como_conheceu, 
                         String receber_informacoes, 
                         String disponibilidade) {
        this.bi = bi;
        this.nif = nif;
        this.nome = nome;
        this.data_nascimento = (Date) data_nascimento.clone();
        this.morada = morada;
        this.telefone = telefone;
        this.telemovel = telemovel;
        this.email = email;
        this.nacionalidade = nacionalidade;
        this.profissao = profissao;
        this.habilitacoes = habilitacoes;
        this.conhecimentos_linguisticos = conhecimentos_linguisticos;
        this.formacao_complementar = formacao_complementar;
        this.experiencia_voluntariado = experiencia_voluntariado;
        this.conhecimentos_construcao = conhecimentos_construcao;
        this.obra = obra;
        this.como_conheceu = como_conheceu;
        this.receber_informacoes = receber_informacoes;
        this.disponibilidade = disponibilidade;
    }
    
//GET

    public String getProfissao() {
        return this.profissao;
    }

    public String getHabilitacoes() {
        return this.habilitacoes;
    }

    public String getConhecimentos_linguisticos() {
        return this.conhecimentos_linguisticos;
    }

    public String getFormacao_complementar() {
        return this.formacao_complementar;
    }

    public String getExperiencia_voluntariado() {
        return this.experiencia_voluntariado;
    }

    public String getConhecimentos_construcao() {
        return this.conhecimentos_construcao;
    }

    public String getObra() {
        return this.obra;
    }

    public String getComo_conheceu() {
        return this.como_conheceu;
    }

    public String getReceber_informacoes() {
        return this.receber_informacoes;
    }

    public String getDisponibilidade() {
        return this.disponibilidade;
    }
    
    public String getBi(){
        return this.bi;
    }
    
    public String getNif(){
        return this.nif;
    }  
    
    public String getNome(){
        return this.nome;
    }    

    public Date getData_nascimento() {
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

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setHabilitacoes(String habilitacoes) {
        this.habilitacoes = habilitacoes;
    }

    public void setConhecimentos_linguisticos(String conhecimentos_linguisticos) {
        this.conhecimentos_linguisticos = conhecimentos_linguisticos;
    }

    public void setFormacao_complementar(String formacao_complementar) {
        this.formacao_complementar = formacao_complementar;
    }

    public void setExperiencia_voluntariado(String experiencia_voluntariado) {
        this.experiencia_voluntariado = experiencia_voluntariado;
    }

    public void setConhecimentos_construcao(String conhecimentos_construcao) {
        this.conhecimentos_construcao = conhecimentos_construcao;
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public void setComo_conheceu(String como_conheceu) {
        this.como_conheceu = como_conheceu;
    }

    public void setReceber_informacoes(String receber_informacoes) {
        this.receber_informacoes = receber_informacoes;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
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

    public void setData_nascimento(Date d) {
        this.data_nascimento = (Date) d.clone();
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
