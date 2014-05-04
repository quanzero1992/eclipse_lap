<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
int x=0;
int y=1;
System.out.println("thuc hien phep chia "+y + " cho "+ x);
try{
	x=x/y;
}catch(Exception e){
	e.printStackTrace();
	System.out.print("phep chia bi loi");
}
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
x:<%=x %> <br/>
y:<%=y %>
</body>
</html>