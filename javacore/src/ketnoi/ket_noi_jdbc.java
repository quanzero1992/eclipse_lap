package ketnoi;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ket_noi_jdbc {
	static String user;
	static String pass;
	static String url;

	static Connection conn = null;
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	
		ket_noi();
	}
	public static void ket_noi() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		try{
			 user= "root";
			 pass= "";
			 url = "jdbc:mysql://localhost/elcom";
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
			conn = (Connection) DriverManager.getConnection (url,user, pass);
			System.out.println ("Da ket noi CSDL");
			hienthi();
			}
			catch (Exception e){
			System.err.println ("KHONG KET NOI DUOC");
			}
			finally
		{
		if (conn != null)
		{
			System.out.println("Du lieu da duoc ket noi");
			
		conn.close();
		}
		else System.out.println("du lieu chua duoc ket noi");
		}
		
	}
	public static void hienthi() throws SQLException{
		Statement selectall=(Statement) conn.createStatement();
		String sql="Select * from company";
		ResultSet results=selectall.executeQuery(sql);
		
		while(results.next()){ 
		
		String companyid = results.getString(1); 
		String company_name = results.getString(2); 
		String company_address = results.getString(3); 
		System.out.println(companyid + " | " + company_name + " | "+ company_address);
		
		} 
	}
}
