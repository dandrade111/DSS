package DataLayerHabitat;

import BusinessLayerHabitat.CAFdoador;
import BusinessLayerHabitat.CAFfuncionario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

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
    
    public CAFfuncionario get(Object id) throws SQLException {
        CAFfuncionario f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM funcionario WHERE BI='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next())
            f = new CAFfuncionario(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4),rs.getString(5),rs.getString(6));
        
        return f;
    }
    
    public Collection<CAFfuncionario> getAll() throws SQLException {
        Collection<CAFfuncionario> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM funcionario";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFfuncionario(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6)));
        
        return f;
    }
/* INSERTS */
    public CAFfuncionario put(String id, String tipo, double salario, String voluntario, String username, String password) throws SQLException {
        CAFfuncionario d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        stm.executeUpdate("DELETE FROM Funcionario WHERE id_Funcionario='" + id + "'");
        if (voluntario.equals(""))
            sql = "INSERT INTO Doador VALUES ('"+id+"','"+tipo+"','"+salario+"',NULL,'"+username+"','"+password+"');";
        else
            sql = "INSERT INTO Doador VALUES ('"+id+"','"+tipo+"','"+salario+"','"+voluntario+"','"+username+"','"+password+"');";
        int i  = stm.executeUpdate(sql);
        
        return new CAFfuncionario(id, tipo, salario, voluntario, username, password);
        
        
    }
    
}
