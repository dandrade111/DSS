package DataLayerHabitat;

import BusinessLayerHabitat.CAFdonativo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCAFdonativo {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCAFdonativo() {
        this.conn = null;
    }
    
    public DAOCAFdonativo(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CAFdonativo> getAll() throws SQLException {
        Collection<CAFdonativo> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_Donativo";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFdonativo((Integer) rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), (Integer) rs.getInt(5), rs.getDate(6), rs.getString(7), (Integer) rs.getInt(8), rs.getString(9), (Integer) rs.getInt(10)));
        
        return f;
    }
    
    public Collection<CAFdonativo> get(Object nif) throws SQLException {
        Collection<CAFdonativo> f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_Donativo WHERE Doador='" + (String) nif + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFdonativo((Integer) rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), (Integer) rs.getInt(5), rs.getDate(6), rs.getString(7), (Integer) rs.getInt(8), rs.getString(9), (Integer) rs.getInt(10)));
        
        return f;
    }
}
