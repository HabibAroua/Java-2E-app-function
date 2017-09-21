<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="db.PassengerDAOImp"%>
<%@page import="com.airline.models.Passenger"%>
<%@page import="java.util.*"%>
<%
PassengerDAOImp passengerDAOImp = new PassengerDAOImp();
List<Passenger> list=passengerDAOImp.getAllPassenger();
String a="Habib";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
         <h1>Liste of passangers</h1>
         <br>
         <table border="1px">
               <tr>
                   <td>Cin</td>
                   <td>First Name</td>
                   <td>Last Name</td>
                   <td>Date </td>
                   <td>Gender</td>
               </tr>
               <% for (int i=0;i<list.size();i++)
            	   {
            	%>
               <tr>
                   <td><%=list.get(i).getCin() %></td>
                   <td><%=list.get(i).getFirstName() %></td>
                   <td><%=list.get(i).getLastName() %></td>
                   <td><%=list.get(i).getDob() %></td>
                   <td><%=list.get(i).getGender() %></td>
               </tr>
               <%} %>
         </table>
    </body>
</html>