package ework;

import java.io.*;

class show_noi_dung_file {
	
	public static void main(String[] args) throws IOException  {
		int i;
		FileInputStream fin;
		try 
		{	System.out.println("Nhap duong dan den file can tim");
			
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			String c=br.readLine();
			fin=new FileInputStream(c);
			
//			String d=fin.toString();
		
			
		}
		catch(FileNotFoundException exc){
			System.out.println("Khong tim thay file");
			return;
		}
		catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("Usage:showfile file");
			return;
			
		}
		System.out.println("______________________________________ Noi Dung File _______________________________________");
		do
		{
			
			i=fin.read();
			if(i!=-1)System.out.print((char) i);
		
			
	
		}
		while(i!=-1);
		fin.close();
		
			
	}

}
