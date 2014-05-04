package IO;
import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
class xoafile {

	
	public static void main(String[] args) throws IOException {
		
System.out.println("Lua chon truong hop");
		System.out.println("1 - Xoa folder | 2 - Xoa file | 3 - Thoat");
		
int a;
Scanner input = new Scanner(System.in);
a=input.nextInt();

switch(a){
	case 1:
		System.out.println("Xoa folder - an 'end' de ket thuc chuong trinh");
		String cf;
		BufferedReader brf= new BufferedReader(new InputStreamReader(System.in));
	
		do {
			
			cf= brf.readLine();
			
				File ff=new File(cf);
	if(!ff.exists()){	
				if(ff.delete())
					JOptionPane.showMessageDialog(null, "Folder " + ff.getName() + " Da bi xoa");
				else
					JOptionPane.showMessageDialog(null, "Tien trinh xoa folder "+ff.getName() + " khong thanh cong");
	}				
	else
		{
			
		}
		}
		while(!cf.equals("end"));
		System.out.println("<------------Chuong trinh ket thuc! ----------->");
		break;
	
	
	case 2:
		System.out.println("Xoa file - an 'end' de ket thuc chuong trinh");
		String c;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		do {
			
			c= br.readLine();
			
				File f=new File(c);
		
				if(f.delete())
					JOptionPane.showMessageDialog(null, "File " + f.getName() +" Dia chi " + f.getAbsolutePath() + " Da bi xoa");
				else
					JOptionPane.showMessageDialog(null, "Tien trinh xoa file "+f.getName()+ f.getPath() + " khong thanh cong");
			
			
			
		
		
		}
		while(!c.equals("end"));
		System.out.println("<------------Chuong trinh ket thuc! ----------->");
		break;
	case 3:
		System.out.println("<------------Chuong trinh ket thuc! ----------->");
		break;
	default : 
}

	
	
}

		
	}


