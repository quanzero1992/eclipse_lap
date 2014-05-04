package ketnoijdbc;

import java.sql.DriverManager;
import java.util.Collection;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ketnoi {
	static String user;
	static String pass;
	static String url;

	static Collection conn = null;
	public static void main(String[] args) {
		try{
		user= "root";
		pass= "";
		url = "jdbc:mysql://localhost/elcom";
		Class.forName ("com.mysql.jdbc.Driver").newInstance ();
		conn = (Collection) DriverManager.getConnection (url,user, pass);
		System.out.println ("Da ket noi CSDL");
		
		}
		catch (Exception e){
		System.err.println ("KHONG KET NOI DUOC");
		}
		finally
	{
	if (conn != null)
	{
		System.out.println("Du lieu da duoc ket noi");
		
	
	}
	else System.out.println("du lieu chua duoc ket noi");
	}
	
	}

}
