package ework;

import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
import java.util.Calendar;
class xoa_file_tong_hop {

	public static void main(String[] args) throws IOException {
		String c;
		int a;

		int dialogButton = JOptionPane.YES_NO_OPTION;
	
		
		do {
			System.out.println("Nhap dia chi file muon xoa : ");
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		c=br.readLine();
		File f=new File(c);
			if(!f.exists()){
				System.out.println("Khong tim thay file " + f.getName());
				}
			else { // xoa folder
			
					try {
						int dialogResult = JOptionPane.showConfirmDialog(null,
								"Du lieu file co the se khong khoi phuc duoc sau khi xoa ! Ban co chac chan xoa ?",
								"Chu y!", dialogButton);
					if(dialogResult==0)	{
						try {
						long begin = Calendar.getInstance().getTimeInMillis();
						delete(f);
						long end = Calendar.getInstance().getTimeInMillis();
						System.out.print("Thoi gian thuc hien lenh xoa file la: " );
						System.out.println((end - begin) + " miligiay");
						}catch(Exception NullPointerException){
							System.err.println("Folder co chua file he thong -> khong the xoa");
						}
						
					}
					else
					{
						System.out.println("File " + f.getName() +" da khong bi xoa ! ");
					}
						}
					catch(Exception e){
						e.printStackTrace();
						}
					}
			int dialogResult = JOptionPane.showConfirmDialog(null,
					"Ban co muon tiep tuc khong?",
					"?", dialogButton);
			
		if(dialogResult==0)
			a=1;
		else
			a=0;
		}
				while(a !=0);
		System.out.println("<---------------------END!------------------------>");
				System.exit(0);
			
		}
			
	

	
	public static void delete(File f) throws IOException {
	// truoc het phai kiem tra f la folder hay tep tin			
		
			if(!f.isDirectory())		// neu la tep tin thi xoa bang delete
			{
				f.delete();
				System.out.println("File " + f.getName() + " Tai dia chi "
						+ f.getAbsolutePath() + " Da xoa thanh cong ");
			}
		while(f.exists()) { // Neu khong co while thi thu muc mac du da trong nhung khong bi xoa di
			
				if (f.isDirectory())// tien trinh xoa het cac thu muc con
				{
					if (f.list().length == 0)// neu folder trong  
					{
						
						f.delete();
						
						System.out.println("Folder " + "' " + f.getName()+ " '" 
								+ " Tai dia chi " + f.getAbsolutePath()
								+ " Da bi xoa ");
	
					} else {
						String file[] = f.list();// khoi tao mang file lay danh sach
													// ten cac tap tin va thu muc
													// con cua doi tuong
						for (String temp : file) {
							File delfile = new File(f, temp);
							delete(delfile);
						}
					}
				}
	
				else // xoa not thu muc me
				{
					f.delete();
					System.out.println("File " + f.getName() + " Tai dia chi "
							+ f.getAbsolutePath() + " Da xoa thanh cong ");
					
				}
					}
				
		}
			}
			

