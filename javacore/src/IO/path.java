package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

class path {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String c=br.readLine();
		File f=new File(c);
		laypath(f);
		
		
		int z=c.indexOf(".");
		System.out.println(z);
		String duoi=c.substring(z);
		System.out.println(duoi);
	}
	public static void laypath(File f) throws IOException{
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.getPath());
			String x=f.getPath().substring(0, 3);
			System.out.println(x);
			
	}

}
