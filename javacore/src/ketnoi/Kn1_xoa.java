package ketnoi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

import javax.swing.JOptionPane;
class Kn1_xoa {

	static Connection conn = null;
	public static void main(String[] args) throws IOException {
		int i;
		int dialogButton = JOptionPane.YES_NO_OPTION;
		do {
		try{
		String userName = "root";
		String password = "";
		String url = "jdbc:mysql://localhost/elcom";
		Class.forName ("com.mysql.jdbc.Driver").newInstance ();
		conn = DriverManager.getConnection (url,userName, password);
		System.out.println ("Da ket noi CSDL");
		}
		catch (Exception e){
		System.err.println ("KHONG KET NOI DUOC");
		}
		finally{
		}
		try {
			
			
			
			hien_thi();
			xoa();
			System.out.println("Cap nhat data");
			hien_thi();
//			tong_rs();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conn != null){
			try{
				conn.close();
			System.out.println ("Dong ket noi");
			}
			catch (Exception e) { /* bo qua loi luc dong csdl */ }
			}
		
		int dialogResult = JOptionPane.showConfirmDialog(null,
				"Ban co muon tiep tuc khong?",
				"?", dialogButton);
		
	if(dialogResult==0)
		i=1;
	else
		i=0;
		
		}
		while(i!=0);
		System.out.println("__________________________________END!!!________________________________");
		System.exit(0);
		// main end
		}
	public static void xoa() throws SQLException, IOException {
		Statement xoa=conn.createStatement();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhap ID cong ty ban muon xoa");
		String id=br.readLine();
		String sql="delete from company where companyID="+"'"+id+"'"+"";
		
		System.out.println(sql);
		
		try {
			xoa.executeUpdate(sql);
		} catch (SQLException e) {
			System.err.println("loi | cau lenh xoa khong duoc thuc thi");
			e.printStackTrace();
		}
		System.out.println("lenh xoa da duoc thuc thi thanh cong");
		
	}
	
	public static void hien_thi()throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
	
		Statement selectall=conn.createStatement();
		String sql="Select * From company";
		ResultSet rs=selectall.executeQuery(sql); 
//		System.out.println("tong so dong"+tong_row());
//		System.out.println("tong so cot"+tong_col());
		while (rs.next()){
//			String a1=rs.getString("companyID");
//			String a2=rs.getString("company_name");
//			String a3=rs.getString("company_address");
				
				String a1=rs.getString(1);
				String a2=rs.getString(2);
				String a3=rs.getString(3);
			
			System.out.println(a1 + " | " + a2 +" | "+a3);	
			
		}
				rs.close();
				
	}
	
public static int tong_row() throws SQLException{
	Statement dem=conn.createStatement();
	String sql="SELECT * FROM company";
	ResultSet rs=dem.executeQuery(sql);
	rs.last();
	int  abc=rs.getRow();
	return abc;
}
public static int tong_col() throws SQLException{
	Statement dem=conn.createStatement();
	String sql="SELECT * FROM company";
	ResultSet rs=dem.executeQuery(sql);
	ResultSetMetaData  rs2=rs.getMetaData();
	int x=rs2.getColumnCount();
	
	return x;
}
		
	}
