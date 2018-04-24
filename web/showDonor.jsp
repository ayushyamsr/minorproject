<%-- 
    Document   : showDonor
    Created on : Apr 4, 2018, 1:23:15 PM
    Author     : dell
--%>


<%@page import="findBlood.SendSmsServlet"%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="findBlood.HospitalDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donor Details</title>
        <link rel="icon" href="./img/icon.jpg" type="image/png" >
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
      

    </head>
    <body>
        <form action='SendSmsServlet' method='post'>
        <table class="table table-bordered ">
            <thead class="thead-dark">
                <tr>
                    <th class='text-center'>Contact</th>
                    <th class='text-center'>Name</th>
                    <th class='text-center'>Last Donation Date(YYYY-MM-DD)</th>
                    <th class='text-center'>Next Donation Date(YYYY-MM-DD)</th>
                    <th class='text-center'>Notification Center</th>
                </tr>
            </thead>
        <%
            System.out.println(session.getAttribute("hospName"));
           
           int i=0;
            ArrayList<HospitalDTO> list=(ArrayList<HospitalDTO>)request.getAttribute("arrayList");
            //ArrayList arraylst=new ArrayList();
            for(HospitalDTO hsp:list)
            {   
                i++;
                long no=hsp.getNumber();
                //session.setAttribute("contactNumber",no);
                
               // arraylst.add(no);
                
                
                String name=hsp.getName();
                Date nextDD=hsp.getNextDD();
                Date lastDD=hsp.getLastDD();
                String tableDataId="uniqueId"+i;
                String submitId="Notify Donor"+i;
                out.println("<tr><td class='text-center' ><input type='hidden' name='" +tableDataId+ "' value='" +no+ "'>"+no+"</td><td class='text-center'>"+name+"</td><td class='text-center'>"+lastDD+
                          "</td><td class='text-center'>"+nextDD+"</td><td class='text-center'><input type='submit' class='btn btn-info' name='notifyDonor' value='" + submitId + "'></td></tr>");
            }
            //request.setAttribute("mobileNoList",arraylst);
            
        
        %>
        
        </table>
        </form>
    </body>
</html>
