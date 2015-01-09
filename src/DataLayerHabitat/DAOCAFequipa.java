package DataLayerHabitat;

import BusinessLayerHabitat.CAFequipa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCAFequipa {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCAFequipa() {
        this.conn = null;
    }
    
    public DAOCAFequipa(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CAFequipa> getAll() throws SQLException {
        Collection<CAFequipa> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_EquipasNomes";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFequipa((Integer) rs.getInt(1), rs.getString(2), (Integer) rs.getInt(3), rs.getString(4)));
        
        return f;
    }
    
    public CAFequipa get(Object id) throws SQLException {
        CAFequipa f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_EquipasNomes WHERE id_equipa='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f = new CAFequipa((Integer) rs.getInt(1), rs.getString(2), (Integer) rs.getInt(3), rs.getString(4));
        
        return f;
    }
}
