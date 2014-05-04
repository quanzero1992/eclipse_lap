package IO;

import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

class xoafiletonghop {

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
				System.out.println("Khong tim thay file" + f.getName());
				}
			else { // xoa folder
			
					try {
						int dialogResult = JOptionPane.showConfirmDialog(null,
								"Du lieu file co the se khong khoi phuc duoc sau khi xoa ! Ban co chac chan xoa ?",
								"Chu y!", dialogButton);
					if(dialogResult==0)	
						delete(f);
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
				while(f.exists()) {
		if(f.isDirectory())// Neu co thu muc con thi dung de quy
		{
			if(f.list().length==0){
				f.delete();
				System.out.println("Folder " + f.getName() + " Tai dia chi " + f.getAbsolutePath() + " Da bi xoa ");
				
			}
			else {
				String file[]=f.list();// khoi tao mang file lay danh sach ten cac tap tin va thu muc con cua doi tuong 
				for(String temp:file){
					File delfile= new File(f,temp);
					delete(delfile);
				}
			}
		}
		
		else//Neu khong co thu muc con thi xoa nhu binh thuong
		{
			f.delete();
			System.out.println("File " + f.getName() + " Tai dia chi " + f.getAbsolutePath() + " Da xoa thanh cong ");
		}
				}
				
	}
			
}
