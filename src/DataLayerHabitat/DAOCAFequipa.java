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
    
    public Collection<CAFequipa> getVoluntario(Object bi) throws SQLException {
        Collection<CAFequipa> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "select v.* from v_equipasnomes AS v, VoluntariosEquipa AS ve where v.id_equipa=ve.id_equipa and voluntario_BI='"+bi+"'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFequipa((Integer) rs.getInt(1), rs.getString(2), (Integer) rs.getInt(3), rs.getString(4)));
        
        return f;
    }
    
    public Collection<CAFequipa> search(Object id, Object nome, Object idfunc, Object nfunc) throws SQLException {
        Collection<CAFequipa> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_EquipasNomes " +
                     "WHERE id_equipa LIKE '%"+id+"%'" +
                     "AND nome LIKE '%"+nome+"%'" + 
                     "AND FuncionarioResponsavel LIKE '%"+idfunc+"%'" +
                     "AND NomeFuncionario LIKE '%"+nfunc+"%'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFequipa((Integer) rs.getInt(1), rs.getString(2), (Integer) rs.getInt(3), rs.getString(4)));
        System.out.println(sql);
        return f;
    }


/*INSERTS */
    public CAFequipa put(String n, Integer fu, String nf) throws SQLException {
        CAFequipa d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        //stm.executeUpdate("DELETE FROM Equipa WHERE id_Equipa='" + id + "'");
        if (fu.equals(0))
            sql = "INSERT INTO Doador VALUES ('"+n+"',NULL,'"+nf+"');";
        else
            sql = "INSERT INTO Doador VALUES ('"+n+"','"+fu+"','"+nf+"');";
//        int i  = stm.executeUpdate(sql);
        
        return new CAFequipa(0, n,  fu, nf);
    }

}
