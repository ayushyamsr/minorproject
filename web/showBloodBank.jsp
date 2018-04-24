<%-- 
    Document   : showBloodBank
    Created on : Apr 8, 2018, 8:15:21 PM
    Author     : dell
--%>

<%@page import="findBlood.FindBloodBankDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blood Bank</title>
        <script src="js/pdfFromHTML.js"></script>
        <script src="js/jquery-2.1.3.js"></script>
        <script src="js/jspdf.js"></script>
        <style>
            td,th{
                width:10%;
                align:middle;
            }
        </style>
    </head>
    <body>
        <a href="#" onclick="HTMLtoPDF()">Download PDF</a>
        <br>
         <a href="index.html">Go to home page</a>
	<div id="HTMLtoPDF">
            <table style="visibility: hidden">
	
		<tr>
			<th>Hospital Name</th>
                        <th>Address</th>
			<th>O+ve</th>
			<th>A+ve</th>
			<th>B+ve</th>
			<th>AB+ve</th>
			<th>O-ve</th>
			<th>A-ve</th>
			<th>B-ve</th>
			<th>AB-ve</th>
		</tr>
                <%
          
          
                        ArrayList<FindBloodBankDTO> list=(ArrayList<FindBloodBankDTO>)request.getAttribute("bbarrayList");
                        for(FindBloodBankDTO findbb:list)
                        {   
                                
                            String bloodBankName=findbb.getBloodBankName();
                            String address=findbb.getAddress();
                            long opos=findbb.getOpos();
                            long apos=findbb.getApos();
                            long bpos=findbb.getBpos();
                            long abpos=findbb.getABpos();
                            long oneg=findbb.getOneg();
                            long aneg=findbb.getAneg();
                            long bneg=findbb.getBneg();
                            long abneg=findbb.getABneg();
                            out.println("<tr> <td>"+bloodBankName+"</td><td>"+address+"</td><td>"+opos+"</td><td>"+apos+"</td><td>"+bpos+"</td><td>"+abpos+"</td><td>"+oneg+"</td><td>"+aneg+"</td><td>"+bneg+"</td><td>"+abneg+"</td></tr>");
                            
                
                        }
            
            
        
                %>
            </table>
        </div>
           
        
    </body>
</html>
