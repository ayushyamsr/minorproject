/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findBlood;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class FindBloodBankDAO {

   public static ArrayList<FindBloodBankDTO> getAllBloodBank(String state, String city)throws SQLException {
       
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("Select * from bbverification,bbquantity where bbverification.license=bbquantity.license and bbverification.state=? and bbverification.city=?");
       ps.setString(1,state);
       ps.setString(2, city);
       ResultSet rs=ps.executeQuery();
       ArrayList<FindBloodBankDTO> arrlst=new ArrayList<>();
       
       while(rs.next())
       {
           String bbname=rs.getString("Name");
           String address=rs.getString("Address");
           long opos=rs.getLong("Opos");
           long apos=rs.getLong("Apos");
           long bpos=rs.getLong("Bpos");
           long abpos=rs.getLong("ABpos");
           long oneg=rs.getLong("Oneg");
           long aneg=rs.getLong("Aneg");
           long bneg=rs.getLong("Bneg");
           long abneg=rs.getLong("ABneg");
           FindBloodBankDTO findbb=new FindBloodBankDTO(bbname,address,opos,apos,bpos,abpos,oneg,aneg,bneg,abneg);
           
           arrlst.add(findbb);
           
           
       }
       return arrlst;
    }
    
}
