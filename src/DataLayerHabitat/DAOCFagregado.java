package DataLayerHabitat;

import BusinessLayerHabitat.CFagregado;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCFagregado {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCFagregado() {
        this.conn = null;
    }
    
    public DAOCFagregado(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CFagregado> get(Object id) throws SQLException {
        Collection<CFagregado> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM agregado WHERE familia='" + id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CFagregado(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
        
        return f;
    }
    
    public CFagregado getFromBI(Object bi) throws SQLException {
        CFagregado f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM agregado WHERE BI='" + (String) bi + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f = new CFagregado(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
        
        return f;
    }
    
    /* INSERTS */
    public void put(String bi, String nif, String dn, String m, String f, String n, String tel, String em, String par, String ec, String oc, String esc) throws SQLException {
        CFagregado d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        sql = "INSERT INTO Agregado VALUES ('"+bi+"','"+nif+"','"+dn+"','"+m+"','"+f+"','"+n+"','"+tel+"','"+em+"','"+par+"','"+ec+"' ,'"+oc+"','"+esc+"');";
        int i  = stm.executeUpdate(sql);
    }
    
}
