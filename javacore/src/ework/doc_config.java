package ework;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


class doc_config {

	/**
	 Doc du lieu tu file data.properties
	 xin chao toi la Quab
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pr= new Properties();
		pr.load(new FileInputStream("data.properties"));
		String url=pr.getProperty("url");
		String user=pr.getProperty("user");
		String pass=pr.getProperty("password");
		System.out.println(url);
		System.out.println(user);
		System.out.println(pass);
		
		
	}

}

