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
    
}
