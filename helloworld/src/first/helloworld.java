package first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

/**
 * Servlet implementation class helloworld
 */
//@WebServlet(description = "Day la demo", urlPatterns = { "/test" })
public class helloworld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public helloworld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter write=response.getWriter();
		write.print("Hello world by get");
		loadprmt(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter write=response.getWriter();
		write.print("Hello world by post");

		loadprmt(request, response);
		}
	private void loadprmt(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter w= response.getWriter();
		String a=request.getParameter("acount");
		w.print(a);
		
		String b=request.getParameter("password");
		w.print(b);
	}
}
