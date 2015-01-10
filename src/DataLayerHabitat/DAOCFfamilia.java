package DataLayerHabitat;

import BusinessLayerHabitat.CAFdoador;
import BusinessLayerHabitat.CFfamilia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCFfamilia {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCFfamilia() {
        this.conn = null;
    }
    
    public DAOCFfamilia(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public CFfamilia get(Object bi) throws SQLException {
        CFfamilia f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_nome_responsavel WHERE bi_responsavel='" + (String) bi + "'";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next())
            f = new CFfamilia((Integer) rs.getInt(1), rs.getFloat(2), rs.getString(3), rs.getString(4), rs.getString(5));
        
        return f;
    }
    
    public Collection<CFfamilia> getAll() throws SQLException {
        Collection<CFfamilia> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_nome_responsavel";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CFfamilia((Integer) rs.getInt(1), rs.getFloat(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        
        return f;
    }
    
    public Collection<CFfamilia> search(String id, String rend, String tel, String bi, String nome) throws SQLException {
        Collection<CFfamilia> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_nome_responsavel " +
                     "WHERE id_Familia LIKE '%"+id+"%' AND rendimento_bruto LIKE '%"+rend+"%' AND telefone LIKE '%"+tel+"%' AND bi_responsavel LIKE '%"+bi+"%' AND nome LIKE '%"+nome+"%'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CFfamilia((Integer) rs.getInt(1), rs.getFloat(2), rs.getString(3), rs.getString(4), rs.getString(5)));
        
        return f;
    }
    
    /* INSERTS */
    public CFfamilia put(Integer id, float rend, String tel, String bi) throws SQLException {
        CFfamilia d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        stm.executeUpdate("DELETE FROM Familia WHERE id_Famlia='" + id + "'");
        
            sql = "INSERT INTO Familia VALUES ('"+id+"','"+rend+"','"+tel+"','"+bi+"');";
       
        int i  = stm.executeUpdate(sql);
        
        return new CFfamilia(id, rend, tel, bi);
    }
    
}

