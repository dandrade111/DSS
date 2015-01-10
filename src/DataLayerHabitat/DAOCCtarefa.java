package DataLayerHabitat;

import BusinessLayerHabitat.CAFdoador;
import BusinessLayerHabitat.CCtarefa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCCtarefa {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCCtarefa() {
        this.conn = null;
    }
    
    public DAOCCtarefa(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public CCtarefa get(Object id) throws SQLException {
        CCtarefa f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM Tarefa WHERE id_tarefa='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f = new CCtarefa((Integer) rs.getInt(1), rs.getString(2));
        
        return f;
    }
    
    public Collection<CCtarefa> getAll() throws SQLException {
        Collection<CCtarefa> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM Tarefa";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCtarefa((Integer) rs.getInt(1), rs.getString(2)));
        
        return f;
    }
    
    /* INSERTS */
    public CCtarefa put(Integer id, String nt) throws SQLException {
        CCtarefa d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        stm.executeUpdate("DELETE FROM Tarefa WHERE id_Tarefa='" + id + "'");
            sql = "INSERT INTO Tarefa VALUES ('"+id+"','"+nt+"');"; 
        int i  = stm.executeUpdate(sql);
        
        return new CCtarefa(id, nt);
    }
    
}
