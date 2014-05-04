package login_;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class xulylogin
 */
@WebServlet("/xulylogin")
public class xulylogin extends HttpServlet {
	public void service(ServletRequest request,ServletResponse response)throws IOException{
		response.setContentType("text/html");
		//lay luong xuat de ghi du lieu
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		String lang=request.getParameter("flang");
		
		// ghi ket qua phan hoi 
		out.println("<HTML>");
		out.println("<body bgcolor=\"#ffffff\">");
		out.println("the loai sach yeu thich cua ban " + user + " la "+ "<a href='details.jsp?user="+user+"&lang="+lang+"'>" + lang + "</a>"+" .");
		out.println("</body>");
		out.println("</HTML>");
		
	}
}
