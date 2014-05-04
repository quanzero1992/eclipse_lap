package module05;

import java.util.Scanner;

class Mang {

	
	
	public static void main(String[] args) {
	int[][] stuMark=new int[2][4];
	int rowIndex=0;
	int colIndex=0;
	System.out.println("so cot la" + stuMark.length);
	Scanner input=new Scanner(System.in);
	for (rowIndex=0;rowIndex<stuMark.length;rowIndex++)
		{	for(colIndex=0;colIndex<stuMark[rowIndex].length;colIndex++)
		{
			System.out.println("Nhap gia tri phan tu");
			stuMark[rowIndex][colIndex]= input.nextInt();
			
		}
		
		}
		
		System.out.println("nhu vay cac phan tu cua mang se la");
		for(rowIndex=0;rowIndex<stuMark.length;rowIndex++){
			for(colIndex=0;colIndex<stuMark[rowIndex].length;colIndex++){
				System.out.print("stuMark[" + rowIndex + "," +colIndex +" ] = ");
				System.out.println(stuMark[rowIndex][colIndex]);
			}
		}
	}

}
