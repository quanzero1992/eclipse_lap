package IO;

import java.io.*;
import java.util.Scanner;

class showfile {
	
	public static void main(String[] args) throws IOException  {
		int i;
		FileInputStream fin;
		try 
		{	System.out.println("Nhap duong dan den file can tim");
			Scanner in=new Scanner(System.in);
			String c=in.next();
			fin=new FileInputStream(c);
		
			
		}
		catch(FileNotFoundException exc){
			System.out.println("Khong tim thay file");
			return;
		}
		catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("Usage:showfile file");
			return;
			
		}
		do
		{
			
			i=fin.read();
			if(i!=-1)System.out.print((char) i);
		
			
	
		}
		while(i!=-1);
		fin.close();
		
			
	}

}
