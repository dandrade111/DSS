package DataLayerHabitat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HabitatConnection {
    
    /* variáveis de instância */
    
    private Connection con;
    
    /* Construtores */
    
    public HabitatConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://192.168.0.100:3306/Habitat?zeroDateTimeBehavior=convertToNull";
            this.con = DriverManager.getConnection(connectionUrl, "gabriel", "11");
        } catch (ClassNotFoundException ex) {
            System.out.println("SQL Exception: "+ ex.toString());
        } catch (SQLException ex) {
            System.out.println("Class Not Found Exception: "+ ex.toString());
        }
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
