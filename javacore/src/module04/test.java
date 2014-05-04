package module04;

class test {

	public static void nhapthongso(int...num){
		for(int i : num){
			System.out.println("Model Number is "+ i + ".");
		}
		
	}
	public static void main(String[] args) {
		
		nhapthongso(201,301,401,501);
		
	}

}
