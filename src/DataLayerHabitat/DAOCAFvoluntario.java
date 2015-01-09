package DataLayerHabitat;

import BusinessLayerHabitat.CAFvoluntario;
import java.sql.Connection;

public class DAOCAFvoluntario {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCAFvoluntario() {
        this.conn = null;
    }
    
    public DAOCAFvoluntario(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public CAFvoluntario get(Object id) {
        
    }
}
