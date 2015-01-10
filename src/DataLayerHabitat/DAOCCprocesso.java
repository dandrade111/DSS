package DataLayerHabitat;

import BusinessLayerHabitat.CAFdoador;
import BusinessLayerHabitat.CCprocesso;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCCprocesso {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCCprocesso() {
        this.conn = null;
    }
    
    public DAOCCprocesso(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public CCprocesso get(Object id) throws SQLException {
        CCprocesso f = null;
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_processonomes WHERE id_processo='" + (String) id + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f = new CCprocesso((Integer) rs.getInt(1), rs.getDate(2), rs.getDate(3), (Integer) rs.getInt(4), rs.getDouble(5), rs.getDouble(6), (Integer) rs.getInt(7), rs.getString(8));
        
        return f;
    }
    
    public Collection<CCprocesso> getAll() throws SQLException {
        Collection<CCprocesso> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_processonomes";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCprocesso((Integer) rs.getInt(1), rs.getDate(2), rs.getDate(3), (Integer) rs.getInt(4), rs.getDouble(5), rs.getDouble(6), (Integer) rs.getInt(7), rs.getString(8)));
        
        return f;
    }
    public Collection<CCprocesso> search(String id, String data_criacao, String data_encerramento, String id_funcionario, String custo_previsto, String custo_final, String id_candidatura, String nome_representante) throws SQLException {
        Collection<CCprocesso> f = new HashSet<>();
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_processonomes " +
                         "WHERE id_Processo LIKE '%"+id+"%' " + 
                         "AND data_criacao LIKE '%"+data_criacao+"%' " + 
                         "AND FuncionarioAprovou LIKE '%"+id_funcionario+"%' " +
                         "AND Candidatura LIKE '%"+id_candidatura+"%' " + 
                         "AND nome_responsavel LIKE '%"+nome_representante+"%'";
        if (!(data_encerramento == null))
            sql = sql + "AND data_encerramento LIKE '%"+data_encerramento+"%'";
        if (!(custo_previsto == null))
            sql = sql + "AND custo_previsto LIKE '%"+custo_previsto+"%' ";
        if (!(custo_final == null))
            sql = sql + "AND custo_final LIKE '%"+custo_final+"%' ";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CCprocesso((Integer) rs.getInt(1), rs.getDate(2), rs.getDate(3), (Integer) rs.getInt(4), rs.getDouble(5), rs.getDouble(6), (Integer) rs.getInt(7), rs.getString(8)));
        System.out.println(sql);
        return f;
    }
    
    /* INSERTS */
    public CCprocesso put(Integer id,
                      Date dc, 
                      Date de, 
                      Integer bi, 
                      double cp, 
                      double cf, 
                      Integer idc,
                      String n) throws SQLException {
        CCprocesso d = null;
        
        String sql;
        Statement stm = conn.createStatement();
        stm.executeUpdate("DELETE FROM Processo WHERE id_processo='" + id + "'");
        if (cf==0)
            sql = "INSERT INTO Processo VALUES ('"+id+"','"+dc+"','"+de+"','"+bi+"','"+cp+"',NULL,'"+idc+"','"+n+"');";
        else
            sql = "INSERT INTO Processo VALUES ('"+id+"','"+dc+"','"+de+"','"+bi+"','"+cp+"','"+cf+"','"+idc+"','"+n+"');";
        int i  = stm.executeUpdate(sql);
        
        return new CCprocesso(id, dc, de, bi, cp, cf, idc, n);
    }
}
