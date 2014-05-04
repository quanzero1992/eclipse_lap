package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ketnoi_sanpham
 */
@WebServlet("/ketnoi_sanpham")
public class ketnoi_sanpham extends HttpServlet {
	private static final long serialVersionUID = 1L;
  static  Connection conn=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ketnoi_sanpham() {
        super();

        // TODO Auto-generated constructor stub
      
    	
    }
    public static void main(String[] args) throws SQLException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		int i;
	System.out.println("<html><body>");
					try {
				String userName = "root";
				String password = "";
				String url = "jdb" +"c:mysql://localhost/elcom";
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				conn = DriverManager.getConnection(url, userName, password);
				System.out.println("Da ket noi CSDL");
			} catch (Exception e) {
				System.err.println("KHONG KET NOI DUOC");
			} finally {
			}
			System.err.println("Cap nhat du lieu!");
			if (conn != null) {
				try {
					conn.close();
//					System.out.println("Dong ket noi");
				} catch(Exception e){
					e.printStackTrace();/* bo qua loi luc dong csdl */
			}
				}
			System.out.println("</body></html>");
		}
    

}
