package IO;
import java.io.*;
import java.util.Scanner;
class writefile {
	
	static FileOutputStream fout;
	
	public static void main(String[] args) throws IOException {
		int i,n;
		do {
		try 
		{
			
			fout = new FileOutputStream("D:\\dich.txt");
			
		}
		catch(FileNotFoundException exc){
			System.out.println("loi khong tim thay file");
			return;
		}
		catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("so ki tu vuot qua cho phep");
			return;
		}
		
		// main
		// problem : neu ki tu write vao file nhieu hon cho phep,may van thuc hien viet vao file dich + in ra loi  
			
				Scanner a=new Scanner(System.in);
				System.out.println("setup so ky tu muon nhap vao");
				n=a.nextInt();
				
				System.out.println("ghi noi dung file");
				byte[] j=new byte[n];
				
				 System.in.read(j);
				 
				fout.write(j);
				System.out.println("file da duoc nhap noi dung moi thanh cong");
				
				fout.close();
				
				System.out.println("1-tiep tuc | 0- ket thuc");
				Scanner input=new Scanner(System.in);	
				i=input.nextInt();
			
			
	}
	
		while(i!=0 && n!=0);
		}
				
	}


