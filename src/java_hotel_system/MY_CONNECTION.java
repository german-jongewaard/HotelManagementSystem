package java_hotel_system;


 
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author german 
 */
public class MY_CONNECTION {
    // In this class we will make our connection with the mysql database
    // 1.- download the mysql connector
    // 2.- extract the file
    // 3.- add the connector to your project
    // 4.- open xampp
    // 5.- strt apche and mysql
    // 6.- go to phpmyadmin
    // 7.- create the database
    
    //create a funcion to connect with mysql
    
    
    
    public Connection createConnection()
    {
        
        Connection connection = null;
        
        MysqlDataSource mds = new MysqlDataSource();
        
        try {
            mds.setServerTimezone("UTC");
        } catch (SQLException ex) {
            Logger.getLogger(MY_CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        mds.setServerName("localhost");
        mds.setPortNumber(3306);
        mds.setUser("root");
        mds.setPassword("");
        mds.setDatabaseName("java_hotel_db");
        
        try {
            connection = mds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MY_CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
        return connection;        
    }    
}
