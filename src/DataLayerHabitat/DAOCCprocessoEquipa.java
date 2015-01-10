package DataLayerHabitat;

import BusinessLayerHabitat.CAFdoador;
import BusinessLayerHabitat.CCprocessoEquipa;
import BusinessLayerHabitat.CFfamilia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCCprocessoEquipa {
        
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCCprocessoEquipa() {
        this.conn = null;
    }
    
    public DAOCCprocessoEquipa(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CCprocessoEquipa> get(Object id) throws SQLException {
        Collection<CCprocessoEquipa> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_processosequipasnomes WHERE Processo='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCprocessoEquipa((Integer) rs.getInt(1), (Integer) rs.getInt(2), rs.getString(3)));
        
        return f;
    }
    
    public Collection<CCprocessoEquipa> getAll() throws SQLException {
        Collection<CCprocessoEquipa> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_processosequipasnomes";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCprocessoEquipa((Integer) rs.getInt(1), (Integer) rs.getInt(2), rs.getString(3)));
        
        return f;
    }


/* INSERTS */
    public CCprocessoEquipa put(Integer processo, Integer equipa) throws SQLException {
        CCprocessoEquipa d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        stm.executeUpdate("DELETE FROM ProcessoEquipa WHERE Processo='" + processo + "'");
        
            sql = "INSERT INTO Doador VALUES ('"+processo+"','"+equipa+"');";
        
        int i  = stm.executeUpdate(sql);
        
        return new CCprocessoEquipa(processo, equipa);
    }
    
}
