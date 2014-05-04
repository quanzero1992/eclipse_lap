package ketnoi;
import java.io.BufferedReader;
import java.io.*;

import java.sql.*;
import java.util.Scanner;
class KN2_them {

	static Connection conn = null;
	public static void main(String[] args) throws SQLException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		int i;
		do {
		
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
			 
			
			hien_thi();
			
			them();
			System.err.println("Cap nhat du lieu!");
			hien_thi();
			if (conn != null) {
				
				try {
					conn.close();
//					System.out.println("Dong ket noi");
				} catch (Exception e) { /* bo qua loi luc dong csdl */
				}
			}
			
			// vong lap tiep tuc chuong trinh 
		System.out.println("nhap 1 de tiep tuc | nhap 0 de thoat");
		Scanner in=new Scanner(System.in);
		i=in.nextInt();
		
		}
		while(i!=0);
		// main end
		}
	
	
	
	public static void them() throws SQLException, IOException{
		Statement a=conn.createStatement();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("nhap companyID moi");
		String id=br.readLine();
		System.out.println("nhap company_name moi");
		String name=br.readLine();
		System.out.println("Nhap dia chi cong ty moi");
		String diachi=br.readLine();
		System.out.println("");
		String sql="INSERT INTO company(companyID,company_name,company_address) values ("+"'" +id+"'"+","+"'"+name+"'"+","+"'"+diachi+"'"+")";
//		System.out.println(sql);
		try {
		a.executeUpdate(sql);
		System.out.println("Da them 1 truong moi vao database thanh cong");
		}
		
		catch (Exception e){
			System.err.println("Loi cau lenh SQL | vui long kiem tra Id ban nhap da duoc cap phat truoc do chua ?");
			System.err.println("cau lenh khong duoc thuc thi");
		}
	}
	
	public static void hien_thi()throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
			Statement selectall = conn.createStatement();
		
			String sql = "Select * From company";
			ResultSet rs = selectall.executeQuery(sql);
		System.out.println("_______________Hien Thi Bang________________");
					while (rs.next()){
//					String a1=rs.getString("companyID");
//					String a2=rs.getString("company_name");
//					String a3=rs.getString("company_address");
						
						String a1=rs.getString(1);
						String a2=rs.getString(2);
						String a3=rs.getString(3);
					
					System.out.println(a1 + " | " + a2 +" | "+a3);	
					
				}
					System.out.println("_____________________END____________________");
				selectall.close();
	}

	
		
	}
