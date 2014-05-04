package module04;

public class bienthehien {
	public int cannang;

	public double chieucao;
	private int sotinchi;
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bienthehien sv1=new bienthehien();
		sv1.cannang=50;
		sv1.chieucao=1.75;
		sv1.sotinchi=191;
		bienthehien sv2=new bienthehien();
		sv2.cannang=60;
		sv2.chieucao=1.85;
		sv2.sotinchi=190;
			System.out.println("Sinh vien 1 cao "+sv1.chieucao+" nang " + sv1.cannang+ " hoc so tin chi la" +sv1.sotinchi);
			System.out.println("Chieu cao cua sinh vien 2 la "+sv2.chieucao +"nang"+sv2.cannang + " hoc so tin chi la " +sv2.sotinchi);
			
		
	}

}
