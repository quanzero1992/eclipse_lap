package IO;
import java.io.*;
import java.awt.*;
class framefile2 {

	public static void main(String[] args) {
		Frame p = new Frame("Quan");
		p.setBounds(100, 100, 500, 500);
		p.setLayout(new BorderLayout());
		Panel pn=new Panel(new GridLayout(1,2));
		Button bt=new Button();
		pn.add(bt);
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
			pn.add(list_D);
		pn.add(p,BorderLayout.CENTER);
		pn.setVisible(true);
	}

}
