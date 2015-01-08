package businessHabitat;

public class CCtarefa {
    
    /* Variáveis de instância */
    
    Integer id;
    String nome_tarefa;
    
    /* Construtor */
    
    public CCtarefa() {
        this.id = 0;
        this.nome_tarefa = "";
    }
    
    public CCtarefa(Integer i, String nt) {
        this.id = i;
        this.nome_tarefa = nt;
    }
//GET
    public Integer getId(){
        return this.id;
    }
    
    public String getNome_tarefa(){
        return this.nome_tarefa;
    }  
    
//SET
    public void setId(Integer id){
        this.id=id;
    }
    
    public void setNome_tarefa(String nome_tarefa){
        this.nome_tarefa=nome_tarefa;
    }  
      
}
