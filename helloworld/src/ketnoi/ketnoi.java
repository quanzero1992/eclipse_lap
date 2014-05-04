package ketnoi;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ketnoi
 */
@WebServlet("/ketnoi")
public class ketnoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ketnoi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		java.io.PrintWriter out=new java.io.PrintWriter(res.getOutputStream());
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>hello jdbc|Iam servlet</title>");
		out.println("</head>");
		out.println("<H2><center>TEST HERE</center></H2>");
		out.println("<br>");
		
		String userName = "root";
		String password = "";
		String url ="jdbc:mysql://localhost/elcom";
		String drivername="com.mysql.jdbc.Driver";
		String SQLquery="select*from company";
	// doi tuong ket noi jdbc
		Connection con=null; 
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName(drivername).newInstance();
			//tao ket noi
			con=DriverManager.getConnection(url,userName,password);
			// tao cau lenh truy van
			stmt=con.createStatement();
			rs=stmt.executeQuery(SQLquery);
			out.print("<table border='1'>");
			ResultSetMetaData rsmd=rs.getMetaData();
			int columncount=rsmd.getColumnCount();
			
			out.print("<tr>");
			for(int i=0;i<columncount;i++){
				out.print("<th>"+rsmd.getColumnLabel(i+1)+"</th>");
				
			}
			out.print("</tr>");
			while(rs.next()){
				out.print("<tr>");
				for(int i=0;i<columncount;i++){
					out.print("<td>" + rs.getString(i+1)+"</td>");
				}
			out.print("</tr>");
			
			}
			out.println("</table></center>");
			out.println("</html>");
			out.flush();
			out.close();
			
		}catch(Exception e){
			out.print(e);
		}
		
	}

	

}
