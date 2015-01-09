package DataLayerHabitat;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOCAFfuncionario {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCAFfuncionario() {
        this.conn = null;
    }
    
    public DAOCAFfuncionario(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Boolean login(String user, String pass) throws SQLException {
        boolean correto = false;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT password FROM Funcionario WHERE username='" + user + "'";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next())
            if (rs.getString(1).equals(pass))
                correto = true;
        
        return correto;
    }
}
