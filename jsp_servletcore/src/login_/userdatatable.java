package login_;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
/**
 * Servlet implementation class userdatatable
 */
@WebServlet("/userdatatable")
public class userdatatable {
	
	protected static Hashtable userdata=new Hashtable();
	protected static Random keygenerator=new Random();
	
	public static String creatuserdata(){
	//tao khoa ngau nhieen
		String userkey =""+keygenerator.nextLong();
		// tao bang bam ket hop voi khoa 
		userdata.put(userkey, new Hashtable());
		
		return userkey;
		}
	// tra ve username tuong ung voi mot khoa
	public static Hashtable getUserdata(String userkey)
	{
		if(userkey==null) return null;
		return(Hashtable)userdata.get(userkey);
		
	}
	// xoa bo du lieu cua user
	public static void clearUserData(String userkey){
		if(userkey==null)return;
		userdata.remove(userkey);
	}
}
