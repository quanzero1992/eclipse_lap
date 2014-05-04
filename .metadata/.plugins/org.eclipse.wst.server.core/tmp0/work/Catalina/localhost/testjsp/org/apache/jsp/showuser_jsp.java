package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class showuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2> Show Items </h2>\r\n");
      out.write("<br>\r\n");

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

      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<table border>\r\n");
      out.write("<tr>\r\n");
 ResultSetMetaData rsmd=rs.getMetaData();
int columncount=rsmd.getColumnCount();
for(int i=0;i<columncount;i++ ){ 
      out.write("\r\n");
      out.write("\t<th> ");
      out.print(rsmd.getColumnLabel(i+1) );
      out.write("</th>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
while(rs.next()){ 
      out.write("\r\n");
      out.write("<tr>\r\n");
for(int i=0;i<columncount;i++){ 
      out.write("\r\n");
      out.write("<td>");
      out.print(rs.getString(i+1) );
      out.write("</td>\r\n");
} 
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
