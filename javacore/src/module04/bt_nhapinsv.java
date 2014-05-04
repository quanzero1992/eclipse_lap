package module04;

import java.util.Scanner;

public class bt_nhapinsv {

	static class thongso {
		int tuoi,cannang;
		double chieucao;
		String hoten;
		char[] masv;
		
	}
	
	
	public static void main(String[] args) {
		nhaptt();
		thongso sv=new thongso();
		System.out.println("Thong so sinh vien "+sv.cannang);
		
	}


	private static void Hienthi() {
		Object sv;
		System.out.println("Thong so sinh vien ");
		System.out.println("Thong so sinh vien");
		System.out.println("Thong so sinh vien");
		System.out.println("Thong so sinh vien");
	}


	private static void nhaptt() {
		Scanner input = new Scanner(System.in);
		thongso sv = new thongso();
		System.out.println("nhap cac thong so sinh vien");

		System.out.println("can nang cua sinh vien = ");
		sv.cannang=input.nextInt();

		System.out.println("tuoi cua sinh vien = ");
		sv.tuoi=input.nextInt();

		System.out.println("chieu cao cua sinh vien = ");
		sv.chieucao=input.nextDouble();

		System.out.println("ho ten sinh vien = ");
		sv.hoten=input.next();
		
	}


}
