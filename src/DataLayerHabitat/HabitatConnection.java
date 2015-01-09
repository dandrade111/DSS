package DataLayerHabitat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HabitatConnection {
    
    /* variáveis de instância */
    
    private Connection con;
    
    /* Construtores */
    
    public HabitatConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String connectionUrl = "jdbc:mysql://192.168.0.100:3306/Habitat?" + "user=gabriel&password=11";
        this.con = DriverManager.getConnection(connectionUrl);
    }
    
    /* Gets */
    
    public Connection getConnection() {
        return this.con;
    }
    
    /* Close connection */
    
    public void closeConnection() throws SQLException {
        this.con.close();
    }
}
