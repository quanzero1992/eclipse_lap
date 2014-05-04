package IO;

import java.io.*;

class copyfile {

public static void main(String args[]) throws IOException {
	int i;
	FileInputStream fin;
	FileOutputStream fout;
try {
	try {
		fin = new FileInputStream("D:\\test.txt");
	}
	catch(FileNotFoundException exc){
		System.out.println("khong tim thay file");
		return;
		
	}
	try {
		fout= new FileOutputStream("D:\\dich.txt");
	}
	catch (FileNotFoundException exc){
		
		System.out.println("khong tim thay file");
		return;
	}
	
}
catch(ArrayIndexOutOfBoundsException exc){
	System.out.println("Usage:copyfile from to");
	return;
}
try {
	// main
	do {
		i=fin.read();
		if(i!=-1)
		fout.write(i);
	
		
	}
	while(i!=-1);
}
catch(FileNotFoundException exc){
	System.out.println("loi file");
	
}
System.out.println("file da duoc copy thanh cong !");
	fin.close();
	fout.close();
}
	

}


