package module03;

import java.util.Scanner;

class lenhnhay {

	
	public static void main(String[] args) {
		int cnt,number;
		String hoten;
		for (cnt=1,number=0;cnt<=100;cnt++)
		{
			Scanner input=new Scanner(System.in);
			System.out.println("nhap vao mot so");
			number= input.nextInt();
			System.out.println("nhap ho ten cua ban");
			hoten=input.next();
			
			if( hoten !="VoTranQuan")
			{	System.out.println("ket thuc chuong trinh");
				break;
			}
			System.out.println("ban co muon tiep tuc khong?");
			
			System.out.println("1-Yes | 2-No");
			number=input.nextInt();
			if(number==1 )
				continue;
			else
				break;
			
			
			
		}

	}

}
