
package loginandregister;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
    
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_login_register", "root","1234");
           
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
