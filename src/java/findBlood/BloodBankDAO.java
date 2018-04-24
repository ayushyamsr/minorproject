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
public class BloodBankDAO {

    public static boolean updateBloodDetails(long Opos, int Apos, int Bpos, int ABpos, int Oneg, int Aneg, int Bneg, int ABneg, String bloodBankName) {
     
        Connection conn=DBConnection.getConnection();
        String license="";
        boolean update=false;
        try
        {
            PreparedStatement ps=conn.prepareStatement("Select * from bbverification where name=?");
            ps.setString(1,bloodBankName);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
                
            {
               license=rs.getString(1);
            }
            System.out.println(license);
            ps=conn.prepareStatement("update  bbquantity set Opos=?,Oneg=?,Apos=?,Aneg=?,Bpos=?,Bneg=?,ABpos=?,ABneg=? where license=?");
            ps.setLong(1,Opos);
            ps.setInt(2,Oneg);
            ps.setInt(3,Apos);
            ps.setInt(4,Aneg);
            ps.setInt(5,Bpos);
            ps.setInt(6,Bneg);
            ps.setInt(7,ABpos);
            ps.setInt(8,ABneg);
            ps.setString(9,license);
            int x=ps.executeUpdate();
            if(x!=0)
            {
                update=true;
                System.out.println("you are in update-blood-bank");
            }
            
        }
        finally
        {
            return update;
        }
    }
    
}
