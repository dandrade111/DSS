package DataLayerHabitat;

import BusinessLayerHabitat.CCtarefaProcesso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCCtarefaProcesso {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCCtarefaProcesso() {
        this.conn = null;
    }
    
    public DAOCCtarefaProcesso(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CCtarefaProcesso> getAll() throws SQLException {
        Collection<CCtarefaProcesso> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_ProcessoTarefa";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCtarefaProcesso((Integer) rs.getInt(1), (Integer) rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getDate(5)));
        
        return f;
    }
    
    public Collection<CCtarefaProcesso> get(Integer idprocesso) throws SQLException {
        Collection<CCtarefaProcesso> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_ProcessoTarefa WHERE processo='" + idprocesso + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCtarefaProcesso((Integer) rs.getInt(1), (Integer) rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getDate(5)));
        
        return f;
    }
    
}
