package DataLayerHabitat;

import BusinessLayerHabitat.CAFdoador;
import BusinessLayerHabitat.CFfamilia;
import BusinessLayerHabitat.CFquestao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCFquestao {
        
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCFquestao() {
        this.conn = null;
    }
    
    public DAOCFquestao(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public CFquestao get(Object id) throws SQLException {
        CFquestao f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM Questao WHERE id_Questoes='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next())
            f = new CFquestao(rs.getString(1), rs.getString(2), rs.getString(3));
        
        return f;
    }
    
    public Collection<CFquestao> getAll() throws SQLException {
        Collection<CFquestao> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM Questao";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CFquestao(rs.getString(1), rs.getString(2), rs.getString(3)));
        
        return f;
    }
    
    /* INSERTS */
    public CFquestao put(String id, String q, String a) throws SQLException {
        CFquestao d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        stm.executeUpdate("DELETE FROM Doador WHERE id_Questoes='" + id + "'");
        
            sql = "INSERT INTO Doador VALUES ('"+id+"','"+q+"','"+a+"');";
       
        int i  = stm.executeUpdate(sql);
        
        return new CFquestao(id,q,a);
    }
}
