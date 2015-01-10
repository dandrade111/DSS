package DataLayerHabitat;

import BusinessLayerHabitat.CAFequipa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCAFequipa {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCAFequipa() {
        this.conn = null;
    }
    
    public DAOCAFequipa(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CAFequipa> getAll() throws SQLException {
        Collection<CAFequipa> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_EquipasNomes";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFequipa((Integer) rs.getInt(1), rs.getString(2), (Integer) rs.getInt(3), rs.getString(4)));
        
        return f;
    }
    
    public CAFequipa get(Object id) throws SQLException {
        CAFequipa f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_EquipasNomes WHERE id_equipa='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f = new CAFequipa((Integer) rs.getInt(1), rs.getString(2), (Integer) rs.getInt(3), rs.getString(4));
        
        return f;
    }


/*INSERTS */
    public CAFequipa put(Integer id, String n, Integer fu, String nf) throws SQLException {
        CAFequipa d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        stm.executeUpdate("DELETE FROM Equipa WHERE id_Equipa='" + id + "'");
        if (fu.equals(0))
            sql = "INSERT INTO Doador VALUES ('"+id+"','"+n+"',NULL,'"+nf+"');";
        else
            sql = "INSERT INTO Doador VALUES ('"+id+"','"+n+"','"+fu+"','"+nf+"');";
        int i  = stm.executeUpdate(sql);
        
        return new CAFequipa( id, n,  fu, nf);
    }

}
