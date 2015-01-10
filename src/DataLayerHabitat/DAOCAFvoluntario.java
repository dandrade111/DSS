package DataLayerHabitat;

import BusinessLayerHabitat.CAFvoluntario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCAFvoluntario {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCAFvoluntario() {
        this.conn = null;
    }
    
    public DAOCAFvoluntario(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public CAFvoluntario getSimples(Object bi) throws SQLException {
        CAFvoluntario v = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_voluntario_simples WHERE BI='" + (String) bi + "'";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next())
            v = new CAFvoluntario(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
        
        return v;
    }
    
    public Collection<CAFvoluntario> getSimplesEquipa(Integer id) throws SQLException {
        Collection<CAFvoluntario> v = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM Habitat.v_voluntario_simples AS vs INNER JOIN VoluntariosEquipa AS ve ON vs.BI = ve.Voluntario_BI WHERE ve.id_Equipa='"+id+"'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            v.add(new CAFvoluntario(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
        
        return v;
    }
    
    public Collection<CAFvoluntario> getAllSimples() throws SQLException {
        Collection<CAFvoluntario> v = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_voluntario_simples";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            v.add(new CAFvoluntario(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
        
        return v;
    }
    
    public Collection<CAFvoluntario> searchSimples(Object bi, Object nome, Object data, Object morada, Object tele, Object nac, Object pro) throws SQLException {
        Collection<CAFvoluntario> v = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_voluntario_simples " +
                     "WHERE BI LIKE '%"+bi+"%'" +
                     "AND Nome LIKE '%"+nome+"%'" +
                     "AND data_nascimento LIKE '%"+data+"%'" +
                     "AND morada LIKE '%"+morada+"%'" +
                     "AND telemovel LIKE '%"+tele+"%'" +
                     "AND nacionalidade LIKE '%"+nac+"%'" +
                     "AND profissao LIKE '%"+pro+"%'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            v.add(new CAFvoluntario(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
        
        return v;
    }
    
    public CAFvoluntario get(String bi) throws SQLException {
        CAFvoluntario v = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM voluntario WHERE BI='" + bi + "'";
        ResultSet rs = stm.executeQuery(sql);
        if (rs.next())
            v = new CAFvoluntario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), 
                                  rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), 
                                  rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), 
                                  rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19));
        
        return v;
    }




                                 
                                 /* INSERTS */
    public CAFvoluntario put(String bi, 
                         String nif, 
                         String nome, 
                         Date data_nascimento, 
                         String morada, 
                         String telefone, 
                         String telemovel, 
                         String email, 
                         String nacionalidade, 
                         String profissao, 
                         String habilitacoes, 
                         String conhecimentos_linguisticos, 
                         String formacao_complementar, 
                         String experiencia_voluntariado, 
                         String conhecimentos_construcao, 
                         String obra, 
                         String como_conheceu, 
                         String receber_informacoes, 
                         String disponibilidade) throws SQLException {
        CAFvoluntario d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        stm.executeUpdate("DELETE FROM Voluntario WHERE BI='" + bi + "'");
        sql = "INSERT INTO Doador VALUES ('"+bi+"','"+nif+"','"+nome+"','"+data_nascimento+"','"+morada+"','"+telefone+"','"+telemovel+"','"+email+",'"+nacionalidade+"','"+profissao+",'"+habilitacoes+"','"+email+",'"+habilitacoes+"','"+conhecimentos_linguisticos+",'"+formacao_complementar+"','"+experiencia_voluntariado+",'"+conhecimentos_construcao+"','"+obra+"','"+como_conheceu+"','"+receber_informacoes+"','"+disponibilidade+"');";
        int i  = stm.executeUpdate(sql);
        
        return new CAFvoluntario(bi,nif,nome,data_nascimento,morada,telefone,telemovel,email,nacionalidade,profissao,habilitacoes,conhecimentos_linguisticos,formacao_complementar,experiencia_voluntariado,conhecimentos_construcao,obra,como_conheceu,receber_informacoes,disponibilidade);
    }
}