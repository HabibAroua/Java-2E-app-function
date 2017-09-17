<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="db.PassengerDAOImp"%>
<%@page import="com.airline.models.Passenger"%>
<%@page import="java.util.*"%>
<%
List<Passenger> list;
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
         <p>Test</p>
         <br>
         <p>My name is <%=a %></p>
    </body>
</html>