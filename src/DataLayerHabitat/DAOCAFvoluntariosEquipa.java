package DataLayerHabitat;

import BusinessLayerHabitat.CAFvoluntariosEquipa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCAFvoluntariosEquipa {
        
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCAFvoluntariosEquipa() {
        this.conn = null;
    }
    
    public DAOCAFvoluntariosEquipa(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CAFvoluntariosEquipa> getAll() throws SQLException {
        Collection<CAFvoluntariosEquipa> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_VoluntariosEquipas";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFvoluntariosEquipa((Integer) rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        
        return f;
    }
    
    public Collection<CAFvoluntariosEquipa> get(Object id) throws SQLException {
        Collection<CAFvoluntariosEquipa> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_VoluntariosEquipas WHERE id_equipa='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFvoluntariosEquipa((Integer) rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        
        return f;
    }

     /* INSERTS */
    public CAFvoluntariosEquipa put(Integer equipa, String bi_vol) throws SQLException {
        CAFvoluntariosEquipa d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        stm.executeUpdate("DELETE FROM VoluntariosEquipa WHERE Voluntario_BI='" + bi_vol + "'");
        sql = "INSERT INTO VoluntariosEquipa VALUES ('"+equipa+"','"+bi_vol+"');";
        int i  = stm.executeUpdate(sql);
        
        return new CAFvoluntariosEquipa(equipa, bi_vol);
    }
}
