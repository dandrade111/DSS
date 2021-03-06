package DataLayerHabitat;

import BusinessLayerHabitat.CAFdoador;
import BusinessLayerHabitat.CFparentesco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCFparentesco {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCFparentesco() {
        this.conn = null;
    }
    
    public DAOCFparentesco(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public CFparentesco get(Object id) throws SQLException {
        CFparentesco f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM Parentesco WHERE id_Parentesco='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next())
            f = new CFparentesco((Integer) rs.getInt(1), rs.getString(2));
        
        return f;
    }
    
    public Collection<CFparentesco> getAll() throws SQLException {
        Collection<CFparentesco> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM Parentesco ORDER BY id_Parentesco";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CFparentesco((Integer) rs.getInt(1), rs.getString(2)));
        
        return f;
    }
    
    /* INSERTS */
    public CFparentesco put(Integer id, String descricao) throws SQLException {
        CFparentesco d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        stm.executeUpdate("DELETE FROM Agregado WHERE id_Parentesco='" + id + "'");
        
            sql = "INSERT INTO Doador VALUES ('"+id+"','"+descricao+"');";
        
        int i  = stm.executeUpdate(sql);
        
        return new CFparentesco(id, descricao);
    }
}
