package businessHabitat;

import java.util.GregorianCalendar;

public class CFagregado {
    
    /* Variáveis de instância */
    
    private String bi;                         // BI do membro do agregado familiar
    private String nif;                        // NIF do membro do agregado familiar
    private GregorianCalendar data_nascimento; // Data de nascimento do membro do agregado familiar
    private String morada;                     // Morada do membro do agregado familiar
    private String nome;                       // Nome do membro do agregado familiar
    private String telemovel;                  // Número de telemóvel do membro do agregado familiar
    private String email;                      // Endereço de e-mail do membro do agregado familiar
    private String parentesco;                 // Grau de parentesco do membro do agregado familiar em relação ao representante da família
    
    /* Construtores */
    
    public CFagregado() {
        this.bi = "";
        this.nif = "";
        this.data_nascimento = new GregorianCalendar();
        this.morada = "";
        this.nome = "";
        this.telemovel = "";
        this.email = "";
        this.parentesco = "";
    }
    
    public CFagregado(String b, String n, GregorianCalendar dn, String m, String nm, String tel, String em, String par) {
        this.bi = b;
        this.nif = n;
        this.data_nascimento = (GregorianCalendar) dn.clone();
        this.morada = m;
        this.nome = nm;
        this.telemovel = tel;
        this.email = em;
        this.parentesco = par;
    }
}
