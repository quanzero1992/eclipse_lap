package IO;
import java.io.*;
class Readbytes {
	
	
	public static void main(String[] args) throws IOException {
		
			byte data[] = new byte[10];
			
			System.out.println("nhap vai ky tu");
			System.in.read(data);
			System.out.println("enter");
			for(int i=0;i<data.length;i++){
				System.out.println((char) data[i]);
			}
			
		
	}

}
