package IO;
import java.io.*;
import javax.swing.*;
class movefile {

	public static void main(String[] args) throws IOException {
		InputStream is=null;
		OutputStream os=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		JFrame z=new JFrame();
		
			try {
				String f3=JOptionPane.showInputDialog(z,"Nhap duong dan cho file muon di chuyen" );
				String f2=JOptionPane.showInputDialog(z,"Nhap duong dan dich file muon di chuyen" );
				
				File file1=new File(f3);
				File file2=new File(f2);
				is = new FileInputStream(file1);
				os = new FileOutputStream(file2);
				
				byte[] buffer=new byte[1024];
				int i;
				while((i=is.read(buffer)) > 0){
					os.write(buffer, 0, i);
				
				}
				is.close();
				os.close();
				file1.delete();
				System.out.println("Copy file thanh cong");
				
					
			}
			catch(Exception e){
				e.printStackTrace();
			}
		
		
	}

}
