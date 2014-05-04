package ketnoi;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sound.midi.SysexMessage;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;


public class xuatexcel {

    /**
     * @param args
     */
	
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/elcom","root","");
            Statement statement = con.createStatement();
            FileOutputStream fileOut; // tao file ra bang luong byte
            System.out.println("Nhap duong dan cho file dich");
            System.err.println("VD:  D:\\test export excel | file se duoc luu tu dong duoi dang xls ");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String url=br.readLine().trim() + ".xls";
            fileOut = new FileOutputStream(url);
            HSSFWorkbook workbook = new HSSFWorkbook(); // tao doi tuong excel
            HSSFSheet worksheet = workbook.createSheet("Sheet 1"); // tao sheet chua du lieu ra ten la test
            Row row1 = worksheet.createRow((short)0); // 
            row1.createCell(0).setCellValue("Mã Khách hàng");
            row1.createCell(1).setCellValue("Tên Khách hàng");
            row1.createCell(2).setCellValue("Địa chỉ");
            row1.createCell(3).setCellValue("Tuổi");
            row1.createCell(4).setCellValue("Ngày sinh");
            row1.createCell(5).setCellValue("Mã Công ty");
            Row row2 ;
            ResultSet rs = statement.executeQuery("SELECT * FROM customer");
            while(rs.next()){
                int a = rs.getRow();
                
                row2 = worksheet.createRow((short)a);
                
                row2.createCell(0).setCellValue(rs.getString(1));
                row2.createCell(1).setCellValue(rs.getString(2));
                row2.createCell(2).setCellValue(rs.getString(3));
                row2.createCell(3).setCellValue(rs.getInt(4));
                row2.createCell(4).setCellValue(rs.getString(5));
                row2.createCell(5).setCellValue(rs.getString(6));
            }
            workbook.write(fileOut);
            fileOut.flush();
            fileOut.close();
            rs.close();
            statement.close();
            con.close();
            System.out.println("Tien trinh xuat file thanh cong !");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException ex){
            System.out.println(ex);
        }catch(IOException ioe){
            System.out.println(ioe);
        }

    }

}
