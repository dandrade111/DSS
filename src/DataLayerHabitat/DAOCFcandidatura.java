package DataLayerHabitat;

import BusinessLayerHabitat.CFcandidatura;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCFcandidatura {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCFcandidatura() {
        this.conn = null;
    }
    
    public DAOCFcandidatura(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public CFcandidatura get(Object id) throws SQLException {
        CFcandidatura f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_candidaturacomnome WHERE id_Candidatura='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next())
            f = new CFcandidatura((Integer) rs.getInt(1), rs.getString(3), rs.getDate(4), (Integer) rs.getInt(5), rs.getString(6), (Integer) rs.getInt(7), rs.getDate(8), rs.getString(9));
        
        return f;
    }
    
    public Collection<CFcandidatura> getAll() throws SQLException {
        Collection<CFcandidatura> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_candidaturacomnome";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CFcandidatura((Integer) rs.getInt(1), rs.getString(3), rs.getDate(4), (Integer) rs.getInt(5), rs.getString(6), (Integer) rs.getInt(7), rs.getDate(8), rs.getString(9)));
        
        return f;
    }
}
