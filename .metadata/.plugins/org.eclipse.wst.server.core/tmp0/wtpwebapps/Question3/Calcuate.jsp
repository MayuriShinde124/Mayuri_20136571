<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int pri=Integer.parseInt(request.getParameter("amount"));
int t=Integer.parseInt(request.getParameter("tenure"));
int rate=Integer.parseInt(request.getParameter("rate"));
int total=((pri*rate*t)/100);
int emi=(pri*rate)/100;

%>
<h2>Total amount:<%=total %></h2>
<h2>EMI :<%=emi %></h2>


</body>
</html>