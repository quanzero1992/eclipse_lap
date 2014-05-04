package IO;
import java.io.*;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class renamefile {

	
	public static void main(String[] args) throws IOException {
	int n;
	JFrame z=new JFrame();
	int dialogButton = JOptionPane.YES_NO_OPTION;
	
		do {	
		System.out.println("Nhap duong dan file");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		String c=br.readLine();
		// lay duoi file 
			int sd=c.indexOf(".");
			String duoi=c.substring(sd);
		File f= new File(c);
		if(!f.exists()){
			System.out.println("File khong ton tai");
		}
		else 
		{
		
		String ften=JOptionPane.showInputDialog(z,"Nhap ten moi cho file");
		String dich=layodia(f) +ften + duoi;
		File ref=new File(dich);
		
		if(ften==null || ften==" ")
			System.out.println("ban chua nhap ten moi cho file -> file chua duoc doi ten");
		else
			{
			f.renameTo(ref); //main 
			System.out.println("da doi ten file '" + f.getName() +"' thanh file '"+ ref.getName()+"'" );
			}
		}
		int kq=JOptionPane.showConfirmDialog(null, "Ban co muon tiep tuc", "?", dialogButton, dialogButton);
		if(kq==0){
			n=1;
		}else
			n=0;
	}
		while(n!=0);
		System.out.println("<-----------------------END!-------------------------->");
		System.exit(0);
	}
	public static String layodia(File f) throws IOException{
		String x=f.getPath().substring(0,f.getPath().length()-f.getName().length());
		return x;
}
	
}
