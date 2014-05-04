package module07;

import java.util.Scanner;

public class MainDisplay {

	public static void main(String args[]) {
		Specification objSpec = new Specification();
		System.out.println("Enter text for the specifications");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		objSpec.beginText();
		objSpec.bodyText(text);
		objSpec.endText();
	}

}
