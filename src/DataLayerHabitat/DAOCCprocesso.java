package DataLayerHabitat;

import BusinessLayerHabitat.CCprocesso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCCprocesso {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCCprocesso() {
        this.conn = null;
    }
    
    public DAOCCprocesso(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public CCprocesso get(Object id) throws SQLException {
        CCprocesso f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_processonomes WHERE id_processo='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f = new CCprocesso((Integer) rs.getInt(1), rs.getDate(2), rs.getDate(3), (Integer) rs.getInt(4), rs.getDouble(5), rs.getDouble(6), (Integer) rs.getInt(7), rs.getString(8));
        
        return f;
    }
    
    public Collection<CCprocesso> getAll() throws SQLException {
        Collection<CCprocesso> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_processonomes";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCprocesso((Integer) rs.getInt(1), rs.getDate(2), rs.getDate(3), (Integer) rs.getInt(4), rs.getDouble(5), rs.getDouble(6), (Integer) rs.getInt(7), rs.getString(8)));
        
        return f;
    }
}
