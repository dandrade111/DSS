package BusinessLayerHabitat;

public class CAFfuncionario {
    
    /* Variáveis de instância */
    
    private String id;
    private String tipo;
    private double salario;
    private String voluntario;
    private String username;
    private String password;
    
    /* Construtores */
    
    public CAFfuncionario() {
        this.id = "";
        this.tipo = "";
        this.salario = 0;
        this.voluntario = "";
        this.username = "";
        this.password = "";
        
    }

    public CAFfuncionario(String id, String tipo, double salario, String voluntario, String username, String password) {
        this.id = id;
        this.tipo = tipo;
        this.salario = salario;
        this.voluntario = voluntario;
        this.username = username;
        this.password = password;
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
    
    public String getUsername(){
        return this.username;
    } 
    
    public String getPassword(){
        return this.password;
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
    
    public void setSalario(double salario){
        this.salario=salario;
    }  
    
    public void setUsername(String username){
        this.username=username;
    }  
}
