package IO;

import java.io.*;

class docndfile {
	public void main (String args[]){
		String pathfile="D:\\test.txt";
		ReadFile(pathfile);
	}
	
	
	private static String ReadFile(String pathFile)
	 {
	 try
	 {
	
	 FileInputStream fileInPutStream = new FileInputStream(pathFile);
	
	 Reader reader = new java.io.InputStreamReader(fileInPutStream, "utf-8");
	
	 BufferedReader buffReader = new BufferedReader(reader);
	 StringBuilder stringBuilder = new StringBuilder();
	 String line = null;
	 while ((line = buffReader.readLine()) != null)
	 {
	 stringBuilder.append(line + "\n");
	 }
	
	 reader.close();
	 return stringBuilder.toString();
	 }
	 catch(IOException io)
	 {
	 System.out.println("Khong tim thay file " + pathFile);
	 }
	 return "";
	 }

}
