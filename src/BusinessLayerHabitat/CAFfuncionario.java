package BusinessLayerHabitat;

import java.util.GregorianCalendar;

public class CAFfuncionario {
    
    /* Variáveis de instância */
    
    private String id;
    private String tipo;
    private double salario;
    private String voluntario;
    
    /* Construtores */
    
    public CAFfuncionario() {
        this.id = "";
        this.tipo = "";
        this.salario = 0;
        this.voluntario = "";
    }

    public CAFfuncionario(String id, String tipo, double salario, String voluntario) {
        this.id = id;
        this.tipo = tipo;
        this.salario = salario;
        this.voluntario = voluntario;
    }
    
//GET

    public double getSalario() {
        return this.salario;
    }

    public String getVoluntario() {
        return this.voluntario;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getTipo(){
        return this.tipo;
    } 
    
//SET
    
    public void setVoluntario(String voluntario) {
        this.voluntario = voluntario;
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }  
    
    public void setSalario(double Salario){
        this.salario=salario;
    }   
}
