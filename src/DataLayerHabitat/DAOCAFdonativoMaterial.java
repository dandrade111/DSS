package DataLayerHabitat;

import BusinessLayerHabitat.CAFdoador;
import BusinessLayerHabitat.CAFdonativoMaterial;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCAFdonativoMaterial {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCAFdonativoMaterial() {
        this.conn = null;
    }
    
    public DAOCAFdonativoMaterial(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CAFdonativoMaterial> getAll() throws SQLException {
        Collection<CAFdonativoMaterial> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_materiaisnomes";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFdonativoMaterial((Integer) rs.getInt(1), rs.getString(2), (Integer) rs.getInt(3), (Integer) rs.getInt(4)));
        
        return f;
    }
    
    public Collection<CAFdonativoMaterial> get(Object id) throws SQLException {
        Collection<CAFdonativoMaterial> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_materiaisnomes WHERE Doador='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFdonativoMaterial((Integer) rs.getInt(1), rs.getString(2), (Integer) rs.getInt(3), (Integer) rs.getInt(4)));
        
        return f;
    }
    
    /* INSERTS */
    public CAFdonativoMaterial put(Integer id_doacao, Integer id_material, Integer quantidade) throws SQLException {
        CAFdonativoMaterial d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        stm.executeUpdate("DELETE FROM MaterialDoacao WHERE Material='" + id_doacao + "'");
        
            sql = "INSERT INTO MaterialDoacao VALUES ('"+id_doacao+"','"+id_material+"','"+quantidade+"');";
       
        int i  = stm.executeUpdate(sql);
        
        return new CAFdonativoMaterial(id_doacao, id_material, quantidade);
    }
}
