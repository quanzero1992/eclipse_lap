package ework;
import java.io.*;
import java.util.Scanner;
class tim_chuoi_trong_file {

	
	public static void main(String[] args) throws IOException {
		String search,source;
		String d=null;
		int v;
do {
	BufferedReader brs=new BufferedReader(new InputStreamReader(System.in));
	try {	
		int a=0;
		Scanner in= new Scanner(System.in);
		System.out.println("moi nhap file chua noi dung tim kiem");
		source=in.next();
		FileReader f=new FileReader(source);
		BufferedReader br = new BufferedReader(f);//
		File b=new File(source);
		
		
		 d=br.readLine();
		System.out.println("noi dung file : "+d);
		
		System.out.println("Moi nhap chuoi tim kiem");
	
		search = brs.readLine();
	
	for (int i=0;i<(d.length()-search.length()+1);i++)
	{
		String kq=d.substring(i, search.length()+i);
		
		if(kq.equalsIgnoreCase(search.trim()))
			a=a+1;
	}
	
	System.out.println("------------------------------Search End!----------------------------------");
	if(a!=0)
	System.out.println("Chuoi tim kiem "+ "'"  + search + "'" + " ton tai trong noi dung file voi so lan lap la " + a);
	else
		System.out.println("Khong tim thay chuoi trong file " + b.getName() );
	
	
	}
		catch(Exception e){
			System.out.println("File khong ton tai hoac khong dung dinh dang txt");
			e.toString();
			}
	System.out.println("Nhap 1 de tiep tuc | 0 de ket thuc");
	v=brs.read();
	
}
while(v!=48);// thoat chuong trinh
	System.out.println("<------------------------Chuong trinh ket thuc !-------------------------->");
	System.exit(0);
		
		
	
	}

}
