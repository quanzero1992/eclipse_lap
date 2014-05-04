package IO;

import java.io.*;
import java.util.Scanner;
class timchuoi {
public static void main(String args[]) throws IOException{
FileInputStream fin=new FileInputStream("D:\\test.txt");
int i;
do{
	i=fin.read();

	
	String m= Character.toString((char)i);
	
	if(i!=-1)
	{	
			System.out.print(m);
		}
	if(m.equalsIgnoreCase("VoTranQuan"))
		System.out.println("Co chuoi nhe");
}
while(i!=-1);

		
}


}
