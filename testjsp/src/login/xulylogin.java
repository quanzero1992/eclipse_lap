package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class LoginServlet
*/
public class xulylogin extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Connection conn=null;
    public void init(ServletConfig config) throws ServletException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print("Driver not found ^^");
        }
    }
    public Connection getConn() {
        return conn;
    }
    public void setConn(Connection conn) {
        this.conn = conn;
    }
    public xulylogin() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        try {
            if(checkUser(user,pass)==true){
                out.println("<html><head><title>Wellcome !</title></head><body>");
                out.println("Wellcome "+user+" to J2EE");
                out.print("</body></hmtl>");
            }else{
                out.println("<html><head><title>Access Denied!</title></head><body>");
                out.println("Your user or password is not match ,please <a href='Register.jsp'>Register</a>");
                out.print("</body></hmtl>");
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.print(e.getMessage());
          }

    }

    
    public boolean checkUser(String user,String password) throws ClassNotFoundException{
        boolean check = false;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/elcom","root","");
            String sql = "SELECT * FROM user WHERE username='"+user+"' AND password='"+password+"'";
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
                check = true;
            else
                check = false;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return check;
    }

}