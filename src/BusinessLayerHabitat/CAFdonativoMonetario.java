package businessHabitat;

import java.util.GregorianCalendar;

public class CAFdonativoMonetario extends CAFdonativo {
    
    /* Variáveis de instância */
    
    private float quantia; // Valor da doação caso seja monetária
    
    /* Construtores */
    
    public CAFdonativoMonetario() {
        super();
        this.quantia = 0;
    }
    
    public CAFdonativoMonetario(Integer i, String t, Integer nr, GregorianCalendar dd, String e, String d, Integer ip, String nif, float qt) {
        super(i, t, nr, dd, e, d, ip, nif);
        this.quantia = qt;
    }
    
    /* Gets */

    public float getQuantia() {
        return this.quantia;
    }
    
    /* Sets */
    
    public void setQuantia(float quantia) {
        this.quantia = quantia;
    }
    
    
}
