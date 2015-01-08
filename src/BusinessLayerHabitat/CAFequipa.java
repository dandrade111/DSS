package BusinessLayerHabitat;

import java.util.HashMap;

public class CAFequipa {
    
    /* Variáveis de instância */
    
    private String id;
    private String nome;
    private CAFfuncionario funcionario_responsavel;
    private HashMap<String, CAFvoluntario> membros;
    
    /* Construtores */
    
    public CAFequipa() {
        this.id = "";
        this.nome = "";
        this.funcionario_responsavel = new CAFfuncionario();
        this.membros = new HashMap<>();
    }
    
    private CAFequipa(String i, String n, CAFfuncionario f) {
        this.id = i;
        this.nome = n;
        this.funcionario_responsavel = f;
        this.membros = new HashMap<>();
    }
    
    private CAFequipa(String i, String n, CAFfuncionario f, HashMap<String, CAFvoluntario> m) {
        this.id = i;
        this.nome = n;
        this.funcionario_responsavel = f;
        this.membros = new HashMap<>(m);
    }
    
    /* Gets */

    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public CAFfuncionario getFuncionario_responsavel() {
        return this.funcionario_responsavel;
    }

    public HashMap<String, CAFvoluntario> getMembros() {
        return this.membros;
    }
    
    /* Sets */

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncionario_responsavel(CAFfuncionario funcionario_responsavel) {
        this.funcionario_responsavel = funcionario_responsavel;
    }

    public void setMembros(HashMap<String, CAFvoluntario> membros) {
        this.membros = membros;
    }
}
