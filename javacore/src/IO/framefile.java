package IO;
import java.io.*;
import java.awt.*;

public class framefile {
	
	public static void main(String[] args) {
		Frame fr = new Frame("O Dia May tinh");
		fr.setBounds(25,25,750,500);
		fr.setLayout(new BorderLayout());
		
		Panel p =new Panel(new GridLayout(1,2,3,4));
		// khoi tao list file C
		List list_c=new List();
		// gan duong dan cho list_c la o dia C
		list_c.add("C:\\");
		// tao doi tuong file tu duong dan tuyet doi
		File driver_C = new File("C:\\");
		// tao mang doi tuong dirs_C tu list file co trong C
		String[] dirs_C = driver_C.list();
		// loop nay de load cac file trong o dia C(moi phan tu trong list o C)
		for(int i=0;i<dirs_C.length;i++){
			File f=new File("C:\\"+dirs_C[i]);
			
			if(f.isDirectory())// kiem tra tep tin co phai la thu muc khong
				list_c.add("<DIR>"+dirs_C[i]);
			else
				list_c.add(" " + dirs_C[i]);
		}
		
		List list_D=new List();
		list_D.add("D:\\");
		File driver_D = new File("D:\\");
		String [] dirs_D = driver_D.list();
			for(int i=0;i<dirs_D.length;i++)
			{
				File f = new File("D:\\"+dirs_D[i]);
				if(f.isDirectory())
					list_D.add("<DIR>" + dirs_D[i]);
				else
					list_D.add(" "+dirs_D[i]);
					
			}
			List list_E=new List();
			list_E.add("E:\\");
			File driver_E = new File("E:\\");
			String [] dirs_E = driver_E.list();
				for(int i=0;i<dirs_E.length;i++)
				{
					File f = new File("E:\\"+dirs_E[i]);
					if(f.isDirectory())
						list_E.add("<DIR>" + dirs_E[i]);
					else
						list_E.add(" "+dirs_E[i]);
						
				}

				List list_F=new List();
				list_F.add("F:\\");
				File driver_F = new File("F:\\");
				String [] dirs_F = driver_F.list();
					for(int i=0;i<dirs_F.length;i++)
					{
						File f = new File("F:\\"+dirs_F[i]);
						if(f.isDirectory())
							list_F.add("<DIR>" + dirs_F[i]);
						else
							list_F.add(" "+dirs_F[i]);
							
					}
				
				
			p.add(list_c);
			p.add(list_D);
			p.add(list_E);
			p.add(list_F);
			fr.add(p,BorderLayout.CENTER);
			fr.setVisible(true);
		
				
	}

}
