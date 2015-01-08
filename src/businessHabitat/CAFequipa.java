package businessHabitat;

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
}
