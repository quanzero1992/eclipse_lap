package IO;
import java.io.*;
class readline {
		
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("nhap Stop de ket thuc chuong trinh");
		do {
			str=br.readLine();
			System.out.println("nhap chuoi");
			System.out.println(str);
			
		}
		while(!str.equals("stop"));
		System.out.println("ket thuc chuong trinh");
		
	}

}
