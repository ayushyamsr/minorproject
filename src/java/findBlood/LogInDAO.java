/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findBlood;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dell
 */
public class LogInDAO {

    public static String searchId(String emailId,String password) 
    {
        Connection conn=DBConnection.getConnection();
       // boolean found=false;
        String type="none";
        try
        {
            PreparedStatement ps=conn.prepareStatement("Select * from logintable where emailid=? and password=?");
            ps.setString(1,emailId);
            ps.setString(2,password);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
                
            {
               type=rs.getString(3);
            }
        }
        finally
        {
            return type;
        }
        
    }

    public static String searchHospital(String emailId) {
        
        Connection conn=DBConnection.getConnection();
       // boolean found=false;
        String username="";
        try
        {
            PreparedStatement ps=conn.prepareStatement("Select * from hospitalverification,logintable where hospitalverification.id=logintable.id and logintable.emailid=?");
            ps.setString(1,emailId);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
                
            {
               username=rs.getString(2);
            }
        }
        finally
        {
            return username;
        }
    }

    public static String searchBloodBank(String emailId) {
       
        Connection conn=DBConnection.getConnection();
        String username="";
        try
        {
            PreparedStatement ps=conn.prepareStatement("Select * from bbverification,logintable where bbverification.license=logintable.id and emailid=?");
            ps.setString(1,emailId);
            ResultSet  rs=ps.executeQuery();
            if(rs.next())
            {
                username=rs.getString(2);
            }
        }
        finally
        {
            return username;
        }
    }
    
    

    
}
