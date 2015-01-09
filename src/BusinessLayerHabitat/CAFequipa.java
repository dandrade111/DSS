package BusinessLayerHabitat;

public class CAFequipa {
    
    /* Variáveis de instância */
    
    private Integer id;
    private String nome;
    private Integer funcionario_responsavel;
    private String nome_funcionario;
    
    /* Construtores */
    
    public CAFequipa() {
        this.id = 0;
        this.nome = "";
        this.funcionario_responsavel = 0;
        this.nome_funcionario = "";
    }
    
    public CAFequipa(Integer i, String n, Integer f, String nf) {
        this.id = i;
        this.nome = n;
        this.funcionario_responsavel = f;
        this.nome_funcionario = nf;
    }
    
    /* Gets */

    public Integer getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getFuncionario_responsavel() {
        return this.funcionario_responsavel;
    }

    public String getNome_funcionario() {
        return this.nome_funcionario;
    }
    
    /* Sets */

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncionario_responsavel(Integer funcionario_responsavel) {
        this.funcionario_responsavel = funcionario_responsavel;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }
}
