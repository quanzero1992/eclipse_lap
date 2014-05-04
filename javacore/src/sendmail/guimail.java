package sendmail;
import sun.net.smtp.*;
public class guimail {
	
	public static void main(String args[]) throws Exception {
		
		String host="alt3.gmail-smtp-in.I.google.com";
		String from="vtquan243@gmail.com";
		String to="vtquan243@gmail.com";
		String subject="Hello Quan";
		String body="Day la test mail";
		
		SmtpClient mailer = new SmtpClient(host);
		mailer.from(from);
		mailer.to(to);
		
		java.io.PrintStream ps=mailer.startMessage();
		
		ps.println("from :"+ from);
		ps.println("to :"+ to);
		ps.println("subject :"+ subject);
		ps.println("_______________________________________");
		ps.println("noidung :"+ body);
		ps.println();
		
		mailer.closeServer();
		System.out.println("Mail da duoc gui thanh cong");
		}
}
