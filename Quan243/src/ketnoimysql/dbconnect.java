package ketnoimysql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbconnect {

	
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url="jdbc:mysql://localhost/elcom";
			String user="root";
			String pass="";
		
			Connection conn=DriverManager.getConnection(url,user,pass);
			Statement st=conn.createStatement();
			String sql="Select*from user";
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next()){
				String show1=rs.getString("username");
				String show2=rs.getString("password");
				System.out.println(show1);
				System.out.println(show2);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
