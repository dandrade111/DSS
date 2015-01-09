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
        String connectionUrl = "jdbc:mysql://localhost:3306/sgef?" + "user=root&password=pass";
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
