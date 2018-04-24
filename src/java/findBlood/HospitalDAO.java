/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findBlood;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class HospitalDAO {

   public static boolean insertHospitalDetails(long mobNo, String userName, String bloodGroup, String date, String city) {
     
        Connection conn=DBConnection.getConnection();
       boolean update=false;
       System.out.println("hellaaaa");
        try
        {
            PreparedStatement ps=conn.prepareStatement("insert into donor values(?,?,?,?,?,?)");
            ps.setLong(1,mobNo);
            ps.setString(2,userName);
            ps.setString(3,city);
            ps.setString(4,bloodGroup);
            
            SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
            java.util.Date dat1=new java.util.Date();
            try
            {
                dat1=sdf.parse(date);
            }
            catch(ParseException pe)
            {
                System.out.println("Exception in Date in HOSPITAL_DAO "+pe);
            }
            java.util.Date dat2=new java.util.Date(dat1.getTime());
            dat2.setMonth(dat2.getMonth()+3);
            ps.setDate(5,new java.sql.Date(dat1.getTime()));
            ps.setDate(6,new java.sql.Date(dat2.getTime()));
            int x=ps.executeUpdate();
            if(x!=0)
                
            {
               //license=rs.getString(1);
                update= true;
            }
            System.out.println(update);
            
        }
        finally
        {
            return update;
        }
    }
     public static boolean findNumber(long mobNo)throws SQLException
    {
        boolean b=false;
        try
        {
            Connection conn=DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement("select contact from donor where contact=?");
            ps.setLong(1,mobNo);
            ResultSet rs=ps.executeQuery();    
               if(rs.next()){
                      b=true;
               }      
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured in SQL Connectivity"+e.getMessage());
        }
        return b;
    }
     
     public static boolean updateDonor(long mobNo,String date)
     {
         
         boolean update=false;
         try
         {
             Connection conn=DBConnection.getConnection();
             SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
            java.util.Date dat1=new java.util.Date();
            try
            {
                dat1=sdf.parse(date);
            }
            catch(ParseException pe)
            {
                System.out.println("Exception in Date in HOSPITAL_DAO "+pe);
            }
            java.util.Date dat2=new java.util.Date(dat1.getTime());
            dat2.setMonth(dat2.getMonth()+3);
            
             PreparedStatement ps=conn.prepareStatement("update  donor set dd=?, nextDD=? where contact=?");
             ps.setDate(1,new java.sql.Date(dat1.getTime()));
             ps.setDate(2,new java.sql.Date(dat2.getTime()));
             ps.setLong(3,mobNo);
             int x=ps.executeUpdate();
             if(x!=0)
             {
                 update=true;
             }
            
         }
         catch(Exception e)
         {
             System.out.println("Exception:"+e.getMessage());
         }
          return update;
     }
     
     public static ArrayList<HospitalDTO> getAllDonor(String bgName,String city)throws SQLException
     {
        Connection conn=DBConnection.getConnection();
        //Statement st=conn.createStatement();
        PreparedStatement ps=conn.prepareStatement("Select * from donor where bg=? and city=?");
        ps.setString(1, bgName);
        ps.setString(2, city);
        ResultSet rs=ps.executeQuery();
        ArrayList<HospitalDTO> arlst=new ArrayList<>();
        while(rs.next())
        {
            long number=rs.getLong("contact");
            String name=rs.getString("Name");
            Date nextDonationDate=rs.getDate("nextDD");
            Date lastDonationDate=rs.getDate("DD");
            HospitalDTO hsp=new HospitalDTO(name,number,nextDonationDate,lastDonationDate);
            
            arlst.add(hsp);
        }
        return arlst;
     }
}
