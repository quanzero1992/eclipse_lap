<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%
try{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	String url="jdbc:mysql://localhost/elcom";
	String user="root";
	String pass="";
	
	Connection conn=DriverManager.getConnection(url,user,pass);
	Statement st=conn.createStatement();
	String sql="Select*from user";
	ResultSet rs=st.executeQuery(sql);

	while(rs.next()){
			
		String show1=rs.getString("username");
		String show2=rs.getString("password");
		%>
		<table border="0">
			<tr>
			<td>
			<%=show1 %>
			</td><td>
			<%=show2 %>
			</td>
			</tr>
		</table>
	<% } 
	
}catch(Exception e){
	e.printStackTrace();
}
%>

</body>
</html>