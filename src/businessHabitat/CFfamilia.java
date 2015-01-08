package businessHabitat;

import java.util.HashMap;

public class CFfamilia {
    
    /* Variáveis de instância */
    
    private Integer id_familia;                    // Identificador da familia
    private String bi_responsavel;                  // BI do representante da familia
    private float rendimento;                      // Rendimento familiar
    private String telefone;                       // Telefone da família
    private HashMap<Integer, CFagregado> agregado; // Membros do agregado familiar
    
    /* Construtores */
    
    public CFfamilia() {
        this.id_familia = 0;
        this.bi_responsavel = "";
        this.rendimento = 0;
        this.telefone = "";
        this.agregado = new HashMap<>();
    }
    
    public CFfamilia(Integer id, String bi, float rend, String tel, HashMap<Integer, CFagregado> agregado) {
        this.id_familia = id;
        this.bi_responsavel = bi;
        this.rendimento = rend;
        this.telefone = tel;
        this.agregado = new HashMap<>(agregado);
    }
}
