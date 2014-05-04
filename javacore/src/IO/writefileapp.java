package IO;
import java.io.*;
public class writefileapp {

	public static void main(String[] args) {
		        byte buffer[] = new byte[80];
		        try {
		            System.out.print("Enter a line to be saved to disk: ");
		            int num = System.in.read(buffer);
		            FileOutputStream f = new FileOutputStream("D:\\line.txt");
		            f.write(buffer, 0, num);
		        } catch (Exception e) {
		            String err = e.toString();
		            System.out.println(err);
		        }
		        System.out.println("Du lieu da duoc ghi vao file thanh cong");
		    }
		
	}





