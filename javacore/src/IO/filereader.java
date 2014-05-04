package IO;
import java.io.*;
class filereader {

	
	public static void main(String[] args) throws IOException {
		String str;
		FileReader fr;
			fr=new FileReader("D:\\test.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while((str = br.readLine())!=null){
				System.out.println(str);
				
			}
			fr.close();
					
	}

}
