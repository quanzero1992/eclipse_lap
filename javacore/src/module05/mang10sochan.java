package module05;

public class mang10sochan {

	
	public static void main(String[] args) {
		int[] mangSoChan =new int[10];
		int so=0;
		int i=0;
		do{
		mangSoChan[i]=so;
		so=so+2;
		i++;
		}
		while(i<mangSoChan.length);
			
		for(int j=0;j<mangSoChan.length;j++)
		{int k=j+1;
		System.out.print("mangSoChan["+ k +"] = ");
		System.out.println(mangSoChan[j]);
		}
	}

}
