package DataLayerHabitat;

import BusinessLayerHabitat.CAFdoador;
import BusinessLayerHabitat.CAFvoluntariosEquipa;
import BusinessLayerHabitat.CCmaterial;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCCmaterial {
            
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCCmaterial() {
        this.conn = null;
    }
    
    public DAOCCmaterial(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CCmaterial> getAll() throws SQLException {
        Collection<CCmaterial> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM Material";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCmaterial((Integer) rs.getInt(1), rs.getString(2), (Integer) rs.getInt(3)));
        
        return f;
    }
    
    public CCmaterial get(Object id) throws SQLException {
        CCmaterial f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM Material WHERE id_Material='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f = new CCmaterial((Integer) rs.getInt(1), rs.getString(2), (Integer) rs.getInt(3));
        
        return f;
    }
    
    /* INSERTS */
    public CCmaterial put(Integer id, String desc, Integer q) throws SQLException {
        CCmaterial d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        stm.executeUpdate("DELETE FROM Material WHERE id_Material='" + id + "'");
        if (desc.equals(""))
            sql = "INSERT INTO Material VALUES ('"+id+"',NULL,'"+q+"');";
        else
            sql = "INSERT INTO Material VALUES ('"+id+"','"+desc+"','"+q+"');";
        int i  = stm.executeUpdate(sql);
        
        return new CCmaterial(id, desc, q);
    }
    
    
}
