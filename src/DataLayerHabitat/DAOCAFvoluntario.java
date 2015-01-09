package DataLayerHabitat;

import BusinessLayerHabitat.CAFvoluntario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
    
    public CAFvoluntario get(Object bi) {
        CAFvoluntario v = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM Voluntario WHERE BI='" + (String) bi + "'";
        ResultSet rs = stm.executeQuery(sql);
        
        return v;
    }
}
