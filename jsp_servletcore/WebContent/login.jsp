<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" import="java.util.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String userName=request.getParameter("username");
String pass=request.getParameter("pass");

%>
Wellcome,<%=userName%>!
<form action="xulylogin" method="post">
<input type="hidden" name="user" value="<%=userName %>">

<br>
chon ngon ngu yeu thich cua ban :
<select name="flang">

	<option value="C" SELECTED>C/C++</option>
	<option value="java" Selected>Java</option>
	<option value="Linux" Selected>Linux</option>
	<option value=".Net" Selected>.NET flatform</option>
	
</select>
<p>
<input type="submit" value="Chon sach"> 

</form>
</body>
</html>