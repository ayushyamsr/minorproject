package findBlood;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class DBConnection {
    
    private static Connection conn;
    
    
    static {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("driver loaded succesfully");
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","");
            }
            catch(Exception e)
            {
                System.out.println("Exception is:"+e.getMessage());
            }
            
    }
    
    public static Connection getConnection()
    {
        return conn;
    }
    
}
