<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font align="center">Noi dung file upload </font>
<hr>
<%
int m_totalbytes = request.getContentLength();
byte[] arr=new byte[m_totalbytes];

request.getInputStream().read(arr);

String data=new String(arr);
out.print(data);

%>
</body>
</html>