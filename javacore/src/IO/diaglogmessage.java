package IO;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;
class diaglogmessage {

	
	
	public static void main(String[] args) {
		int dialogButton = JOptionPane.YES_NO_OPTION;
		int a;
		Scanner in=new Scanner(System.in);
		do {
		int dialogResult = JOptionPane.showConfirmDialog(null,
				"Du lieu file co the se khong khoi phuc duoc sau khi xoa",
				"Chu y!", dialogButton);
		
		if (dialogResult == 0)
			{System.out.println("Yes");
		break;}
		else
			{
			System.out.println("No");
		System.out.println(dialogResult);
			
			
		System.out.println("1 tiep tuc | 0 de thoat");
		a=in.nextInt();
		
			}
		}
		while(a!=0);
		
	}
}

