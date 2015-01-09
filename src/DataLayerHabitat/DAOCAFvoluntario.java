package DataLayerHabitat;

import BusinessLayerHabitat.CAFvoluntario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;

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
    
    public CAFvoluntario getSimples(Object bi) throws SQLException {
        CAFvoluntario v = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM voluntario_simples WHERE BI='" + (String) bi + "'";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next())
            v = new CAFvoluntario(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
        
        return v;
    }
    
    public Collection<CAFvoluntario> getAllSimples() throws SQLException {
        Collection<CAFvoluntario> v = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM voluntario_simples";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next())
            v.add(new CAFvoluntario(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
        
        return v;
    }
    
    public CAFvoluntario get(Object bi) throws SQLException {
        CAFvoluntario v = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM voluntario WHERE BI='" + (String) bi + "'";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next())
            v = new CAFvoluntario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), 
                                  rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), 
                                  rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), 
                                  rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19));
        
        return v;
    }
}
