package DataLayerHabitat;

import BusinessLayerHabitat.CCvoluntarioProcessoTarefa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCCvoluntarioProcessoTarefa {
        
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCCvoluntarioProcessoTarefa() {
        this.conn = null;
    }
    
    public DAOCCvoluntarioProcessoTarefa(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CCvoluntarioProcessoTarefa> getAll() throws SQLException {
        Collection<CCvoluntarioProcessoTarefa> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_ProcessoTarefaVoluntario";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCvoluntarioProcessoTarefa((Integer) rs.getInt(1), rs.getString(2), rs.getString(3), (Integer) rs.getInt(4), rs.getString(5), rs.getDate(6), rs.getDate(7), rs.getDate(8)));
        
        return f;
    }
    
    public Collection<CCvoluntarioProcessoTarefa> get(Object id) throws SQLException {
        Collection<CCvoluntarioProcessoTarefa> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_ProcessoTarefaVoluntario WHERE Processo = '" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCvoluntarioProcessoTarefa((Integer) rs.getInt(1), rs.getString(2), rs.getString(3), (Integer) rs.getInt(4), rs.getString(5), rs.getDate(6), rs.getDate(7), rs.getDate(8)));
        
        return f;
    }
}
