package ketnoi;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
public class main {
    //connection kết nối cơ sở dữ liệu
    private Connection con;
 
    public void ConnectDB(String accessDBName) throws Exception{
    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
        String url="jdbc:mysql://localhost/elcom";
        con=DriverManager.getConnection(url);
    }
    /**
     * lay 1 bang csdl
     * 
     * @param tableName là bảng cơ sở dữ liệu cần lấy
     * @return
     * @throws Exception
     */
    public ResultSet getTable(String tableName)throws Exception{
        String sql="select * from "+tableName;
        PreparedStatement pstmt=con.prepareStatement(sql);
        return pstmt.executeQuery();
    }
 
    /**
     * Lấy 1 resultset từ  câu truy vấn
     * @param sql là câu truy vấn
     * @return
     * @throws Exception
     */
    public ResultSet getTableFromSQL(String sql)throws Exception{
        PreparedStatement pstmt=con.prepareStatement(sql);
        return pstmt.executeQuery();
    }
    /**
     * Lấy 1 connection
     * @return
     */
    public Connection getConnection(){
        return con;
    }
    /**
     * Đóng kết nối
     * @throws Exception
     */
    public void CloseConnection()throws Exception{
        if(con!=null)
            con.close();
    }
    public static void main(String[] args){
    	System.out.println("hello");
    }
}