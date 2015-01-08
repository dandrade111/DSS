package businessHabitat;

import java.util.GregorianCalendar;

public class CAFfuncionario extends CAFvoluntario {
    
    /* Variáveis de instância */
    
    private String id;
    private String tipo;
    private float salario;
    
    /* Construtores */
    
    public CAFfuncionario() {
        super();
        this.id = "";
        this.tipo = "";
        this.salario = 0;
    }
    
    public CAFfuncionario(String bivol, String nifvol, String n, GregorianCalendar dn, String m, String tel, String tlm, String eml, String nac, String idf, String tipof, float sal) {
        super(bivol, nifvol, n, dn, m, tel, tlm, eml, nac);
        this.id = idf;
        this.tipo = tipof;
        this.salario = sal;
    }
//GET
    public String getid(){
        return this.id;
    }
    
    public String gettipo(){
        return this.tipo;
    }  
    
    public double getsalario(){
        return this.salario;
    }    
//SET
    public void setid(String id){
        this.id=id;
    }
    
    public void settipo(String tipo){
        this.tipo=tipo;
    }  
    
    public void setsalario(double Salario){
        this.salario=salario;
    }   
}
