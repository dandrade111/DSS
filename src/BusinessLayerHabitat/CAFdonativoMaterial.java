package businessHabitat;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class CAFdonativoMaterial extends CAFdonativo {
    
    /* Variáveis de instância */
    
    private HashMap<Integer, Integer> material_doado;
    
    /* Construtores */
    
    public CAFdonativoMaterial() {
        super();
        this.material_doado = new HashMap<>();
    }
    
    //Novo donativo sem o material criado
    public CAFdonativoMaterial(Integer i, 
                               String t, 
                               Integer nr, 
                               GregorianCalendar dd, 
                               String e, 
                               String d, 
                               Integer ip, 
                               String nif) {
        super(i, t, nr, dd, e, d, ip, nif);
        this.material_doado = new HashMap<>();
    }
    
    //Novo donativo já com o material criado
    public CAFdonativoMaterial(Integer i, 
                               String t, 
                               Integer nr, 
                               GregorianCalendar dd, 
                               String e, 
                               String d, 
                               Integer ip, 
                               String nif, 
                               HashMap<Integer, Integer> mat) {
        super(i, t, nr, dd, e, d, ip, nif);
        this.material_doado = new HashMap<>(mat);
    }
}
