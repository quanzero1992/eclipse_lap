package module05;

public class vonglap {
			
	public static void main(String[] args) {

			double sum=0;
			double[] numArray={10.12,67.99,56.65,45.43,32.45};
//			
//			System.out.println("Array values are : ");
//			for(double index: numArray){
//				System.out.println(index);
//				sum+=index;
//				}
//			
			System.out.println("Cac phan tu cua mang la");
			for(int i=0;i<numArray.length;i++)
			{
				System.out.println(numArray[i]);
				sum+=numArray[i];
			}
			System.out.println("Sum = "+ sum);
					
	}

}
