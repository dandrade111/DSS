package BusinessLayerHabitat;

import exceptions.MembroAgregadoNaoExisteException;
import java.util.HashMap;

public class CFfamilia {
    
    /* Variáveis de instância */
    
    private Integer id_familia;                    // Identificador da familia
    private String bi_responsavel;                  // BI do representante da familia
    private float rendimento;                      // Rendimento familiar
    private String telefone;                       // Telefone da família
    private HashMap<String, CFagregado> agregado; // Membros do agregado familiar
    
    /* Construtores */
    
    public CFfamilia() {
        this.id_familia = 0;
        this.bi_responsavel = "";
        this.rendimento = 0;
        this.telefone = "";
        this.agregado = new HashMap<>();
    }
    
    public CFfamilia(Integer id, String bi, float rend, String tel, HashMap<String, CFagregado> agregado) {
        this.id_familia = id;
        this.bi_responsavel = bi;
        this.rendimento = rend;
        this.telefone = tel;
        this.agregado = new HashMap<>(agregado);
    }
    
    /* Gets */

    public Integer getId_familia() {
        return this.id_familia;
    }

    public String getBi_responsavel() {
        return this.bi_responsavel;
    }

    public float getRendimento() {
        return this.rendimento;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public HashMap<String, CFagregado> getAgregado() {
        return this.agregado;
    }
    
    public CFagregado getMembroAgregado(Integer id_membro) throws MembroAgregadoNaoExisteException {
        if (this.agregado.containsKey(id_membro)) {
            return this.agregado.get(id_membro);
        } else {
            throw new MembroAgregadoNaoExisteException();
        }
    }
    
    /* Sets */

    public void setId_familia(Integer idf) {
        this.id_familia = idf;
    }

    public void setBi_responsavel(String bir) {
        this.bi_responsavel = bir;
    }

    public void setRendimento(float r) {
        this.rendimento = r;
    }

    public void setTelefone(String t) {
        this.telefone = t;
    }

    public void setAgregado(HashMap<String, CFagregado> a) {
        this.agregado = new HashMap<>(a);
    }
    
    /* Add */
    
    public void addMembroAgregado(CFagregado a) {
        this.agregado.put(a.getBi(), a);
    }
    
    public void addMembros(HashMap<String, CFagregado> a) {
        this.agregado.putAll(a);
    }
}
