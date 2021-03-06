package BusinessLayerHabitat;

import java.sql.Date;

public class CCprocesso {
    
    /* Variáveis de instância */
    
    private Integer id;
    private Date data_criacao;
    private Date data_encerramento;
    private Integer id_funcionario;                     // Funcionario que criou o processo;
    private double custo_previsto;
    private double custo_final;
    private Integer id_candidatura;                     // Qual a candidatura que originou este processo
    private String nome_representante;
    
    /* Construtor */
    
    public CCprocesso() {
        this.id = 0;
        this.data_criacao = null;
        this.data_encerramento = null;
        this.id_funcionario = 0;
        this.custo_previsto = 0;
        this.custo_final = 0;
        this.id_candidatura = 0;
        this.nome_representante = "";
    }
    
    // Processo simples, sem tarefas, material ou equipas
    public CCprocesso(Integer i,
                      Date dc, 
                      Date de, 
                      Integer bi, 
                      double cp, 
                      double cf, 
                      Integer idc,
                      String n) {
        this.id = i;
        this.data_criacao = (Date) dc.clone();
        if (!(de == null))
            this.data_encerramento = (Date) de.clone();
        else
            this.data_encerramento = null;
        this.id_funcionario = bi;
        this.custo_previsto = cp;
        this.custo_final = cf;
        this.id_candidatura = idc;
        this.nome_representante = n;
    }
    
    //GET

    public String getNome_representante() {
        return this.nome_representante;
    }
    
    public Integer getId(){
        return this.id;
    }
 
    public Date getData_criacao(){
        return this.data_criacao;
    }

    public Date getData_encerramento(){
        return this.data_encerramento;
    } 
    
    public Integer getId_funcionario(){
        return this.id_funcionario;
    }  
    
    public double getCusto_previsto(){
        return this.custo_previsto;
    } 

    public double getCusto_final(){
        return this.custo_final;
    }
    
    public Integer getId_candidatura(){
        return this.id_candidatura;
    }

//SET

    public void setNome_representante(String nome_representante) {
        this.nome_representante = nome_representante;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
 
    public void setData_criacao(Date data_criacao){
        this.data_criacao =data_criacao;
    }

    public void setData_encerramento(Date data_encerramento){
        this.data_encerramento = data_encerramento;
    } 
    
    public void setId_funcionario(Integer id_funcionario){
        this.id_funcionario = id_funcionario;
    }  
    
    public void setCusto_previsto(double custo_previsto){
        this.custo_previsto = custo_previsto;
    } 

    public void setCusto_final(double custo_final){
        this.custo_final = custo_final;
    }
    
    public void setId_candidatura(Integer id_candidatura){
        this.id_candidatura = id_candidatura;
    }
}

