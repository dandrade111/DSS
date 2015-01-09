package DataLayerHabitat;

import BusinessLayerHabitat.CAFdoador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCAFdoador {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCAFdoador() {
        this.conn = null;
    }
    
    public DAOCAFdoador(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CAFdoador> getAll() throws SQLException {
        Collection<CAFdoador> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM Doador";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFdoador(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
        
        return f;
    }
    
    public CAFdoador get(Object nif) throws SQLException {
        CAFdoador f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM Doador WHERE NIF='" + (String) nif + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f = new CAFdoador(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
        
        return f;
    }
}
