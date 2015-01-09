package DataLayerHabitat;

import BusinessLayerHabitat.CAFdonativoMaterial;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCAFdonativoMaterial {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCAFdonativoMaterial() {
        this.conn = null;
    }
    
    public DAOCAFdonativoMaterial(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CAFdonativoMaterial> getAll() throws SQLException {
        Collection<CAFdonativoMaterial> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_materiaisnomes";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFdonativoMaterial((Integer) rs.getInt(1), rs.getString(2), (Integer) rs.getInt(3), (Integer) rs.getInt(4)));
        
        return f;
    }
    
    public Collection<CAFdonativoMaterial> get(Object id) throws SQLException {
        Collection<CAFdonativoMaterial> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_materiaisnomes WHERE Doador='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFdonativoMaterial((Integer) rs.getInt(1), rs.getString(2), (Integer) rs.getInt(3), (Integer) rs.getInt(4)));
        
        return f;
    }
}
