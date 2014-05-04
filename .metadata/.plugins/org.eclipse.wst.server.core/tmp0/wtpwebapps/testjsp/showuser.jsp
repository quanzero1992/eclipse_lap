<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page language="java" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Show Items </h2>
<br>
<%
String driver="com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost/elcom";
String user="root";
String pass="";
String sqlquery="select*from user";
Connection con=null;
Statement stmt=null;
ResultSet rs=null;

Class.forName(driver).newInstance();
con=DriverManager.getConnection(url, user, pass);
stmt=con.createStatement();
rs=stmt.executeQuery(sqlquery);
%>
<center>
<table border>
<tr>
<% ResultSetMetaData rsmd=rs.getMetaData();
int columncount=rsmd.getColumnCount();
for(int i=0;i<columncount;i++ ){ %>
	<th> <%=rsmd.getColumnLabel(i+1) %></th>
	<%} %>

</tr>
<%while(rs.next()){ %>
<tr>
<%for(int i=0;i<columncount;i++){ %>
<td><%=rs.getString(i+1) %></td>
<%} %>
</tr>

<%} %>

</table>
</center>
</body>
</html>