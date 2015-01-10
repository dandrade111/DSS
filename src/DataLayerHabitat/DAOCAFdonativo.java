package DataLayerHabitat;

import BusinessLayerHabitat.CAFdonativo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;

public class DAOCAFdonativo {
    
    /* Variáveis de instância */
    
    public Connection conn;
    
    /* Construtores */
    
    public DAOCAFdonativo() {
        this.conn = null;
    }
    
    public DAOCAFdonativo(Connection c) {
        this.conn = c;
    }
    
    /* Métodos de instância */
    
    public Collection<CAFdonativo> getAll() throws SQLException {
        Collection<CAFdonativo> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_Donativo";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFdonativo((Integer) rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), (Integer) rs.getInt(5), rs.getDate(6), rs.getString(7), (Integer) rs.getInt(8), rs.getString(9), (Integer) rs.getInt(10)));
        
        return f;
    }
    
    public Collection<CAFdonativo> search(String id, String tipo, String nr_recibo, String data_doacao, String evento, String quantia, String descricao, String id_processo) throws SQLException {
        Collection<CAFdonativo> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_Donativo WHERE id_Doacao LIKE '%"+id+"%'";
        if (!(tipo == null))
            sql = sql +  "AND tipo LIKE '%"+tipo+"%'";
        if (!nr_recibo.equals(""))
            sql = sql +  "AND nr_Recibo LIKE '%"+nr_recibo+"%'";
        if (!(data_doacao == null))
            sql = sql +  "AND data_doacao LIKE '%"+data_doacao+"%'";
        if (!(evento == null))
            sql = sql +  "AND evento LIKE '%"+evento+"%'";
        if (!quantia.equals(""))
            sql = sql +  "AND quantia LIKE '%"+quantia+"%'";
        if (!descricao.equals(""))
            sql = sql +  "AND descricao LIKE '%"+descricao+"%'";
        if (!id_processo.equals(""))
            sql = sql +  "AND Processo LIKE '%"+id_processo+"%'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFdonativo((Integer) rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), (Integer) rs.getInt(5), rs.getDate(6), rs.getString(7), (Integer) rs.getInt(8), rs.getString(9), (Integer) rs.getInt(10)));
        
        return f;
    }
    
    public Collection<CAFdonativo> get(String nif) throws SQLException {
        Collection<CAFdonativo> f = new HashSet<>();
        
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM v_Donativo WHERE Doador='" + nif + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next())
            f.add(new CAFdonativo((Integer) rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), (Integer) rs.getInt(5), rs.getDate(6), rs.getString(7), (Integer) rs.getInt(8), rs.getString(9), (Integer) rs.getInt(10)));
        
        return f;
    }

/* INSERTS */
    public void put(String nif_doador, String tipo, String nr_recibo, String data_doacao, String evento, String quantia, String descricao, String id_processo) throws SQLException {
        CAFdonativo d = null;
        
        String sql = "";
        Statement stm = conn.createStatement();
        if (tipo.equals("Financeira")) {
            if (id_processo.equals(""))
                sql = "INSERT INTO `Doacao` (`tipo`,`nr_Recibo`,`data_doacao`,`evento`,`quantia`,`descricao`,`Doador`) "
                    + "VALUES ('"+tipo+"','"+nr_recibo+"','"+data_doacao+"','"+evento+"','"+quantia+"','"+descricao+"', '"+nif_doador+"');";
            else
                sql = "INSERT INTO `Doacao` (`tipo`,`nr_Recibo`,`data_doacao`,`evento`,`quantia`,`descricao`,`Processo`,`Doador`) "
                    + "VALUES ('"+tipo+"','"+nr_recibo+"','"+data_doacao+"','"+evento+"','"+quantia+"','"+descricao+"','"+id_processo+"','"+nif_doador+"');";
        } else {
            if (id_processo.equals(""))
                sql = "INSERT INTO `Doacao` (`tipo`,`data_doacao`,`evento`,`descricao`,`Doador`) "
                    + "VALUES ('"+tipo+"','"+data_doacao+"','"+evento+"','"+descricao+"','"+nif_doador+"');";
            else
                sql = "INSERT INTO `Doacao` (`tipo`,`data_doacao`,`evento`,`descricao`,`Processo`,`Doador`) "
                    + "VALUES ('"+tipo+"','"+data_doacao+"','"+evento+"','"+descricao+"','"+id_processo+"','"+nif_doador+"');";
        }
        
        int i  = stm.executeUpdate(sql);
    }












}
