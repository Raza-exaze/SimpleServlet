<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WebSite Is Live</title>
</head>
<body style='background-color:#00FF00'>
<center><h1>Welcome To JSP</h1></center>
<%
out.println("<hr><hr><hr>");
out.println("Java Server Page Now You Can Land");
out.println("<hr><hr>");
String a=(String)request.getAttribute("name");
out.println("<br>");
out.println("This Is Your Login Page");
out.println("<hr><hr>");
out.println("<br>");
out.println("Welcome:"+a);
out.println("<hr><hr><hr>");
%>
</body>
</html>