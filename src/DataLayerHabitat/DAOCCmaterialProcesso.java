package DataLayerHabitat;

import BusinessLayerHabitat.CAFdoador;
import BusinessLayerHabitat.CCmaterialProcesso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCCmaterialProcesso {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCCmaterialProcesso() {
        this.conn = null;
    }
    
    public DAOCCmaterialProcesso(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CCmaterialProcesso> getAll() throws SQLException {
        Collection<CCmaterialProcesso> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_materialprocesso";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCmaterialProcesso((Integer) rs.getInt(1), (Integer) rs.getInt(2), rs.getString(3), (Integer) rs.getInt(4), (Integer) rs.getInt(5)));
        
        return f;
    }
    
    public Collection<CCmaterialProcesso> get(Object id) throws SQLException {
        Collection<CCmaterialProcesso> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_materialprocesso WHERE Processo = '" + id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCmaterialProcesso((Integer) rs.getInt(1), (Integer) rs.getInt(2), rs.getString(3), (Integer) rs.getInt(4), (Integer) rs.getInt(5)));
        
        return f;
    }


/* INSERTS */
    public void put(Integer processo, String material, Integer funcionario, String quantidade) throws SQLException {
        CCmaterialProcesso d = null;
        String sql;
        Statement stm = conn.createStatement();
        sql = "INSERT INTO MaterialProcesso (`Processo`,`Material`,`Funcionario`,`quantidade`) VALUES ('"+processo+"','"+material+"','"+funcionario+"','"+quantidade+"');";   
        int i  = stm.executeUpdate(sql);
    }
    
}