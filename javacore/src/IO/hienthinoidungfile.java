package IO;
import java.io.*;
class hienthinoidungfile {

	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fin;
		
		try {
			fin = new FileInputStream("D:\\test.txt");
		}

		catch (FileNotFoundException exc){
			System.out.println("khong tim thay file");
			
			return;
		}
		do {
			i=fin.read();
			if(i!=-1)
				System.out.print((char)i);
		}
		while (i!=-1);
	}

}
