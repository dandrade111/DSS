package BusinessLayerHabitat;

import java.util.HashMap;

public class CAFequipa {
    
    /* Variáveis de instância */
    
    private String id;
    private String nome;
    private Integer funcionario_responsavel;
    
    /* Construtores */
    
    public CAFequipa() {
        this.id = "";
        this.nome = "";
        this.funcionario_responsavel = 0;
    }
    
    private CAFequipa(String i, String n, Integer f) {
        this.id = i;
        this.nome = n;
        this.funcionario_responsavel = f;
    }
    
    /* Gets */

    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getFuncionario_responsavel() {
        return this.funcionario_responsavel;
    }
    
    /* Sets */

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncionario_responsavel(Integer funcionario_responsavel) {
        this.funcionario_responsavel = funcionario_responsavel;
    }
}
